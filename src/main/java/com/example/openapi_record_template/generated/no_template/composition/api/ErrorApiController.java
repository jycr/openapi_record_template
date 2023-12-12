package com.example.openapi_record_template.generated.no_template.composition.api;

import com.example.openapi_record_template.generated.no_template.composition.dto.FindErrors200ResponseInner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Controller
@RequestMapping("${openapi.compositionError.base-path:}")
public class ErrorApiController implements ErrorApi {

    private final ErrorApiDelegate delegate;

    public ErrorApiController(@Autowired(required = false) ErrorApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ErrorApiDelegate() {});
    }

    @Override
    public ErrorApiDelegate getDelegate() {
        return delegate;
    }

}
