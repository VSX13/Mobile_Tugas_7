package com.example.navigasiapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigasiapplication.databinding.FragmentQuizEndBinding

class QuizEndFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding: FragmentQuizEndBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_quiz_end, container, false)
        binding.sorryTryAgainButton.setOnClickListener { view: View ->
            view.findNavController()
                .navigate(R.id.action_quizendFragment_to_quizFragment)
        }
        return binding.root
    }
}