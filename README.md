# Douyu TV danmu collector

## What can it do!
- It can collect danmu from Douyu TV
- After package, you can edit conf/config.properties to change Room_id

## Result

```
pel@raspberrypi:~/DouyuDanmu/target $ sh run.sh start
java -XX:+TieredCompilation -Xmx1024m -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:logs/gc.log -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=1 -XX:GCLogFileSize=100M -Dfile.encoding=UTF-8 -cp danmu-0.0.1-SNAPSHOT.jar:./conf com.pelucky.danmu.DanmuApp
start
pel@raspberrypi:~/DouyuDanmu/target $ OpenJDK Zero VM warning: TieredCompilation is disabled in this release.
19:54:37.809 [main] INFO  com.pelucky.danmu.util.TcpSocketClient - Connect to Server 124.95.174.146:8601.
19:54:37.934 [main] INFO  com.pelucky.danmu.util.TcpSocketClient - Open Socket successfully
19:54:37.960 [main] INFO  com.pelucky.danmu.util.Danmu - Danmu start succefully!
AcerSword: Ӯ��
����Ļ���: �����ɶ��Ϸ
�߲�o: �������ȷʵ����
������Ϭ��: �ϴ��������
�ƻ����ؼ: 66666666666
����: 66666666666
36���϶ȵ�����: ������
����: �������ϴ�
yuyuyu123554: 6666666
ppykj001: 2333333333333
��������: 666666
��clgb: 666666666
��ѡ������: �����ˮ������
���ɵ�����: �ϴ�����
���˹���: 6666
���ò�Ҳ������: ˮ���ݵúð�
V999999999999999: �����ˣ��ҵĺ�
����ꪳ�دɳ: ˭����Ϸ����Ӯ�����Ŵ���ˮ
��������: ��Ļ�����NB
л����666666: 6666
�Ժ�з��Ʀ�ϰ�: ����
��һ��С��: �����Ϸ �����Զ��
��������ؼGeTao: 666
���h����: 66666666666
Mass0000: 66666666666
С���: 666666
fhjmuqueen: ��������  Ӯ�˾��Ƿ�ˮ�����������
ֽ��3: 666696
������123: 666666666666666
������ó�����: ��Ӯ��
fzzzzzzzzzzzzz: ȫ���ϴ�Ͷ���һ�����ĥ����Щ˵�˵ĺ���˼��
��С��: ������ �ܵ�
��ͫ2016: �ϴ��ĸ���
���ڤι�Ƥ: ����Ӯ��
�С��: ��ʤ��
Treasure��ؼ: ����Ӯ��һ��
��һ��С��: ������
ganda2002: ������Ӯ��
FadedUs: 66666666666
���Ӽҵı�����: 6666666666666
chs303007: ����Ӯ��
waericdh: �ϴ�Ц��
�ƻ����ؼ: 666666666666666666666
eve�⳾: �������ǲ��Ǳ��������
��ʧ: 66666666666
��������: 66666666666666666666
Z�տռ��տ�: ��Цһ��
����ꪳ�دɳ: 66666666666666666666
�в���: �ϴ����Ǹ���������
hongjiaming1: ����Ӯ��
�Ę��T: ������ �ܵ�
�򰮱�: 66666666666
���ǲ�����0: ������మ�����Ϳ������ؼ���
����������110: ����Ӯ�ˡ���
��ҹ�㽪��: ���¼�Ƭ
��clgb: 666666666666
�����·����11: ��Щ����
��˹����ĵ�����: �ϴ������ˣ���
Сĸţ������: 66
ˮ����Ѩ: 66666666666666
а���: ��������
Aվ������: Ӯ��
```

## Environment
- You should have at lesast Java 1.8 and Maven 3
- Linux is perfered, Windows is also OK


## Usage

```
mvn clean package
cd target
Linux start:sh run.sh start
Linux Stop:sh run.sh stop
Windows
```
## Configuration

```
danmu_server=openbarrage.douyutv.com 	# Open Barrage's server, Should not change!
danmu_port=8601				# Port, Should not change!
room_id=71415  				# Room_id of Douyu TV
```
