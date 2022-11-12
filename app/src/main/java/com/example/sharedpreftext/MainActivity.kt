package com.example.sharedpreftext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpreftext.utils.ContextUtill
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        autoLoginCheckBox.setOnCheckedChangeListener { buttonview, ischecked ->

//            지금 체크된 상황을 그대로 => ContextUtill을 이용해 자동 로그인 여부로 저장

            ContextUtill.setAutoLogin(this,ischecked)


        }
//        화면이 만들어지면 => 저장된 자동 로그인 여부 값을 => 체크박스에 반영
        autoLoginCheckBox.isChecked = ContextUtill.getAutoLogin(this)
    }
}