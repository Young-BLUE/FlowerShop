package com.youngblue.flowershop.member.domain;

import com.youngblue.flowershop.authority.Authorities;
import com.youngblue.flowershop.member.MemberGrade;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id")
    private String id;

    private String name;

    private String phoneNumber;

    private String email;

    private String password;

    private Long point;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Authorities authority;

    private MemberGrade memberGrade;

    private String zipcode;

    private String address1;

    private String address2;

    // TODO: Coupon 객체로 변경
    private List<String> coupons;

}
