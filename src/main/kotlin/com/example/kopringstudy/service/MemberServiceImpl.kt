package com.example.kopringstudy.service

import com.example.kopringstudy.dto.MemberDto
import com.example.kopringstudy.entity.MemberEntity
import com.example.kopringstudy.repository.MemberRepository
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service
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