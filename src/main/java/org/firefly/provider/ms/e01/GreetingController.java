package org.firefly.provider.ms.e01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    @GetMapping("/{name}")
    public String greetBody(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
}
