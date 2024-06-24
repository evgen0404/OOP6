package homework;

//Создадим новый класс ConsoleReporter, который будет реализовывать интерфейс Reporter.

public class ConsoleReporter implements Reporter {
    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}