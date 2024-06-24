package homework;
//  Изменим класс User, чтобы убрать из него методы save и report.Принцип единственной ответственности.

public class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
