package com.iwktd.rema;

import java.util.Map;

import okhttp3.OkHttpClient;

public class Network {
    private String username;
    private String password;
    private String latest_hash;

    private OkHttpClient client;

    public Network(String username, String password){
        this.username = username;
        this.password = password;
        this.latest_hash = "0";

        //client = new OkHttpClient()
    }

    public Network(String username, String password, String hash){
        assert hash.length() == 6;

        this.username = username;
        this.password = password;
        this.latest_hash = hash;
    }

    //public Map<String, String> fetch_data(){
}
