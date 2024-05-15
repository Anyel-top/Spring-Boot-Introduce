package top.anyel.hola.controller;

import org.springframework.web.bind.annotation.*;
import top.anyel.hola.entities.Person;

@RestController
@RequestMapping("/person/v1")
public class PersonController {

    @PostMapping(value = "/save")
    public Person save(@RequestBody Person person) {
        return person;
    }

}
