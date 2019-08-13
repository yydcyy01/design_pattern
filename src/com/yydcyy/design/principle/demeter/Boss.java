package com.yydcyy.design.principle.demeter;

/**
 * Created by YYDCYY on 2019-08-13.
 */
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }
}
