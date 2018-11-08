package com.example.duyguturkmen.retrofitexample.network;

import com.example.duyguturkmen.retrofitexample.model.EmployeeList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetEmployeeDataService {

    @GET("retrofit-demo.php")

    Call<EmployeeList> getEmployeeData(@Query("company_no") int companyNo);
}
