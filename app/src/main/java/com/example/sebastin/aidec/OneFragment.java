package com.example.sebastin.aidec;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class OneFragment extends Fragment {
    View view;
    TextView txtTitle;
    String title;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_one,container,false);
        txtTitle=(TextView)view.findViewById(R.id.txtTitle);

        if(getArguments()!=null){
            title=getArguments().getString("title");
        }
        txtTitle.setText(title);

        return view;
    }
}
