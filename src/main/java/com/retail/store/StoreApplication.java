package com.retail.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.retail.store"})
public class StoreApplication {

  public static void main(String[] args) {
    SpringApplication.run(StoreApplication.class, args);
  }

}