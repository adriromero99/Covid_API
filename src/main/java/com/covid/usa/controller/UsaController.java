package com.covid.usa.controller;

import com.covid.usa.service.UsaService;
import com.covid.usa.to.UsaReportTO;
import com.covid.usa.to.UsaResponseTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/usa")
public class UsaController {

    @Autowired
    UsaService usaService;

    @GetMapping()
    public UsaResponseTO getUsaData() {
        return usaService.getUsaData();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> savePais(@Valid @RequestBody UsaReportTO report){
        usaService.save(report);
        return new ResponseEntity<String>("Se ha agregado al repositorio", HttpStatus.OK);
    }
}
