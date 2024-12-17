public class App {
    public static void main(String[] args) throws Exception {
       EmployeeBook book = new EmployeeBook(10);

       book.add("Ivan", "Ivanovich", "Ivanov", 1, 1000);
       book.add("Petr", "Petrovich", "Petrov", 2, 2000);
       book.add("Sidor", "Sidorovich", "Sidorov", 3, 3000);
       book.add("Vladimir", "Vladimirovich", "Vladimirov", 4, 4000);
       book.add("Vasily", "Vasilyevich", "Vasilyev", 5, 5000);
       book.add("Vladislav", "Vladislavovich", "Vladislavov", 3, 6000);
       book.add("Vladimir", "Vladimirovich", "Vladimirov", 2, 1000);
       book.add("Vasily", "Vasilyevich", "Vasilyev", 4, 8000);
       book.add("Vladislav", "Vladislavovich", "Vladislavov", 5, 9000);
       book.add("Vladimir", "Vladimirovich", "Vladimirov", 4, 4000);

       book.getAllEmployees();
       System.out.println(book.add("Vladimir", "Vladimirovich", "Vladimirov", 4, 4000));
       System.out.println(book.remove(2));
       book.getAllEmployees();
       System.out.println(book.getTotalSalary());
       System.out.println(book.calculateAverageSalary());
       System.out.println(book.getEmployeeWithMinimalSalary());
       System.out.println(book.getEmployeeWithMaximalSalary());
       book.indexSalary(10);
       book.printAllEmployeesFullName();

       System.out.println("\nInfo by department\n");

       System.out.println(book.getEmployeeWithMinimalSalaryByDepartment(3));
       System.out.println(book.getEmployeeWithMaximalSalaryByDepartment(3));
       System.out.println(book.getTotalSalaryByDepartment(3));
       System.out.println(book.getAverageSalaryByDepartment(3));
       book.indexSalaryByDepartment(10, 3);
       book.getEmployeesByDepartment(3);
    }
}