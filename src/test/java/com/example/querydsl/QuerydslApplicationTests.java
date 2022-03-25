package com.example.querydsl;

import com.example.querydsl.repository.MemberRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@Rollback(value = false)
class QuerydslApplicationTests {

	@Autowired
	JPAQueryFactory jpaQueryFactory;

	@Autowired
	MemberRepository memberRepository;

	@Test
	void contextLoads() {
	}
}
