package hmyh.test.padcassignment10movie.data.models

import hmyh.test.padcassignment10movie.data.vos.NowPlayingVO

interface MovieModel {

    fun getNowPlayingMovies(
        onSuccess: (List<NowPlayingVO>) -> Unit,
        onFailure: (String) -> Unit
    )
}