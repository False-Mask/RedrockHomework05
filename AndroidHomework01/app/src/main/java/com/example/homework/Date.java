package com.example.homework;

import android.util.Log;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Date {

    static List<String> username=new ArrayList<>();
    static List<String> password=new ArrayList<>();
    public static boolean judge(String Username,String Passport){
       Iterator iterator1=username.iterator();
       int index1=username.indexOf(Username);
       int index2=password.indexOf(Passport);
       if (index1==-1 | index2==-1) return false;
       else if (index1==index2) return true;
        else return false;
    }
}
