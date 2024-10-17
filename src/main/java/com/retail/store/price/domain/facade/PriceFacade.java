package com.retail.store.price.domain.facade;

import com.retail.store.price.adapter.repository.PriceRepository;
import com.retail.store.price.adapter.repository.model.Price;
import java.time.LocalDateTime;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PriceFacade {

  private final PriceRepository priceRepository;

  public Optional<Price> getPriceVO(LocalDateTime applicationDate, Long productId, Long brandId) {
    return Optional.ofNullable(
        priceRepository.getCurrentPrice(brandId, productId, applicationDate));
  }
}