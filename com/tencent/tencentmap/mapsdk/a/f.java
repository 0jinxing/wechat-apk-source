package com.tencent.tencentmap.mapsdk.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

@TargetApi(14)
public final class f
  implements Application.ActivityLifecycleCallbacks
{
  private static SparseArray<WeakReference<Activity>> a;

  static
  {
    AppMethodBeat.i(97836);
    a = new SparseArray();
    AppMethodBeat.o(97836);
  }

  private static void a(Activity paramActivity)
  {
    AppMethodBeat.i(97835);
    if ((paramActivity != null) && (a != null))
    {
      int i = paramActivity.hashCode();
      if (a.get(i) == null)
      {
        paramActivity = new WeakReference(paramActivity);
        a.put(i, paramActivity);
      }
    }
    AppMethodBeat.o(97835);
  }

  public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(97828);
    a(paramActivity);
    AppMethodBeat.o(97828);
  }

  public final void onActivityDestroyed(Activity paramActivity)
  {
    AppMethodBeat.i(97834);
    a.b = true;
    a(paramActivity);
    AppMethodBeat.o(97834);
  }

  public final void onActivityPaused(Activity paramActivity)
  {
    AppMethodBeat.i(97831);
    a.b = true;
    a(paramActivity);
    AppMethodBeat.o(97831);
  }

  public final void onActivityResumed(Activity paramActivity)
  {
    AppMethodBeat.i(97830);
    a.b = true;
    a(paramActivity);
    AppMethodBeat.o(97830);
  }

  public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(97833);
    a.b = true;
    a(paramActivity);
    AppMethodBeat.o(97833);
  }

  public final void onActivityStarted(Activity paramActivity)
  {
    AppMethodBeat.i(97829);
    a.b = true;
    a(paramActivity);
    AppMethodBeat.o(97829);
  }

  public final void onActivityStopped(Activity paramActivity)
  {
    AppMethodBeat.i(97832);
    a.b = true;
    a(paramActivity);
    AppMethodBeat.o(97832);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.f
 * JD-Core Version:    0.6.2
 */