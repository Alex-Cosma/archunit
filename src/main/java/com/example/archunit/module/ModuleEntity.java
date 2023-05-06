package com.example.archunit.module;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ModuleEntity {
  @Id
  private Long id;

  private String title;

  private String subtitle;
}
