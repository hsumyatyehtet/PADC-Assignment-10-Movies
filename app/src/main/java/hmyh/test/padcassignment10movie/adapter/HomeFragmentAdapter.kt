package hmyh.test.padcassignment10movie.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import hmyh.test.padcassignment10movie.R
import hmyh.test.padcassignment10movie.holder.HomeFragmentHolder
import kotlinx.android.synthetic.main.fragment_home_nested_rv.view.*

class HomeFragmentAdapter : RecyclerView.Adapter<HomeFragmentHolder>() {

    private lateinit var nowPlayingAdapter: HomeFragmentNowPlayingAdapter
    private lateinit var popularAdapter: HomeFragmentPopularAdapter

    override fun onCreateViewHolder(view: ViewGroup, viewType: Int): HomeFragmentHolder {
        return HomeFragmentHolder(
            LayoutInflater.from(view.context).inflate(
                R.layout.fragment_home_nested_rv,
                view,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return 4
    }

    override fun onBindViewHolder(holder: HomeFragmentHolder, position: Int) {

        if (position == 0) {
            holder.itemView.tv_movie_title.text = "Now Playing"
        } else if (position == 1) {
            holder.itemView.tv_movie_title.text = "Popular"
        } else if (position == 2) {
            holder.itemView.tv_movie_title.text = "Tip Rated"
        } else {
            holder.itemView.tv_movie_title.text = "UpComing"
        }

        nowPlayingAdapter = HomeFragmentNowPlayingAdapter()
        popularAdapter = HomeFragmentPopularAdapter()

        if (position == 0) {
            with(holder.itemView.nested_recycler_view) {
                holder.itemView.nested_recycler_view.setHasFixedSize(true)
                holder.itemView.nested_recycler_view.layoutManager =
                    LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
                holder.itemView.nested_recycler_view.adapter = nowPlayingAdapter
            }
        } else if (position == 1) {
            with(holder.itemView.nested_recycler_view) {
                holder.itemView.nested_recycler_view.setHasFixedSize(true)
                holder.itemView.nested_recycler_view.layoutManager =
                    LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
                holder.itemView.nested_recycler_view.adapter = popularAdapter
            }
        } else if (position == 2) {
            with(holder.itemView.nested_recycler_view) {
                holder.itemView.nested_recycler_view.setHasFixedSize(true)
                holder.itemView.nested_recycler_view.layoutManager =
                    LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
                holder.itemView.nested_recycler_view.adapter = nowPlayingAdapter
            }
        } else {
            with(holder.itemView.nested_recycler_view) {
                holder.itemView.nested_recycler_view.setHasFixedSize(true)
                holder.itemView.nested_recycler_view.layoutManager =
                    LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
                holder.itemView.nested_recycler_view.adapter = popularAdapter
            }
        }

    }
}