package day5Ilab;

public class SettersandGetters {
    private int age;

    public static void main(String[]Args){

        SettersAndGetters_Test obj = new SettersAndGetters_Test();
        obj.setAge(-25);

        System.out.println("Age is " + obj.getAge());
    }

}
