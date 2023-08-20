package com.example.composenavigate.shared

import android.content.Context
import android.widget.Toast

fun mToast(message : String, context : Context){
    Toast.makeText(context,message, Toast.LENGTH_LONG).show()
}