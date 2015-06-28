package me.evgenius.criminalintent;


import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime() {
        mId = UUID.randomUUID();
    }
}
