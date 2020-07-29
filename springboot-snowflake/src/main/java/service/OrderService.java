package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
@Service
public class OrderService {

    @Autowired
    private IdGeneratorSnowflake idGenerator;

    //通过雪花算法获取唯一ID
    public String getIDBySnowFlake(){
        //TODO
        ExecutorService threadPool= Executors.newFixedThreadPool(5);
        for (int i=0;i<=20;i++){
            threadPool.submit(new ThreadPoolRunnable(idGenerator.snowflakeId()));
        }
        threadPool.shutdown();
        return "hello snowflake";
    }
}
