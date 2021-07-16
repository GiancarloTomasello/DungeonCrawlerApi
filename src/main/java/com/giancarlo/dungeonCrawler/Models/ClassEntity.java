package com.giancarlo.dungeonCrawler.Models;

import javax.persistence.*;

//Should be managed and created by a admin

@Entity
@Table(name = "classes")
public class ClassEntity {

    @Id
    @Column(name = "class_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int classId;

    @Column(name = "class_name", nullable = false)
    private String className;

    @Column(name = "level_req", nullable = false)
    private int levelRequirement;

    @Column(name = "start_health", nullable = false)
    private int startingHealth;

    @Column(name = "start_strength", nullable = false)
    private int startingStrength;

    @Column(name = "start_defense", nullable = false)
    private int startingDefense;
}
