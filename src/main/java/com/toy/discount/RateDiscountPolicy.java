package com.toy.discount;

import com.toy.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {
    public int discount(Member member, int itemPrice) {
        return 0;
    }
}
