package com.example.kopringstudy.repository

import com.example.kopringstudy.entity.MemberEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface MemberRepository : JpaRepository<MemberEntity,Long>{
    fun findByName(name: String): Optional<MemberEntity>
}