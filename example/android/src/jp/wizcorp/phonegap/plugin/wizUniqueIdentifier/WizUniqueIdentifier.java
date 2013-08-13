/*
 *
 * @author 	Ally Ogilvie
 * @copyright Wizcorp Inc. [ Incorporated Wizards ] 2013
 * @file	- WizUniqueIdentifier.java
 * @about	- Create and return a unique identifier.
*/
package jp.wizcorp.phonegap.plugin.wizUniqueIdentifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

import java.util.UUID;

public class WizUniqueIdentifier extends CordovaPlugin {

    public static final String TAG = "WizUniqueIdentifier";
    private String PREF_NAME = "jp.wizcorp.application";

    @Override
    public void initialize(final org.apache.cordova.api.CordovaInterface cordova, org.apache.cordova.CordovaWebView webView) {

        super.initialize(cordova, webView);
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

		Log.d(TAG, "Plugin execute called with action: " + action);

		if (action.equalsIgnoreCase("get")) {
            // Get unique identifier, if not existing, create

            SharedPreferences prefs = cordova.getActivity().getSharedPreferences(
                    PREF_NAME, Context.MODE_PRIVATE);

            String uniqueID;
            if (prefs.contains("id")) {
                uniqueID = prefs.getString("id", "");
            } else {
                // Create
                uniqueID = UUID.randomUUID().toString();

                // Store
                prefs.edit().putString("id", uniqueID).commit();
            }

            // Return it
            PluginResult result = new PluginResult(PluginResult.Status.OK, uniqueID);
            callbackContext.sendPluginResult(result);
            return true;

        }
		return false;
    }

}
