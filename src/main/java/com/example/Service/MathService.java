package com.example.Service;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class MathService {

    @GetMapping("/calculate")
    public String calculate(@RequestParam(required = false, defaultValue = "add") String operation,
                            @RequestParam Integer x,
                            @RequestParam Integer y) {
        switch (operation) {
            case "add":
                return String.format("%s + %s = %s", x, y, x + y);
            case "subtract":
                return String.format("%s - %s = %s", x, y, x - y);
            case "multiply":
                return String.format("%s * %s = %s", x, y, x * y);
            case "divide":
                return String.format("%s / %s = %s", x, y, x / y);
            default:
                return "Must specify valid operation like 'add', 'subtract', 'multiply', or 'divide'";
        }
    }

    @PostMapping("/sum")
    public String sum(@RequestParam("n") Integer[] n) {
        String value = null;
        Integer sum = 0;
        for (Integer x : n) {
            value = value == null ? x.toString() : String.format("%s + %s", value, x);
            sum = sum + x;
        }
        return String.format("%s = %s", value, sum);
    }

    @RequestMapping("/volume/{length}/{width}/{height}")
    public String volume(@PathVariable Integer length, @PathVariable Integer width,
                         @PathVariable Integer height) {
        return String.format("The volume of a %sx%sx%s rectangle is %s",
                length, width, height, length * width * height);
    }
}
