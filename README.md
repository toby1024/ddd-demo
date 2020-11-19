# ddd-demo
## 代码架构图
![image](https://github.com/toby1024/ddd-demo/blob/master/doc/image/ddd_demo.png)

## user case
- 作为乘客我希望创建一个出行订单，以便于从A地前往B地
- 作为司机我希望履行一个订单，以便于获取收入
- 作为运营我希望能取消订单，以便于乘客联系不上司机时重新下单

## 技术栈
- springboot
- dubbo
- mybatis

## 数据库脚本
schema.sql

## start
- 修改数据库密码
- 启动application/Bootstrap
- 启动RpcConsumer/ConsumerBootStrap
- rest api： http://127.0.0.1:8081/swagger-ui.html#/
- 测试rpc post：127.0.0.1:8082/rpc/createTravel
   
   请求json参数
   ```json
    {
          "passengerId":1,
          "startLat":30.249333,
          "startLon":120.038622,
          "startAddress":"余杭区五常大道175",
          "endLat":30.253276,
          "endLon":120.057152,
          "endAddress":"浙江省杭州市余杭区五常大道辅路西溪印象城"
      }
  ```
   