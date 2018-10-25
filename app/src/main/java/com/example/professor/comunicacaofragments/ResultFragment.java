package com.example.professor.comunicacaofragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ResultFragment extends Fragment {


    private TextView txtTexto;

    public ResultFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_result, container, false);
        txtTexto = (TextView) view.findViewById(R.id.txtTexto);

        return view;
    }

    public void definirTexto(String texto){
        if (texto != null){
            txtTexto.setText(texto);
        }
    }

}
