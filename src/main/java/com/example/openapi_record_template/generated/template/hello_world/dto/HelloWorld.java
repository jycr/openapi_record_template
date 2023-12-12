package com.example.openapi_record_template.generated.template.hello_world.dto;

import lombok.Builder;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.annotation.Nullable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * HelloWorld
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Builder(toBuilder = true)
public record HelloWorld (
        
		@Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
		@JsonProperty("message")
		String message
) {
}

