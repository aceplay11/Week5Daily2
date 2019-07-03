# Week5Daily2
Using Kotlin:
Create an activity with an edittext for each item listed below.  On a button click, have the values from the edit text save to an Person Object. populate text views for each of the items below from the person object. (You have to make the person class)  
	First Name
	Last Name
	Street Address
	City
	State
	Zip
  
  <?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#50C925"
        tools:context=".MainActivity">

    <TextView
            android:id="@+id/tvFirstName"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="@string/first_name"
            app:layout_constraintBottom_toTopOf="@id/tvlastName"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintTop_toTopOf="parent"
            style="@style/TextView"/>

    <TextView
            android:id="@+id/tvlastName"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="@string/last_name"
            app:layout_constraintBottom_toTopOf="@id/tvAddress"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintTop_toBottomOf="@id/tvFirstName"
            style="@style/TextView"/>

    <TextView
            android:id="@+id/tvAddress"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="@string/street_address"
            app:layout_constraintBottom_toTopOf="@id/tvCity"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintTop_toBottomOf="@id/tvlastName"
            style="@style/TextView" />

    <TextView
            android:id="@+id/tvCity"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="@string/city"
            app:layout_constraintBottom_toTopOf="@id/tvState"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintTop_toBottomOf="@id/tvAddress"
            style="@style/TextView" />

    <TextView
            android:id="@+id/tvState"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="@string/state"
            app:layout_constraintBottom_toTopOf="@id/tvZipCode"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintTop_toBottomOf="@id/tvCity"
            style="@style/TextView" />

    <TextView
            android:id="@+id/tvZipCode"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="@string/zipcode"
            app:layout_constraintBottom_toTopOf="@id/etfirstNameInput"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintTop_toBottomOf="@id/tvState"
            style="@style/TextView"/>

    <EditText
            android:id="@+id/etfirstNameInput"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="@string/enter_first_name"
            app:layout_constraintBottom_toTopOf="@id/etlastNameInput"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintTop_toBottomOf="@id/tvZipCode"
            style="@style/EditText" />

    <EditText
            android:id="@+id/etlastNameInput"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="@string/enter_last_name"
            app:layout_constraintBottom_toTopOf="@id/etStreetAddressInput"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintTop_toBottomOf="@id/etfirstNameInput"
            style="@style/EditText" />

    <EditText
            android:id="@+id/etStreetAddressInput"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="@string/enter_street_address"
            app:layout_constraintBottom_toTopOf="@id/etCityInput"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintTop_toBottomOf="@id/etlastNameInput"
            style="@style/EditText" />

    <EditText
            android:id="@+id/etCityInput"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="@string/enter_city"
            app:layout_constraintBottom_toTopOf="@id/etStateInput"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintTop_toBottomOf="@id/etStreetAddressInput"
            style="@style/EditText" />

    <EditText
            android:id="@+id/etStateInput"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="@string/enter_state"
            app:layout_constraintBottom_toTopOf="@id/etZipCodeInput"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintTop_toBottomOf="@id/etCityInput"
            style="@style/EditText" />

    <EditText
            android:id="@+id/etZipCodeInput"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="@string/enter_zip_code"
            app:layout_constraintBottom_toTopOf="@id/btnSubmit"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintTop_toBottomOf="@id/etStateInput"
            style="@style/EditText" />

    <Button
            android:id="@+id/btnSubmit"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@string/submit_inputs"
            android:onClick="onClick"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintLeft_toLeftOf="parent"
            app:layout_constraintRight_toRightOf="parent"
            app:layout_constraintTop_toBottomOf="@id/etZipCodeInput"
            android:background="#FF9800"
            android:textColor="#0B5B99"/>



</androidx.constraintlayout.widget.ConstraintLayout>


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

  
  ![week5day2screenshot2small](https://user-images.githubusercontent.com/51377336/60610820-c062d780-9d92-11e9-9d31-31109efad8fe.png)
  
  
![week5day2screenshot1small](https://user-images.githubusercontent.com/51377336/60610821-c062d780-9d92-11e9-8fac-fbb7020cbccd.png)
