package info.androidhive.HomeWised.com.nunc.android.HomWised.Fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import info.androidhive.materialdesign.R;

/**
 * Created by NUNC.
 */
public class ContactSupport extends Fragment {
private TextView text_phone,text_email;
    View rootView;
    public ContactSupport() {

        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         rootView = inflater.inflate(R.layout.fragment_contactsupport, container, false);
        text_phone=(TextView) rootView.findViewById(R.id.text_phone);
        text_email=(TextView)rootView.findViewById(R.id.text_email);



        // Inflate the layout for this fragment
        return rootView;
    }


}
