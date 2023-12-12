package com.example.openapi_record_template.delegateService;

import com.example.openapi_record_template.generated.no_template.inheritance.api.PetApiDelegate;
import com.example.openapi_record_template.generated.no_template.inheritance.dto.Cat;
import com.example.openapi_record_template.generated.no_template.inheritance.dto.Dog;
import com.example.openapi_record_template.generated.no_template.inheritance.dto.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PetApiDelegateImpl implements PetApiDelegate {
    @Override
    public ResponseEntity<List<Pet>> findPets() {
        return ResponseEntity.ok(List.of(
                new Pet().name("Bobby").petType("Cat"),
                new Cat().name("joji").petType("Cat").huntingSkill(Cat.HuntingSkillEnum.ADVENTUROUS),
                new Dog().name("katy").petType("Dog").packSize(12),
                new Cat().name("Liam").huntingSkill(Cat.HuntingSkillEnum.LAZY),
                new Dog().name("Otto").packSize(16),
                new Cat().name("Max").petType("Dog").huntingSkill(Cat.HuntingSkillEnum.CLUELESS), // invalid petType
                new Dog().name("Charlie").petType("Cat").packSize(12) // invalid petType
        ));
    }
}
