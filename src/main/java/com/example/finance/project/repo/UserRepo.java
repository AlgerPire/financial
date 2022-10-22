package com.example.finance.project.repo;

import com.example.finance.project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
