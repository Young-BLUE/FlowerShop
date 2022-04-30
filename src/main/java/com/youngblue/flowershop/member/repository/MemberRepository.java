package com.youngblue.flowershop.member.repository;

import com.youngblue.flowershop.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
