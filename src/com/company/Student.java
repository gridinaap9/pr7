package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Student {
    private final String name;
    private Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String dateToString(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(this.birthDate);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
