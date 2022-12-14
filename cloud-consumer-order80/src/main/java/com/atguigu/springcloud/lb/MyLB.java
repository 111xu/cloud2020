package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author shkstart
 * @project cloud2020
 * @create 2022 10 10 11:15
 */
@Component
public class MyLB implements LoadBalance{

   private AtomicInteger atomicInteger= new AtomicInteger(0);
   public final int getAndIncrement(){
       int current;
       int next;
       for (;;){
           current=this.atomicInteger.get();//得到当前原子类的值
           next= current>=2147483647?0 : current+1;
           if (this.atomicInteger.compareAndSet(current,next)){
               System.out.println("**********第几次访问:"+next);
               return next;
           };
       }
   }
    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
       int index= getAndIncrement() % serviceInstances.size();
       return serviceInstances.get(index);
    }
}
