/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofitexample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class PollsDemo {
    
    public static void main(String[] args) throws IOException{
        
        Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("http://private-5b13e-prenosdat.apiary-mock.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build();

        PollsService polls = retrofit.create(PollsService.class);
        
        // get list users
        try{
            //synchronna metoda execute()
            Response<List<ListUsers>> execute = polls.getAllUsers().execute();
            System.out.println("********** GET LIST USERS **********\n");
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO, execute.body().toString());
                System.out.println("    OK  \n");
            }else{
                System.out.println("    FAILED  \n");
            }
        
        }catch (IOException ex){
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE,null, ex);
        }
        
      //-----------------------------------------------------------------------------------  
      
        // get single user
        try{
            
            Response<UserData> execute = polls.getSingleUser().execute();
            System.out.println("********** GET SINGLE USER **********\n");
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO, execute.body().toString());
                System.out.println("    OK  \n");
            }else{
                System.out.println("    FAILED  \n");
            }
        
        }catch (IOException ex){
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE,null, ex);
        }
        //-------------------------------------------------------------------------------
        
        //create user
        Users user = new Users();
        
        try{
            
            Response<Users> execute = polls.creatUser(user).execute();
            System.out.println("********** CREATE USER **********\n");
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO, execute.body().toString());
                System.out.println("    OK  \n");
            }else{
                System.out.println("    FAILED  \n");
            }
        
        }catch (IOException ex){
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE,null, ex);
        }
        //--------------------------------------------------------------------------------
        
        // update
        Users user2 = new Users();

        //PUT
        try{
            Response<Users> execute = polls.putUser(user2).execute();
            System.out.println("********** UPDATE - PUT **********\n");
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO, execute.body().toString());
                System.out.println("    OK  \n");
            }else{
                System.out.println("    FAILED  \n");
            }
        
        }catch (IOException ex){
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE,null, ex);
        }
        //------------------------------------------------------------------------------
        
        //patch
        try{
            Response<Users> execute = polls.patchUser(user2).execute();
            System.out.println("********** UPDATE - PATCH **********\n");
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO, execute.body().toString());
                System.out.println("    OK  \n");
            }else{
                System.out.println("    FAILED  \n");
            }
        
        }catch (IOException ex){
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE,null, ex);
        }
        //------------------------------------------------------------------------------
        
        
        
        //user not found
        try{
            Response<UserAvatar> execute = polls.getUserAvatar().execute();
            System.out.println("********** GET USER NOT FOUND **********\n");
            Logger.getGlobal().log(Level.INFO, execute.toString());
            if(!execute.isSuccessful()){
                //Logger.getGlobal().log(Level.INFO, execute.body().toString());
                System.out.println("    OK  \n");
            }else{
                System.out.println("    FAILED  \n");
            }
        
        }catch (IOException ex){
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE,null, ex);
        }
        //------------------------------------------------------------------------------
        
        //get list resource
        try{
            Response<ListResource> execute = polls.getAllResource().execute();
            System.out.println("********** GET LIST <RESOURCE> **********\n");
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO, execute.body().toString());
                System.out.println("    OK  \n");
            }else{
                System.out.println("    FAILED  \n");
            }
        
        }catch (IOException ex){
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE,null, ex);
        }
        //------------------------------------------------------------------------
        
        //get single resource
        try{
            Response<ResourceData> execute = polls.getSingleResource().execute();
            System.out.println("********** GET SINGLE <RESOURCE> **********\n");
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO, execute.body().toString());
                System.out.println("    OK  \n");
            }else{
                System.out.println("    FAILED  \n");
            }
        
        }catch (IOException ex){
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE,null, ex);
        }
        //--------------------------------------------------------------------------
        
        //single resource not found
        try{
            Response<Resource> execute = polls.getResource().execute();
            System.out.println("********** GET SINGLE <RESOURCE> NOT FOUND **********\n");
            Logger.getGlobal().log(Level.INFO, execute.toString());
            if(!execute.isSuccessful()){
                //Logger.getGlobal().log(Level.INFO, execute.body().toString());
                System.out.println("    OK  \n");
            }else{
                System.out.println("    FAILED  \n");
            }
        
        }catch (IOException ex){
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE,null, ex);
        }
        //-----------------------------------------------------------------------------
        
        
        //delete user
        try{
            Response<Users> execute = polls.deleteUser().execute();
            System.out.println("********** DELETE USER **********\n");
            Logger.getGlobal().log(Level.INFO, execute.toString());
            if(execute.isSuccessful()){
               
                System.out.println("    OK  \n");
            }else{
                System.out.println("    FAILED  \n");
            }
        
        }catch (IOException ex){
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE,null, ex);
        }
        //------------------------------------------------------------------------------
        
        
        //
        /*
        //asynchronna
        polls.postQuestion(question).enqueue(new Callback<Question>() {
            
            @Override
            public void onResponse(Call<Question> call, Response<Question> rspns) {
                Logger.getGlobal().log(Level.INFO, rspns.body().toString()); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void onFailure(Call<Question> call, Throwable thrwbl) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });*/
        
               
        
        
        
    }   
}
