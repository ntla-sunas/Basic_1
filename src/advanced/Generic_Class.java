package advanced;

public class Generic_Class<T> {
    private T t;

    public void set(T t1) {
        this.t = t1;
    }

    public T get() {
        return this.t;
    }

    public static void main(String[] args) {
        Generic_Class<String> type = new Generic_Class<>();
        type.set("Pank");
        System.out.println(type.get());

        Generic_Class raw = new Generic_Class();
        raw.set(10);
    }
}
