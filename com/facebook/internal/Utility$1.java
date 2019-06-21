package com.facebook.internal;

import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class Utility$1
  implements GraphRequest.Callback
{
  Utility$1(Utility.GraphMeRequestWithCacheCallback paramGraphMeRequestWithCacheCallback, String paramString)
  {
  }

  public final void onCompleted(GraphResponse paramGraphResponse)
  {
    AppMethodBeat.i(72490);
    if (paramGraphResponse.getError() != null)
    {
      this.val$callback.onFailure(paramGraphResponse.getError().getException());
      AppMethodBeat.o(72490);
    }
    while (true)
    {
      return;
      ProfileInformationCache.putProfileInformation(this.val$accessToken, paramGraphResponse.getJSONObject());
      this.val$callback.onSuccess(paramGraphResponse.getJSONObject());
      AppMethodBeat.o(72490);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.internal.Utility.1
 * JD-Core Version:    0.6.2
 */