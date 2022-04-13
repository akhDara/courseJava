package employeehomework;

public class AkhunzyanovaHomeworkFour {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Sasha","QA engineer","ivanov@mail.ru", "123456", 12345678, 45);
        employees[1] = new Employee("Sergey","Actor", "sergey@mail.ru", "12345678", 1234567, 35);
        employees[2] = new Employee("Anna","Developer", "ivanov@mail.ru", "1234567899876", 87654, 45);
        employees[3] = new Employee("Lily","freelance", "lily@mail.ru", "123456", 123456, 27);
        employees[4] = new Employee("Migel","engineer", "migel@mail.ru", "123456", 123456, 48);
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge() > 40){
                employees[i].printInfo();
            }
        }
    }
}

