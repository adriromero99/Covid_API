package com.covid.usa.controller;

import com.covid.usa.service.UsaService;
import com.covid.usa.to.StateResponseTO;
import com.covid.usa.to.UsaReportTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usa")
public class UsaController implements IUsaController{

    @Autowired
    UsaService usaService;

    @GetMapping(value = "/{state}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StateResponseTO>> getStateReport(@PathVariable String state) {
        List<StateResponseTO> stateResponseTO = usaService.getStateByName(state);
        return new ResponseEntity<List<StateResponseTO>>(stateResponseTO, HttpStatus.OK);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addUsaReport(@Valid @RequestBody UsaReportTO report){
        usaService.save(report);
        return new ResponseEntity<String>("A new report has been added to database successfuly", HttpStatus.OK);
    }
}
