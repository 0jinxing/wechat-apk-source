package com.tencent.mm.plugin.wepkg.utils;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.HandlerThread;
import android.webkit.URLUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.plugin.wepkg.model.WepkgCrossProcessTask;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class d
{
  private static volatile al ftB;
  private static final Set<Object> hvE;
  private static final Object iRa;

  static
  {
    AppMethodBeat.i(63665);
    iRa = new Object();
    hvE = new HashSet();
    AppMethodBeat.o(63665);
  }

  public static void aNR()
  {
    AppMethodBeat.i(63654);
    if (ftB == null)
      AppMethodBeat.o(63654);
    while (true)
    {
      return;
      synchronized (iRa)
      {
        if (ftB != null)
        {
          ftB.oAl.quit();
          ftB = null;
        }
        AppMethodBeat.o(63654);
      }
    }
  }

  public static al aNS()
  {
    AppMethodBeat.i(63655);
    if (ftB == null);
    synchronized (iRa)
    {
      if (ftB == null)
      {
        al localal = new com/tencent/mm/sdk/platformtools/al;
        localal.<init>("WebviewCache#WorkerThread");
        ftB = localal;
      }
      ??? = ftB;
      AppMethodBeat.o(63655);
      return ???;
    }
  }

  public static long aNY()
  {
    AppMethodBeat.i(63651);
    long l = bo.anT();
    AppMethodBeat.o(63651);
    return l;
  }

  public static String aid(String paramString)
  {
    AppMethodBeat.i(63657);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(63657);
    }
    while (true)
    {
      return paramString;
      try
      {
        paramString = bo.nullAsNil(Uri.parse(paramString).getQueryParameter("wechat_pkgid"));
        AppMethodBeat.o(63657);
      }
      catch (UnsupportedOperationException paramString)
      {
        ab.e("MicroMsg.Wepkg.WepkgUtil", paramString.getMessage());
        paramString = "";
        AppMethodBeat.o(63657);
      }
    }
  }

  public static String aie(String paramString)
  {
    AppMethodBeat.i(63658);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(63658);
    }
    while (true)
    {
      return paramString;
      paramString = Uri.parse(paramString).getHost();
      AppMethodBeat.o(63658);
    }
  }

  public static String aif(String paramString)
  {
    AppMethodBeat.i(63659);
    if ((bo.isNullOrNil(paramString)) || (!URLUtil.isNetworkUrl(paramString)))
    {
      paramString = "";
      AppMethodBeat.o(63659);
    }
    while (true)
    {
      return paramString;
      try
      {
        localObject = Uri.parse(paramString);
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject = paramString.replaceFirst(((Uri)localObject).getScheme() + "://", "");
        paramString = (String)localObject;
      }
      catch (Exception localException)
      {
        try
        {
          Object localObject;
          if (((String)localObject).contains("?"))
            paramString = ((String)localObject).substring(0, ((String)localObject).indexOf("?"));
          while (true)
          {
            AppMethodBeat.o(63659);
            break;
            localException = localException;
          }
        }
        catch (Exception paramString)
        {
          while (true)
            paramString = localException;
        }
      }
    }
  }

  public static boolean aig(String paramString)
  {
    AppMethodBeat.i(63660);
    boolean bool;
    if (!bo.isNullOrNil(aid(paramString)))
    {
      SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("we_pkg_sp", 4);
      if ((localSharedPreferences != null) && (localSharedPreferences.getBoolean("disable_we_pkg", false)))
      {
        ab.i("MicroMsg.Wepkg.WepkgUtil", "disable wepkg");
        a.b("EnterWeb", paramString, aid(paramString), null, 0L, 0L, a.Kl(11));
        AppMethodBeat.o(63660);
        bool = false;
      }
    }
    while (true)
    {
      return bool;
      if (b.uXV)
      {
        ab.i("MicroMsg.Wepkg.WepkgUtil", "config wepkg disable");
        a.b("EnterWeb", paramString, aid(paramString), null, 0L, 0L, a.Kl(12));
        AppMethodBeat.o(63660);
        bool = false;
      }
      else
      {
        bool = true;
        AppMethodBeat.o(63660);
        continue;
        AppMethodBeat.o(63660);
        bool = false;
      }
    }
  }

  public static boolean aih(String paramString)
  {
    AppMethodBeat.i(63662);
    try
    {
      File localFile = new java/io/File;
      localFile.<init>(paramString);
      if ((!localFile.exists()) || (!localFile.isDirectory()))
        localFile.mkdirs();
      bool = true;
      AppMethodBeat.o(63662);
      return bool;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(63662);
      }
    }
  }

  public static void at(Object paramObject)
  {
    AppMethodBeat.i(63653);
    hvE.remove(paramObject);
    AppMethodBeat.o(63653);
  }

  public static void b(String paramString, com.tencent.mm.plugin.wepkg.model.a parama)
  {
    AppMethodBeat.i(63656);
    long l = System.currentTimeMillis();
    WepkgCrossProcessTask localWepkgCrossProcessTask = new WepkgCrossProcessTask();
    localWepkgCrossProcessTask.Cn = 1001;
    localWepkgCrossProcessTask.uXd = paramString;
    if (ah.bqo())
    {
      aNS().aa(new d.1(localWepkgCrossProcessTask, parama));
      AppMethodBeat.o(63656);
    }
    while (true)
    {
      return;
      localWepkgCrossProcessTask.hww = new d.2(l, parama, localWepkgCrossProcessTask);
      localWepkgCrossProcessTask.aBV();
      WepkgMainProcessService.a(localWepkgCrossProcessTask);
      AppMethodBeat.o(63656);
    }
  }

  public static <T> T bB(T paramT)
  {
    AppMethodBeat.i(63652);
    hvE.add(paramT);
    AppMethodBeat.o(63652);
    return paramT;
  }

  public static boolean dgH()
  {
    boolean bool = true;
    AppMethodBeat.i(63663);
    GregorianCalendar localGregorianCalendar = new GregorianCalendar();
    int i = localGregorianCalendar.get(11);
    int j = localGregorianCalendar.get(12);
    if ((i >= 12) && (i < 14))
      AppMethodBeat.o(63663);
    while (true)
    {
      return bool;
      if (i == 14)
      {
        if (j <= 30)
          AppMethodBeat.o(63663);
      }
      else if ((i >= 18) && (i <= 24))
      {
        AppMethodBeat.o(63663);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(63663);
      }
    }
  }

  public static boolean eA(Context paramContext)
  {
    AppMethodBeat.i(63664);
    paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    boolean bool;
    if (paramContext == null)
    {
      AppMethodBeat.o(63664);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramContext = paramContext.iterator();
      while (true)
        if (paramContext.hasNext())
        {
          ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)paramContext.next();
          if ((localRunningAppProcessInfo.importance == 100) && ((localRunningAppProcessInfo.processName.equals("com.tencent.mm")) || (localRunningAppProcessInfo.processName.equals("com.tencent.mm:tools")) || (localRunningAppProcessInfo.processName.equals("com.tencent.mm:toolsmp"))))
          {
            bool = true;
            AppMethodBeat.o(63664);
            break;
          }
        }
      AppMethodBeat.o(63664);
      bool = false;
    }
  }

  public static String hA(String paramString1, String paramString2)
  {
    AppMethodBeat.i(63661);
    paramString1 = g.x((paramString1 + "_" + paramString2).getBytes());
    AppMethodBeat.o(63661);
    return paramString1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wepkg.utils.d
 * JD-Core Version:    0.6.2
 */