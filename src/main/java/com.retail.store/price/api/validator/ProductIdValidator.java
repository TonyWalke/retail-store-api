package com.retail.store.price.api.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

@Component
public class ProductIdValidator implements ConstraintValidator<ProductIdValid, Long> {

  private String message;

  @Override
  public void initialize(ProductIdValid name) {
    message = name.message();
  }

  @Override
  public boolean isValid(Long productId, ConstraintValidatorContext context) {

    return productId != null && productId >= 1L;
  }
}
