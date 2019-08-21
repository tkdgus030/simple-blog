package com.example.blog.controller;
import com.example.blog.vo.Member;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class BlogController {
    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello, Sang.";
    }
    @RequestMapping(value = "/getInfo", method = RequestMethod.GET)
    public Member getInfo() {
        Member member = new Member(1,"Sang hyun, Oh","tkdgus951114@naver.com");

        return member;
        }
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public List<Member> list() {
        List<Member> memberList = Arrays.asList(
            new Member[]{new Member(1,"Sang hyun1, Oh","tkdgus95114@naver.com"),
                new Member(2,"Sang hyun2, Oh","tkdgus951114@naver.com"),
                new Member(3,"Sang hyun3, Oh","tkdgus9511114@naver.com"),
                new Member(4,"Sang hyun4, Oh","tkdgus95111114@naver.com"),
                new Member(5,"Sang hyun5, Oh","tkdgus951111114@naver.com")}
        );
        long startTime = System.currentTimeMillis();
        for (Member member : memberList){ //for -loop (for-each)
            System.out.println(member);
        }
        System.out.println("for loop" +
                (System.currentTimeMillis() - startTime) + "ms ");

        startTime = System.currentTimeMillis();
        memberList.forEach(System.out::println);
        System.out.println("lamda" +
                (System.currentTimeMillis() - startTime) + "ms ");

        return memberList;
    }
}
