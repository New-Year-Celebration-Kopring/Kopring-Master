package com.example.kopringstudy.controller

import com.example.kopringstudy.dto.MemberDto
import com.example.kopringstudy.entity.MemberEntity
import com.example.kopringstudy.service.MemberService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

class MemberController {
    @RestController
    @RequestMapping("/v1/member")
    class MemberController (
            private val memberService: MemberService,
    ){
        @GetMapping("/{name}")
        fun getMember(@PathVariable(value = "name") name: String): ResponseEntity<MemberEntity> {
            return ResponseEntity.ok(memberService.findMember(name).get())
        }

        @PostMapping("")
        fun insertMember(@RequestBody memberDto: MemberDto): ResponseEntity<Any> {
            memberService.save(memberDto)
            return ResponseEntity.status(HttpStatus.CREATED).body("회원가입 완료")
        }
    }
}