package com.toy.discount;

import com.toy.member.Member;
import org.springframework.stereotype.Component;

@Component
public class RateDiscountPolicy implements DiscountPolicy {
    public int discount(Member member, int itemPrice) {
        return 0;
    }
}
