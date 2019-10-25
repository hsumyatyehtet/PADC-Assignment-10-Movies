package hmyh.test.padcassignment10movie.adapter

import androidx.recyclerview.widget.RecyclerView
import hmyh.test.padcassignment10movie.holder.BaseViewHolder

abstract class BaseAdapter<VH : BaseViewHolder<T>, T> : RecyclerView.Adapter<VH>() {

    private var dataList: MutableList<T> = mutableListOf()

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: VH, position: Int) {

    }

//    fun setNewData(newData: MutableList<T>){
//        dataList=newData
//        notifyDataSetChanged()
//    }
//
//    fun appendData(newData: List<T>){
//        dataList.addAll(newData)
//        notifyDataSetChanged()
//    }
}