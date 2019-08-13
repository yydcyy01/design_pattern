package com.yydcyy.design.principle.demeter;

/**
 * Created by YYDCYY on 2019-08-13.
 * com.yydcyy.design.principle.demeter 包右键-> diagrams - > show diagrams -> java class diagrams -> 点放大镜左边那个键(可能1 / 2下), 显示关系,
 * 结果表名, boss 不知道 TeamLeader存在, TeamLeader - > Course
 * 符合迪米特原则
 *
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
