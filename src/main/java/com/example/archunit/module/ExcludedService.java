package com.example.archunit.module;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExcludedService {

  public String method() {
    return "test";
  }

  public String method2() {
    return "test";
  }

}
