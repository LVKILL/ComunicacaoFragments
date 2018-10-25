package com.example.professor.comunicacaofragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TextFragment.OnFragmentInteractionListener{

    private ResultFragment resultFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultFragment = (ResultFragment) getSupportFragmentManager().findFragmentById(R.id.frag_result);
    }

    @Override
    public void onFragmentInteraction(String text) {
        resultFragment.definirTexto(text);
    }
}
