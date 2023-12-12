package com.example.openapi_record_template.generated.template.visibility.api;

import com.example.openapi_record_template.generated.template.visibility.dto.VisibilityObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link VisibilityApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface VisibilityApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /visibility : Hello world
     * Hello world
     *
     * @return Hello world (status code 200)
     * @see VisibilityApi#helloWorld
     */
    default ResponseEntity<VisibilityObject> helloWorld() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"forBoth\" : \"forBoth\", \"onlyForRequest\" : \"onlyForRequest\", \"nullableField\" : \"nullableField\", \"requiredField\" : \"requiredField\", \"deprecatedField\" : \"deprecatedField\", \"onlyForResponse\" : \"onlyForResponse\", \"dateField\" : \"2020-01-01T00:00:00.000+00:00\", \"dateTimeField\" : \"2020-01-01T00:00:00Z\", \"nullablePatternField\" : \"nullablePatternField\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /visibility : Hello world
     * Hello world
     *
     * @param visibilityObject Hello world (optional)
     * @return Hello world (status code 200)
     * @see VisibilityApi#helloWorldPost
     */
    default ResponseEntity<VisibilityObject> helloWorldPost(VisibilityObject visibilityObject) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"forBoth\" : \"forBoth\", \"onlyForRequest\" : \"onlyForRequest\", \"nullableField\" : \"nullableField\", \"requiredField\" : \"requiredField\", \"deprecatedField\" : \"deprecatedField\", \"onlyForResponse\" : \"onlyForResponse\", \"dateField\" : \"2020-01-01T00:00:00.000+00:00\", \"dateTimeField\" : \"2020-01-01T00:00:00Z\", \"nullablePatternField\" : \"nullablePatternField\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
