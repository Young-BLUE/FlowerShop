package com.youngblue.flowershop.member.service;

import com.youngblue.common.JsonResult;
import com.youngblue.flowershop.member.dto.MemberJoinDTO;
import com.youngblue.flowershop.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public JsonResult join(MemberJoinDTO memberJoinDTO) {
        return null;
    }

}
