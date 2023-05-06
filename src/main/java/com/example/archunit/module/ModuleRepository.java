package com.example.archunit.module;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModuleRepository extends JpaRepository<ModuleEntity, Long> {

  ModuleEntity findByTitleLikeIgnoreCaseAndSubtitleLikeIgnoreCase(String title, String subtitle);

}
