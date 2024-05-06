package cucmbervikashmarch;

public class ThreadLocalExample {
    private static ThreadLocal<Integer> threadLocalValue = ThreadLocal.withInitial(() -> 0);
	
    //private static ThreadLocal<Integer> threadLocalValue =  new ThreadLocal<>();
    
    public static void main(String[] args) {
        Runnable task = () -> {
        	
            int value = threadLocalValue.get();
            System.out.println("Thread " + Thread.currentThread().threadId() + " has value " + value);
            threadLocalValue.set(value + 1);
			
        };

  
        Thread thread1 = new Thread(task);       
        
        Thread thread2 = new Thread(task);
        thread1.start();                       
        thread2.start();
       
    }
}
