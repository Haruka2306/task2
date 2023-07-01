public class Student {
    private String name;
    private int age;
    private String bloodType;

    public Student(String name, int age, String bloodType) {
        this.name = name;
        this.age = age;
        this.bloodType = bloodType;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBloodType() {
        return bloodType;
    }
}
