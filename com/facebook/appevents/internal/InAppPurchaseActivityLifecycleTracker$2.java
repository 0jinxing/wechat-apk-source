package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.Executor;

final class InAppPurchaseActivityLifecycleTracker$2
  implements Application.ActivityLifecycleCallbacks
{
  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
  }

  public final void onActivityDestroyed(Activity paramActivity)
  {
  }

  public final void onActivityPaused(Activity paramActivity)
  {
  }

  public final void onActivityResumed(Activity paramActivity)
  {
    AppMethodBeat.i(72182);
    FacebookSdk.getExecutor().execute(new InAppPurchaseActivityLifecycleTracker.2.1(this));
    AppMethodBeat.o(72182);
  }

  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
  }

  public final void onActivityStarted(Activity paramActivity)
  {
  }

  public final void onActivityStopped(Activity paramActivity)
  {
    AppMethodBeat.i(72183);
    if ((InAppPurchaseActivityLifecycleTracker.access$300().booleanValue()) && (paramActivity.getLocalClassName().equals("com.android.billingclient.api.ProxyBillingActivity")))
      FacebookSdk.getExecutor().execute(new InAppPurchaseActivityLifecycleTracker.2.2(this));
    AppMethodBeat.o(72183);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.internal.InAppPurchaseActivityLifecycleTracker.2
 * JD-Core Version:    0.6.2
 */