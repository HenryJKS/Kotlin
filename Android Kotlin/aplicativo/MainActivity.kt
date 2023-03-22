package com.example.aplicativo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var users: MutableList<String> = mutableListOf("user1", "user2")
    var emails: MutableList<String> = mutableListOf("email1", "email2")
    var passwords: MutableList<String> = mutableListOf("pass1", "pass2")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.signupbtn)
        btn.setOnClickListener{
            val user = findViewById<EditText>(R.id.username)
            val userInput = user.text.toString()

            var result = "User successfully registered"
            var bundle = Bundle()

            if(userInput in users) {
                result = "User already registered. Insert the password"
                }
            else if(userInput.isEmpty() || userInput.equals("")) {
                result = "User empty, type a valid user"
            } else {
                val email = findViewById<EditText>(R.id.email)
                val emailInput = user.text.toString()

                val password = findViewById<EditText>(R.id.password)
                val passwordInput = user.text.toString()

                val repassword = findViewById<EditText>(R.id.repassword)
                val repasswordInput = user.text.toString()

                if(passwordInput.equals(repasswordInput)) {
                    users.add(userInput)
                    emails.add(emailInput)
                    passwords.add(passwordInput)
                } else {
                    result = "Password does not match. Retype the password"

                }
            }

            //Importante
            bundle.putString("res", result)
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)

        }


    }

}