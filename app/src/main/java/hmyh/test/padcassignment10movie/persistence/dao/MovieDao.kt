package hmyh.test.padcassignment10movie.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import hmyh.test.padcassignment10movie.data.vos.NowPlayingVO

@Dao
abstract class MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertNowPlayingMovies(movies: List<NowPlayingVO>): LongArray

    @Query("SELECT * FROM now_playing")
    abstract fun getAllNowPlayingMovies(): List<NowPlayingVO>
}