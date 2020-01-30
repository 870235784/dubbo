dubbo学习

1.基本使用
    使用点对点的方式
    使用zookeeper注册中心的方式:
        会将服务发布到注册中心zookeeper下: /dubbo/{interface}/provider/路径下, 路径下的子节点为具体服务实现的url, 为临时节点
        
2.使用多种协议 dubbo hessian