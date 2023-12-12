package com.example.openapi_record_template.generated.no_template.visibility.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * VisibilityObject
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class VisibilityObject {

  private String onlyForRequest;

  private String onlyForResponse;

  private String forBoth;

  private JsonNullable<String> nullableField = JsonNullable.<String>undefined();

  private String requiredField;

  private JsonNullable<String> nullablePatternField = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateField;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dateTimeField;

  @Deprecated
  private String deprecatedField;

  public VisibilityObject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public VisibilityObject(String requiredField) {
    this.requiredField = requiredField;
  }

  public VisibilityObject onlyForRequest(String onlyForRequest) {
    this.onlyForRequest = onlyForRequest;
    return this;
  }

  /**
   * Get onlyForRequest
   * @return onlyForRequest
  */
  
  @Schema(name = "onlyForRequest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("onlyForRequest")
  public String getOnlyForRequest() {
    return onlyForRequest;
  }

  public void setOnlyForRequest(String onlyForRequest) {
    this.onlyForRequest = onlyForRequest;
  }

  public VisibilityObject onlyForResponse(String onlyForResponse) {
    this.onlyForResponse = onlyForResponse;
    return this;
  }

  /**
   * Get onlyForResponse
   * @return onlyForResponse
  */
  
  @Schema(name = "onlyForResponse", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("onlyForResponse")
  public String getOnlyForResponse() {
    return onlyForResponse;
  }

  public void setOnlyForResponse(String onlyForResponse) {
    this.onlyForResponse = onlyForResponse;
  }

  public VisibilityObject forBoth(String forBoth) {
    this.forBoth = forBoth;
    return this;
  }

  /**
   * Get forBoth
   * @return forBoth
  */
  
  @Schema(name = "forBoth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("forBoth")
  public String getForBoth() {
    return forBoth;
  }

  public void setForBoth(String forBoth) {
    this.forBoth = forBoth;
  }

  public VisibilityObject nullableField(String nullableField) {
    this.nullableField = JsonNullable.of(nullableField);
    return this;
  }

  /**
   * Get nullableField
   * @return nullableField
  */
  
  @Schema(name = "nullableField", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nullableField")
  public JsonNullable<String> getNullableField() {
    return nullableField;
  }

  public void setNullableField(JsonNullable<String> nullableField) {
    this.nullableField = nullableField;
  }

  public VisibilityObject requiredField(String requiredField) {
    this.requiredField = requiredField;
    return this;
  }

  /**
   * Get requiredField
   * @return requiredField
  */
  @NotNull 
  @Schema(name = "requiredField", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requiredField")
  public String getRequiredField() {
    return requiredField;
  }

  public void setRequiredField(String requiredField) {
    this.requiredField = requiredField;
  }

  public VisibilityObject nullablePatternField(String nullablePatternField) {
    this.nullablePatternField = JsonNullable.of(nullablePatternField);
    return this;
  }

  /**
   * Get nullablePatternField
   * @return nullablePatternField
  */
  @Pattern(regexp = "^[a-zA-Z0-9]+$", message="Only letters and numbers are allowed") @Size(min = 1, max = 20) 
  @Schema(name = "nullablePatternField", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nullablePatternField")
  public JsonNullable<String> getNullablePatternField() {
    return nullablePatternField;
  }

  public void setNullablePatternField(JsonNullable<String> nullablePatternField) {
    this.nullablePatternField = nullablePatternField;
  }

  public VisibilityObject dateField(LocalDate dateField) {
    this.dateField = dateField;
    return this;
  }

  /**
   * Date
   * @return dateField
  */
  @Valid 
  @Schema(name = "dateField", example = "Wed Jan 01 02:00:00 EET 2020", description = "Date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateField")
  public LocalDate getDateField() {
    return dateField;
  }

  public void setDateField(LocalDate dateField) {
    this.dateField = dateField;
  }

  public VisibilityObject dateTimeField(OffsetDateTime dateTimeField) {
    this.dateTimeField = dateTimeField;
    return this;
  }

  /**
   * Date time
   * @return dateTimeField
  */
  @Valid 
  @Schema(name = "dateTimeField", example = "2020-01-01T00:00Z", description = "Date time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateTimeField")
  public OffsetDateTime getDateTimeField() {
    return dateTimeField;
  }

  public void setDateTimeField(OffsetDateTime dateTimeField) {
    this.dateTimeField = dateTimeField;
  }

  public VisibilityObject deprecatedField(String deprecatedField) {
    this.deprecatedField = deprecatedField;
    return this;
  }

  /**
   * Get deprecatedField
   * @return deprecatedField
   * @deprecated
  */
  
  @Schema(name = "deprecatedField", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deprecatedField")
  @Deprecated
  public String getDeprecatedField() {
    return deprecatedField;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setDeprecatedField(String deprecatedField) {
    this.deprecatedField = deprecatedField;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VisibilityObject visibilityObject = (VisibilityObject) o;
    return Objects.equals(this.onlyForRequest, visibilityObject.onlyForRequest) &&
        Objects.equals(this.onlyForResponse, visibilityObject.onlyForResponse) &&
        Objects.equals(this.forBoth, visibilityObject.forBoth) &&
        equalsNullable(this.nullableField, visibilityObject.nullableField) &&
        Objects.equals(this.requiredField, visibilityObject.requiredField) &&
        equalsNullable(this.nullablePatternField, visibilityObject.nullablePatternField) &&
        Objects.equals(this.dateField, visibilityObject.dateField) &&
        Objects.equals(this.dateTimeField, visibilityObject.dateTimeField) &&
        Objects.equals(this.deprecatedField, visibilityObject.deprecatedField);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlyForRequest, onlyForResponse, forBoth, hashCodeNullable(nullableField), requiredField, hashCodeNullable(nullablePatternField), dateField, dateTimeField, deprecatedField);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VisibilityObject {\n");
    sb.append("    onlyForRequest: ").append(toIndentedString(onlyForRequest)).append("\n");
    sb.append("    onlyForResponse: ").append(toIndentedString(onlyForResponse)).append("\n");
    sb.append("    forBoth: ").append(toIndentedString(forBoth)).append("\n");
    sb.append("    nullableField: ").append(toIndentedString(nullableField)).append("\n");
    sb.append("    requiredField: ").append(toIndentedString(requiredField)).append("\n");
    sb.append("    nullablePatternField: ").append(toIndentedString(nullablePatternField)).append("\n");
    sb.append("    dateField: ").append(toIndentedString(dateField)).append("\n");
    sb.append("    dateTimeField: ").append(toIndentedString(dateTimeField)).append("\n");
    sb.append("    deprecatedField: ").append(toIndentedString(deprecatedField)).append("\n");
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

