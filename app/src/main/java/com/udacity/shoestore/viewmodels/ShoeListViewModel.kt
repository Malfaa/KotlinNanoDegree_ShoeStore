package com.udacity.shoestore.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class ShoeListViewModel : ViewModel() {
    private val _shoeList = MutableLiveData<List<Shoe>>()
    val shoeList: LiveData<List<Shoe>>
        get() = _shoeList

    private val listOfShoes = mutableListOf<Shoe>()

    var name:String = ""
    var size:String = ""
    var company:String = ""
    var description:String = ""

    fun addingShoeToTheList(){
        listOfShoes.add(Shoe(name,size.toDouble(),company, description))
        _shoeList.value = listOfShoes
    }

    fun cleaningFields(){
        name = ""
        size = ""
        company = ""
        description = ""
    }

}