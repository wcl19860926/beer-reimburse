package com.crc.ems.beer.voucher.config;

import com.crc.ems.beer.voucher.base.serializer.NullValueJsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.text.SimpleDateFormat;
import java.util.List;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		for (HttpMessageConverter<?> converer : converters) {
			if (converer instanceof MappingJackson2HttpMessageConverter) {
				ObjectMapper objMap = ((MappingJackson2HttpMessageConverter) converer).getObjectMapper();
				objMap.setDateFormat(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"));
				objMap.getSerializerProvider().setNullValueSerializer(new NullValueJsonSerializer());

			}

		}
	}




	
	
	

}