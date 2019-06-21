package com.facebook.appevents.codeless;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AppEventUtility;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;

public class ViewIndexer
{
  private static final String APP_VERSION_PARAM = "app_version";
  private static final String PLATFORM_PARAM = "platform";
  private static final String REQUEST_TYPE = "request_type";
  private static final String SUCCESS = "success";
  private static final String TAG;
  private static final String TREE_PARAM = "tree";
  private WeakReference<Activity> activityReference;
  private Timer indexingTimer;
  private String previousDigest;
  private final Handler uiThreadHandler;

  static
  {
    AppMethodBeat.i(72089);
    TAG = ViewIndexer.class.getCanonicalName();
    AppMethodBeat.o(72089);
  }

  public ViewIndexer(Activity paramActivity)
  {
    AppMethodBeat.i(72082);
    this.activityReference = new WeakReference(paramActivity);
    this.previousDigest = null;
    this.uiThreadHandler = new Handler(Looper.getMainLooper());
    AppMethodBeat.o(72082);
  }

  public static GraphRequest buildAppIndexingRequest(String paramString1, AccessToken paramAccessToken, String paramString2, String paramString3)
  {
    Bundle localBundle = null;
    AppMethodBeat.i(72087);
    if (paramString1 == null)
      AppMethodBeat.o(72087);
    for (paramString1 = localBundle; ; paramString1 = paramString2)
    {
      return paramString1;
      paramString2 = GraphRequest.newPostRequest(paramAccessToken, String.format(Locale.US, "%s/app_indexing", new Object[] { paramString2 }), null, null);
      localBundle = paramString2.getParameters();
      paramAccessToken = localBundle;
      if (localBundle == null)
        paramAccessToken = new Bundle();
      paramAccessToken.putString("tree", paramString1);
      paramAccessToken.putString("app_version", AppEventUtility.getAppVersion());
      paramAccessToken.putString("platform", "android");
      paramAccessToken.putString("request_type", paramString3);
      if (paramString3.equals("app_indexing"))
        paramAccessToken.putString("device_session_id", ActivityLifecycleTracker.getCurrentDeviceSessionID());
      paramString2.setParameters(paramAccessToken);
      paramString2.setCallback(new ViewIndexer.4());
      AppMethodBeat.o(72087);
    }
  }

  private void sendToServer(String paramString1, String paramString2)
  {
    AppMethodBeat.i(72086);
    FacebookSdk.getExecutor().execute(new ViewIndexer.3(this, paramString1));
    AppMethodBeat.o(72086);
  }

  public void schedule()
  {
    AppMethodBeat.i(72083);
    Activity localActivity = (Activity)this.activityReference.get();
    if (localActivity == null)
      AppMethodBeat.o(72083);
    while (true)
    {
      return;
      Object localObject = localActivity.getClass().getSimpleName();
      FacebookSdk.getApplicationId();
      localObject = new ViewIndexer.1(this, localActivity, (String)localObject);
      FacebookSdk.getExecutor().execute(new Runnable()
      {
        public void run()
        {
          AppMethodBeat.i(72076);
          try
          {
            if (ViewIndexer.this.indexingTimer != null)
              ViewIndexer.this.indexingTimer.cancel();
            ViewIndexer.access$402(ViewIndexer.this, null);
            ViewIndexer localViewIndexer = ViewIndexer.this;
            Timer localTimer = new java/util/Timer;
            localTimer.<init>();
            ViewIndexer.access$302(localViewIndexer, localTimer);
            ViewIndexer.this.indexingTimer.scheduleAtFixedRate(this.val$indexingTask, 0L, 1000L);
            AppMethodBeat.o(72076);
            return;
          }
          catch (Exception localException)
          {
            while (true)
              AppMethodBeat.o(72076);
          }
        }
      });
      AppMethodBeat.o(72083);
    }
  }

  public void sendToServerUnity(String paramString)
  {
    AppMethodBeat.i(72085);
    Object localObject = (Activity)this.activityReference.get();
    if (localObject != null);
    for (localObject = localObject.getClass().getSimpleName(); ; localObject = "")
    {
      sendToServer(paramString, (String)localObject);
      AppMethodBeat.o(72085);
      return;
    }
  }

  public void unschedule()
  {
    AppMethodBeat.i(72084);
    if ((Activity)this.activityReference.get() == null)
      AppMethodBeat.o(72084);
    while (true)
    {
      return;
      if (this.indexingTimer != null)
        try
        {
          this.indexingTimer.cancel();
          this.indexingTimer = null;
          AppMethodBeat.o(72084);
        }
        catch (Exception localException)
        {
        }
      else
        AppMethodBeat.o(72084);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.codeless.ViewIndexer
 * JD-Core Version:    0.6.2
 */