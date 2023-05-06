package com.example.archunit.module;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ModuleController {

  private final ModuleService moduleService;

  @GetMapping
  public Long example() {
    return moduleService.example();
  }

}
