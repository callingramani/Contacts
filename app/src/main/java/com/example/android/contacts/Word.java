package com.example.android.contacts;

/**
 * Created by ankit on 31-05-2017.
 */

public class Word {

    private String mContactName;
    private String mPhoneNumber;
    private int mresorceId;



    public Word(String ContactName,String PhoneNumber,int resorceId){

        mContactName=ContactName;
        mPhoneNumber=PhoneNumber;
        mresorceId=resorceId;

    }

    public String getmContactName() {
        return mContactName;
    }

    public int getmresorceId() {
        return mresorceId;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

}
