package hmyh.test.padcassignment10movie.persistence

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import hmyh.test.padcassignment10movie.data.vos.NowPlayingVO
import hmyh.test.padcassignment10movie.persistence.dao.MovieDao
import hmyh.test.padcassignment10movie.utils.MOVIE_DB

@Database(entities = [NowPlayingVO::class], version = 1, exportSchema = false)
abstract class MovieDatabase : RoomDatabase() {

    abstract fun movieDao(): MovieDao

    companion object {
        private var instance: MovieDatabase? = null

        fun getInstance(context: Context): MovieDatabase {
            if (instance == null) {
                instance = Room.databaseBuilder(context, MovieDatabase::class.java, MOVIE_DB)
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
            }
            val db = instance!!

            return db
        }
    }
}