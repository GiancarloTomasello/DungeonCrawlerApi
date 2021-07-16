package com.giancarlo.dungeonCrawler.Models;

import javax.persistence.*;

@Entity
@Table(name = "Accounts")
public class AccountEntity {

    @Id
    @Column(name = "account_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountId;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;
}
