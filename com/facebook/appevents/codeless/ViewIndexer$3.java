package com.facebook.appevents.codeless;

import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.tencent.matrix.trace.core.AppMethodBeat;
import org.json.JSONException;
import org.json.JSONObject;

class ViewIndexer$3
  implements Runnable
{
  ViewIndexer$3(ViewIndexer paramViewIndexer, String paramString)
  {
  }

  public void run()
  {
    AppMethodBeat.i(72077);
    Object localObject1 = FacebookSdk.getApplicationId();
    String str = Utility.md5hash(this.val$tree);
    Object localObject2 = AccessToken.getCurrentAccessToken();
    if ((str != null) && (str.equals(ViewIndexer.access$400(this.this$0))))
      AppMethodBeat.o(72077);
    while (true)
    {
      return;
      localObject2 = ViewIndexer.buildAppIndexingRequest(this.val$tree, (AccessToken)localObject2, (String)localObject1, "app_indexing");
      if (localObject2 != null)
      {
        localObject2 = ((GraphRequest)localObject2).executeAndWait();
        try
        {
          localObject1 = ((GraphResponse)localObject2).getJSONObject();
          if (localObject1 == null)
            break label157;
          if ((((JSONObject)localObject1).has("success")) && (((JSONObject)localObject1).getString("success") == "true"))
          {
            Logger.log(LoggingBehavior.APP_EVENTS, ViewIndexer.access$100(), "Successfully send UI component tree to server");
            ViewIndexer.access$402(this.this$0, str);
          }
          if (!((JSONObject)localObject1).has("is_app_indexing_enabled"))
            break label180;
          ActivityLifecycleTracker.updateAppIndexing(Boolean.valueOf(((JSONObject)localObject1).getBoolean("is_app_indexing_enabled")));
          AppMethodBeat.o(72077);
        }
        catch (JSONException localJSONException)
        {
          ViewIndexer.access$100();
        }
      }
      else
      {
        AppMethodBeat.o(72077);
        continue;
        label157: ViewIndexer.access$100();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("Error sending UI component tree to Facebook: ");
        localStringBuilder.append(((GraphResponse)localObject2).getError());
        label180: AppMethodBeat.o(72077);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.codeless.ViewIndexer.3
 * JD-Core Version:    0.6.2
 */