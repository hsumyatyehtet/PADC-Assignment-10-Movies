package hmyh.test.padcassignment10movie.network.dataagents


import hmyh.test.padcassignment10movie.data.vos.NowPlayingVO
import hmyh.test.padcassignment10movie.network.MovieApi
import hmyh.test.padcassignment10movie.network.response.GetNowPlayingResponse
import hmyh.test.padcassignment10movie.utils.BASE_URL
import hmyh.test.padcassignment10movie.utils.EM_NULL_MOVIE_RESPONSE
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitAgent : MovieDataAgent {

    private val movieApi: MovieApi

    init {
        val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        movieApi = retrofit.create(MovieApi::class.java)
    }

    override fun getNowPlayingMovies(
        onSuccess: (List<NowPlayingVO>) -> Unit,
        onFailure: (String) -> Unit
    ) {
        val call = movieApi.getNowPlayingMovies()
        call.enqueue(object : Callback<GetNowPlayingResponse> {
            override fun onFailure(call: Call<GetNowPlayingResponse>, t: Throwable) {
                onFailure(t.localizedMessage)
            }

            override fun onResponse(
                call: Call<GetNowPlayingResponse>,
                response: Response<GetNowPlayingResponse>
            ) {
                val nowPlayingResponse = response.body()
                if (nowPlayingResponse != null) {
                    if (nowPlayingResponse.data != null) {
                        onSuccess(nowPlayingResponse.data)
                    }
                } else {
                    onFailure(EM_NULL_MOVIE_RESPONSE)
                }
            }

        })
    }
}