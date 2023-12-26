package com.example.kopringstudy.service

import com.example.kopringstudy.dto.MemberDto
import com.example.kopringstudy.entity.MemberEntity
import java.util.Optional

interface MemberService {
    fun findMember(name: String): Optional<MemberEntity>
    fun save(memberDto: MemberDto)
}