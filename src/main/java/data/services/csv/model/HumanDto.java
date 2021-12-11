package data.services.csv.model;

import java.util.Objects;

public class HumanDto {
    private int id;
    private String name;
    private String sex;
    private String dateOfBirth;
    private String subdiv;
    private int salary;

    public HumanDto() {
        this.id = 0;
        this.name = "";
        this.sex = "";
        this.dateOfBirth = "";
        this.subdiv = "";
        this.salary = 0;
    }

    public HumanDto(int id, String name, String sex, String dateOfBirth, String subdiv, int salary) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.subdiv = subdiv;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSubdiv() {
        return subdiv;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSubdiv(String subdiv) {
        this.subdiv = subdiv;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HumanDto human = (HumanDto) o;
        return id == human.id && salary == human.salary && name.equals(human.name) && sex.equals(human.sex) && dateOfBirth.equals(human.dateOfBirth) && subdiv.equals(human.subdiv);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sex, dateOfBirth, subdiv, salary);
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", subdiv='" + subdiv + '\'' +
                ", salary=" + salary +
                '}';
    }
}
