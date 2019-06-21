package com.tencent.tencentmap.mapsdk.maps.a;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.a;
import com.tencent.tencentmap.mapsdk.a.c;
import com.tencent.tencentmap.mapsdk.a.e;
import com.tencent.tencentmap.mapsdk.a.f;
import java.util.Date;
import java.util.Map;

public class an
{
  protected static Map<String, String> a;
  private static Context b;
  private static String c;
  private static String d;
  private static String e;
  private static Runnable f;

  static
  {
    AppMethodBeat.i(98483);
    b = null;
    c = "";
    d = "10000";
    e = "";
    a = null;
    f = new an.1();
    AppMethodBeat.o(98483);
  }

  public static String a()
  {
    return d;
  }

  public static void a(Context paramContext)
  {
    AppMethodBeat.i(98475);
    a(paramContext, null, true, 0L);
    AppMethodBeat.o(98475);
  }

  @TargetApi(14)
  private static void a(Context paramContext, ay paramay, boolean paramBoolean, long paramLong)
  {
    AppMethodBeat.i(98476);
    if (paramContext == null)
    {
      ag.c(" the context is null! init beacon sdk failed!", new Object[0]);
      AppMethodBeat.o(98476);
      return;
    }
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null);
    for (b = localContext; ; b = paramContext)
    {
      if (paramLong > 0L)
      {
        long l = paramLong;
        if (paramLong > 10000L)
          l = 10000L;
        u.a(l);
      }
      paramLong = new Date().getTime();
      if (Integer.valueOf(Build.VERSION.SDK).intValue() >= 14)
      {
        paramContext = new f();
        ((Application)b).registerActivityLifecycleCallbacks(paramContext);
      }
      ag.a("initUserAction t1:" + (new Date().getTime() - paramLong), new Object[0]);
      paramContext = ax.a(b, a(paramBoolean));
      ax.a(b, paramContext, paramay);
      ag.a("initUserAction t1:" + (new Date().getTime() - paramLong), new Object[0]);
      AppMethodBeat.o(98476);
      break;
    }
  }

  public static void a(String paramString)
  {
    AppMethodBeat.i(98478);
    if ((paramString != null) && (!paramString.trim().equals("")))
      a.a(paramString);
    AppMethodBeat.o(98478);
  }

  public static void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    ag.a = paramBoolean1;
    ag.b = paramBoolean2;
  }

  public static boolean a(String paramString, boolean paramBoolean1, long paramLong1, long paramLong2, Map<String, String> paramMap, boolean paramBoolean2)
  {
    AppMethodBeat.i(98481);
    paramBoolean1 = a(paramString, paramBoolean1, paramLong1, paramLong2, paramMap, paramBoolean2, false);
    AppMethodBeat.o(98481);
    return paramBoolean1;
  }

  public static boolean a(String paramString, boolean paramBoolean1, long paramLong1, long paramLong2, Map<String, String> paramMap, boolean paramBoolean2, boolean paramBoolean3)
  {
    AppMethodBeat.i(98482);
    if ((paramString == null) || ("".equals(paramString.trim())))
    {
      ag.c("param eventName is null or \"\", please check it, return false! ", new Object[0]);
      paramBoolean1 = false;
      AppMethodBeat.o(98482);
    }
    while (true)
    {
      return paramBoolean1;
      String str1 = paramString.replace('|', '_').trim();
      String str2;
      if (str1.length() == 0)
      {
        ag.c("eventName is invalid!! eventName length == 0!", new Object[0]);
        str2 = null;
      }
      while (true)
      {
        if (str2 != null)
          break label162;
        paramBoolean1 = false;
        AppMethodBeat.o(98482);
        break;
        if (e.c(str1))
        {
          str2 = str1;
          if (str1.length() > 128)
          {
            ag.c("eventName is invalid!! eventName length should be less than 128! eventName:".concat(String.valueOf(paramString)), new Object[0]);
            str2 = str1.substring(0, 128);
          }
        }
        else
        {
          ag.c("eventName is invalid!! eventName should be ASCII code in 32-126! eventName:".concat(String.valueOf(paramString)), new Object[0]);
          str2 = null;
        }
      }
      label162: paramBoolean1 = ax.a(str2, paramBoolean1, paramLong1, paramLong2, paramMap, paramBoolean2, paramBoolean3);
      AppMethodBeat.o(98482);
    }
  }

  private static boolean a(boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = true;
    AppMethodBeat.i(98477);
    if (!paramBoolean)
    {
      AppMethodBeat.o(98477);
      paramBoolean = false;
      return paramBoolean;
    }
    String str = a.b(b, "pid_stat", "");
    int i = Process.myPid();
    if ("".equals(str))
    {
      a.c(b, String.valueOf(i));
      paramBoolean = bool1;
    }
    while (true)
      while (true)
      {
        AppMethodBeat.o(98477);
        break;
        int j = -1;
        try
        {
          int k = Integer.valueOf(str).intValue();
          j = k;
          label84: if (j == i)
          {
            AppMethodBeat.o(98477);
            paramBoolean = bool2;
            break;
          }
          if (!a.a(b, j))
          {
            a.c(b, str);
            AppMethodBeat.o(98477);
            paramBoolean = bool2;
          }
        }
        catch (Exception localException)
        {
          break label84;
          paramBoolean = false;
        }
      }
  }

  public static String b()
  {
    return c;
  }

  public static void b(String paramString)
  {
    AppMethodBeat.i(98479);
    if ((paramString != null) && (!paramString.equals("")))
      e = paramString;
    AppMethodBeat.o(98479);
  }

  public static Map<String, String> c()
  {
    return a;
  }

  public static void c(String paramString)
  {
    AppMethodBeat.i(98480);
    c localc1 = c.m();
    c localc2 = localc1;
    if (localc1 == null)
    {
      c.a(b);
      localc2 = c.m();
    }
    if (localc2 == null)
    {
      ag.d("please set the channelID after call initUserAction!", new Object[0]);
      AppMethodBeat.o(98480);
    }
    while (true)
    {
      return;
      localc2.c(e.b(paramString));
      AppMethodBeat.o(98480);
    }
  }

  public static String d()
  {
    return e;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.an
 * JD-Core Version:    0.6.2
 */