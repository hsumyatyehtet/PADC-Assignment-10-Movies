package hmyh.test.padcassignment10movie.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import hmyh.test.padcassignment10movie.R
import hmyh.test.padcassignment10movie.holder.HomeFragmentNowPlayingHolder
import hmyh.test.padcassignment10movie.holder.HomeFragmentPopularHolder

class HomeFragmentPopularAdapter: RecyclerView.Adapter<HomeFragmentPopularHolder>() {

    override fun onCreateViewHolder(view: ViewGroup, viewType: Int): HomeFragmentPopularHolder {
        return HomeFragmentPopularHolder(LayoutInflater.from(view.context).inflate(R.layout.fragment_home_popular_nested_rv_item,view,false))
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: HomeFragmentPopularHolder, position: Int) {

    }
}