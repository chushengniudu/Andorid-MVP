# Andorid-MVP
MVP模式正在熟悉当中，如有错误请谅解。
![image](https://github.com/chushengniudu/Andorid-MVP/blob/master/device-2016-12-22ff.png)
# MVP模式通常包含的4要素：
     (1)View:负责绘制UI元素、与用户进行交互(在Android中体现为Activity);
     (2)View interface:需要View实现的接口，View通过View interface与Presenter进行交互，降低耦合，方便进行单元测试;
     (3)Model:负责存储、检索、操纵数据(有时也实现一个Model interface用来降低耦合);
     (4)Presenter:作为View与Model交互的中间纽带，处理与用户交互的负责逻辑。
# 参考来源
http://blog.csdn.net/vector_yi/article/details/24719873
     
