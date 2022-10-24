package oop_3_video_lesson_skypro.animal;

public class Parrot {

    private String name;
    private int birthYear;
    private boolean talking;
    private String breed;

    public Parrot(String name) {
        this.name = name;
    }

    public Parrot(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void talk() {
        System.out.println("Hello!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public boolean isTalking() {
        return talking;
    }

    public void setTalking(boolean talking) {
        this.talking = talking;
    }

    public String getBread() {
        return breed;
    }

    public void setBread(String bread) {
        this.breed = bread;
    }
}
