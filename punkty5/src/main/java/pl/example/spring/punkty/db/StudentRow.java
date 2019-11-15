package pl.example.spring.punkty.db;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class StudentRow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String number;
    private String group1;

    protected  StudentRow(){}

        public StudentRow(String name, String number,String group1){
        this.name=name;
        this.number=number;
        this.group1=group1;
        }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getGroup() {        return group1;    }

    public void setGroup(String group) {        this.group1 = group;    }
}
