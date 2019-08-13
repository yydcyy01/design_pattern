package com.yydcyy.design.principle.singleresponsibility;

/**
 * Created by YYDCYY on 2019-08-13.
 */
public class Method {
    private void updateUserInfo(String userName, String address){
        userName = "YuYang";
        address = "China";
    }
    private void updateUserInfo(String userName, String... properties){
        userName = "YuYang";
        // todo Sth
    }

    private void updateUserName(String userName){
        userName = "YuYang";
    }

    private void updateUserInfo(String userName,String address,boolean bool){
        if (bool){
            //todo sth1
        }
        else{
            //todo sth2
        }

        userName = "";
        address = "";
    }
}
