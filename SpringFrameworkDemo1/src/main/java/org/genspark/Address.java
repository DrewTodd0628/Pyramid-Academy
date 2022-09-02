package org.genspark;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class Address {

    @Value("#{new java.lang.String('Seattle')}")
    private String city;
    @Value("#{new java.lang.String('Washington')}")
    private String state;
    @Value("#{new java.lang.String('US')}")
    private String country;
    @Value("#{new java.lang.String('72946')}")
    private String zipcode;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
