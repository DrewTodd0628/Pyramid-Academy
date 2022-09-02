package org.genspark;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Getter
public class Student {
    private int id;
    private String name;
    private List<Phone> ph;
    @Autowired
    private Address add;


    public void properties() {

        System.out.println("ID: " + id + "\nNAME: " + name + "\nADDRESS: " + add.getCity() + " " + add.getState() + ", " + add.getZipcode() + " " + add.getCountry());
    }

    public void contact() {

        System.out.println("PHONE NUMBERS: " + ph);
    }


}
