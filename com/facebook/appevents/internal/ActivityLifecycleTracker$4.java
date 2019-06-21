package com.facebook.appevents.internal;

import com.facebook.appevents.codeless.ViewIndexingTrigger.OnShakeListener;
import com.facebook.internal.FetchedAppSettings;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ActivityLifecycleTracker$4
  implements ViewIndexingTrigger.OnShakeListener
{
  ActivityLifecycleTracker$4(FetchedAppSettings paramFetchedAppSettings, String paramString)
  {
  }

  public final void onShake()
  {
    AppMethodBeat.i(72142);
    if ((this.val$appSettings != null) && (this.val$appSettings.getCodelessEventsEnabled()))
      ActivityLifecycleTracker.checkCodelessSession(this.val$appId);
    AppMethodBeat.o(72142);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.internal.ActivityLifecycleTracker.4
 * JD-Core Version:    0.6.2
 */