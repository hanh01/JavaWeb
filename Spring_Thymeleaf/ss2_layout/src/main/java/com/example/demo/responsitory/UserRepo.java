package com.example.demo.responsitory;

import com.example.demo.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepo extends JpaRepository<UserEntity,Integer> {
    @Query("select p from UserEntity p where p.name like %:name%")
    List<UserEntity> findAllByName(String name, Pageable pageable);

    Page<UserEntity> findAllByNameContaining(String firstname, Pageable pageable);
}
