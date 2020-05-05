package hw_4.task_1;

import java.util.Objects;

public class Man {
    private static String text = "Hello from static";

    private String name;
    private Integer age;

    public Man(){
        // this("Alex", 50);
        name = "Alex";
        age = 50;
    }

    public Man(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public Integer getAge(){
        return age;
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        Man.text = text;
    }

    public void show(){
        System.out.println("name = " + name + " age = " + age);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,age);
    }

    @Override
    public boolean equals(Object object){
        if (this == object){
            return true;
        }

        if (object == null || this.getClass() != object.getClass()){
            return false;
        }

        Man man = (Man) object;

        if (!this.name.equals(man.name)){
            return false;
        }

        if (!this.age.equals(man.age)){
            return false;
        }

        return true;
    }
}
