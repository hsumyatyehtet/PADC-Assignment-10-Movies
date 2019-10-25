package hmyh.test.padcassignment10movie.mvp.presenters

import hmyh.test.padcassignment10movie.mvp.views.BaseView

abstract class BasePresenter<T : BaseView> {

    protected lateinit var mView: T

    open fun initPresenter(view: T) {
        this.mView = view
    }

    open fun onStart() {}
    open fun onCreate() {}
    open fun onResume() {}
    open fun onPause() {}
    open fun onStop() {}
    open fun onDestroy() {}
}