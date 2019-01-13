package com.example.alexr.brightwave;

public class Goal {

    //var
    private String disc = "";
    private date end;
    private boolean complete = false;

    //constructor
    public Goal(String gdisc, date gend){
        disc = gdisc;
        end = gend;
    }

    //discription setter and getter values
    public static string getdisc(){
        return disc;
    }
    public static void setdisc(String newdisc){
        disc = newdisc;
    }

    //deadline setter and getter values
    public static string getend(){
        return end;
    }
    public static void setend(date newend){
        return disc;
    }
}
