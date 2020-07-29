package service;

public class ThreadPoolRunnable implements Runnable {
    long snowflakeId=0;
    public ThreadPoolRunnable() {
    }
    public ThreadPoolRunnable(long snowflakeId) {
        this.snowflakeId=snowflakeId;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+"获得"+snowflakeId);
    }
}

