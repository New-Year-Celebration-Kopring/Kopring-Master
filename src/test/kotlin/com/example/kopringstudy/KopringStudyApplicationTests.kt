package com.example.kopringstudy

import com.example.kopringstudy.domain.MemberEntity
import com.example.kopringstudy.domain.MemberRepository
import com.example.kopringstudy.service.dto.MemberDto
import com.example.kopringstudy.service.MemberService
import jakarta.transaction.Transactional
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

/*@SpringBootTest
class KopringStudyApplicationTests {

	@Test
	fun contextLoads() {
	}

}*/
@SpringBootTest
class MemberServiceImplTest(
		@Autowired val memberService: MemberService,
		@Autowired val memberRepository: MemberRepository,
){
	@Test
	@DisplayName("member 조회에 성공한다.")
	@Transactional
	fun memberFind(){
		//given
		val member = MemberEntity("juno", "juno@mail.com", "01012341234")
		val memberDto = MemberDto("eunhwa", "eunhwa@mail.com", "01012341234")

		memberRepository.save(member)
		memberService.save(memberDto)
		//when
		val all: List<MemberEntity> = memberRepository.findAll()
		for (mem in all) {
			println("mem = " + mem.name)
		}
		/*
		val findMember = memberService.findMember("juno").get()
		println(findMember.name)
		println(findMember.phone)
*/
	}
}

