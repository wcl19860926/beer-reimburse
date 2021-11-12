package com.crc.ems.beer.voucher.web.security;



public class UserHolder {

    private static  ThreadLocal<User> threadLocal =  new ThreadLocal<>();


    public  static   void  remove(){
        threadLocal.remove();
    }


    public  static   User  getUserInfo(){
        return  threadLocal.get();

    }


    public static void setUser(User user){
        threadLocal.set(user);
    }
}
