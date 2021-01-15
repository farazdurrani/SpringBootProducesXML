# SpringBootProducesXML

    // xml will not be produced unless messageconverter is configured
    // but MarshallingHTTPMessageConverter is already added to message converters if JAXB is found on classpath
    @GetMapping(value = "/testxml", produces = MediaType.APPLICATION_XML_VALUE)
    
    Use JAXB annotations on domain objects. Annotations such as @XmlRootElement and/or @XmlElement
