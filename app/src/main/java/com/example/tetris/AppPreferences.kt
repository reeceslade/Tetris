package com.example.tetris

import android.content.Context
import android.content.SharedPreferences

class AppPreferences(ctx: Context) {
    //content provides access to getSharedPreferences()
    //this retrieves the files name as the first argument (APP PREFERENCES)
    private var data: SharedPreferences =
        ctx.getSharedPreferences("APP_PREFERENCES", Context.MODE_PRIVATE)


    fun saveHighScore(highscore: Int) {
        //takes high score as only argument
        data.edit().putInt("HIGH_SCORE", highscore).apply()
        //uses data.edit to allow modification to this data
        //putInt represents a string as a key that will be used to access stored value
        //second argument is the integer which will be stored (highScore)
    }

    fun getHighScore(): Int {
        return data.getInt("HIGH_SCORE", 0)
        //returns the high score data
    }

    fun clearHighScore() {
        data.edit().putInt("HIGH_SCORE", 0).apply()
        //overwrites high score to 0
    }
}