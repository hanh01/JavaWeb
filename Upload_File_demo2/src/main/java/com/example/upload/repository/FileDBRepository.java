package com.example.upload.repository;

import com.example.upload.model.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileDBRepository extends JpaRepository<FileDB, String> {
}
