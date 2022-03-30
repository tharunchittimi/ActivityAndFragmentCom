package com.example.activityandfragmentcom.views.activity_to_fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import com.example.activityandfragmentcom.R
import com.example.activityandfragmentcom.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_layout_af.*

open class FragmentAF : BaseFragment() {
    override fun setLayout(): Int {
        return R.layout.fragment_layout_af
    }

    override fun initView(savedInstanceState: Bundle?) {
        val data: String = this.arguments?.getString("activityData").toString()
        fragmentEditText.setText(data)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("lifecycle", "FragmentAF onAttach")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("lifecycle", "FragmentAF onDetach")
    }

    override fun onStart() {
        super.onStart()
        Log.e("lifecycle", "FragmentAF onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("lifecycle", "FragmentAF onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.e("lifecycle", "FragmentAF onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.e("lifecycle", "FragmentAF onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("lifecycle", "FragmentAF onDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("lifecycle", "FragmentAF onDestroyView")
    }
}