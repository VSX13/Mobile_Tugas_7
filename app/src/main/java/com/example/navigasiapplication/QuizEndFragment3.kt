package com.example.navigasiapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigasiapplication.databinding.FragmentQuizEnd3Binding

class QuizEndFragment3 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding: FragmentQuizEnd3Binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_quiz_end3, container, false)
        binding.sorryTryAgainButton3.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(R.id.action_quizendFragment3_to_titleFragment)
        }
        return binding.root
    }
}