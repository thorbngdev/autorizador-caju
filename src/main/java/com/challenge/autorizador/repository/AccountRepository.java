package com.challenge.autorizador.repository;

import com.challenge.autorizador.model.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
}
