package info.androidhive.HomeWised.adapter;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import info.androidhive.materialdesign.R;

/**
 * Created by nunc_dayal on 19-11-2015.
 */
public class ScheduleDetails extends Fragment {
    public ScheduleDetails() {

        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.scheduledetails, container, false);


        // Inflate the layout for this fragment
        return rootView;
    }


}
