package com.giancarlo.dungeonCrawler.Repository;

import com.giancarlo.dungeonCrawler.Models.AccountEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<AccountEntity, Integer> {
}
