package com.p3solutions.metalyzer_service.flat_file.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.p3solutions.metalyzer_service.flat_file.enums.FileInputType;
import lombok.*;

@Data
@Builder
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class FlatFileRequestDTO {
    private FileInputType fIleInputType;
    private String delimeter; //(",",";","/t","|")
    @JsonProperty(required = false)
    private String userDefinedDelimiters;
    private String inputPathLocation;
    private String dateFormat;
    private String dateTimeFormat;
    private Boolean isMetaDataPath;
    private Boolean fileHasHeader;
}
