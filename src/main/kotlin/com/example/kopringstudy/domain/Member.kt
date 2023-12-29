package com.example.kopringstudy.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "MEMBER")
class MemberEntity (
    @Column(name="name", nullable = false)
    var name: String,

    @Column(name="email", nullable = false)
    val email: String,

    @Column(name="phone", nullable = true)
    val phone: String? =null,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
){
    fun changeName(name: String){
        this.name = name
    }
}