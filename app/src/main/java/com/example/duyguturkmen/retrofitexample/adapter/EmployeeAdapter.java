package com.example.duyguturkmen.retrofitexample.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.duyguturkmen.retrofitexample.R;
import com.example.duyguturkmen.retrofitexample.model.Employee;

import java.util.ArrayList;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder> {

    private ArrayList<Employee> dataList;

    public EmployeeAdapter(ArrayList<Employee> dataList) {
        this.dataList = dataList;
    }

    @Override
    public EmployeeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_employee, parent, false);
        return new EmployeeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(EmployeeViewHolder holder, int position) {
        holder.txtEmpPhone.setText(dataList.get(position).getPhone());
        holder.txtEmpName.setText(dataList.get(position).getName());
        holder.txtEmpMail.setText(dataList.get(position).getEmail());

    }

    @Override
    public int getItemCount() {


        return dataList.size();

    }

    public class EmployeeViewHolder extends RecyclerView.ViewHolder {
        TextView txtEmpName, txtEmpMail, txtEmpPhone;


        public EmployeeViewHolder(View itemView) {
            super(itemView);
            txtEmpMail = (TextView) itemView.findViewById(R.id.txt_employee_email);
            txtEmpName = (TextView) itemView.findViewById(R.id.txt_employee_name);
            txtEmpPhone = (TextView) itemView.findViewById(R.id.txt_employee_phone);
        }
    }
}
