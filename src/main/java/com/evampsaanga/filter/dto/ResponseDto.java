package com.evampsaanga.filter.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseDto {
    private String responseCode;
    private String responseDesc;
    private String execTime;
    private String timeStamp;
    private String responseConfig;
    private String responseString;
}
