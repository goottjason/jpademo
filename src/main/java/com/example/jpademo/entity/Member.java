package com.example.jpademo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}

// curl -X POST http://localhost:8081/members -H "Content-Type: application/json; charset=utf-8" -d '{"name":"lee"}'
// curl http://localhost:8081/members