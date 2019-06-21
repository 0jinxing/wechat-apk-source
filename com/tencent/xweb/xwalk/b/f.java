package com.tencent.xweb.xwalk.b;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.XWebCoreContentProvider;
import com.tencent.xweb.w;
import com.tencent.xweb.xwalk.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xwalk.core.NetworkUtil;
import org.xwalk.core.XWalkEnvironment;
import org.xwalk.core.XWalkInitializer;
import org.xwalk.core.XWalkUpdater;
import org.xwalk.core.XWalkUpdater.ErrorInfo;

public final class f extends AsyncTask<String, Integer, Integer>
{
  static XWalkUpdater ASF;
  private static String ATD = "0";
  private HashMap<String, String> ATC;

  public f(XWalkUpdater paramXWalkUpdater, HashMap<String, String> paramHashMap)
  {
    AppMethodBeat.i(85481);
    ASF = paramXWalkUpdater;
    this.ATC = paramHashMap;
    if (paramHashMap != null)
    {
      paramXWalkUpdater = (String)paramHashMap.get("UpdaterCheckType");
      ATD = paramXWalkUpdater;
      if ((paramXWalkUpdater == null) || (!ATD.equals("1")))
        break label84;
      c.dVV().dVZ();
    }
    while (true)
    {
      XWalkInitializer.addXWalkInitializeLog("XWalkUpdateChecker notify received !! mNotifyType = " + ATD);
      AppMethodBeat.o(85481);
      return;
      label84: if ((ATD != null) && (ATD.equals("2")))
      {
        c.dVV().dVZ();
        com.tencent.xweb.util.f.nI(93L);
      }
      else if ((ATD != null) && (ATD.equals("3")))
      {
        c.dWd().ATh = true;
        com.tencent.xweb.util.f.nI(94L);
      }
      else
      {
        ATD = "0";
      }
    }
  }

  public static void SF(int paramInt)
  {
    AppMethodBeat.i(138446);
    dWh();
    c.SF(paramInt);
    AppMethodBeat.o(138446);
  }

  private static boolean b(c.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(85482);
    if (dWf())
      AppMethodBeat.o(85482);
    while (true)
    {
      return bool;
      if (!XWalkEnvironment.isSelfProvider())
      {
        dWg();
        XWalkUpdater.ErrorInfo localErrorInfo = ASF.updateRuntimeFromProvider(parama);
        try
        {
          Object localObject1 = XWalkEnvironment.getPackageName();
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          String str = localErrorInfo.errorCode + "," + (String)localObject1 + "," + localErrorInfo.targetVer + "," + localErrorInfo.readFileListFailedCount + "," + localErrorInfo.noMatchedVersionCount + "," + localErrorInfo.copyFailedCount + "," + localErrorInfo.md5FailedCount + "," + localErrorInfo.extractFailedCount + "," + localErrorInfo.setVersionFailedCount + "," + localErrorInfo.extractRetryFailedCount;
          localObject2 = XWalkEnvironment.getContentResolver();
          if (localObject2 != null)
          {
            localObject1 = XWebCoreContentProvider.b("com.tencent.mm", (String)localObject1, 3, 0, "");
            ContentValues localContentValues = new android/content/ContentValues;
            localContentValues.<init>();
            localContentValues.put("15626", str);
            ((ContentResolver)localObject2).insert((Uri)localObject1, localContentValues);
          }
          if (localErrorInfo.errorCode == 0)
          {
            dWi();
            AppMethodBeat.o(85482);
            bool = true;
          }
        }
        catch (Exception localException)
        {
          while (true)
            XWalkInitializer.addXWalkInitializeLog("_doStartUpdate report error");
          if (localErrorInfo.errorCode == -10)
          {
            int i = localErrorInfo.errorCode;
            dWh();
            c.SF(i);
            AppMethodBeat.o(85482);
            continue;
          }
          dWh();
        }
      }
      else
      {
        XWalkInitializer.addXWalkInitializeLog("_doStartUpdate go on");
        if (!NetworkUtil.isNetworkAvailable())
        {
          parama = w.dUo();
          if (parama != null)
            parama.aMz();
          AppMethodBeat.o(85482);
        }
        else if ((!parama.ATh) && (!NetworkUtil.isWifiAvailable()))
        {
          XWalkInitializer.addXWalkInitializeLog("current network is not wifi , this scheduler not support mobile data");
          parama = w.dUo();
          if (parama != null)
            parama.aMz();
          AppMethodBeat.o(85482);
        }
        else if (ASF.updateXWalkRuntime(parama.dWe()))
        {
          dWg();
          AppMethodBeat.o(85482);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(85482);
        }
      }
    }
  }

  static void c(c.a parama)
  {
    AppMethodBeat.i(85488);
    if (parama != null)
      if (!XWalkEnvironment.hasAvailableVersion())
      {
        XWalkInitializer.addXWalkInitializeLog("no availableversion installed, do start download ");
        b(parama);
      }
    label71: 
    while (true)
    {
      parama = w.dUo();
      if (parama != null)
        parama.aMy();
      AppMethodBeat.o(85488);
      while (true)
      {
        return;
        if (parama.ATv > System.currentTimeMillis())
          break label71;
        b(parama);
        break;
        AppMethodBeat.o(85488);
      }
    }
  }

  public static boolean dWf()
  {
    AppMethodBeat.i(85483);
    int i = XWalkEnvironment.getSharedPreferencesForUpdateConfig().getInt("UpdatingProcessId", -1);
    boolean bool;
    if (i == Process.myPid())
    {
      XWalkInitializer.addXWalkInitializeLog("current process is in updating progress");
      AppMethodBeat.o(85483);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (i < 0)
      {
        AppMethodBeat.o(85483);
        bool = false;
      }
      else
      {
        Object localObject = (ActivityManager)XWalkEnvironment.getApplicationContext().getSystemService("activity");
        Process.myPid();
        int j = Process.myUid();
        Iterator localIterator = ((ActivityManager)localObject).getRunningAppProcesses().iterator();
        while (true)
          if (localIterator.hasNext())
          {
            localObject = (ActivityManager.RunningAppProcessInfo)localIterator.next();
            if (((ActivityManager.RunningAppProcessInfo)localObject).pid == i)
              if (((ActivityManager.RunningAppProcessInfo)localObject).uid == j)
              {
                XWalkInitializer.addXWalkInitializeLog("some process is in updating progress");
                AppMethodBeat.o(85483);
                bool = true;
                break;
              }
          }
        dWh();
        AppMethodBeat.o(85483);
        bool = false;
      }
    }
  }

  public static void dWg()
  {
    AppMethodBeat.i(85484);
    int i = Process.myPid();
    SharedPreferences.Editor localEditor = XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit();
    localEditor.putInt("UpdatingProcessId", i);
    localEditor.commit();
    XWalkInitializer.addXWalkInitializeLog("start updating progress");
    AppMethodBeat.o(85484);
  }

  public static void dWh()
  {
    AppMethodBeat.i(85485);
    Process.myPid();
    SharedPreferences.Editor localEditor = XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit();
    localEditor.remove("UpdatingProcessId");
    localEditor.commit();
    XWalkInitializer.addXWalkInitializeLog("finish updating progress");
    AppMethodBeat.o(85485);
  }

  public static void dWi()
  {
    AppMethodBeat.i(85486);
    XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit();
    dWh();
    c.a(null);
    AppMethodBeat.o(85486);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.b.f
 * JD-Core Version:    0.6.2
 */