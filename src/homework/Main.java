 package homework;

//Главный класс зависит от абстракций (Saver и Reporter), а не от конкретных реализаций.
// Принцип инверсии зависимостей.

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");

        Reporter reporter = new ConsoleReporter();
        Saver saver = new Persister();

        reporter.report(user);
        saver.save(user);
    }
}