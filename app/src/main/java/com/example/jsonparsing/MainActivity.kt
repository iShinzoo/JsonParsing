package com.example.jsonparsing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val dummyJson = "{\n" +
                "            \"name\" : \"something\",\n" +
                "            \"age\" : \"19\",\n" +
                "            \"email\" : \"xyz@gmail.com\",\n" +
                "            \"bio\" : \"something interesting to read\"\n" +
                "        }"

        val jsonObj = JSONObject(dummyJson)
        val name = jsonObj.getString("name")
        val age = jsonObj.getString("age")
        val email = jsonObj.getString("email")
        val bio = jsonObj.getString("bio")

        val user = User(name, age, email, bio)
        Log.i("userdata",user.toString())
    }
}
data class User(
        val name : String,
        val age : String,
        val email : String,
        val bio : String,
        )