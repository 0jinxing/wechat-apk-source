package com.tencent.xweb.xwalk.b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.a;
import org.xwalk.core.NetworkUtil;
import org.xwalk.core.XWalkEnvironment;
import org.xwalk.core.XWalkInitializer;

public class c
{
  static c ATq;
  static c.a ATr;

  public static void SF(int paramInt)
  {
    AppMethodBeat.i(85457);
    Object localObject;
    if (paramInt == -10)
    {
      localObject = XWalkEnvironment.getSharedPreferencesForUpdateConfig();
      paramInt = ((SharedPreferences)localObject).getInt("nTryUseSharedCoreCount", 0);
      XWalkInitializer.addXWalkInitializeLog("onUpdateFailed shared mode, current nTryUseSharedCoreCount: ".concat(String.valueOf(paramInt)));
      paramInt++;
      dWd().ATy = paramInt;
      localObject = ((SharedPreferences)localObject).edit();
      ((SharedPreferences.Editor)localObject).putInt("nTryUseSharedCoreCount", paramInt);
      a((SharedPreferences.Editor)localObject, paramInt);
      ((SharedPreferences.Editor)localObject).commit();
      AppMethodBeat.o(85457);
    }
    while (true)
    {
      return;
      if (!NetworkUtil.isNetworkAvailable())
      {
        AppMethodBeat.o(85457);
      }
      else
      {
        localObject = XWalkEnvironment.getSharedPreferencesForUpdateConfig();
        int i = ((SharedPreferences)localObject).getInt("nTryCnt", 0) + 1;
        int j;
        if ((paramInt == -3) || (paramInt == -4))
        {
          dWd().ATt = false;
          dWd().ATg = dWd().ATu;
          dWd().ATh = false;
          a(dWd());
          XWalkInitializer.addXWalkInitializeLog("switch to full package update");
          j = i;
        }
        while (true)
        {
          if (j <= 3)
            break label213;
          XWalkInitializer.addXWalkInitializeLog("FailedTooManytimes at this version");
          XWalkInitializer.addXWalkInitializeLog("abandon Current Scheduler");
          a(null);
          AppMethodBeat.o(85457);
          break;
          j = i;
          if (paramInt <= -2)
          {
            j = i;
            if (paramInt >= -5)
              j = i + 3;
          }
        }
        label213: dWd().ATx = j;
        localObject = ((SharedPreferences)localObject).edit();
        ((SharedPreferences.Editor)localObject).putInt("nTryCnt", j);
        a((SharedPreferences.Editor)localObject, j);
        ((SharedPreferences.Editor)localObject).commit();
        AppMethodBeat.o(85457);
      }
    }
  }

  private static void a(SharedPreferences.Editor paramEditor, int paramInt)
  {
    try
    {
      AppMethodBeat.i(85458);
      long l1 = System.currentTimeMillis();
      long l2 = 7200000 * paramInt;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("rescheduler update time after ");
      XWalkInitializer.addXWalkInitializeLog(7200000 * paramInt / 60000 + " minute");
      paramEditor.putLong("nTimeToUpdate", l1 + l2);
      AppMethodBeat.o(85458);
      return;
    }
    finally
    {
    }
    throw paramEditor;
  }

  public static void a(c.a parama)
  {
    try
    {
      AppMethodBeat.i(85464);
      ATr = parama;
      if (parama == null)
      {
        parama = new com/tencent/xweb/xwalk/b/c$a;
        parama.<init>();
        ATr = parama;
      }
      parama = XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit();
      parama.putString("strMd5", ATr.ATb);
      parama.putString("strUrl", ATr.ATg);
      parama.putString("strFullPackageUrl", ATr.ATu);
      parama.putString("strConfigVer", ATr.ATc);
      parama.putBoolean("bIsPatchUpdate", ATr.ATt);
      parama.putBoolean("bCanUseCellular", ATr.ATh);
      parama.putBoolean("bUseCdn", ATr.bUseCdn);
      parama.putLong("nTimeToUpdate", ATr.ATv);
      parama.putInt("nApkVer", ATr.ATn);
      parama.putInt("nTryCnt", ATr.ATx);
      parama.putInt("nTryUseSharedCoreCount", ATr.ATy);
      parama.putString("strPatchMd5", ATr.cdy);
      parama.putString("strVersionDetail", ATr.ATw);
      parama.putBoolean("bTryUseSharedCore", ATr.bTryUseSharedCore);
      parama.commit();
      AppMethodBeat.o(85464);
      return;
    }
    finally
    {
    }
    throw parama;
  }

  private static boolean ah(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(85467);
    long l = dWb();
    boolean bool;
    if ((paramLong1 > paramLong2 + l) || (l + paramLong1 < paramLong2))
    {
      bool = true;
      AppMethodBeat.o(85467);
    }
    while (true)
    {
      return bool;
      XWalkInitializer.addXWalkInitializeLog("the most recent time to fetch config is too close");
      bool = false;
      AppMethodBeat.o(85467);
    }
  }

  public static c dVV()
  {
    try
    {
      AppMethodBeat.i(85456);
      if (ATq == null)
      {
        localc = new com/tencent/xweb/xwalk/b/c;
        localc.<init>();
        ATq = localc;
      }
      c localc = ATq;
      AppMethodBeat.o(85456);
      return localc;
    }
    finally
    {
    }
  }

  public static boolean dVW()
  {
    AppMethodBeat.i(85460);
    boolean bool;
    if (!dVX())
    {
      bool = false;
      AppMethodBeat.o(85460);
    }
    while (true)
    {
      return bool;
      XWalkInitializer.addXWalkInitializeLog("has scheduler for update");
      bool = true;
      AppMethodBeat.o(85460);
    }
  }

  public static boolean dVX()
  {
    boolean bool = false;
    while (true)
    {
      try
      {
        AppMethodBeat.i(85461);
        if ((dWd() == null) || (dWd().ATg == null) || (dWd().ATg.isEmpty()))
        {
          AppMethodBeat.o(85461);
          return bool;
        }
        if (dWd().ATn <= XWalkEnvironment.getInstalledNewstVersion())
        {
          AppMethodBeat.o(85461);
          continue;
        }
      }
      finally
      {
      }
      bool = true;
      AppMethodBeat.o(85461);
    }
  }

  public static void dWa()
  {
    AppMethodBeat.i(85465);
    dWd().ATs = System.currentTimeMillis();
    SharedPreferences.Editor localEditor = XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit();
    localEditor.putLong("nLastFetchConfigTime", dWd().ATs);
    localEditor.commit();
    AppMethodBeat.o(85465);
  }

  public static long dWb()
  {
    AppMethodBeat.i(85466);
    long l1 = a.dTO();
    long l2 = l1;
    if (l1 < 0L)
      l2 = 86400000L;
    AppMethodBeat.o(85466);
    return l2;
  }

  public static boolean dWc()
  {
    AppMethodBeat.i(85468);
    long l1 = System.currentTimeMillis();
    boolean bool;
    if (ah(l1, dWd().ATs))
    {
      long l2 = XWalkEnvironment.getSharedPreferencesForUpdateConfig().getLong("nLastFetchConfigTime", 0L);
      dWd().ATs = l2;
      if (ah(l1, l2))
      {
        XWalkInitializer.addXWalkInitializeLog("enough time after last time fetch config");
        bool = true;
        AppMethodBeat.o(85468);
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(85468);
    }
  }

  public static c.a dWd()
  {
    AppMethodBeat.i(85469);
    Object localObject;
    if (ATr != null)
    {
      localObject = ATr;
      AppMethodBeat.o(85469);
    }
    while (true)
    {
      return localObject;
      ATr = new c.a();
      localObject = XWalkEnvironment.getSharedPreferencesForUpdateConfig();
      ATr.ATs = ((SharedPreferences)localObject).getLong("nLastFetchConfigTime", 0L);
      if (!((SharedPreferences)localObject).contains("strUrl"))
      {
        localObject = ATr;
        AppMethodBeat.o(85469);
      }
      else
      {
        ATr.ATb = ((SharedPreferences)localObject).getString("strMd5", null);
        ATr.ATg = ((SharedPreferences)localObject).getString("strUrl", null);
        ATr.ATu = ((SharedPreferences)localObject).getString("strFullPackageUrl", null);
        ATr.ATc = ((SharedPreferences)localObject).getString("strConfigVer", null);
        ATr.ATt = ((SharedPreferences)localObject).getBoolean("bIsPatchUpdate", false);
        ATr.ATv = ((SharedPreferences)localObject).getLong("nTimeToUpdate", 0L);
        ATr.ATn = ((SharedPreferences)localObject).getInt("nApkVer", 0);
        ATr.ATx = ((SharedPreferences)localObject).getInt("nTryCnt", 0);
        ATr.ATy = ((SharedPreferences)localObject).getInt("nTryUseSharedCoreCount", 0);
        ATr.cdy = ((SharedPreferences)localObject).getString("strPatchMd5", null);
        ATr.ATw = ((SharedPreferences)localObject).getString("strVersionDetail", null);
        ATr.ATh = ((SharedPreferences)localObject).getBoolean("bCanUseCellular", false);
        ATr.bUseCdn = ((SharedPreferences)localObject).getBoolean("bUseCdn", false);
        ATr.bTryUseSharedCore = ((SharedPreferences)localObject).getBoolean("bTryUseSharedCore", true);
        localObject = ATr;
        AppMethodBeat.o(85469);
      }
    }
  }

  static boolean iM(String paramString1, String paramString2)
  {
    AppMethodBeat.i(85459);
    boolean bool;
    if (paramString1 == null)
      if (paramString1 == paramString2)
      {
        bool = true;
        AppMethodBeat.o(85459);
      }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(85459);
      continue;
      bool = paramString1.equals(paramString2);
      AppMethodBeat.o(85459);
    }
  }

  public final boolean dVY()
  {
    boolean bool = false;
    while (true)
    {
      try
      {
        AppMethodBeat.i(85462);
        if (!dVX())
        {
          AppMethodBeat.o(85462);
          return bool;
        }
        if (System.currentTimeMillis() >= dWd().ATv)
        {
          XWalkInitializer.addXWalkInitializeLog("time to update");
          bool = true;
          AppMethodBeat.o(85462);
          continue;
        }
      }
      finally
      {
      }
      XWalkInitializer.addXWalkInitializeLog("has scheduler waiting for update, but time is not up");
      AppMethodBeat.o(85462);
    }
  }

  public final void dVZ()
  {
    try
    {
      AppMethodBeat.i(85463);
      SharedPreferences.Editor localEditor = XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit();
      localEditor.putLong("nLastFetchConfigTime", 0L);
      localEditor.commit();
      dWd().ATs = 0L;
      dWd().ATv = 0L;
      AppMethodBeat.o(85463);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.b.c
 * JD-Core Version:    0.6.2
 */