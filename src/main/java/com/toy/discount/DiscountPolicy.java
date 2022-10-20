package com.toy.discount;

import com.toy.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int itemPrice);
}
