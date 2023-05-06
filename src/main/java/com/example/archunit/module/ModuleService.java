package com.example.archunit.module;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ModuleService {

  private final ModuleRepository moduleRepository;
  public Long example() {
    return moduleRepository.findByTitleLikeIgnoreCaseAndSubtitleLikeIgnoreCase("test", "test")
        .getId();
  }

  public Long example2() {
    return -1L;
  }

  public Long example3() {
    return -1L;
  }

  private String privateMethod() {
    return "test";
  }

}
