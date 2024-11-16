package creational.singleton;

public class SingletonExample {
    public static SingletonExample instance = new SingletonExample();

    private SingletonExample() {
    }
    public static synchronized SingletonExample getInstance(){
        return instance;
    }
}
