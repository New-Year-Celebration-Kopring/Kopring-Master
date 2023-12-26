package com.example.kopringstudy.controller

import com.example.kopringstudy.dto.MemberDto
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1")
class HelloController {
    @GetMapping("/hello")
    fun hello(): String{
        return "hello"
    }

    @GetMapping("/user")
    fun user(): ResponseEntity<Any> {
        val user = MemberDto("juno", "juno@mail.com")
        return ResponseEntity.ok(user)
    }
}