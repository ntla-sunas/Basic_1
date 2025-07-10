package inheritance;

class Human {
    public void eat() {
        System.out.println("Human is eating");
    }

    public void speak(String msg) {
        System.out.println("Speaking: " + msg);
    }

    public void speak(String msg, int times) {
        System.out.println("Speaking " + times + " times: " + msg);
    }
}

class Boy extends Human {
    @Override
    public void eat() {
        System.out.println("Boy is eating");
    }

    public static void main(String[] args) {
        Boy obj = new Boy();
        obj.eat();
        obj.speak("Hi");
        obj.speak("Hello", 3);
    }
}