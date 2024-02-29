package object1;

public class Dog {
    private int age;
    private String breed;
    private String gender;

    public Dog(int age, String breed, String gender) {
        this.age = age;
        this.breed = breed;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    String s = String.valueOf(age);
    public String toString(){
        return "Breed"+this.breed+ "Gender" +this.gender+ "Age"+ this.age;
    }

}
