public class EmployeeBook {
    private final Employee[] workers;
    private int size;

    public EmployeeBook() {
        this.workers = new Employee[10];
    }

    public Employee[] getWorkers() {
        return workers;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(getWorkers().length);
    }

    public String toString(Employee employee) {
        return employee.getId() + ". " + employee.toString();
    }

    public int getCurrentSize() {
        return size;
    }

    // Метод #1 printAllWorkers (распечатать всех работников)
    public void printAllWorkers() {
        for (int i = 0; i < size; i++) {
            Employee worker = workers[i];
            System.out.println(worker.toString());
        }
    }

    // Метод #2 addWorker (добавить работника):
    public void addWorker(String name, String department, float salary) {
        if (size >= workers.length) {
            System.out.println("Нельзя добавить работника, закончились места");
        } else {
            Employee newWorker = new Employee(name, department, salary);
            workers[size++] = newWorker;
        }
    }

    // Метод #3 removeWorker (удалить работника)
    public void removeWorker(String name) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().equals(name)) {
                System.out.println(workers[i].getId() + ". " + workers[i].getName() + " - удален");
                System.arraycopy(workers, i + 1, workers, i, size - i - 1);
                workers[size - 1] = null;
                size--;
                break;
            }
        }
    }

    // Метод #4 findWorker (найти работника)
    public void findWorker(String name) {
        for (int i = 0; i < size; i++) {
            Employee worker = workers[i];
            if (worker.getName().equals(name)) {
                System.out.println(worker.getId() + ". " + worker.getName() + ", отдел " + worker.getDepartment() + ", зарплата: " + worker.getSalary() + " рублей.");
                return;
            }
        }
        System.out.println("Работник: " + name + " - не найден.");
    }

    // Метод #5 countAllSalaries посчитать сумму затрат на ЗП в месяц
    public void countAllSalaries() {
        float sum = 0f;
        for (int i = 0; i < size; i++) {
            sum += workers[i].getSalary();
        }
        System.out.println("Cумма затрат на ЗП в месяц " + sum + " рублей.");
    }

    // Метод #6 countMinSalary найти сотрудника с минимальной ЗП
    public void countMinSalary() {
        Employee worker = workers[0];
        for (int i = 1; i < size; i++) {
            if (workers[i].getSalary() < worker.getSalary()) {
                worker = workers[i];
            }
        }
        System.out.println(worker.getId() + ". " + "Сотрудник с минимальной ЗП: " + worker.getId() + ". " + worker.getName() + ", отдел " + worker.getDepartment() + ", зарплата: " + worker.getSalary() + " рублей.");
    }

    // Метод #7 countMaxSalary найти сотрудника с максимальной ЗП
    public void countMaxSalary() {
        Employee worker = workers[0];
        for (int i = 1; i < size; i++) {
            if (workers[i].getSalary() > worker.getSalary()) {
                worker = workers[i];
            }
        }
        System.out.println(worker.getId() + ". " + "Сотрудник с максимальной ЗП: " + worker.getId() + ". " + worker.getName() + ", отдел " + worker.getDepartment() + ", зарплата: " + worker.getSalary() + " рублей.");
    }

    // Метод #8 countAverageSalaries посчитать среднее значение ЗП
    public void countAverageSalaries() {
        float sum = 0f;
        for (int i = 0; i < size; i++) {
            sum += workers[i].getSalary();
        }
        System.out.println("Среднее значение зарплат: " + sum / getCurrentSize() + " рублей.");
    }

    // Метод #9 printAllWorkersName (распечатать только ФИО всех работников)
    public void printAllWorkersName() {
        for (int i = 0; i < size; i++) {
            Employee worker = workers[i];
            System.out.println(worker.getName());
        }
    }

    // Метод #10 countAllSalariesInDepartment посчитать сумму затрат на ЗП по отделу
    public void countAllSalariesInDepartment(String department) {
        float sum = 0f;
        for (int i = 0; i < size; i++) {
            if (workers[i].getDepartment().equals(department)) {
                sum += workers[i].getSalary();
            }
        }
        System.out.println("Cумма затрат на ЗП по отделу " + sum + " рублей.");
    }

    // Метод #10 countAverageSalariesInDepartment посчитать среднюю ЗП по отделу
    public void countAverageSalariesInDepartment(String department) {
        float sum = 0f;
        float numberOfDepartment = 0f;
        float averageSum = 0f;
        for (int i = 0; i < size; i++) {
            if (workers[i].getDepartment().equals(department)) {
                sum += workers[i].getSalary();
                numberOfDepartment += workers[i].getDepartment().length();
            }
        }
        averageSum = sum / numberOfDepartment;
        System.out.println("Средняя ЗП по отделу " + averageSum + " рублей.");
    }

    // Метод #11 indexationSalary проиндексировать зарплату (вызвать изменение зп у всех сотрудников на величину аргумента в %)
    public void indexationSalary(float indexCount) {
        float salary = 0f;
        for (int i = 0; i < workers.length - 1; i++) {
            salary = ((100 + indexCount) * workers[i].getSalary()) / 100;
            workers[i].setSalary(salary);
        }
        System.out.println("Все ЗП работников проиндексированы на " + indexCount + " %.");
    }

    // Метод #12 findDepartment (найти отдел)
    public void findDepartment(String department) {
        for (int i = 0; i < size; i++) {
            Employee worker = workers[i];
            if (worker.getDepartment().equals(department)) {
                System.out.println(worker.getId() + ". " + worker.getName() + ", отдел " + worker.getDepartment() + ", зарплата: " + worker.getSalary() + " рублей.");
            }
        }
    }

    // Метод #13 countMinSalaryInDepartment найти сотрудника в отделе с минимальной ЗП
    public void countMinSalaryInDepartment(String department) {
        Employee worker = workers[0];
        float minSum = 0;
        for (int i = 0; i < size; i++) {
            if (workers[i].getDepartment().equals(department) && workers[i].getSalary() < minSum) {
                minSum = workers[i].getSalary();
                worker = workers[i];
            }
        }
        System.out.println("Сотрудник с минимальной ЗП в отделе " + worker.getDepartment() + ": " + worker.getId() + ". " + worker.getName() + ", зарплата: " + worker.getSalary() + " рублей.");
    }

    // Метод #14 countMaxSalaryInDepartment найти сотрудника в отделе с минимальной ЗП
    public void countMaxSalaryInDepartment(String department) {
        Employee worker = workers[0];
        float maxSum = 0;
        for (int i = 0; i < size; i++) {
            if (workers[i].getDepartment().equals(department) && workers[i].getSalary() > maxSum) {
                maxSum = workers[i].getSalary();
                worker = workers[i];
            }
        }
        System.out.println("Сотрудник с максимальной ЗП в отделе " + worker.getDepartment() + ": " + worker.getId() + ". " + worker.getName() + ", зарплата: " + worker.getSalary() + " рублей.");
    }

    // Метод #15 indexationSalaryInDepartment проиндексировать зарплату у всего отдела (вызвать изменение зп у всех сотрудников в отделе на величину аргумента в %)
    public void indexationSalaryInDepartment(String department, float indexCount) {
        float salary = 0f;
        for (int i = 0; i < size; i++) {
            if (workers[i].getDepartment().equals(department)) {
                salary = ((100 + indexCount) * workers[i].getSalary()) / 100;
                workers[i].setSalary(salary);
            }
        }
        System.out.println("Все ЗП работников отдела " + department + " проиндексированы на " + indexCount + " %.");
    }

    // Метод #16 printAllWorkersInDepartment распечатать все людей из отдела
    public void printAllWorkersInDepartment(String department) {
        Employee worker = workers[0];
        for (int i = 0; i < size; i++) {
            if (workers[i].getDepartment().equals(department)) {
                worker = workers[i];
                System.out.println(worker.getId() + ". " + worker.getName() + ", зарплата: " + worker.getSalary() + " рублей.");
            }
        }
    }

    // Метод #17 printAllSalariesLessThan распечатать всех сотрудников с ЗП меньше числа (распечатать id, фио и зп в консоль)
    public void printAllSalariesLessThan(float lessThanSalary) {
        Employee worker = workers[0];
        for (int i = 0; i < size; i++) {
            if (workers[i].getSalary() < lessThanSalary) {
                worker = workers[i];
                System.out.println(worker.toString());
            }
        }
    }

    // Метод #18 printAllSalariesGreaterThanOrEqual распечатать всех сотрудников с ЗП больше (или равно) числа (распечатать id, фио и зп в консоль).
    public void printAllSalariesGreaterThanOrEqual(float greaterThanOrEqual) {
        Employee worker = workers[0];
        for (int i = 0; i < size; i++) {
            if (workers[i].getSalary() >= greaterThanOrEqual) {
                worker = workers[i];
                System.out.println(worker.toString());
            }
        }
    }

    // Метод #19 findEmployeeById найти работника по id
    public void findEmployeeById(int findForId) {
        Employee worker = workers[0];
        for (int i = 0; i < size; i++) {
            if (workers[i].getId() == findForId) {
                worker = workers[i];
            }
        }
        System.out.println(worker.toString());
    }

}
