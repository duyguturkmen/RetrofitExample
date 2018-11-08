package com.example.duyguturkmen.retrofitexample.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.duyguturkmen.retrofitexample.R;
import com.example.duyguturkmen.retrofitexample.adapter.EmployeeAdapter;
import com.example.duyguturkmen.retrofitexample.model.Employee;
import com.example.duyguturkmen.retrofitexample.model.EmployeeList;
import com.example.duyguturkmen.retrofitexample.network.GetEmployeeDataService;
import com.example.duyguturkmen.retrofitexample.network.RetrofitInstance;

import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EmployeeAdapter adapter;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetEmployeeDataService service = RetrofitInstance.getRetrofitInstance().create(GetEmployeeDataService.class);

        Call<EmployeeList> call = service.getEmployeeData(100);

        call.enqueue(new Callback<EmployeeList>() {
            @Override
            public void onResponse(Call<EmployeeList> call, Response<EmployeeList> response) {
                generateEmployeeList(response.body().getEmployeeList());
            }

            @Override
            public void onFailure(Call<EmployeeList> call, Throwable t) {
                Toast.makeText(MainActivity.this, "something went wrong.:(", Toast.LENGTH_SHORT).show();

            }
        });


    }

    private void generateEmployeeList(ArrayList<Employee> employeeList) {

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view_employee_list);

        adapter = new EmployeeAdapter(employeeList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
