package com.tencent.mm.plugin.appbrand.game.g;

import a.f.b.j;
import a.k.m;
import a.l;
import a.v;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.Iterator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/game/util/WAGameSelfRestart;", "", "()V", "prepare_restart", "", "selfRestart", "suicide", "plugin-appbrand-integration_release"})
public final class a
{
  public static final a huo;

  static
  {
    AppMethodBeat.i(134638);
    huo = new a();
    AppMethodBeat.o(134638);
  }

  public static void aBH()
  {
    AppMethodBeat.i(134636);
    Object localObject = ah.getContext().getSystemService("activity");
    if (localObject == null)
    {
      localObject = new v("null cannot be cast to non-null type android.app.ActivityManager");
      AppMethodBeat.o(134636);
      throw ((Throwable)localObject);
    }
    localObject = ((ActivityManager)localObject).getRunningAppProcesses();
    j.o(localObject, "am.runningAppProcesses");
    localObject = ((Iterable)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
      String str = localRunningAppProcessInfo.processName;
      j.o(str, "it.processName");
      if (m.a((CharSequence)str, (CharSequence)"com.tencent.mm:", false))
        Process.killProcess(localRunningAppProcessInfo.pid);
    }
    Process.killProcess(Process.myPid());
    AppMethodBeat.o(134636);
  }

  public static void aBI()
  {
    AppMethodBeat.i(134637);
    Object localObject = ah.getContext();
    j.o(localObject, "context");
    PendingIntent localPendingIntent = PendingIntent.getActivity((Context)localObject, -1, ((Context)localObject).getPackageManager().getLaunchIntentForPackage(((Context)localObject).getPackageName()), 268435456);
    localObject = (AlarmManager)((Context)localObject).getSystemService("alarm");
    if (localObject == null)
      j.dWJ();
    ((AlarmManager)localObject).set(1, System.currentTimeMillis() + 100L, localPendingIntent);
    AppMethodBeat.o(134637);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.g.a
 * JD-Core Version:    0.6.2
 */