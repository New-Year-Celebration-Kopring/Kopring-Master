package com.example.kopringstudy.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "MEMBER")
class MemberEntity (
    var name: String,
    val email: String,
    val phone: String? =null,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
){
    fun changeName(name: String){
        this.name = name
    }
}