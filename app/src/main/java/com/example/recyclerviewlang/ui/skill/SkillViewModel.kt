package com.example.recyclerviewlang.ui.skill

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SkillViewModel  : ViewModel(){
    private val _texts = MutableLiveData<List<String>>().apply {
        value = (1..10).mapIndexed { _, i ->
            "Skill # $i"
        }
    }

    val texts: LiveData<List<String>> = _texts
}