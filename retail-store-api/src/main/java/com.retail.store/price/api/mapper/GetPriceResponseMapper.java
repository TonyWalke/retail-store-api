package com.retail.store.price.api.mapper;

import com.retail.store.price.api.response.GetPriceResponse;
import com.retail.store.price.domain.model.PriceVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class GetPriceResponseMapper {

  @Mapping(target = "brandId", source = "priceVO.brandId.id")
  public abstract GetPriceResponse mapToGetPriceResponse(PriceVO priceVO);
}