package com.example.home_work_2;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class firstFragment extends Fragment {

Button btn;
EditText ed;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btn = view.findViewById(R.id.button);
        ed = view.findViewById(R.id.ed);
        SecondFragment fragment = new SecondFragment(); // replace your custom fragment class

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
Bundle bundle = new Bundle();
bundle.putString("key",ed.getText().toString());
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
fragment.setArguments(bundle);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.replace(R.id.fragment,fragment);
                fragmentTransaction.commit();
            }
        });
    }
}