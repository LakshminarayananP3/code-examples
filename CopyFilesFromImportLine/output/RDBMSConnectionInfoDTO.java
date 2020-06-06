package com.p3solutions.metalyzer_service.configured_dbs.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.p3solutions.metalyzer_service.configured_dbs.enums.Type;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class RDBMSConnectionInfoDTO {

	private String databaseName;
	private String host;
	private Integer port;
	private Type type;
	@JsonProperty(required = false)
	private List<String> schema;
	@JsonProperty(required = false)
	private ConnectionCredentialsDTO connectionCredentials;
	@JsonProperty(required = false)
	private KERBROSEConnectionCredentialsDTO kerbroseConnectionCredentials;

}