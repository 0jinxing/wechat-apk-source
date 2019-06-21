package com.facebook.appevents.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.facebook.FacebookSdk;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class InAppPurchaseActivityLifecycleTracker$1
  implements ServiceConnection
{
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    AppMethodBeat.i(72179);
    InAppPurchaseActivityLifecycleTracker.access$002(InAppPurchaseEventManager.asInterface(FacebookSdk.getApplicationContext(), paramIBinder));
    AppMethodBeat.o(72179);
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.internal.InAppPurchaseActivityLifecycleTracker.1
 * JD-Core Version:    0.6.2
 */