package com.faraz.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "custom")
public class Custom {
    private String name;

    public Custom() {
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
	return "Custom [name=" + name + "]";
    }
    
}
