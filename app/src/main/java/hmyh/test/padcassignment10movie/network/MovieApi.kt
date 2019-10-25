package hmyh.test.padcassignment10movie.network

import hmyh.test.padcassignment10movie.network.response.GetNowPlayingResponse
import hmyh.test.padcassignment10movie.utils.GET_NOW_PLAYING
import retrofit2.Call
import retrofit2.http.GET

interface MovieApi {

    @GET(GET_NOW_PLAYING)
    fun getNowPlayingMovies(): Call<GetNowPlayingResponse>
}