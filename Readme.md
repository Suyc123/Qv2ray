# Qv2ray安装配置说明
参照[https://github.com/Qv2ray/Qv2ray/wiki/Getting-Started-step1](https://github.com/Qv2ray/Qv2ray/wiki/Getting-Started-step1)

## 首先在官网下载Qv2ray安装文件
在官网下载所需要的版本
[https://github.com/Qv2ray/Qv2ray/releases](https://github.com/Qv2ray/Qv2ray/releases)
**Linux 下载Qv2ray.v2.2.3.linux-x64.AppImage**  
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200318124806714.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3N1eW9uZ2NhaTEyMzQ=,size_16,color_FFFFFF,t_70)
## 配置运行
### 1. AppImage 文件是一种新型压缩方式，在Linux下可以直接运行，运行前需更改文件权限，右键属性将文件权限更改为可执行，然后双击即可执行。
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200318125458516.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3N1eW9uZ2NhaTEyMzQ=,size_16,color_FFFFFF,t_70)
### 2. 到v2ray-core 官网下载v2ray-core [https://github.com/v2ray/v2ray-core/releases](https://github.com/v2ray/v2ray-core/releases)
下载 v2ray-linux-64.zip
然后将v2ray-linux-64.zip 解压到 ~/.qv2ray/vcore/ 中

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200318130001190.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3N1eW9uZ2NhaTEyMzQ=,size_16,color_FFFFFF,t_70)
### 3. 配置v2ray core到 Qv2ray
运行Qv2ray 点击preferences 进行配置
如下图中 v2ray settings 中设置
V2ray Assets Directory 为v2ray core的文件夹，确保 包含**geoip.dat geosite.dat v2ctl v2ray** 
Core Executable Path 为**v2ray**文件的路径


![在这里插入图片描述](https://img-blog.csdnimg.cn/20200318130327271.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3N1eW9uZ2NhaTEyMzQ=,size_16,color_FFFFFF,t_70)
### 4. 配置订阅信息
运行Qv2ray 点击Subscription 输入订阅地址，然后 Update Subscuption Data 然后ok

![在这里插入图片描述](https://img-blog.csdnimg.cn/20200318130921233.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3N1eW9uZ2NhaTEyMzQ=,size_16,color_FFFFFF,t_70)
回到Qv2ray 主界面，与任一线路即可
![在这里插入图片描述](https://img-blog.csdnimg.cn/20200318131113470.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3N1eW9uZ2NhaTEyMzQ=,size_16,color_FFFFFF,t_70)

> # **Copyright**
> This is free software, and you are welcome to redistribute it under certain conditions
ALL Credit goes to Qv2ray User Group and Qv2ray Development Group
Contributors (sorted alphabetically):
@aliyuchang33
@axionl
@DuckSoft
@lhy0403
@rikakomoe
@SoneWinstone
@thebadgateway
Libraries that have been used in Qv2ray are listed below (Sorted by date added)
Copyright (c) 2019 dridk (@dridk): X2Struct (Apache)
Copyright (c) 2011 SCHUTZ Sacha (@dridk): QJsonModel (MIT)
Copyright (c) 2019 Nikolaos Ftylitakis (@ftylitak): QZXing (Apache2)
Copyright (c) 2016 Singein (@Singein): ScreenShot (MIT)
Copyright (c) 2016 Nikhil Marathe (@nikhilm): QHttpServer (MIT)
Copyright (c) 2019 Itay Grudev (@itay-grudev): SingleApplication (MIT)
Copyright (c) 2019 paceholder (@paceholder): nodeeditor (QNodeEditor modified by lhy0403) (BSD-3-Clause)
Copyright (c) 2020 Ram Pani (@DuckSoft): QvRPCBridge (WTFPL)
Copyright (c) 2019 ShadowSocks (@shadowsocks): libQtShadowsocks (LGPLv3)
Copyright (c) 2015-2020 qBittorrent (Anton Lashkov) (@qBittorrent): speedplotview (GPLv2)


> # 声明
> ###### 注意：Qv2ray 仅能用于 Qt/C++/Linux/CI/自动化 等相关技术的学习和在法律允许范围内的使用，任何个人或集体不得使用 Qv2ray 进行任何违反相关法律法规的活动。
> ###### Note: Qv2ray can ONLY be used for learning related technologies such as Qt/C++/Linux/CI/automation and use within the scope permitted by law. Any individual or group MAY NOT use Qv2ray for any violation of relevant laws and regulations.
>###### 任何尝试下载或下载 Qv2ray 任意分支或发行版即代表您同意本项目作者不承担任何由于您违反以上准则所带来的任何法律责任。
>###### Any attempt to download of any branch or distribution of Qv2ray constitutes your agreement that the author of the project will not be liable for any legal liability arising from your breach of the above guidelines.t

