package info.androidhive.HomeWised.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import info.androidhive.HomeWised.com.nunc.android.HomWised.Fragment.AppointmentFragment;
import info.androidhive.HomeWised.com.nunc.android.HomWised.Fragment.Catalog;
import info.androidhive.HomeWised.com.nunc.android.HomWised.Fragment.ContactSupport;
import info.androidhive.HomeWised.com.nunc.android.HomWised.Fragment.Customers;
import info.androidhive.HomeWised.com.nunc.android.HomWised.Fragment.Invoices;
import info.androidhive.HomeWised.com.nunc.android.HomWised.Fragment.LeadsFragments;
import info.androidhive.HomeWised.com.nunc.android.HomWised.Fragment.MyProfile;
import info.androidhive.HomeWised.com.nunc.android.HomWised.Fragment.PrefsFragment;
import info.androidhive.materialdesign.R;

public class MainActivity extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener {

    private static String TAG = MainActivity.class.getSimpleName();

    private Toolbar mToolbar;

    private FragmentDrawer drawerFragment;
    private Activity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        this.context = this;
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        drawerFragment = (FragmentDrawer)
                getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);
        drawerFragment.setDrawerListener(this);

        // display the first navigation drawer view on app launch
        displayView(0);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_plus) {
            return true;
        }
/*
        if(id == R.id.action_search){
            Toast.makeText(getApplicationContext(), "Search action is selected!", Toast.LENGTH_SHORT).show();
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onDrawerItemSelected(View view, int position) {
        displayView(position);
    }

    private void displayView(int position) {
        Fragment fragment = null;
        String title = getString(R.string.app_name);
        if (position == 0) {
            fragment = new AppointmentFragment();
            title = getString(R.string.title_appointent);
        } else if (position == 1) {
            fragment = new Customers();
            title = getString(R.string.title_customers);
            // View v=findViewById(R.id.action_plus);
        } else if (position == 2) {
            fragment = new LeadsFragments();
            title = getString(R.string.title_leads);

        } else if (position == 3) {
            fragment = new MyProfile();
            title = getString(R.string.title_myprofile);
        } else if (position == 4) {
            fragment = new Invoices();
            title = getString(R.string.title_invoices);

        } else if (position == 5) {
            fragment = new Catalog();
            title = getString(R.string.title_catalog);

        } else if (position == 6) {
            fragment = new ContactSupport();
            title = "ContactSupport";
        }
        else if (position == 7) {
            AlertUtil.displaylogoutDialog(context);
            title = getString(R.string.title_sight_out);

        }
      /*  else if(position==7){
         fragment= new PrefsFragment();
         //title=
         }*/

        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_body, fragment);
            fragmentTransaction.commit();

            // set the toolbar title
            getSupportActionBar().setTitle(title);
        }
    }
}