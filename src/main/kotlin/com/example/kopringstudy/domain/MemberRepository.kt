package com.example.kopringstudy.domain

import com.example.kopringstudy.domain.MemberEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface MemberRepository : JpaRepository<MemberEntity,Long>{
    fun findByName(name: String): Optional<MemberEntity>
}