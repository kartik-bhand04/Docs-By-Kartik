package com.example.docsbykartik.ui.AddDocument

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.docsbykartik.databinding.FragmentAdddocumentBinding
class AddDocumentFragment : Fragment() {

    private var _binding: FragmentAdddocumentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val AddDocumentFragmentViewModel =
            ViewModelProvider(this).get(AddDocumentFragmentViewModel::class.java)

        _binding = FragmentAdddocumentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textAddDocument
        AddDocumentFragmentViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}