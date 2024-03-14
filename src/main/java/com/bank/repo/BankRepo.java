package com.bank.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.BankEntity;
@Repository
public interface BankRepo extends CrudRepository<BankEntity, Integer> {

}
