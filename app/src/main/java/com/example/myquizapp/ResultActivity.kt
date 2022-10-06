package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName: TextView = findViewById(R.id.tv_name)
        val tvScore: TextView = findViewById(R.id.tv_score)
        val tvFinish: TextView = findViewById(R.id.tv_finish)
        val btnFinish: Button = findViewById(R.id.tv_finish)

        tvName.text = intent.getStringExtra(constants.USER_NAME)
        tvScore.text = intent.getStringExtra(constants.CORRECT_ANSWERS)

        val totalQuestions = intent.getIntExtra(constants.TOTAL_QUESTIONS,0)
        val correctAnswers = intent.getIntExtra(constants.CORRECT_ANSWERS,0)

        tvScore.text = "Your score is $correctAnswers out of $totalQuestions"

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}