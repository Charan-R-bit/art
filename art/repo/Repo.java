package com.art.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.art.entity.art;

@Repository
public interface Repo extends JpaRepository<art, Integer>
{

}
