package hmyh.test.padcassignment10movie.mvp.presenters

import hmyh.test.padcassignment10movie.data.models.MovieModelImpl
import hmyh.test.padcassignment10movie.mvp.views.MovieListView

class MovieListPresenter : BasePresenter<MovieListView>() {

    override fun onCreate() {
        val modelNowPlaying: MovieModelImpl = MovieModelImpl

        modelNowPlaying.getNowPlayingMovies(
            { nowplayingmovies ->
                mView.displayNowPlayingMovies(nowplayingmovies)
            }, {
                mView.displayError(it)
            }
        )
    }


    override fun onStart() {

    }

    override fun onResume() {

    }

    override fun onPause() {

    }

    override fun onStop() {

    }

    override fun onDestroy() {

    }
}