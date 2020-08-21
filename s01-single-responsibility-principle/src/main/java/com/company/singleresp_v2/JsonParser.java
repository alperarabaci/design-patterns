package com.company.singleresp_v2;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParser {
	
	private final ObjectMapper mapper;
	
	public JsonParser() {
		 mapper = new ObjectMapper();
		 mapper.setSerializationInclusion(Include.NON_NULL);
		 mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		 mapper.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, true);
		 //..
	}
	
	public <T> T parseObject(String json, Class<T> valueType) throws IOException {
		return  (T) mapper.readValue(json, valueType);
	}
	
}
