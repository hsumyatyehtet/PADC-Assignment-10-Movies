package hmyh.test.padcassignment10movie.network.dataagents

import hmyh.test.padcassignment10movie.data.vos.NowPlayingVO

interface MovieDataAgent {

    fun getNowPlayingMovies(
        onSuccess: (List<NowPlayingVO>) -> Unit,
        onFailure: (String) -> Unit
    )
}