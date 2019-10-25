package hmyh.test.padcassignment10movie.holder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import hmyh.test.padcassignment10movie.data.vos.NowPlayingVO
import kotlinx.android.synthetic.main.fragment_home_now_playing_nested_rv_item.view.*
import kotlinx.android.synthetic.main.fragment_search_rv_item.view.*

class HomeFragmentNowPlayingHolder(itemView: View): BaseViewHolder<NowPlayingVO>(itemView) {


    override fun bindData(data: NowPlayingVO) {
        Glide.with(itemView)
            .load(data.posterPath)
            .into(itemView.iv_movie_poster_now_playing)
    }

}