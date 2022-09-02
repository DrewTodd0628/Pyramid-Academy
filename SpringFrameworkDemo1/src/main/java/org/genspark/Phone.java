package org.genspark;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Phone {

    private String mob;

    @Override
    public String toString() {

        String num = mob;
        return num;
    }
}
