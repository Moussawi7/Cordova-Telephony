package pro.moussawi7.plugins;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.content.Context;
import android.telephony.TelephonyManager;

public class Telephony extends CordovaPlugin {
	
@Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {	
    try {
    	Context context=this.cordova.getActivity();
    	    TelephonyManager mManager =(TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);

      	    String NetworkOperator =   mManager.getNetworkOperator();
    	    String PhoneNumber =   mManager.getLine1Number();
    	    String SimSerialNumber= mManager.getSimSerialNumber();
    	    String NetworkCountry=mManager.getNetworkCountryIso();
    	    
            JSONObject result = new JSONObject();
    	    result.put("NetworkOperator",NetworkOperator);
    	    result.put("PhoneNumber",PhoneNumber);
    	    result.put("SimSerialNumber",SimSerialNumber);
    	    result.put("NetworkCountry",NetworkCountry);
    	    
            callbackContext.success(result);
       return true;
    } catch (Exception e) {
      callbackContext.error(e.getMessage());
      return false;
    }
  }

}