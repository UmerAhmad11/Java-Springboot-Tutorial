package com.tutorial.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {
    @GetMapping
    public List<SoftwareEngineer> getEngineers(){
        return List.of(
            new SoftwareEngineer(
                1,
                "James",
                "javascript, python, c#"
            ),
            new SoftwareEngineer(
                2,
                "Allen",
                "c++, c, ruby#"
            ),
            new SoftwareEngineer(
                3,
                "Miles",
                "java, typescript, react#"
            )
        );
    }
    
}
