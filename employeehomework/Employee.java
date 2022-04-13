package employeehomework;

public class Employee {

    //public protected default private
    private String name;
    private String profession;
    private String email;
    private String tel;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    public Employee(String name, String profession, String email, String tel, int salary, int age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo(){
        System.out.println("name: "+ name + "; profession: " + profession + "; email: " + email + "; tel: " + tel + "; salary: " + salary + "; age: " + age);
    }
}
