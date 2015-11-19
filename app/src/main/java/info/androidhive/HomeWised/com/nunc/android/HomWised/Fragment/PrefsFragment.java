package info.androidhive.HomeWised.com.nunc.android.HomWised.Fragment;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import info.androidhive.materialdesign.R;

/**
 * Created by nunc 19-11-2015.
 */
public class PrefsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
