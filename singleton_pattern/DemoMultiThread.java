package singleton_pattern;


import singleton_pattern.single.Singleton;

public class DemoMultiThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
        "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
        "RESULT:" + "\n");

        Thread thread1 = new Thread(new ThreadFoo());
        Thread thread2 = new Thread(new ThreadBar());
        thread1.start();
        thread2.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {        
        @Override
        public void run() {    
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }     
    }
}
