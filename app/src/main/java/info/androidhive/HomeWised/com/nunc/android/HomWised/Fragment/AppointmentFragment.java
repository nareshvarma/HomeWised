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
import info.androidhive.HomeWised.model.Appointment;
import info.androidhive.materialdesign.R;


/**
 * Created by NUNC.
 */
public class AppointmentFragment extends Fragment {
    public static final String ARG_PLANET_NUMBER = "planet_number";

    private Activity activity;
    View rootView;
    private Button btn_nextsevendays, btn_today, btn_lastsevendays;

    public AppointmentFragment() {

        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.appointmentlist, container, false);
        btn_nextsevendays = (Button) rootView.findViewById(R.id.btn_nextsevendays);
        btn_lastsevendays = (Button) rootView.findViewById(R.id.btn_lastsevendays);
        btn_today = (Button) rootView.findViewById(R.id.btn_today);

        btn_today.setOnClickListener(new ButtonClick());
        btn_lastsevendays.setOnClickListener(new ButtonClick());
        btn_nextsevendays.setOnClickListener(new ButtonClick());
        this.activity = getActivity();

        updateList();

        // Inflate the layout for this fragment
        return rootView;
    }

    private void updateList() {
        ArrayList<Appointment> list = new ArrayList<Appointment>();
        Appointment mainopage = new Appointment();
        mainopage.setJobid(" job Id 1122");
        mainopage.setText_airconditon_repair("Air Conditioning Reapir");
        mainopage.setText_airconditon_time("11-11-2015  02PM-05PM");
        mainopage.setText_airconditon_address("Mark Hiller Phone-201 345 567");
        mainopage.setText_cust("CUST -1019");
        list.add(mainopage);
        mainopage = new Appointment();
        mainopage.setJobid(" job Id 3344");
        mainopage.setText_airconditon_repair("Air Conditioning Reapir");
        mainopage.setText_airconditon_time("14-11-2015  10AM-12PM");
        mainopage.setText_airconditon_address("Mark Hiller Phone-201 345 567");
        mainopage.setText_cust("CUST -2039");
        list.add(mainopage);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(new AppointmentAdapter(activity, list));

    }


    private class ButtonClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if(v==btn_today){

            }else if(v==btn_lastsevendays){

            }else if(v==btn_nextsevendays){

            }

        }
    }
}
