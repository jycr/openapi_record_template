package com.example.openapi_record_template.generated.no_template.inheritance.dto;

import java.net.URI;
import java.util.Objects;
import com.example.openapi_record_template.generated.no_template.inheritance.dto.Pet;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A representation of a cat
 */

@Schema(name = "Cat", description = "A representation of a cat")

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Cat extends Pet {

  /**
   * The measured skill for hunting
   */
  public enum HuntingSkillEnum {
    CLUELESS("clueless"),
    
    LAZY("lazy"),
    
    ADVENTUROUS("adventurous"),
    
    AGGRESSIVE("aggressive");

    private String value;

    HuntingSkillEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HuntingSkillEnum fromValue(String value) {
      for (HuntingSkillEnum b : HuntingSkillEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private HuntingSkillEnum huntingSkill;

  public Cat() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Cat(HuntingSkillEnum huntingSkill, String name, String petType) {
    super(name, petType);
    this.huntingSkill = huntingSkill;
  }

  public Cat huntingSkill(HuntingSkillEnum huntingSkill) {
    this.huntingSkill = huntingSkill;
    return this;
  }

  /**
   * The measured skill for hunting
   * @return huntingSkill
  */
  @NotNull 
  @Schema(name = "huntingSkill", description = "The measured skill for hunting", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("huntingSkill")
  public HuntingSkillEnum getHuntingSkill() {
    return huntingSkill;
  }

  public void setHuntingSkill(HuntingSkillEnum huntingSkill) {
    this.huntingSkill = huntingSkill;
  }


  public Cat name(String name) {
    super.name(name);
    return this;
  }

  public Cat petType(String petType) {
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
    Cat cat = (Cat) o;
    return Objects.equals(this.huntingSkill, cat.huntingSkill) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(huntingSkill, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cat {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    huntingSkill: ").append(toIndentedString(huntingSkill)).append("\n");
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

