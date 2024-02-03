public class Main {
    public static void main(String[] args) {

            Employee[] employees = new Employee[10];

            employees[0] = new Employee("Роман","Лацапнев","Станиславович",1,65000);
            employees[1] = new Employee("Евгений", "Лацапнев","Станиславович",1,60000);
            employees[2] = new Employee("Ярослав","Фролов","Григорьевич",2,45500);
            employees[3] = new Employee("Иван","Елисеев","Владимироваич",2,56850);
            employees[4] = new Employee("Михаил", "Горшков","Егорович",3,59000);
            employees[5] = new Employee("Иван","Фадеев","Иванович",3,79900);
            employees[6] = new Employee("Василий","Богомолов","Савельевич",4,58457);
            employees[7] = new Employee("Злата","Васильева","Викторовна",4,69921);
            employees[8] = new Employee("Марк","Алексеев","Ярославович",5,91000);
            employees[9] = new Employee("Полина","Березина","Данииловна",5,127883);

            printAll(employees);
            printSumSalaryInMonth(employees);
            printWithMinSalary(employees);
            printWithMaxSalary(employees);
            printAverageSalary(employees);
            printAllFullNameEmployees(employees);
    }

    private static void printAll (Employee[] employees){ // Распечатать список всех сотрудников
        System.out.println("Список всех сотрудников:");
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }

    private static int calculateSumSalaryInMonth (Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }
    private static void printSumSalaryInMonth(Employee[] employees) {
        System.out.println("\nСумма затрат на зарплату для сотрудников в месяц - "+calculateSumSalaryInMonth(employees));
    }

    private static void printWithMinSalary(Employee[] employees) {
        Employee employeeWithMinSalary = employees[0];
        for (Employee employee : employees) {
            if (employeeWithMinSalary.getSalary() > employee.getSalary()) {
                employeeWithMinSalary = employee;
            }
        }

        for (Employee employee : employees) {
            if (employeeWithMinSalary.getSalary() == employee.getSalary()) {
                    System.out.println("\nCотрудник с наименьшей заработной платой: " + employeeWithMinSalary);
            }
        }
    }


    private static void printWithMaxSalary(Employee[] employees) {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee employee : employees) {
            if (employeeWithMaxSalary.getSalary() < employee.getSalary()) {
                employeeWithMaxSalary = employee;
            }
        }
        for (Employee employee : employees){
            if (employeeWithMaxSalary.getSalary() == employee.getSalary()) {
                System.out.println("\nCотрудник с наибольшей заработной платой: "+ employeeWithMaxSalary);
            }
        }
    }

    private static void printAverageSalary(Employee[] employees) {
        int sum = calculateSumSalaryInMonth(employees);
        int theNumberOfEmployees = 0;
        for (int e = 0; e < employees.length; e++) {
            theNumberOfEmployees++;
        }
        if (theNumberOfEmployees != 0) {
            System.out.println("\nСреднее значение зарплат в месяц: "+(float)sum/theNumberOfEmployees+" рублей");
        }
    }

    private static void printAllFullNameEmployees(Employee[] employees) {
        System.out.println("\nСписок ФИО всех сотрудников:");
        for (Employee employee : employees) {
            System.out.println(employee.getFirstName()+" "+employee.getSecondName()+" "+employee.getLastName());
        }
    }
}