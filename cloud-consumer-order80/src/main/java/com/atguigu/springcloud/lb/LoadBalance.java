package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**      负载均衡方法
 * @author shkstart
 * @project cloud2020
 * @create 2022 10 10 11:14
 */
public interface LoadBalance {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
