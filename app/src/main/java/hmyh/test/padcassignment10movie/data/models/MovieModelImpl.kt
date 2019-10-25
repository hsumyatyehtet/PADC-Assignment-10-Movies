package hmyh.test.padcassignment10movie.data.models

import hmyh.test.padcassignment10movie.data.vos.NowPlayingVO

object MovieModelImpl : BaseModel(),MovieModel {


    override fun getNowPlayingMovies(
        onSuccess: (List<NowPlayingVO>) -> Unit,
        onFailure: (String) -> Unit
    ) {
        val nowPlayingMoviesFromDB = database.movieDao().getAllNowPlayingMovies()
        if (nowPlayingMoviesFromDB.isNotEmpty()){
            onSuccess(nowPlayingMoviesFromDB)
        }else{
            dataAgent.getNowPlayingMovies(
                {
                    database.movieDao().insertNowPlayingMovies(it)
                    onSuccess(it)
                },onFailure
            )
        }
    }


}