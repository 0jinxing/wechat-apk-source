package com.facebook;

import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONObject;

class AccessTokenManager$3
  implements GraphRequest.Callback
{
  AccessTokenManager$3(AccessTokenManager paramAccessTokenManager, AccessTokenManager.RefreshResult paramRefreshResult)
  {
  }

  public void onCompleted(GraphResponse paramGraphResponse)
  {
    AppMethodBeat.i(71552);
    paramGraphResponse = paramGraphResponse.getJSONObject();
    if (paramGraphResponse == null)
      AppMethodBeat.o(71552);
    while (true)
    {
      return;
      this.val$refreshResult.accessToken = paramGraphResponse.optString("access_token");
      this.val$refreshResult.expiresAt = paramGraphResponse.optInt("expires_at");
      this.val$refreshResult.dataAccessExpirationTime = Long.valueOf(paramGraphResponse.optLong("data_access_expiration_time"));
      AppMethodBeat.o(71552);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.AccessTokenManager.3
 * JD-Core Version:    0.6.2
 */