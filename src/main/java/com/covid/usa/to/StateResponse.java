package com.covid.usa.to;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StateResponse {

    private String name;

    private Long casesReported;

}
