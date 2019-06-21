package com.facebook.login;

import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONException;
import org.json.JSONObject;

class DeviceAuthDialog$1
  implements GraphRequest.Callback
{
  DeviceAuthDialog$1(DeviceAuthDialog paramDeviceAuthDialog)
  {
  }

  public void onCompleted(GraphResponse paramGraphResponse)
  {
    AppMethodBeat.i(96711);
    if (DeviceAuthDialog.access$000(this.this$0))
      AppMethodBeat.o(96711);
    while (true)
    {
      return;
      if (paramGraphResponse.getError() != null)
      {
        this.this$0.onError(paramGraphResponse.getError().getException());
        AppMethodBeat.o(96711);
      }
      else
      {
        JSONObject localJSONObject = paramGraphResponse.getJSONObject();
        paramGraphResponse = new DeviceAuthDialog.RequestState();
        try
        {
          paramGraphResponse.setUserCode(localJSONObject.getString("user_code"));
          paramGraphResponse.setRequestCode(localJSONObject.getString("code"));
          paramGraphResponse.setInterval(localJSONObject.getLong("interval"));
          DeviceAuthDialog.access$100(this.this$0, paramGraphResponse);
          AppMethodBeat.o(96711);
        }
        catch (JSONException paramGraphResponse)
        {
          this.this$0.onError(new FacebookException(paramGraphResponse));
          AppMethodBeat.o(96711);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.login.DeviceAuthDialog.1
 * JD-Core Version:    0.6.2
 */