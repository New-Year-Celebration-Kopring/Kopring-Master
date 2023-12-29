package com.example.kopringstudy.service

import com.example.kopringstudy.service.dto.MemberDto
import com.example.kopringstudy.domain.MemberEntity
import java.util.Optional

interface MemberService {
    fun findMember(name: String): Optional<MemberEntity>
    fun save(memberDto: MemberDto)
}