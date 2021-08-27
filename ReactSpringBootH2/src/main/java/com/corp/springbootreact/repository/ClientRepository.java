package com.corp.springbootreact.repository;

import com.corp.springbootreact.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
