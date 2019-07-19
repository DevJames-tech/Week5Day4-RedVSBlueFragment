package com.example.redvsblue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements BLUE.OnFragmentInteractionListener {

    private FragmentManager fragmentManager;
    BLUE blueFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        setupUpBLUEFragment();
    }

    private void setupUpBLUEFragment() {

        blueFragment = new BLUE();
        fragmentManager.beginTransaction().add(R.id.blueLayoutFragment, blueFragment)
                .addToBackStack("BLUE FRAGMENT").commit();

    }

    public ArrayList<Celebriety> setArrayList(ArrayList<Celebriety> passArrayList){

        passArrayList.add(new Celebriety(23, "Frank", "N'Stein", "7ft", "Best Costume"));
        passArrayList.add(new Celebriety(60, "Morgan", "Friedman", "65ft", "That Guy"));
        passArrayList.add(new Celebriety(35, "Ryan", "Jabberwock", "3ft.4in.", "The one they speak of"));
        passArrayList.add(new Celebriety(40, "Marcus", "Phoenix", "5ft.10in.", "GEAR OF WAR"));
        passArrayList.add(new Celebriety(23, "JAMES", "CALVIN", "7ft", "IMMORTAL SPARK"));

        return setArrayList(passArrayList);
    }

    @Override
    public void popFrag() {

        //remove one fragment at a time
        fragmentManager.popBackStack();

    }


}
