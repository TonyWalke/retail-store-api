package com.retail.store.price.domain.mapper;

import com.retail.store.price.adapter.repository.model.Price;
import com.retail.store.price.domain.model.PriceVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PriceToPriceVOMapper {

  @Mapping(source = "price.brandId", target = "brandId")
  PriceVO mapToPriceVO(Price price);
}