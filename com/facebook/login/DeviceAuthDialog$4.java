package com.facebook.login;

import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

class DeviceAuthDialog$4
  implements GraphRequest.Callback
{
  DeviceAuthDialog$4(DeviceAuthDialog paramDeviceAuthDialog)
  {
  }

  public void onCompleted(GraphResponse paramGraphResponse)
  {
    AppMethodBeat.i(96714);
    if (DeviceAuthDialog.access$300(this.this$0).get())
      AppMethodBeat.o(96714);
    while (true)
    {
      return;
      FacebookRequestError localFacebookRequestError = paramGraphResponse.getError();
      if (localFacebookRequestError != null)
        switch (localFacebookRequestError.getSubErrorCode())
        {
        default:
          this.this$0.onError(paramGraphResponse.getError().getException());
          AppMethodBeat.o(96714);
          break;
        case 1349172:
        case 1349174:
          DeviceAuthDialog.access$400(this.this$0);
          AppMethodBeat.o(96714);
          break;
        case 1349152:
          if (DeviceAuthDialog.access$500(this.this$0) != null)
            DeviceRequestsHelper.cleanUpAdvertisementService(DeviceAuthDialog.access$500(this.this$0).getUserCode());
          if (DeviceAuthDialog.access$600(this.this$0) != null)
          {
            this.this$0.startLogin(DeviceAuthDialog.access$600(this.this$0));
            AppMethodBeat.o(96714);
            continue;
          }
          this.this$0.onCancel();
          AppMethodBeat.o(96714);
          break;
        case 1349173:
          this.this$0.onCancel();
          AppMethodBeat.o(96714);
          break;
        }
      else
        try
        {
          paramGraphResponse = paramGraphResponse.getJSONObject();
          DeviceAuthDialog.access$700(this.this$0, paramGraphResponse.getString("access_token"), Long.valueOf(paramGraphResponse.getLong("expires_in")), Long.valueOf(paramGraphResponse.optLong("data_access_expiration_time")));
          AppMethodBeat.o(96714);
        }
        catch (JSONException paramGraphResponse)
        {
          this.this$0.onError(new FacebookException(paramGraphResponse));
          AppMethodBeat.o(96714);
        }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.login.DeviceAuthDialog.4
 * JD-Core Version:    0.6.2
 */