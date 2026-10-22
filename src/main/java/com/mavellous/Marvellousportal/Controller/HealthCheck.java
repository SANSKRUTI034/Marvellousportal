
package com.mavellous.Marvellousportal.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/Check")
    public String checkStatus() {
        return "Marvellous Portal is live";
    }
}
