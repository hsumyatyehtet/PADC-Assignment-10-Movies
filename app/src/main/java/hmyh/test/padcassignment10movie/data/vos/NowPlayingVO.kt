package hmyh.test.padcassignment10movie.data.vos

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "now_playing")
data class NowPlayingVO (

    @SerializedName("popularity")
    @ColumnInfo(name = "popularity")
    var popularity: Float,

    @SerializedName("vote_count")
    @ColumnInfo(name = "vote_count")
    var voteCount: Long,

    @SerializedName("video")
    @ColumnInfo(name = "video")
    var video: Boolean,

    @SerializedName("poster_path")
    @ColumnInfo(name = "poster_path")
    var posterPath: String,

    @PrimaryKey
    @SerializedName("id")
    @ColumnInfo(name = "id")
    var id: Long,

    @SerializedName("adult")
    @ColumnInfo(name = "adult")
    var adult: Boolean,

    @SerializedName("backdrop_path")
    @ColumnInfo(name = "backdrop_path")
    var backDropPath: String,

    @SerializedName("original_language")
    @ColumnInfo(name = "original_language")
    var originalLanguage: String,

    @SerializedName("original_title")
    @ColumnInfo(name = "original_title")
    var originalTitle: String,

    @SerializedName("title")
    @ColumnInfo(name = "title")
    var title: String,

    @SerializedName("vote_average")
    @ColumnInfo(name = "vote_average")
    var voteAverage: Float,

    @SerializedName("overview")
    @ColumnInfo(name = "overview")
    var overView: String,

    @SerializedName("release_date")
    @ColumnInfo(name = "release_date")
    var releaseDate: String
)