package com.example.navigasiapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigasiapplication.databinding.FragmentQuizBinding

class QuizFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentQuizBinding>(
            inflater, R.layout.fragment_quiz, container, false)
        binding.submitButton.setOnClickListener { view: View ->
            val checkedId =
                binding.pertanyaanRadioGroup.checkedRadioButtonId
            if (-1 != checkedId) {
                var answerIndex = 0
                when (checkedId) {
                    R.id.firstAnswer -> answerIndex = 0
                    R.id.secondAnswer -> answerIndex = 1
                    R.id.thirdAnswer -> answerIndex = 2
                    R.id.fourthAnswer -> answerIndex = 3
                }
                if (answerIndex == 3) {
                    view.findNavController()
                        .navigate(R.id.action_quizFragment_to_quizFragment2)
                } else {
                    view.findNavController()
                        .navigate(R.id.action_quizFragment_to_quizendFragment)
                }
            }
        }
        return binding.root
    }
}