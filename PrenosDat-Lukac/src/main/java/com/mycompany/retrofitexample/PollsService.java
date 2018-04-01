/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofitexample;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;



public interface PollsService {
    // end pointy
   @GET("/api/users?page=2")
    Call<List<ListUsers>> getAllUsers();
    
    @GET("/api/users/2")
    Call<UserData> getSingleUser();
    
    @GET("/api/users/23")
    Call<UserAvatar> getUserAvatar();
    
    @GET("/api/unknown")
    Call<ListResource> getAllResource();
    
    @GET("/api/unknown/2")
    Call<ResourceData> getSingleResource();
    
    @GET("/api/unknown/23")
    Call<Resource> getResource();
    
    @POST("/api/users")
    Call<Users> creatUser(@Body Users user);
    
    @PUT("/api/users/2")
    Call<Users> putUser(@Body Users user);
    
    @PATCH("/api/users/2")
    Call<Users> patchUser(@Body Users user);
    
    @DELETE("/api/users/2")
    Call<Users> deleteUser();
    
    
    
}
