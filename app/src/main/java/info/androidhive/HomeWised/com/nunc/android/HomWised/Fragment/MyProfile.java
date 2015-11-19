package info.androidhive.HomeWised.com.nunc.android.HomWised.Fragment;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import info.androidhive.HomeWised.activity.FragmentUtil;
import info.androidhive.materialdesign.R;

/**
 * Created NUNC.
 */
public class MyProfile extends Fragment {
    View rootView;

    private EditText edt_companyname, edt_firstname, edt_middelname, edt_lastname, edt_username,
            edt_password, edt_work, edt_mobilenumber, edt_homephone, edt_fax, edt_alt_email, edt_type,
            edt_address1, edt_address2, edt_city, edt_state, edt_zipcode, edt_county, edt_country;
private Button btn_edit,btn_save;
    private boolean status;
    private Activity activity;
    public MyProfile() {

        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         rootView = inflater.inflate(R.layout.myprofile, container, false);
        activity = getActivity();
        edt_companyname=(EditText)rootView.findViewById(R.id.edt_companyname);
        edt_firstname=(EditText)rootView.findViewById(R.id.edt_firstname);
        edt_middelname=(EditText)rootView.findViewById(R.id.edt_middelname);
        edt_lastname=(EditText)rootView.findViewById(R.id.edt_lastname);
        edt_username=(EditText)rootView.findViewById(R.id.edt_username);
        edt_password=(EditText)rootView.findViewById(R.id.edt_password);
        edt_work=(EditText)rootView.findViewById(R.id.edt_work);
        edt_mobilenumber=(EditText)rootView.findViewById(R.id.edt_mobilenumber);
        edt_homephone=(EditText)rootView.findViewById(R.id.edt_homephone);
        edt_fax=(EditText)rootView.findViewById(R.id.edt_fax);
        edt_alt_email=(EditText)rootView.findViewById(R.id.edt_alt_email);
        edt_type=(EditText)rootView.findViewById(R.id.edt_type);
        edt_address1=(EditText)rootView.findViewById(R.id.edt_address1);
        edt_address2=(EditText)rootView.findViewById(R.id.edt_address2);
        edt_city=(EditText)rootView.findViewById(R.id.edt_city);
        edt_state=(EditText)rootView.findViewById(R.id.edt_state);
        edt_zipcode=(EditText)rootView.findViewById(R.id.edt_zipcode);
        edt_county=(EditText)rootView.findViewById(R.id.edt_county);
        edt_country=(EditText)rootView.findViewById(R.id.edt_country);
        btn_edit=(Button)rootView.findViewById(R.id.btn_edit);
        btn_save=(Button)rootView.findViewById(R.id.btn_save);
        
eidtable();
btn_edit.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
          btn_edit.setVisibility(View.GONE);
                btn_save.setVisibility(View.VISIBLE);
                noteditable(true);

    }
});


        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppointmentFragment appointmentfragment = new AppointmentFragment();
               /* FragmentUtil.addFragmentForWalker(getActivity(),
                        appointmentfragment, null, false, true,
                        "AppointmentFragment");*/

            }
        });



        // Inflate the layout for this fragment
        return rootView;
    }

    private void eidtable() {
        edt_companyname.setEnabled(false);
        edt_firstname.setEnabled(false);
        edt_middelname.setEnabled(false);
        edt_lastname.setEnabled(false);
        edt_username.setEnabled(false);
        edt_password.setEnabled(false);;
        edt_work.setEnabled(false);
        edt_mobilenumber.setEnabled(false);
        edt_homephone.setEnabled(false);
        edt_fax.setEnabled(false);
        edt_alt_email.setEnabled(false);
        edt_type.setEnabled(false);
        edt_address1.setEnabled(false);
        edt_address2.setEnabled(false);
        edt_city.setEnabled(false);
        edt_state.setEnabled(false);
        edt_zipcode.setEnabled(false);
        edt_county.setEnabled(false);
        edt_country.setEnabled(false);
    }


    private void noteditable(boolean status) {


        edt_companyname.setEnabled(status);
        edt_firstname.setEnabled(status);
        edt_middelname.setEnabled(status);
        edt_lastname.setEnabled(status);
        edt_username.setEnabled(status);
        edt_password.setEnabled(status);
        edt_work.setEnabled(status);
        edt_mobilenumber.setEnabled(status);
        edt_homephone.setEnabled(status);
        edt_fax.setEnabled(status);
        edt_alt_email.setEnabled(status);
        edt_type.setEnabled(status);
        edt_address1.setEnabled(status);
        edt_address2.setEnabled(status);
        edt_city.setEnabled(status);
        edt_state.setEnabled(status);
        edt_zipcode.setEnabled(status);
        edt_county.setEnabled(status);
        edt_country.setEnabled(status);
    }


}
