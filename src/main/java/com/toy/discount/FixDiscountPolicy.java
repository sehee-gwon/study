package com.toy.discount;

import com.toy.member.Grade;
import com.toy.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;

    public int discount(Member member, int itemPrice) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
