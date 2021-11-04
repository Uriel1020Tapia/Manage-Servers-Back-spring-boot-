package com.urtaav.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.urtaav.app.model.Server;

public interface ServerRepository extends JpaRepository<Server, Long>{
	Server findByIpAddress(String ipAddress);
}
