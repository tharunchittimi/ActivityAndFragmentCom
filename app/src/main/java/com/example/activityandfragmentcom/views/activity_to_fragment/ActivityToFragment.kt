package com.example.activityandfragmentcom.views.activity_to_fragment

import android.os.Bundle
import android.util.Log
import com.example.activityandfragmentcom.R
import com.example.activityandfragmentcom.base.BaseActivity
import kotlinx.android.synthetic.main.activity_to_fragment.*


class ActivityToFragment : BaseActivity() {
    override fun setLayout(): Int {
        return R.layout.activity_to_fragment
    }

    override fun initView(savedInstanceState: Bundle?) {
        Log.e("lifecycle", "ActivityToFragment onCreate")
        sendBtnActivity.setOnClickListener {
            sendDataToFragment()
        }
    }

    private fun sendDataToFragment() {
        val bundle = Bundle()
        bundle.putString("activityData", passActivityData.text.toString())
        val fragmentFirst = FragmentAF()
        fragmentFirst.arguments = bundle
        passActivityData.setText("")
        supportFragmentManager.beginTransaction().replace(R.id.loadsFragment,fragmentFirst).commit()
    }


    override fun onStart() {
        super.onStart()
        Log.e("lifecycle", "ActivityToFragment onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("lifecycle", "ActivityToFragment onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("lifecycle", "ActivityToFragment onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.e("lifecycle", "ActivityToFragment onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.e("lifecycle", "ActivityToFragment onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("lifecycle", "ActivityToFragment onDestroy")
    }

}