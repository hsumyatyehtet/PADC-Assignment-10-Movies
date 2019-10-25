package hmyh.test.padcassignment10movie.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import hmyh.test.padcassignment10movie.R
import hmyh.test.padcassignment10movie.data.vos.NowPlayingVO
import hmyh.test.padcassignment10movie.holder.HomeFragmentNowPlayingHolder

class HomeFragmentNowPlayingAdapter: BaseAdapter<HomeFragmentNowPlayingHolder,NowPlayingVO>() {

    private var dataList: MutableList<NowPlayingVO> = mutableListOf()

    override fun onCreateViewHolder(view: ViewGroup, viewType: Int): HomeFragmentNowPlayingHolder {
        return HomeFragmentNowPlayingHolder(LayoutInflater.from(view.context).inflate(R.layout.fragment_home_now_playing_nested_rv_item,view,false))
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: HomeFragmentNowPlayingHolder, position: Int) {
        holder.data=dataList[position]
    }

    fun setNewData(newData: MutableList<NowPlayingVO>){
        dataList=newData
        notifyDataSetChanged()
    }
}