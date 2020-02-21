package com.oclkstudio.jms.rest;

import com.oclkstudio.jms.entity.Simeranya;
import com.oclkstudio.jms.service.JmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jms")
public class JmsController {
    @Autowired
    private JmsService jmsService;

    @PostMapping("/produce")
    public Simeranya produce(@RequestBody Simeranya simeranya) {
        jmsService.send(simeranya);
        return simeranya;
    }

    @GetMapping("/receive")
    public Simeranya receive() {
        return jmsService.receive();
    }
}
