package com.example.redvsblue;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BLUE.OnFragmentInteractionListener} interface
 * to handle interaction events.

 * create an instance of this fragment.
 */
public class BLUE extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    private OnFragmentInteractionListener fragmentListner;
     ArrayList<Celebrity>  celebrities = new ArrayList<>();
     private Celebrity myCeleb;
    MainActivity myArrayFromActivity;
    private Button fragmentButton1;
    private Button fragmentButton2;
    private Button fragmentButton3;
    private Button fragmentButton4;
    private Button fragmentButton5;

    public BLUE() {
        // Required empty public constructor
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){

            case R.id.buttonID1:

                fragmentListner.onFragmentInteraction();

                break;

            case R.id.buttonID2:
                fragmentListner.popFrag();

                break;

            case R.id.buttonID3:
                fragmentListner.popFrag();

                break;

            case R.id.buttonID4:

                break;

            case R.id.buttonID5:
                fragmentListner.popFrag();

                break;

                default:
                    break;

        }

    }





    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRetainInstance(true);
    }

    @Override public View onCreateView(LayoutInflater inflater, ViewGroup viewContainer, Bundle savedInstanceStateBundle){

        //inflate layout for this fragment
        return inflater.inflate(R.layout.fragment_blue, viewContainer, false);
    }

    @Override public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fragmentButton1 = view.findViewById(R.id.buttonID1);
        fragmentButton2 = view.findViewById(R.id.buttonID2);
                fragmentButton3 = view.findViewById(R.id.buttonID3);
                fragmentButton4 = view.findViewById(R.id.buttonID4);
                        fragmentButton5 = view.findViewById(R.id.buttonID5);

        myArrayList =


        switch(view.getId()){

            case R.id.buttonID1:
                fragmentButton1.setOnClickListener(this);


                break;

            case R.id.buttonID2:
                fragmentButton2.setOnClickListener(this);

                break;

            case R.id.buttonID3:
                fragmentButton3.setOnClickListener(this);

                break;

            case R.id.buttonID4:
                fragmentButton4.setOnClickListener(this);

                break;

            case R.id.buttonID5:
                fragmentButton5.setOnClickListener(this);

                break;

                default:
                    break;
        }
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            fragmentListner = (OnFragmentInteractionListener) context;
        }
        else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        fragmentListner = null;
    }



    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Celebrity celebrity);
    }
}
