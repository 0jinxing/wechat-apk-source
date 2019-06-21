package com.tencent.smtt.utils;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class TbsLog
{
  public static final int TBSLOG_CODE_SDK_BASE = 1000;
  public static final int TBSLOG_CODE_SDK_CONFLICT_X5CORE = 993;
  public static final int TBSLOG_CODE_SDK_INIT = 999;
  public static final int TBSLOG_CODE_SDK_INVOKE_ERROR = 997;
  public static final int TBSLOG_CODE_SDK_LOAD_ERROR = 998;
  public static final int TBSLOG_CODE_SDK_NO_SHARE_X5CORE = 994;
  public static final int TBSLOG_CODE_SDK_SELF_MODE = 996;
  public static final int TBSLOG_CODE_SDK_THIRD_MODE = 995;
  public static final int TBSLOG_CODE_SDK_UNAVAIL_X5CORE = 992;
  public static final String X5LOGTAG = "x5logtag";
  private static boolean a;
  private static boolean b;
  private static TbsLogClient c;
  public static int sLogMaxCount;
  public static List<String> sTbsLogList;

  static
  {
    AppMethodBeat.i(65337);
    a = false;
    b = true;
    c = null;
    sTbsLogList = new LinkedList();
    sLogMaxCount = 10;
    AppMethodBeat.o(65337);
  }

  public static void addLog(int paramInt, String paramString, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(65336);
    try
    {
      Object localObject1;
      Object localObject2;
      synchronized (sTbsLogList)
      {
        if (sTbsLogList.size() > sLogMaxCount)
          for (int i = sTbsLogList.size() - sLogMaxCount; (i > 0) && (sTbsLogList.size() > 0); i--)
            sTbsLogList.remove(0);
        localObject1 = null;
        localObject2 = localObject1;
        if (paramString == null);
      }
      try
      {
        localObject2 = String.format(paramString, paramArrayOfObject);
        paramString = (String)localObject2;
        if (localObject2 == null)
          paramString = "";
        paramString = String.format("[%d][%d][%c][%d]%s", new Object[] { Long.valueOf(System.currentTimeMillis()), Integer.valueOf(1), Character.valueOf('0'), Integer.valueOf(paramInt), paramString });
        sTbsLogList.add(paramString);
        label155: AppMethodBeat.o(65336);
        return;
        paramString = finally;
        AppMethodBeat.o(65336);
        throw paramString;
      }
      catch (Exception paramString)
      {
        while (true)
          localObject2 = localObject1;
      }
    }
    catch (Exception paramString)
    {
      break label155;
    }
  }

  public static void app_extra(String paramString, Context paramContext)
  {
    int i = 0;
    AppMethodBeat.i(65322);
    try
    {
      paramContext = paramContext.getApplicationContext();
      while (true)
      {
        if (i < 6)
        {
          if (paramContext.getPackageName().contains(new String[] { "com.tencent.tbs", "com.tencent.mtt", "com.tencent.mm", "com.tencent.mobileqq", "com.tencent.mtt.sdk.test", "com.qzone" }[i]))
          {
            paramContext = new java/lang/StringBuilder;
            paramContext.<init>("app_extra pid:");
            i(paramString, Process.myPid() + "; APP_TAG:" + new String[] { "DEMO", "QB", "WX", "QQ", "TEST", "QZ" }[i] + "!");
          }
        }
        else
        {
          if (i == 6)
          {
            paramContext = new java/lang/StringBuilder;
            paramContext.<init>("app_extra pid:");
            i(paramString, Process.myPid() + "; APP_TAG:OTHER!");
          }
          AppMethodBeat.o(65322);
          return;
        }
        i++;
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        w(paramString, "app_extra exception:" + Log.getStackTraceString(paramContext));
        AppMethodBeat.o(65322);
      }
    }
  }

  public static void d(String paramString1, String paramString2)
  {
    if (c == null);
  }

  public static void d(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(65329);
    d(paramString1, paramString2);
    if ((c != null) && (a) && (paramBoolean))
      c.showLog(paramString1 + ": " + paramString2);
    AppMethodBeat.o(65329);
  }

  public static void e(String paramString1, String paramString2)
  {
    AppMethodBeat.i(65325);
    if (c == null)
      AppMethodBeat.o(65325);
    while (true)
    {
      return;
      c.writeLog("(E)-" + paramString1 + "-TBS:" + paramString2);
      AppMethodBeat.o(65325);
    }
  }

  public static void e(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(65326);
    e(paramString1, paramString2);
    if ((c != null) && (a) && (paramBoolean))
      c.showLog(paramString1 + ": " + paramString2);
    AppMethodBeat.o(65326);
  }

  public static String getTbsLogFilePath()
  {
    AppMethodBeat.i(65333);
    String str;
    if (TbsLogClient.c != null)
    {
      str = TbsLogClient.c.getAbsolutePath();
      AppMethodBeat.o(65333);
    }
    while (true)
    {
      return str;
      str = null;
      AppMethodBeat.o(65333);
    }
  }

  public static void i(String paramString1, String paramString2)
  {
    AppMethodBeat.i(65323);
    if (c == null)
      AppMethodBeat.o(65323);
    while (true)
    {
      return;
      c.writeLog("(I)-" + paramString1 + "-TBS:" + paramString2);
      AppMethodBeat.o(65323);
    }
  }

  public static void i(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(65324);
    i(paramString1, paramString2);
    if ((c != null) && (a) && (paramBoolean))
      c.showLog(paramString1 + ": " + paramString2);
    AppMethodBeat.o(65324);
  }

  public static void initIfNeed(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(65334);
      if (c == null)
      {
        TbsLogClient localTbsLogClient = new com/tencent/smtt/utils/TbsLogClient;
        localTbsLogClient.<init>(paramContext);
        setTbsLogClient(localTbsLogClient);
      }
      AppMethodBeat.o(65334);
      return;
    }
    finally
    {
    }
    throw paramContext;
  }

  public static void setLogView(TextView paramTextView)
  {
    AppMethodBeat.i(65331);
    if ((paramTextView == null) || (c == null))
      AppMethodBeat.o(65331);
    while (true)
    {
      return;
      c.setLogView(paramTextView);
      AppMethodBeat.o(65331);
    }
  }

  public static boolean setTbsLogClient(TbsLogClient paramTbsLogClient)
  {
    AppMethodBeat.i(65332);
    boolean bool;
    if (paramTbsLogClient == null)
    {
      bool = false;
      AppMethodBeat.o(65332);
    }
    while (true)
    {
      return bool;
      c = paramTbsLogClient;
      TbsLogClient.setWriteLogJIT(b);
      bool = true;
      AppMethodBeat.o(65332);
    }
  }

  public static void setWriteLogJIT(boolean paramBoolean)
  {
    AppMethodBeat.i(65321);
    b = paramBoolean;
    if (c == null)
      AppMethodBeat.o(65321);
    while (true)
    {
      return;
      TbsLogClient.setWriteLogJIT(paramBoolean);
      AppMethodBeat.o(65321);
    }
  }

  public static void v(String paramString1, String paramString2)
  {
    if (c == null);
  }

  public static void v(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(65330);
    v(paramString1, paramString2);
    if ((c != null) && (a) && (paramBoolean))
      c.showLog(paramString1 + ": " + paramString2);
    AppMethodBeat.o(65330);
  }

  public static void w(String paramString1, String paramString2)
  {
    AppMethodBeat.i(65327);
    if (c == null)
      AppMethodBeat.o(65327);
    while (true)
    {
      return;
      c.writeLog("(W)-" + paramString1 + "-TBS:" + paramString2);
      AppMethodBeat.o(65327);
    }
  }

  public static void w(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(65328);
    w(paramString1, paramString2);
    if ((c != null) && (a) && (paramBoolean))
      c.showLog(paramString1 + ": " + paramString2);
    AppMethodBeat.o(65328);
  }

  public static void writeLogToDisk()
  {
    try
    {
      AppMethodBeat.i(65335);
      if (c != null)
        c.writeLogToDisk();
      AppMethodBeat.o(65335);
      return;
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.utils.TbsLog
 * JD-Core Version:    0.6.2
 */