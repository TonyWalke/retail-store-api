package com.retail.store.commons.exceptions;

import java.util.Map;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class StoreBadRequestException {

  private final Map<String, String[]> parameters;

  private final String error;
}
