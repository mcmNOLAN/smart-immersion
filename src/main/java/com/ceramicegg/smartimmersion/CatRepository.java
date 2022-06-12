package com.ceramicegg.smartimmersion;

import org.springframework.data.repository.CrudRepository;

public interface CatRepository extends CrudRepository<CatFact, Long> {
}
