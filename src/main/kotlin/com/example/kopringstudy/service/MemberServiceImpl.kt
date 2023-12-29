package com.example.kopringstudy.service

import com.example.kopringstudy.service.dto.MemberDto
import com.example.kopringstudy.domain.MemberEntity
import com.example.kopringstudy.domain.MemberRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
class MemberServiceImpl (
        private val memberRepository: MemberRepository,
): MemberService{
    override fun findMember(name: String): Optional<MemberEntity> {
        return memberRepository.findByName(name)
    }

    @Transactional
    override fun save(memberDto: MemberDto) {
        memberRepository.save(MemberEntity(memberDto.name, memberDto.email, memberDto.phone))
    }
}