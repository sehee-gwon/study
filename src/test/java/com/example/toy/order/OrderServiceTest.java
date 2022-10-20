package com.example.toy.order;

import com.toy.AppConfig;
import com.toy.member.Grade;
import com.toy.member.Member;
import com.toy.member.MemberService;
import com.toy.order.OrderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(1L, "memberA", Grade.VIP);


    }
}
