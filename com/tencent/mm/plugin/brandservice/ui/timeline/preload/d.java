package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.f.a.b;
import a.f.b.j;
import a.l;
import a.v;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.at;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"bundleToString", "", "bundle", "Landroid/os/Bundle;", "findProcess", "", "context", "Landroid/content/Context;", "predicate", "Lkotlin/Function1;", "Landroid/app/ActivityManager$RunningAppProcessInfo;", "getNetWorkType", "now", "", "isExpire", "Lcom/tencent/mm/sdk/platformtools/MultiProcessMMKV;", "key", "duration", "putNow", "", "toDebugString", "Landroid/content/Intent;", "toInt", "", "plugin-brandservice_release"})
public final class d
{
  public static final boolean C(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(14800);
    boolean bool;
    if (System.currentTimeMillis() - paramLong1 > paramLong2)
    {
      bool = true;
      AppMethodBeat.o(14800);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(14800);
    }
  }

  private static final String E(Bundle paramBundle)
  {
    AppMethodBeat.i(138513);
    StringBuilder localStringBuilder = new StringBuilder("Bundle[");
    if (paramBundle == null)
    {
      localStringBuilder.append("null");
      localStringBuilder.append("]");
      paramBundle = localStringBuilder.toString();
      j.o(paramBundle, "out.toString()");
      AppMethodBeat.o(138513);
      return paramBundle;
    }
    while (true)
    {
      Object localObject;
      try
      {
        Iterator localIterator = paramBundle.keySet().iterator();
        int i = 1;
        if (!localIterator.hasNext())
          break;
        localObject = (String)localIterator.next();
        if (i == 0)
          localStringBuilder.append(", ");
        localStringBuilder.append((String)localObject).append('=');
        localObject = paramBundle.get((String)localObject);
        if ((localObject instanceof Object[]))
        {
          localStringBuilder.append(Arrays.toString((Object[])localObject));
          i = 0;
          continue;
        }
        if (!(localObject instanceof Bundle))
          break label175;
        localStringBuilder.append(E((Bundle)localObject));
        continue;
      }
      catch (Exception paramBundle)
      {
        localStringBuilder.append("can not read bundle");
      }
      break;
      label175: localStringBuilder.append(localObject);
    }
  }

  public static final String Q(Intent paramIntent)
  {
    AppMethodBeat.i(138512);
    j.p(paramIntent, "receiver$0");
    paramIntent = paramIntent.toString() + " " + E(paramIntent.getExtras());
    AppMethodBeat.o(138512);
    return paramIntent;
  }

  public static final void a(as paramas, String paramString)
  {
    AppMethodBeat.i(14801);
    j.p(paramas, "receiver$0");
    j.p(paramString, "key");
    paramas.putLong(paramString, System.currentTimeMillis());
    AppMethodBeat.o(14801);
  }

  public static final boolean a(Context paramContext, b<? super ActivityManager.RunningAppProcessInfo, Boolean> paramb)
  {
    AppMethodBeat.i(14803);
    j.p(paramContext, "context");
    j.p(paramb, "predicate");
    paramContext = paramContext.getSystemService("activity");
    if (paramContext == null)
    {
      paramContext = new v("null cannot be cast to non-null type android.app.ActivityManager");
      AppMethodBeat.o(14803);
      throw paramContext;
    }
    paramContext = ((ActivityManager)paramContext).getRunningAppProcesses().iterator();
    boolean bool;
    while (paramContext.hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
      j.o(localRunningAppProcessInfo, "info");
      if (((Boolean)paramb.am(localRunningAppProcessInfo)).booleanValue())
      {
        bool = true;
        AppMethodBeat.o(14803);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(14803);
    }
  }

  public static final boolean a(as paramas, String paramString, long paramLong)
  {
    AppMethodBeat.i(14802);
    j.p(paramas, "receiver$0");
    j.p(paramString, "key");
    boolean bool = C(paramas.getLong(paramString, 0L), paramLong);
    AppMethodBeat.o(14802);
    return bool;
  }

  public static final String aWX()
  {
    AppMethodBeat.i(14804);
    Object localObject = ah.getContext();
    if (at.isWifi((Context)localObject))
    {
      localObject = "wifi";
      AppMethodBeat.o(14804);
    }
    while (true)
    {
      return localObject;
      if (at.is4G((Context)localObject))
      {
        localObject = "4g";
        AppMethodBeat.o(14804);
      }
      else if (at.is3G((Context)localObject))
      {
        localObject = "3g";
        AppMethodBeat.o(14804);
      }
      else if (at.is2G((Context)localObject))
      {
        localObject = "2g";
        AppMethodBeat.o(14804);
      }
      else
      {
        localObject = "none";
        AppMethodBeat.o(14804);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.d
 * JD-Core Version:    0.6.2
 */