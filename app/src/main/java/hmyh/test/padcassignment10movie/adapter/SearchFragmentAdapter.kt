package hmyh.test.padcassignment10movie.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import hmyh.test.padcassignment10movie.R
import hmyh.test.padcassignment10movie.holder.SearchFragmentHolder

class SearchFragmentAdapter: RecyclerView.Adapter<SearchFragmentHolder>() {

    override fun onCreateViewHolder(view: ViewGroup, viewType: Int): SearchFragmentHolder {
        return SearchFragmentHolder(LayoutInflater.from(view.context).inflate(R.layout.fragment_search_rv_item,view,false))
    }

    override fun getItemCount(): Int {
        return 20
    }

    override fun onBindViewHolder(holder: SearchFragmentHolder, position: Int) {

    }
}