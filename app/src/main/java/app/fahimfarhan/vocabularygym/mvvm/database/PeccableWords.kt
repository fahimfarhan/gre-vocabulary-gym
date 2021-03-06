package app.fahimfarhan.vocabularygym.mvvm.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Suppress("RedundantSemicolon")
@Entity(tableName = "peccable_words_table")
data class PeccableWords(
  @PrimaryKey(autoGenerate = true)
  var pk: Int = 0,
  @ColumnInfo(name = "words_list")
  var wordsList: ArrayList<Int> = ArrayList(),
  @ColumnInfo(name = "out_of_words")
  var outOfWords: Int = 0
)