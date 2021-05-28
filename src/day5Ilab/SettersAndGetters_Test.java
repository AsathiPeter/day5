package day5Ilab;

public class SettersAndGetters_Test {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
            if (age < 1) {
                System.out.println("Invalid entry");
            } else {
                this.age = age;
            }
        }
    }

