package com.example.navigasiapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigasiapplication.databinding.FragmentQuiz3Binding

class QuizFragment3 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentQuiz3Binding>(
            inflater, R.layout.fragment_quiz3, container, false)
        binding.submitButton3.setOnClickListener { view: View ->
            val checkedId =
                binding.pertanyaanRadioGroup3.checkedRadioButtonId
            if (-1 != checkedId) {
                var answerIndex = 0
                when (checkedId) {
                    R.id.firstAnswerP3 -> answerIndex = 0
                    R.id.secondAnswerP3 -> answerIndex = 1
                    R.id.thirdAnswerP3 -> answerIndex = 2
                    R.id.fourthAnswerP3 -> answerIndex = 3
                }
                if (answerIndex == 0) {
                    view.findNavController()
                        .navigate(R.id.action_quizFragment3_to_quizFinishFragment)
                } else {
                    view.findNavController()
                        .navigate(R.id.action_quizFragment3_to_quizendFragment3)
                }
            }
        }
        return binding.root
    }
}