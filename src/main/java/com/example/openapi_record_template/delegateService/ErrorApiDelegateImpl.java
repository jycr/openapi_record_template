package com.example.openapi_record_template.delegateService;

import com.example.openapi_record_template.generated.no_template.composition.api.ErrorApiDelegate;
import com.example.openapi_record_template.generated.no_template.composition.dto.ErrorModel;
import com.example.openapi_record_template.generated.no_template.composition.dto.ExtendedErrorModel;
import com.example.openapi_record_template.generated.no_template.composition.dto.FindErrors200ResponseInner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ErrorApiDelegateImpl implements ErrorApiDelegate {
    @Override
    public ResponseEntity<List<FindErrors200ResponseInner>> findErrors() {
        return ResponseEntity.ok(
                List.of(
                        new ErrorModel().code(1).message("Error 1"),
                        new ExtendedErrorModel().code(2).message("Error 2").rootCause("Root cause 2")
                )
        );
    }
}
