# jdk7
## 1、将本项目下载下来直接导入idea中；
## 2、配置以下设置：
![](image/1653189022168.jpg)
### 1）配置sdk:
![](image/1653199531901.jpg)
![](image/1653199567746.jpg)
### 2）配置项目：
![](image/1653199619186.jpg)
![](image/1653199689015.jpg)
![](image/1653199707960.jpg)
![](image/1653199729610.jpg)
![](image/1653199762759.jpg)
## 3、设置VM参数（让我们编译的代码要跑在jre/lib/rt.jar前面）
-Xbootclasspath/p:/Users/xuzhipeng/soft/jdk/7/target/production/7
/Users/xuzhipeng/soft/jdk/7/target/production/7是本项目class文件的路径
![](image/1653200273967.jpg)
![](image/1653200596302.jpg)
## 4、设置debug的时候可以跳进jdk源码，将java.*和javax.*前面的对钩去掉
![](image/1653200715822.jpg)
## 5、增大编译时的内存
![](image/1653202579949.jpg)