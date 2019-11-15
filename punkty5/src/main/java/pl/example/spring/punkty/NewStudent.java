package pl.example.spring.punkty;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


public class NewStudent {
    final String name;
    final String number;
    final String group;

    @JsonCreator
    public NewStudent(@JsonProperty ("name") String name,
                      @JsonProperty ("number") String number,
                      @JsonProperty("group") String group) {
        this.name = name;
        this.number = number;
        this.group = group;
    }
}
