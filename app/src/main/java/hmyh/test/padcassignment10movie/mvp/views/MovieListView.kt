package hmyh.test.padcassignment10movie.mvp.views

import hmyh.test.padcassignment10movie.data.vos.NowPlayingVO

interface MovieListView : BaseView {

    fun displayNowPlayingMovies(movies: List<NowPlayingVO>)

    fun displayError(errorMessage: String)
}