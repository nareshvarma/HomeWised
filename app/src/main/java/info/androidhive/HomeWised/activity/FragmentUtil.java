package info.androidhive.HomeWised.activity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Set;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Bundle;

import info.androidhive.materialdesign.R;


/**
 * @since 1.0
 * @author Nunc Systems Pvt. Ltd.
 * 
 */
public class FragmentUtil {
	public static void addFragmentForWalker(Activity context,
											Fragment fragment, HashMap<String, String> map,
											boolean autoRefreshOnBackClick, boolean addToBackStack,String FragmentName) {
		// Create fragment and give it an argument specifying the article it
		// should show
		if (map != null) {
			Bundle args = new Bundle();
			Set<String> keySet = map.keySet();
			for (String key : keySet) {
				args.putString(key, map.get(key));
			}
			fragment.setArguments(args);
		}
		FragmentTransaction transaction = context.getFragmentManager()
				.beginTransaction();

		// Replace whatever is in the fragment_container view with this
		// fragment,
		// and add the transaction to the back stack so the user can navigate
		// back
//		String uuid = UUID.randomUUID().toString();
		if (autoRefreshOnBackClick) {
			transaction.replace(R.id.container_body, fragment);
		} else {
			transaction.add(R.id.container_body, fragment);
		}
		if (addToBackStack)
			transaction.addToBackStack(FragmentName);
		// Commit the transaction
		transaction.commit();

	}

	public static void addFragmentForWalker(Activity context,
			Fragment fragment, Serializable object,
			HashMap<String, String> map, boolean autoRefreshOnBackClick,
			boolean addToBackStack,String FragmentName) {
		// Create fragment and give it an argument specifying the article it
		// should show
		Bundle args = new Bundle();
		if (object != null) {

			args.putSerializable("OBJECT", object);
			fragment.setArguments(args);
		}
		if (map != null) {
			Set<String> keySet = map.keySet();
			for (String key : keySet) {
				args.putString(key, map.get(key));
			}
			fragment.setArguments(args);
		}
		FragmentTransaction transaction = context.getFragmentManager()
				.beginTransaction();

		// Replace whatever is in the fragment_container view with this
		// fragment,
		// and add the transaction to the back stack so the user can navigate
		// back
//		String uuid = UUID.randomUUID().toString();
		if (autoRefreshOnBackClick) {
			transaction.replace(R.id.container_body, fragment);
		} else {
			transaction.add(R.id.container_body, fragment);
		}
		if (addToBackStack)
			transaction.addToBackStack(FragmentName);
		// Commit the transaction
		transaction.commit();

	}

	
}
