import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Курсовая работа!");
        System.out.println("\nКнига сотрудников:");
        EmployeeBook employeeBook = new EmployeeBook();

        //Добавляем работников
        employeeBook.addWorker("Иванов Иван Иванович", "1", 52_000.54f);
        employeeBook.addWorker("Петров Дмитрий Рустамович", "2", 54_000.25f);
        employeeBook.addWorker("Васильев Марк Константинович", "1", 49_000.66f);
        employeeBook.addWorker("Михайлов Михаил Олегович", "3", 50_000.76f);
        employeeBook.addWorker("Краснов Василий Валерьевич", "2", 55_000.78f);
        employeeBook.addWorker("Романов Станислав Игоревич", "3", 60_000.01f);
        employeeBook.addWorker("Черных Александр Павлович", "4", 45_000.55f);
        employeeBook.addWorker("Попов Владимир Петрович", "5", 54_500.87f);
        employeeBook.addWorker("Лещенко Виктор Евгеньевич", "4", 56_890.36f);
        employeeBook.addWorker("Картакаев Анвар Расулович", "5", 57450.25f);

        // Распечатаем всех работников
        System.out.println("Распечатаем всех работников");
        employeeBook.printAllWorkers();

        // Удаляем работника одиночно
        System.out.println("\nУдаляем работника одиночно");
        employeeBook.removeWorker("Картакаев Анвар Расулович");

        // Распечатаем сумму затрат на ЗП в месяц
        System.out.println("\nРаспечатаем сумму затрат на ЗП в месяц");
        employeeBook.countAllSalaries();

        // Найти работника с минимальной ЗП в месяц
        System.out.println("\nНайти работника с минимальной ЗП в месяц");
        employeeBook.countMinSalary();

        // Найти работника с максимальной ЗП в месяц
        System.out.println("\nНайти работника с максимальной ЗП в месяц");
        employeeBook.countMaxSalary();

        // Подсчитать среднее значение зарплат
        System.out.println("\nПодсчитать среднее значение зарплат");
        employeeBook.countAverageSalaries();

        // Поиск работника по ФИО
        System.out.println("\nПоиск работника по ФИО");
        employeeBook.findWorker("Картакаев Анвар Расулович");
        employeeBook.findWorker("Иванов Иван Иванович");

        // Распечатать только ФИО всех работников
        System.out.println("\nРаспечатать только ФИО всех работников");
        employeeBook.printAllWorkersName();

        // Посчитать сумму затрат на ЗП по отделу
        System.out.println("\nПосчитать сумму затрат на ЗП по отделу");
        employeeBook.countAllSalariesInDepartment("1");

        // Посчитать среднюю ЗП по отделу, например 1 отдела
        System.out.println("\nПосчитать среднюю ЗП по отделу, например 1 отдела");
        employeeBook.countAverageSalariesInDepartment("1");

        // Индексация всех зарплат на увеличение в %
        System.out.println("\nИндексация всех зарплат на увеличение в %");
        employeeBook.indexationSalary(0.5f);

        // Проверяем изменилась ли ЗП после индексации
        System.out.println("\nПроверяем изменилась ли ЗП после индексации");
        employeeBook.printAllWorkers();

        // Поиск отдела
        System.out.println("\nПоиск отдела");
        employeeBook.findDepartment("1");

        // Найти сотрудника в отделе с минимальной ЗП
        System.out.println("\nНайти сотрудника в отделе с минимальной ЗП");
        employeeBook.countMinSalaryInDepartment("4");

        // Найти сотрудника в отделе с максимальной ЗП
        System.out.println("\nНайти сотрудника в отделе с максимальной ЗП");
        employeeBook.countMaxSalaryInDepartment("4");

        // Индексация всех зарплат по отделу на увеличение в %
        System.out.println("\nИндексация всех зарплат по отделу на увеличение в %");
        employeeBook.indexationSalaryInDepartment("1", 5f);

        // Проверяем изменилась ли ЗП после индексации
        System.out.println("\nПроверяем изменилась ли ЗП после индексации");
        employeeBook.printAllWorkers();

        // Распечатываем всех людей из отдела
        System.out.println("\nРаспечатываем всех людей из отдела");
        employeeBook.printAllWorkersInDepartment("2");

        // Распечатать всех сотрудников с ЗП меньше числа (распечатать id, фио и зп в консоль)
        System.out.println("\nРаспечатать всех сотрудников с ЗП меньше числа (распечатать id, фио и зп в консоль)");
        employeeBook.printAllSalariesLessThan(55_000f);

        // Распечатать всех сотрудников с ЗП больше (или равно) числа (распечатать id, фио и зп в консоль)
        System.out.println("\nРаспечатать всех сотрудников с ЗП больше (или равно) числа (распечатать id, фио и зп в консоль)");
        employeeBook.printAllSalariesGreaterThanOrEqual(55_000f);

        // Найти работника по id
        System.out.println("\nНайти работника по id");
        employeeBook.findEmployeeById(1);

        // Сколько всего записей (работников) в книге
        System.out.println("\nСколько всего записей (работников) в книге");
        System.out.println("Всего работников: " + employeeBook.getCurrentSize());


    }
}