package com.example.openapi_record_template.generated.no_template.inheritance.dto;

import java.net.URI;
import java.util.Objects;
import com.example.openapi_record_template.generated.no_template.inheritance.dto.Pet;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A representation of a dog
 */

@Schema(name = "Dog", description = "A representation of a dog")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Dog extends Pet {

  private Integer packSize = 0;

  public Dog() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Dog(Integer packSize, String name, String petType) {
    super(name, petType);
    this.packSize = packSize;
  }

  public Dog packSize(Integer packSize) {
    this.packSize = packSize;
    return this;
  }

  /**
   * the size of the pack the dog is from
   * minimum: 0
   * @return packSize
  */
  @NotNull @Min(0) 
  @Schema(name = "packSize", description = "the size of the pack the dog is from", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("packSize")
  public Integer getPackSize() {
    return packSize;
  }

  public void setPackSize(Integer packSize) {
    this.packSize = packSize;
  }


  public Dog name(String name) {
    super.name(name);
    return this;
  }

  public Dog petType(String petType) {
    super.petType(petType);
    return this;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dog dog = (Dog) o;
    return Objects.equals(this.packSize, dog.packSize) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packSize, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dog {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    packSize: ").append(toIndentedString(packSize)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

