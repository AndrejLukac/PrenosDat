/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofitexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;


public class ResourceData {
    
    
    @SerializedName("data")
    @Expose
    public Resource data;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("data", data).toString();
    }
    
    
}
