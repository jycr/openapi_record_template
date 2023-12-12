package com.example.openapi_record_template.generated.no_template.composition.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ExtendedErrorModel
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ExtendedErrorModel implements FindErrors200ResponseInner {

  private String message;

  private Integer code;

  private String rootCause;

  public ExtendedErrorModel() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ExtendedErrorModel(String message, Integer code, String rootCause) {
    this.message = message;
    this.code = code;
    this.rootCause = rootCause;
  }

  public ExtendedErrorModel message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @NotNull 
  @Schema(name = "message", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ExtendedErrorModel code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * minimum: 100
   * maximum: 600
   * @return code
  */
  @NotNull @Min(100) @Max(600) 
  @Schema(name = "code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ExtendedErrorModel rootCause(String rootCause) {
    this.rootCause = rootCause;
    return this;
  }

  /**
   * Get rootCause
   * @return rootCause
  */
  @NotNull 
  @Schema(name = "rootCause", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rootCause")
  public String getRootCause() {
    return rootCause;
  }

  public void setRootCause(String rootCause) {
    this.rootCause = rootCause;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedErrorModel extendedErrorModel = (ExtendedErrorModel) o;
    return Objects.equals(this.message, extendedErrorModel.message) &&
        Objects.equals(this.code, extendedErrorModel.code) &&
        Objects.equals(this.rootCause, extendedErrorModel.rootCause);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, code, rootCause);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedErrorModel {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    rootCause: ").append(toIndentedString(rootCause)).append("\n");
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

