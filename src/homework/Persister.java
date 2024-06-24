package homework;
//Изменим класс Persister так, чтобы он реализовывал интерфейс Saver.

public class Persister implements Saver {
    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}