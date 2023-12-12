/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.openapi_record_template.generated.no_template.visibility.api;

import com.example.openapi_record_template.generated.no_template.visibility.dto.VisibilityObject;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Tag(name = "Hello world", description = "the Hello world API")
public interface VisibilityApi {

    default VisibilityApiDelegate getDelegate() {
        return new VisibilityApiDelegate() {};
    }

    /**
     * GET /visibility : Hello world
     * Hello world
     *
     * @return Hello world (status code 200)
     */
    @Operation(
        operationId = "helloWorld",
        summary = "Hello world",
        description = "Hello world",
        tags = { "Hello world" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Hello world", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = VisibilityObject.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/visibility",
        produces = { "application/json" }
    )
    
    default ResponseEntity<VisibilityObject> helloWorld(
        
    ) {
        return getDelegate().helloWorld();
    }


    /**
     * POST /visibility : Hello world
     * Hello world
     *
     * @param visibilityObject Hello world (optional)
     * @return Hello world (status code 200)
     */
    @Operation(
        operationId = "helloWorldPost",
        summary = "Hello world",
        description = "Hello world",
        tags = { "Hello world" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Hello world", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = VisibilityObject.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/visibility",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<VisibilityObject> helloWorldPost(
        @Parameter(name = "VisibilityObject", description = "Hello world") @Valid @RequestBody(required = false) VisibilityObject visibilityObject
    ) {
        return getDelegate().helloWorldPost(visibilityObject);
    }

}
