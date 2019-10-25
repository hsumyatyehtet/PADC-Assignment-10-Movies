package hmyh.test.padcassignment10movie.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import hmyh.test.padcassignment10movie.R
import hmyh.test.padcassignment10movie.adapter.HomeFragmentAdapter
import hmyh.test.padcassignment10movie.adapter.HomeFragmentNowPlayingAdapter
import hmyh.test.padcassignment10movie.data.vos.NowPlayingVO
import hmyh.test.padcassignment10movie.mvp.presenters.MovieListPresenter
import hmyh.test.padcassignment10movie.mvp.views.MovieListView
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(), MovieListView {

    override fun displayError(errorMessage: String) {
        Snackbar.make(root_view, errorMessage, Snackbar.LENGTH_LONG).show()
    }

    override fun displayNowPlayingMovies(movies: List<NowPlayingVO>) {
        mNowPlayingAdapter.setNewData(movies.toMutableList())
    }

    private lateinit var mAdapter: HomeFragmentAdapter

    private lateinit var mNowPlayingAdapter: HomeFragmentNowPlayingAdapter
    private lateinit var mPresenter: MovieListPresenter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mPresenter = MovieListPresenter()
        mPresenter.initPresenter(this)

       // mNowPlayingAdapter = HomeFragmentNowPlayingAdapter(mPresenter)

        mAdapter = HomeFragmentAdapter()

        with(main_recycler_view) {
            main_recycler_view.setHasFixedSize(true)
            main_recycler_view.layoutManager =
                LinearLayoutManager(context, RecyclerView.VERTICAL, false)
            main_recycler_view.adapter = mAdapter
        }

        mPresenter.onCreate()
    }


}