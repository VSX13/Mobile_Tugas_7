package com.example.navigasiapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigasiapplication.databinding.FragmentQuiz2Binding

class QuizFragment2 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentQuiz2Binding>(
            inflater, R.layout.fragment_quiz2, container, false)
        binding.submitButton2.setOnClickListener { view: View ->
            val checkedId =
                binding.pertanyaanRadioGroup2.checkedRadioButtonId
            if (-1 != checkedId) {
                var answerIndex = 0
                when (checkedId) {
                    R.id.firstAnswerP2 -> answerIndex = 0
                    R.id.secondAnswerP2 -> answerIndex = 1
                    R.id.thirdAnswerP2 -> answerIndex = 2
                    R.id.fourthAnswerP2 -> answerIndex = 3
                }
                if (answerIndex == 2) {
                    view.findNavController()
                        .navigate(R.id.action_quizFragment2_to_quizFragment3)
                } else {
                    view.findNavController()
                        .navigate(R.id.action_quizFragment2_to_quizendFragment2)
                }
            }
        }
        return binding.root
    }
}