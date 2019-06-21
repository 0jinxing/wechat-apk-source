package com.facebook.appevents.codeless;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import com.facebook.appevents.codeless.internal.UnityReflection;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.internal.InternalSettings;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class ViewIndexer$1 extends TimerTask
{
  ViewIndexer$1(ViewIndexer paramViewIndexer, Activity paramActivity, String paramString)
  {
  }

  public void run()
  {
    AppMethodBeat.i(72075);
    try
    {
      View localView = this.val$activity.getWindow().getDecorView().getRootView();
      boolean bool = ActivityLifecycleTracker.getIsAppIndexingEnabled();
      if (!bool)
        AppMethodBeat.o(72075);
      while (true)
      {
        return;
        if (InternalSettings.isUnityApp())
        {
          UnityReflection.captureViewHierarchy();
          AppMethodBeat.o(72075);
          continue;
        }
        Object localObject1 = new java/util/concurrent/FutureTask;
        Object localObject2 = new com/facebook/appevents/codeless/ViewIndexer$ScreenshotTaker;
        ((ViewIndexer.ScreenshotTaker)localObject2).<init>(localView);
        ((FutureTask)localObject1).<init>((Callable)localObject2);
        ViewIndexer.access$000(this.this$0).post((Runnable)localObject1);
        try
        {
          localObject1 = (String)((FutureTask)localObject1).get(1L, TimeUnit.SECONDS);
          localObject2 = new org/json/JSONObject;
          ((JSONObject)localObject2).<init>();
        }
        catch (Exception localException1)
        {
          try
          {
            ((JSONObject)localObject2).put("screenname", this.val$activityName);
            ((JSONObject)localObject2).put("screenshot", localObject1);
            localObject1 = new org/json/JSONArray;
            ((JSONArray)localObject1).<init>();
            ((JSONArray)localObject1).put(ViewHierarchy.getDictionaryOfView(localView));
            ((JSONObject)localObject2).put("view", localObject1);
            localObject1 = ((JSONObject)localObject2).toString();
            ViewIndexer.access$200(this.this$0, (String)localObject1, this.val$activityName);
            AppMethodBeat.o(72075);
            continue;
            localException1 = localException1;
            ViewIndexer.access$100();
            String str = "";
          }
          catch (JSONException localJSONException)
          {
            while (true)
              ViewIndexer.access$100();
          }
        }
      }
    }
    catch (Exception localException2)
    {
      while (true)
      {
        ViewIndexer.access$100();
        AppMethodBeat.o(72075);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.codeless.ViewIndexer.1
 * JD-Core Version:    0.6.2
 */