package info.androidhive.HomeWised.com.nunc.android.HomWised.Fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import info.androidhive.HomeWised.adapter.AppointmentAdapter;
import info.androidhive.HomeWised.adapter.LeadsAdapter;
import info.androidhive.HomeWised.model.Appointment;
import info.androidhive.HomeWised.model.Leads;
import info.androidhive.materialdesign.R;

/**
 * Created NUNC.
 */
public class LeadsFragments extends Fragment {
    private Activity activity;
    private Button btn_lastsevendays,btn_today;
    View rootView;
    public LeadsFragments() {

        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_leads, container, false);
        btn_lastsevendays=(Button)rootView.findViewById(R.id.btn_lastsevendays);
        btn_today=(Button)rootView.findViewById(R.id.btn_today);

        this.activity = getActivity();
        // Inflate the layout for this fragment

        btn_today.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_lastsevendays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        updateList();
        return rootView;
    }

    private void updateList() {
        ArrayList<Leads> list = new ArrayList<Leads>();
        Leads leads = new Leads();
        leads.setText_name(" Joshua (TEST)Rowe (TEST)");
        leads.setText_address("Test Address,TestCity,\nMI,11111,us\nPhone-201 345 567");

        leads.setText_notes("Notes:Need Services ASAP");
        list.add(leads);
        leads = new Leads();
        leads.setText_name(" Ashok (TEST)Rowe (TEST)");
        leads.setText_address("Test Address,TestCity,\nMI,11111,us\nPhone-201 345 567");

        leads.setText_notes("Notes:Need Services ASAP");
        list.add(leads);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(new LeadsAdapter(activity, list));

    }


}
