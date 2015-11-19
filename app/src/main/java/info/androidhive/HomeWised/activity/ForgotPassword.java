package info.androidhive.HomeWised.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import info.androidhive.materialdesign.R;


/**
 * Created by nunc_dayal on 13-11-2015.
 */
public class ForgotPassword extends Activity {
    private EditText ed_email;
    private Button forgot_password;
    private Activity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgotpassword);
        this.context = this;
        ed_email = (EditText) findViewById(R.id.ed_email);
        forgot_password = (Button) findViewById(R.id.forgot_password);
        forgot_password.setOnClickListener(new BtnClicklistener());


    }

    private class BtnClicklistener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            String email = ed_email.getText().toString().trim();
            if (v == forgot_password) {
                if (validation()) {
                    startActivity(new Intent(context, MainActivity.class));
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Please Enter email", Toast.LENGTH_SHORT).show();
                    //ed_email.setError("Invalid Email");
                }
            }

        }

        private boolean validation() {
            return ed_email.getText().toString().trim().length() > 0;
        }
    }
}
