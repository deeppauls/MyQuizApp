package com.example.myquizapp

object constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_argentina, "Argentina", "Australia",
            "Armenia", "Austria", 1
        )
        questionsList.add(que1)

        val que2 = Question(
            2,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_australia, "Angola", "Austria",
            "Australia", "Armenia", 3
        )
        questionsList.add(que2)

        val que3 = Question(
            3,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_brazil, "Belarus", "Brunei",
            "Belgium", "Brazil", 4
        )
        questionsList.add(que3)

        val que4 = Question(
            4,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_belgium, "Belgium", "Bahamas",
            "Barbados", "Belize", 1
        )
        questionsList.add(que4)

        val que5 = Question(
            5,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_fiji, "Gabon", "France",
            "Fiji", "Finland", 3
        )
        questionsList.add(que5)

        val que6 = Question(
            6,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_germany, "Germany", "Georgia",
            "Greece", "none of these", 1
        )
        questionsList.add(que6)

        val que7 = Question(
            7,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_denmark, "Dominica", "Egypt",
            "Denmark", "Ethiopia", 3
        )
        questionsList.add(que7)

        val que8 = Question(
            8,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_india, "Hungary", "India",
            "Iran", "Ireland", 2
        )
        questionsList.add(que8)

        val que9 = Question(
            9,"Which country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand, "Jordan", "Sudan",
            "Palestine", "New Zealand", 4
        )
        questionsList.add(que9)


        return questionsList
    }
}