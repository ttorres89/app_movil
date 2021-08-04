package com.example.comparaprecios_tania.View

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.comparaprecios_tania.R

class LoginTabFragment : Fragment() {
    lateinit var mView: View
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        mView = inflater.inflate(R.layout.login_tab_fragment, container, false)

        val btn = mView.findViewById<Button>(R.id.button_login)



        btn.setOnClickListener {

            val intent=Intent(activity, MenuPrincipal::class.java)
            startActivity(intent)
        }

        return mView
    }




}