package com.example.festivalswebservice.repository;

import com.example.festivalswebservice.model.Festival;
import com.example.festivalswebservice.model.OtherActivity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OtherActivityRepository  extends JpaRepository<OtherActivity, Integer> {
}
