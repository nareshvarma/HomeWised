package info.androidhive.HomeWised.com.nunc.android.HomWised.Fragment;


import android.os.Bundle;
import android.preference.PreferenceFragment;

import info.androidhive.materialdesign.R;

/**
 * Created by NUNC.
 */
public class SettingsPreference extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preferences);
    }
}
