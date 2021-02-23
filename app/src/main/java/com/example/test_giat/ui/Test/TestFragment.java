package com.example.test_giat.ui.Test;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.test_giat.R;

import org.w3c.dom.Text;

public class TestFragment extends Fragment {

    private EditText age,cadence,step_time,stride_time;
    private Button start;




    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.test_fragment, container, false);

        age=view.findViewById(R.id.edit_age);
        cadence=view.findViewById(R.id.edit_candence);
        step_time=view.findViewById(R.id.edit_steptime);
        stride_time=view.findViewById(R.id.edit_stridetime);
        start=view.findViewById(R.id.start);





        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





            }
        });






        return  view;


    }



}