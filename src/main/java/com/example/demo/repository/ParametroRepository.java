package com.example.demo.repository;

import com.example.demo.entity.ParametroEntity;
import com.example.demo.entity.UserPruebaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ParametroRepository extends JpaRepository<ParametroEntity, Integer> {

    @Query(value = "select t.* from V_PARAM_ESTR_METALICAS t", nativeQuery = true)
    List<ParametroEntity> ListParametroView();
}
