package com.example.blooddonation.Email;

import android.content.Context;
import android.os.AsyncTask;
import android.se.omapi.Session;

import java.net.PasswordAuthentication;
import java.security.Policy;
import java.util.ConcurrentModificationException;
import java.util.Properties;

public class JavaMailApi extends AsyncTask<Void,Void,Void> {

    private Context context;
    private Session session;
    private String email,subject,message;

    public JavaMailApi(Context context, Session session, String email, String subject, String message) {
        this.context = context;
        this.session = session;
        this.email = email;
        this.subject = subject;
        this.message = message;
    }



    @Override
    protected Void doInBackground(Void... voids) {
        Properties properties=new Properties();
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.socketFactory.port","465");
        properties.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.port","465");

//        session=Session.getDefaultInstance(properties,new javax.mail.Authenticator()){
//            protected PasswordAuthentication getPassword
//        }
        return null;
    }
}
