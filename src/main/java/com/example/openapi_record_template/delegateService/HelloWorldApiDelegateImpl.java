package com.example.openapi_record_template.delegateService;


import com.example.openapi_record_template.generated.template.hello_world.api.HelloWorldApiDelegate;
import com.example.openapi_record_template.generated.template.hello_world.dto.HelloWorld;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldApiDelegateImpl implements HelloWorldApiDelegate {
    @Override
    public ResponseEntity<HelloWorld> helloWorld() {
        return ResponseEntity.ok(HelloWorld.builder().message("Hello world").build());
    }
}
