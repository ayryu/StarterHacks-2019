package com.example.alexr.brightwave;

import java.util.Date;

public class Goal {

    //var
    private String disc = "";
    private Date end;
    private boolean complete = false;

    //constructor
    public Goal(String gdisc, Date gend){
        disc = gdisc;
        end = gend;
    }

    //discription setter and getter values
    public  String getdisc(){
        return this.disc;
    }
    public void setdisc(String newdisc){
        this.disc = newdisc;
    }

    //deadline setter and getter values
    public Date getend(){
        return this.end;
    }
    public void setend(Date newend){
        this.end = newend;
    }

    //complete setter getter
    public boolean getcomplete(){
        return this.complete;
    }
    public void setcomplete(boolean refresh){
        this.complete= refresh;
    }
}
