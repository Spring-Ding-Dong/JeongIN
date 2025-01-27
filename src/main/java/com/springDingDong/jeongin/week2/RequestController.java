package com.springDingDong.jeongin.week2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("request")
@RequiredArgsConstructor
public class RequestController {
    @PersistenceContext
    private EntityManager entityManager;

    public RequestController(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @PostMapping("/member")
    @Transactional
    public Long testPost(@RequestBody Member member){
        System.out.println("member:" + member);
        entityManager.persist(member);
        return member.getId();
    }

}
