package com.m.g.c2p.controllers;

import com.m.g.c2p.model.Text;
import com.m.g.c2p.repository.TextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Autowired
    TextRepository textRepository;

    @RequestMapping("/hi")
    public ResponseEntity<String> process()
    {
        Text sampleText = new Text();
        sampleText.setTextCode("7657575765");
        sampleText.setTextString("Sample Text 87687686687");
        textRepository.save(sampleText);
        return ResponseEntity.ok("Completed");
    }
}
