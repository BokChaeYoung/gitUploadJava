package javaTest;

public class MemberDTO {

    private int age;
    private String name;
    private int num;
    private double height;

    public MemberDTO() {
    }

    public MemberDTO(int age, String name, int num, double height) {
        this.age = age;
        this.name = name;
        this.num = num;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", num=" + num +
                ", height=" + height +
                '}';
    }
}
