/*
数据库表 = Java 类
数据库列 = Java 属性
数据库一行 = Java 对象*/

/*
package com.example.timeflow.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "schedule_task")
public class ScheduleTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Boolean completed = false;
    private LocalDateTime createAt = LocalDateTime.now();
}*/
package com.example.timeflow.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "schedule_task")
public class ScheduleTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Boolean completed = false;
    private LocalDateTime createdAt = LocalDateTime.now();
    //private LocalDateTime plannedAt;
    private LocalDateTime plannedEnd;
}