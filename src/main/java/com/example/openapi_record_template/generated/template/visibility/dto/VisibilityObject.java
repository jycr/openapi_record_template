package com.example.openapi_record_template.generated.template.visibility.dto;

import lombok.Builder;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import jakarta.annotation.Nullable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * VisibilityObject
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Builder(toBuilder = true)
public record VisibilityObject (
        
		@Schema(name = "onlyForRequest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
		@JsonProperty("onlyForRequest")
		String onlyForRequest,
        
		@Schema(name = "onlyForResponse", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
		@JsonProperty("onlyForResponse")
		String onlyForResponse,
        
		@Schema(name = "forBoth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
		@JsonProperty("forBoth")
		String forBoth,
		@Nullable()
        
		@Schema(name = "nullableField", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
		@JsonProperty("nullableField")
		String nullableField,
        @NotNull 
		@Schema(name = "requiredField", requiredMode = Schema.RequiredMode.REQUIRED)
		@JsonProperty("requiredField")
		String requiredField,
		@Nullable()
        @Pattern(regexp = "^[a-zA-Z0-9]+$", message="Only letters and numbers are allowed") @Size(min = 1, max = 20) 
		@Schema(name = "nullablePatternField", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
		@JsonProperty("nullablePatternField")
		String nullablePatternField,
        @Valid 
		@Schema(name = "dateField", example = "Wed Jan 01 02:00:00 EET 2020", description = "Date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
		@JsonProperty("dateField")
		@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
		LocalDate dateField,
        @Valid 
		@Schema(name = "dateTimeField", example = "2020-01-01T00:00Z", description = "Date time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
		@JsonProperty("dateTimeField")
		@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
		OffsetDateTime dateTimeField,
        
        @Deprecated
		@Schema(name = "deprecatedField", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
		@JsonProperty("deprecatedField")
		String deprecatedField
) {
}

