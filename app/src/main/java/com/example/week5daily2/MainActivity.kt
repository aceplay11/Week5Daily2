package com.example.week5daily2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

data class Person(var firstName : String, var lastName : String, var streetAddress : String,
                  var city: String, var state : String, var zipCode : String)
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view : View) =
        when (view.id) {
            R.id.btnSubmit -> {
                val inputFirstName = etfirstNameInput.text.toString()
                val inputLastName = etlastNameInput.text.toString()
                val inputAddress = etStreetAddressInput.text.toString()
                val inputCity = etCityInput.text.toString()
                val inputState= etStateInput.text.toString()
                val inputZipCode = etZipCodeInput.text.toString()

               var person = Person(inputFirstName , inputLastName, inputAddress, inputCity, inputState, inputZipCode)
                tvFirstName.text = person.firstName
                tvlastName.text = person.lastName
                tvAddress.text = person.streetAddress
                tvCity.text = person.city
                tvState.text = person.state
                tvZipCode.text = person.zipCode
            }
            else -> {
            }
        }
}
