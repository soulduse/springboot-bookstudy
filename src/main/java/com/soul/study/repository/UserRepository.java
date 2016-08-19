package com.soul.study.repository;

import com.soul.study.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sould on 2016-08-19.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
