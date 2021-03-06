package app.fahimfarhan.vocabularygym.mvvm.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey


@Suppress("RedundantSemicolon")
@Entity(tableName = "gre_vocabulary_table")
data class GreModel(
  @PrimaryKey(autoGenerate = true)
  var pk: Int = 0,
  @ColumnInfo(name = "gre_word")
  var greWord: String = "",
  @ColumnInfo(name = "gre_meaning")
  var greMeaning: String = "",
  @ColumnInfo(name = "gre_part_of_speech")
  var grePartOfSpeech: String = "",
  @ColumnInfo(name = "example_sentence")
  var exampleSentence: String = "",
  @ColumnInfo(name = "initial_character")
  var initialChar: Int = -1,
  @ColumnInfo(name = "difficulty_level")
  var difficultyLevel: Int = 0,
  // for analytics
  @Ignore
  var isCorrect: Boolean? = null
)