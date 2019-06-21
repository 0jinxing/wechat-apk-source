package com.facebook.share.internal;

import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONException;
import org.json.JSONObject;

class DeviceShareDialogFragment$2
  implements GraphRequest.Callback
{
  DeviceShareDialogFragment$2(DeviceShareDialogFragment paramDeviceShareDialogFragment)
  {
  }

  public void onCompleted(GraphResponse paramGraphResponse)
  {
    AppMethodBeat.i(96954);
    Object localObject = paramGraphResponse.getError();
    if (localObject != null)
    {
      DeviceShareDialogFragment.access$100(this.this$0, (FacebookRequestError)localObject);
      AppMethodBeat.o(96954);
    }
    while (true)
    {
      return;
      localObject = paramGraphResponse.getJSONObject();
      paramGraphResponse = new DeviceShareDialogFragment.RequestState();
      try
      {
        paramGraphResponse.setUserCode(((JSONObject)localObject).getString("user_code"));
        paramGraphResponse.setExpiresIn(((JSONObject)localObject).getLong("expires_in"));
        DeviceShareDialogFragment.access$200(this.this$0, paramGraphResponse);
        AppMethodBeat.o(96954);
      }
      catch (JSONException paramGraphResponse)
      {
        DeviceShareDialogFragment.access$100(this.this$0, new FacebookRequestError(0, "", "Malformed server response"));
        AppMethodBeat.o(96954);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.DeviceShareDialogFragment.2
 * JD-Core Version:    0.6.2
 */