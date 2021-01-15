package com.faraz.xml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.xml.MarshallingHttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootSoapApplication {

    public static void main(String[] args) {
	SpringApplication.run(SpringbootSoapApplication.class, args);
    }

    @GetMapping("/test")
    public Custom test() {
	Custom custom = new Custom();
	custom.setName("faraz");
	return custom;
    }

    // xml will not be produced unless messageconverter is configured
    // but I think marshallinghttpmessageconverter is already added to message converters if jaxb is found on classpath
    @GetMapping(value = "/testxml", produces = MediaType.APPLICATION_XML_VALUE)
    public Custom testXML() {
	Custom custom = new Custom();
	custom.setName("faraz");
	return custom;
    }

    @Bean
    public HttpMessageConverter<Object> createXmlHttpMessageConverter() {
	MarshallingHttpMessageConverter xmlConverter = new MarshallingHttpMessageConverter();
	return xmlConverter;
    }
}
