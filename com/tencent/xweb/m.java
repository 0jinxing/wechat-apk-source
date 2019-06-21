package com.tencent.xweb;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Debug;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.c.k;
import com.tencent.xweb.c.k.a;
import org.xwalk.core.Log;
import org.xwalk.core.XWalkEnvironment;

public final class m
{
  private static m AMq = null;
  public i.a AMA = i.a.AMd;
  public boolean AMB = false;
  String AMC = "";
  public Context AMr;
  WebView.d AMs = WebView.d.ANa;
  public boolean AMt = false;
  public boolean AMu = false;
  public boolean AMv = false;
  public boolean AMw = false;
  boolean AMx = false;
  public boolean AMy = false;
  public boolean AMz = false;

  public static m dTZ()
  {
    return AMq;
  }

  public static void jy(Context paramContext)
  {
    AppMethodBeat.i(3825);
    if (AMq != null)
      AppMethodBeat.o(3825);
    while (true)
    {
      return;
      Object localObject = new m();
      AMq = (m)localObject;
      ((m)localObject).AMr = paramContext.getApplicationContext();
      XWalkEnvironment.init(paramContext);
      AMq.AMu = paramContext.getSharedPreferences("wcwebview", 0).getBoolean("bShowVersion", false);
      AMq.AMv = paramContext.getSharedPreferences("wcwebview", 0).getBoolean("bShowX5Version", false);
      AMq.AMw = paramContext.getSharedPreferences("wcwebview", 0).getBoolean("bShowSavePage", false);
      localObject = paramContext.getSharedPreferences("wcwebview", 0).getString("V8type", "RT_TYPE_AUTO");
      try
      {
        AMq.AMA = i.a.valueOf((String)localObject);
        label133: AMq.AMt = XWalkEnvironment.getSharedPreferences().getBoolean("ENABLEREMOTEDEBUG", false);
        String str = XWalkEnvironment.getTestDownLoadUrl(paramContext);
        localObject = AMq;
        if ((str != null) && (!str.isEmpty()));
        for (boolean bool = true; ; bool = false)
        {
          ((m)localObject).AMB = bool;
          AMq.AMy = paramContext.getSharedPreferences("wcwebview", 0).getBoolean("bWaitforDebugger", false);
          if (AMq.AMy)
          {
            localObject = AMq.AMr.getSharedPreferences("wcwebview", 4).getString("strDebugProcess", "");
            if ((localObject != null) && (((String)localObject).equals(XWalkEnvironment.getProcessName())))
            {
              Debug.waitForDebugger();
              Log.w("WebDebugCfg", "strDebugProcess is ".concat(String.valueOf(localObject)));
            }
          }
          AMq.AMz = paramContext.getSharedPreferences("wcwebview", 0).getBoolean("ignore_crashwatch", false);
          AppMethodBeat.o(3825);
          break;
        }
      }
      catch (Exception localException)
      {
        break label133;
      }
    }
  }

  public final void a(i.a parama)
  {
    AppMethodBeat.i(3831);
    if (this.AMA == parama)
      AppMethodBeat.o(3831);
    while (true)
    {
      return;
      this.AMA = parama;
      this.AMr.getSharedPreferences("wcwebview", 0).edit().putString("V8type", parama.toString()).commit();
      AppMethodBeat.o(3831);
    }
  }

  public final void a(String paramString, WebView.d paramd)
  {
    AppMethodBeat.i(3827);
    if ((this.AMr == null) || (paramString == null) || (paramString.isEmpty()))
      AppMethodBeat.o(3827);
    while (true)
    {
      return;
      this.AMC = paramString;
      this.AMs = paramd;
      this.AMr.getSharedPreferences("wcwebview", 0).edit().putString("HardCodeWebView".concat(String.valueOf(paramString)), paramd.toString()).commit();
      AppMethodBeat.o(3827);
    }
  }

  public final void a(String[] paramArrayOfString, d.a parama)
  {
    AppMethodBeat.i(3830);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
      AppMethodBeat.o(3830);
    while (true)
    {
      return;
      SharedPreferences.Editor localEditor = this.AMr.getSharedPreferences("wcwebview", 4).edit();
      int i = paramArrayOfString.length;
      for (int j = 0; j < i; j++)
      {
        String str = paramArrayOfString[j];
        localEditor.putString("force_fr_" + str.toLowerCase(), parama.toString());
      }
      localEditor.commit();
      AppMethodBeat.o(3830);
    }
  }

  public final WebView.d avg(String paramString)
  {
    AppMethodBeat.i(3826);
    if (this.AMC.equals(paramString))
    {
      paramString = this.AMs;
      AppMethodBeat.o(3826);
    }
    SharedPreferences localSharedPreferences;
    while (true)
    {
      return paramString;
      if ((paramString == null) || (paramString.isEmpty()) || (this.AMr == null))
      {
        paramString = WebView.d.ANa;
        AppMethodBeat.o(3826);
      }
      else
      {
        this.AMC = paramString;
        localSharedPreferences = this.AMr.getSharedPreferences("wcwebview", 0);
        if (localSharedPreferences != null)
          break;
        paramString = WebView.d.ANa;
        AppMethodBeat.o(3826);
      }
    }
    String str1 = localSharedPreferences.getString("HardCodeWebView".concat(String.valueOf(paramString)), "");
    String str2;
    if ((str1 != null) && (!str1.isEmpty()))
    {
      str2 = str1;
      if (!str1.equals(WebView.d.ANa.toString()));
    }
    else
    {
      str2 = localSharedPreferences.getString("ABTestWebView".concat(String.valueOf(paramString)), "");
    }
    if ((str2 == null) || (str2.isEmpty()))
      this.AMs = WebView.d.ANa;
    while (true)
    {
      paramString = this.AMs;
      AppMethodBeat.o(3826);
      break;
      try
      {
        this.AMs = WebView.d.valueOf(str2);
      }
      catch (Exception paramString)
      {
        this.AMs = WebView.d.ANa;
      }
    }
  }

  public final void rw(boolean paramBoolean)
  {
    AppMethodBeat.i(3828);
    if (paramBoolean == this.AMt)
      AppMethodBeat.o(3828);
    while (true)
    {
      return;
      this.AMt = paramBoolean;
      XWalkEnvironment.getSharedPreferences().edit().putBoolean("ENABLEREMOTEDEBUG", paramBoolean).commit();
      AppMethodBeat.o(3828);
    }
  }

  public final void rx(boolean paramBoolean)
  {
    AppMethodBeat.i(3829);
    if (paramBoolean == this.AMw)
      AppMethodBeat.o(3829);
    while (true)
    {
      return;
      this.AMw = paramBoolean;
      this.AMr.getSharedPreferences("wcwebview", 0).edit().putBoolean("bShowSavePage", this.AMw).commit();
      AppMethodBeat.o(3829);
    }
  }

  public final void ry(boolean paramBoolean)
  {
    AppMethodBeat.i(3832);
    if (paramBoolean == this.AMB)
      AppMethodBeat.o(3832);
    while (true)
    {
      return;
      this.AMB = paramBoolean;
      if (this.AMB)
      {
        if (XWalkEnvironment.isIaDevice())
          XWalkEnvironment.setTestDownLoadUrl(this.AMr, "https://dldir1.qq.com/weixin/android/wxweb/updateConfig_x86_test.xml");
        while (true)
        {
          localEditor = XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit();
          localEditor.putLong("nLastFetchConfigTime", 0L);
          localEditor.commit();
          k.f(WebView.d.ANb).excute("STR_CMD_CLEAR_SCHEDULER", null);
          AppMethodBeat.o(3832);
          break;
          XWalkEnvironment.setTestDownLoadUrl(this.AMr, "https://dldir1.qq.com/weixin/android/wxweb/updateConfig_test.xml");
        }
      }
      XWalkEnvironment.setTestDownLoadUrl(this.AMr, "");
      SharedPreferences.Editor localEditor = XWalkEnvironment.getSharedPreferencesForUpdateConfig().edit();
      localEditor.putLong("nLastFetchConfigTime", 0L);
      localEditor.commit();
      k.f(WebView.d.ANb).excute("STR_CMD_CLEAR_SCHEDULER", null);
      AppMethodBeat.o(3832);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.m
 * JD-Core Version:    0.6.2
 */