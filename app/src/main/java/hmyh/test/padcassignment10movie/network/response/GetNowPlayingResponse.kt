package hmyh.test.padcassignment10movie.network.response

import com.google.gson.annotations.SerializedName
import hmyh.test.padcassignment10movie.data.vos.NowPlayingVO

data class GetNowPlayingResponse (

    @SerializedName("results")
    val data: List<NowPlayingVO>
)