package es.uca.TFG.conexionmorada.Security

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase
import com.google.firebase.firestore.ktx.firestore

class Login {
    private lateinit var auth: FirebaseAuth
    private val db = Firebase.firestore

}