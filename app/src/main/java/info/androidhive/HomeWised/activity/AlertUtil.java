package info.androidhive.HomeWised.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.widget.Button;

import info.androidhive.materialdesign.R;

/**
 * Created by nunc_dayal on 14-11-2015.
 */
public class AlertUtil {


    public static void displaylogoutDialog(final Activity activity) {
        // TODO Auto-generated method stub
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(activity);
        alertDialog.setCancelable(false);
        alertDialog.setTitle("HomeWised");

        // set dialog message
        alertDialog.setMessage("Are you sure you want to Signout?");
        alertDialog.setPositiveButton("Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();

                        Intent intent = new Intent(activity,
                                LoginActivity.class);
                        activity.startActivity(intent);
                        activity.overridePendingTransition(R.anim.fedin,
                                R.anim.fedout);
                        activity.finish();
                    }

                });
        alertDialog.setNegativeButton("Cancel",
                new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO Auto-generated method stub

                    }
                }).setIcon(android.R.drawable.ic_dialog_alert);
        AlertDialog alert = alertDialog.create();
        alert.show();
        Button nbutton = alert.getButton(DialogInterface.BUTTON_NEGATIVE);

        /*nbutton.setTextColor(activity.getResources().getColor(
                R.color.alert_color));*/
        nbutton.setTextSize(15);

        Button pbutton = alert.getButton(DialogInterface.BUTTON_POSITIVE);

        /*pbutton.setTextColor(activity.getResources().getColor(
                R.color.alert_color));*/
        pbutton.setTextSize(15);

    }
   /* public static void CustomAlertdialog(final Activity activity) {

        final Dialog dialog = new Dialog(get);
        dialog.setContentView(R.layout.custom);
        dialog.setTitle("Title...");

        // set the custom dialog components - text, image and button
        TextView text = (TextView) dialog.findViewById(R.id.text);
        text.setText("Android custom dialog example!");
        ImageView image = (ImageView) dialog.findViewById(R.id.image);
        image.setImageResource(R.drawable.ic_launcher);

        Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
        // if button is clicked, close the custom dialog
        dialogButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
});


    }
*/



}
