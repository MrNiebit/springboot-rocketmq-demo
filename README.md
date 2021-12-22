# 工程简介

springboot 集成 rocketmq

1、消息生产与消费
2、同一topic指定标签消费

同一topic下
 - 当消费组名称一样时，就会按照负载均衡的形式消费，一个消息只被消费一次
 - 当消费组名不一样时，一条消息会被这些组消费，假如有两个不同名称的消费组，那么这条消息将会消费两次；

# 延伸阅读

rocketmq 阿里云文档：https://help.aliyun.com/document_detail/95837.html