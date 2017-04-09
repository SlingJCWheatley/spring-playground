package com.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class EndpointsController {

    @GetMapping("/pi")
    public String getMathPi() {
        return String.format("%.15f", Math.PI);
    }
}