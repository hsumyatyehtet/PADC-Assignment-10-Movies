package hmyh.test.padcassignment10movie.data.models

import android.content.Context
import hmyh.test.padcassignment10movie.network.dataagents.RetrofitAgent
import hmyh.test.padcassignment10movie.persistence.MovieDatabase

abstract class BaseModel {

    protected val dataAgent = RetrofitAgent

    protected lateinit var database: MovieDatabase

    public fun initDatabase(context: Context) {
        database = MovieDatabase.getInstance(context)
    }
}