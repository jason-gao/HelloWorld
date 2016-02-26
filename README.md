# HelloWorld
all kinds of program language hello world

##node js enviroment install

1 yum install gcc-c++ openssl-devel

2 wget http://nodejs.org/dist/v0.12.0/node-v0.12.0.tar.gz 从源代码编译安装

3 cd node-v0.12.0

4 ./configure;make;make install

5 vim helloworld.js

6 node helloworld.js

--scan:

浏览器输入 http://192.168.0.112:1337

输出hello world 即代表node环境正常，192.168.0.112为node运行机器的ip，此处是我虚拟机的ip


##scala enviroment install

+	cd /usr/local/src
+	wget http://downloads.lightbend.com/scala/2.12.0-M3/scala-2.12.0-M3.tgz
+	tar -zxvf scala-2.12.0-M3.tgz
+	cd scala-2.12.0-M3
+	cd /usr/local/src/scala-2.12.0-M3/bin
+	ln -s  /usr/local/src/scala-2.12.0-M3/bin/scala /usr/local/bin/scala
+	ln -s  /usr/local/src/scala-2.12.0-M3/bin/scalac /usr/local/bin/scalac

+	编译：scalac HelloWorld.scala
+	运行：scala HelloWorld


