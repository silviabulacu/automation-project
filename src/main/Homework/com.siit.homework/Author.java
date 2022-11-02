package com.siit.homework;

public class Author {

    String name;
    String emailAddress;

    Author(String name,String emailAddress){
        this.name =name;
        this.emailAddress = emailAddress;
    }

    public String getName(){
        return this.name;
    }
    public String getEmailAddress(){

        return this.emailAddress;
    }
}

