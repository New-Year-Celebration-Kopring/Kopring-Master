package com.example.kopringstudy

import com.example.kopringstudy.entity.MemberEntity
import com.example.kopringstudy.repository.MemberRepository
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
		memberRepository.save(member)
		//when
		//val findMember = memberService.findMember("juno").get()
		//then
		//assert(findMember.name, member.name)
	}
}
