package com.example.comparaprecios_tania.View

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.comparaprecios_tania.R
import com.example.comparaprecios_tania.ViewModel.UsuarioViewModel
import com.google.android.material.textfield.TextInputLayout

class LoginTabFragment : Fragment() {
    lateinit var mView: View
    lateinit var correo: TextInputLayout
    lateinit var clave:TextInputLayout
    lateinit var viewModel: UsuarioViewModel



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment

        mView = inflater.inflate(R.layout.login_tab_fragment, container, false)

        val btn = mView.findViewById<Button>(R.id.button_login)
        correo = mView.findViewById<TextInputLayout>(R.id.textInputLayout_email)
        clave = mView.findViewById<TextInputLayout>(R.id.textInputLayout_password)


        btn.setOnClickListener {

            this.viewModel  = ViewModelProvider(this).get(UsuarioViewModel::class.java)
            var existe = viewModel.getUsuario(correo.editText?.text.toString(),clave.editText?.text.toString())

            if(correo.editText?.text.toString().isEmpty() && clave.editText?.text.toString().isEmpty()) {

                Toast.makeText(context, "Ingrese sus datos", Toast.LENGTH_LONG).show()

            }else{

                if (existe) {
                    val intent = Intent(activity, MenuPrincipal::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(context, "Usuario no registrado", Toast.LENGTH_LONG).show()
                }
            }

        }

        return mView
    }




}