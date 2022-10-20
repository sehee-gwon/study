package com.toy;

import com.toy.discount.DiscountPolicy;
import com.toy.discount.FixDiscountPolicy;
import com.toy.member.MemberRepository;
import com.toy.member.MemberService;
import com.toy.member.MemberServiceImpl;
import com.toy.member.MemoryMemberRepository;
import com.toy.order.OrderService;
import com.toy.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
}
