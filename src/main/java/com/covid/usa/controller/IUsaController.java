package com.covid.usa.controller;

import com.covid.usa.to.UsaReportTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

public interface IUsaController {

    @ApiOperation(value = "Adds a new report of deaths and cases of COVID-19 in USA")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "A new report has been added to database successfuly", response = String.class)
    })
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<String> addUsaReport(@Valid @RequestBody UsaReportTO report);

}
