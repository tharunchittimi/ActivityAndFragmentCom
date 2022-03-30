package com.example.activityandfragmentcom.views.fragment_to_activity

import android.app.Activity
import android.content.Context
import android.os.Bundle
import com.example.activityandfragmentcom.R
import com.example.activityandfragmentcom.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_layout_fa.*

class FragmentFA : BaseFragment() {
    private var sendDataToActivity: SendDataToActivity? = null

    override fun setLayout(): Int {
        return R.layout.fragment_layout_fa
    }

    override fun initView(savedInstanceState: Bundle?) {
        fragmentEditTextFA
        clickListener()
    }

    private fun clickListener() {
        btnFragFA.setOnClickListener {
            val editTextData = fragmentEditTextFA.text.toString()
            sendDataToActivity?.sendData(editTextData)
            fragmentEditTextFA.setText("")
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val activity = context as Activity
        try {
            sendDataToActivity = activity as SendDataToActivity
        } catch (e: ClassCastException) {
            throw ClassCastException(activity.toString() + "must Override sendData Method")
        }
    }

    interface SendDataToActivity {
        fun sendData(message: String)
    }
}