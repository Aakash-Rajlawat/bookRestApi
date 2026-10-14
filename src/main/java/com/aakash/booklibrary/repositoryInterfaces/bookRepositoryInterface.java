package com.aakash.booklibrary.repositoryInterfaces;


import com.aakash.booklibrary.entity.bookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bookRepositoryInterface extends JpaRepository<bookEntity,Integer> {
}
