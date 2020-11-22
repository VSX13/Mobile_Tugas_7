package com.example.navigasiapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigasiapplication.databinding.FragmentQuizFinishBinding

class QuizFinishFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding: FragmentQuizFinishBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_quiz_finish, container, false)
        binding.nextMatchButton.setOnClickListener { view: View ->
            view.findNavController().
            navigate(R.id.action_quizFinishFragment_to_titleFragment)
        }
        return binding.root
    }
}