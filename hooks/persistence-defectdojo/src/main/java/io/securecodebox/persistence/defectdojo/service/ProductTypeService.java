package io.securecodebox.persistence.defectdojo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import io.securecodebox.persistence.defectdojo.models.DefectDojoResponse;
import io.securecodebox.persistence.defectdojo.models.ProductType;
import org.springframework.stereotype.Component;

@Component
public class ProductTypeService extends GenericDefectDojoService<ProductType> {

  @Override
  protected String getUrlPath() {
    return "product_types";
  }

  @Override
  protected Class<ProductType> getModelClass() {
    return ProductType.class;
  }

  @Override
  protected DefectDojoResponse<ProductType> deserializeList(String response) throws JsonProcessingException {
    return this.objectMapper.readValue(response, new TypeReference<>() {
    });
  }
}