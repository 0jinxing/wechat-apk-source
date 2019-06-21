package com.facebook.internal;

import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

class WebDialog$UploadStagingResourcesTask$1
  implements GraphRequest.Callback
{
  WebDialog$UploadStagingResourcesTask$1(WebDialog.UploadStagingResourcesTask paramUploadStagingResourcesTask, String[] paramArrayOfString, int paramInt, CountDownLatch paramCountDownLatch)
  {
  }

  public void onCompleted(GraphResponse paramGraphResponse)
  {
    AppMethodBeat.i(96668);
    try
    {
      Object localObject1 = paramGraphResponse.getError();
      if (localObject1 != null)
      {
        Object localObject2 = ((FacebookRequestError)localObject1).getErrorMessage();
        localObject1 = localObject2;
        if (localObject2 == null)
          localObject1 = "Error staging photo.";
        localObject2 = new com/facebook/FacebookGraphResponseException;
        ((FacebookGraphResponseException)localObject2).<init>(paramGraphResponse, (String)localObject1);
        AppMethodBeat.o(96668);
        throw ((Throwable)localObject2);
      }
    }
    catch (Exception paramGraphResponse)
    {
      WebDialog.UploadStagingResourcesTask.access$800(this.this$1)[this.val$writeIndex] = paramGraphResponse;
    }
    while (true)
    {
      this.val$latch.countDown();
      AppMethodBeat.o(96668);
      return;
      paramGraphResponse = paramGraphResponse.getJSONObject();
      if (paramGraphResponse == null)
      {
        paramGraphResponse = new com/facebook/FacebookException;
        paramGraphResponse.<init>("Error staging photo.");
        AppMethodBeat.o(96668);
        throw paramGraphResponse;
      }
      paramGraphResponse = paramGraphResponse.optString("uri");
      if (paramGraphResponse == null)
      {
        paramGraphResponse = new com/facebook/FacebookException;
        paramGraphResponse.<init>("Error staging photo.");
        AppMethodBeat.o(96668);
        throw paramGraphResponse;
      }
      this.val$results[this.val$writeIndex] = paramGraphResponse;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.internal.WebDialog.UploadStagingResourcesTask.1
 * JD-Core Version:    0.6.2
 */