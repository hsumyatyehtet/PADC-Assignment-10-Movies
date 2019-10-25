package hmyh.test.padcassignment10movie.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import hmyh.test.padcassignment10movie.R
import hmyh.test.padcassignment10movie.adapter.SearchFragmentAdapter
import kotlinx.android.synthetic.main.fragment_search.*

class SearchFragment : Fragment() {

    private lateinit var mAdapter: SearchFragmentAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mAdapter = SearchFragmentAdapter()

        with(search_recycler_view) {
            search_recycler_view.setHasFixedSize(true)
            search_recycler_view.layoutManager = GridLayoutManager(context, 3)
            search_recycler_view.adapter = mAdapter
        }
    }

}