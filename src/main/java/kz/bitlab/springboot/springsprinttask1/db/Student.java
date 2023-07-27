package kz.bitlab.springboot.springsprinttask1.db;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class Student {

    private Long id;
    private String name;
    private String surname;
    private int exam;
    private String mark;

}
