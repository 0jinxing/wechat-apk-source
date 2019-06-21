package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class y
{
  public static String a = "TencentMapSDK";
  private static String b;
  private static String c;
  private static String d;
  private static String e;
  private static String f;
  private static String g;
  private static String h;
  private static float i = 1.0F;

  public static String a()
  {
    return c;
  }

  private static String a(String paramString)
  {
    AppMethodBeat.i(101241);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(101241);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.replace("&", "").replace("#", "").replace("?", "");
      AppMethodBeat.o(101241);
    }
  }

  public static void a(Context paramContext)
  {
    AppMethodBeat.i(101236);
    String str;
    if (b == null)
    {
      str = b(paramContext);
      b = str;
      b = a(str);
    }
    if (c == null)
    {
      str = c(paramContext);
      c = str;
      c = a(str);
    }
    if (d == null)
    {
      str = Build.MODEL;
      d = str;
      d = a(str);
    }
    if (e == null)
      e = Build.VERSION.RELEASE;
    if (f == null)
    {
      str = d(paramContext);
      f = str;
      f = a(str);
    }
    if (g == null)
    {
      str = paramContext.getPackageName();
      g = str;
      g = a(str);
    }
    if (h == null)
    {
      str = e(paramContext);
      h = str;
      h = a(str);
    }
    i = paramContext.getResources().getDisplayMetrics().density;
    AppMethodBeat.o(101236);
  }

  public static String b()
  {
    return d;
  }

  private static String b(Context paramContext)
  {
    AppMethodBeat.i(101237);
    Object localObject;
    if (Build.VERSION.SDK_INT < 21)
      localObject = "armeabi-v7a";
    while (true)
    {
      AppMethodBeat.o(101237);
      return localObject;
      if ((Build.VERSION.SDK_INT >= 21) && (Build.VERSION.SDK_INT < 23))
      {
        paramContext = paramContext.getClassLoader();
        try
        {
          paramContext = ClassLoader.class.getDeclaredMethod("findLibrary", new Class[] { String.class }).invoke(paramContext, new Object[] { "art" });
          if (paramContext != null)
          {
            if (((String)paramContext).contains("lib64"));
            for (paramContext = Build.SUPPORTED_64_BIT_ABIS[0]; ; paramContext = Build.SUPPORTED_32_BIT_ABIS[0])
            {
              localObject = paramContext;
              if (paramContext != null)
                break;
              localObject = Build.SUPPORTED_ABIS[0];
              break;
            }
          }
        }
        catch (NoSuchMethodException paramContext)
        {
          while (true)
            paramContext = "";
        }
        catch (IllegalAccessException paramContext)
        {
          while (true)
            paramContext = "";
        }
        catch (InvocationTargetException paramContext)
        {
          while (true)
            paramContext = "";
        }
        catch (NullPointerException paramContext)
        {
          while (true)
            paramContext = "";
        }
      }
      else if (Build.VERSION.SDK_INT >= 23)
      {
        if (Process.is64Bit())
          localObject = Build.SUPPORTED_64_BIT_ABIS[0];
        else
          localObject = Build.SUPPORTED_32_BIT_ABIS[0];
      }
      else
      {
        localObject = "";
      }
    }
  }

  public static String c()
  {
    return e;
  }

  private static String c(Context paramContext)
  {
    AppMethodBeat.i(101238);
    if (paramContext == null)
    {
      paramContext = "";
      AppMethodBeat.o(101238);
    }
    TelephonyManager localTelephonyManager;
    while (true)
    {
      return paramContext;
      localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
      if (localTelephonyManager != null)
        break;
      paramContext = "";
      AppMethodBeat.o(101238);
    }
    if (Build.VERSION.SDK_INT > 22)
      if (paramContext.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0)
        paramContext = "no permission";
    while (true)
    {
      AppMethodBeat.o(101238);
      break;
      paramContext = localTelephonyManager.getDeviceId();
      continue;
      paramContext = localTelephonyManager.getDeviceId();
    }
  }

  public static String d()
  {
    return f;
  }

  private static String d(Context paramContext)
  {
    AppMethodBeat.i(101239);
    if (paramContext == null)
    {
      paramContext = "";
      AppMethodBeat.o(101239);
    }
    while (true)
    {
      return paramContext;
      PackageManager localPackageManager = paramContext.getPackageManager();
      String str = "unknown";
      try
      {
        paramContext = localPackageManager.getApplicationInfo(paramContext.getPackageName(), 128).loadLabel(localPackageManager);
        paramContext = paramContext.toString();
        AppMethodBeat.o(101239);
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        while (true)
        {
          dy.b(Log.getStackTraceString(paramContext));
          paramContext = str;
        }
      }
    }
  }

  public static String e()
  {
    return g;
  }

  private static String e(Context paramContext)
  {
    AppMethodBeat.i(101240);
    if (paramContext == null)
    {
      paramContext = "";
      AppMethodBeat.o(101240);
    }
    while (true)
    {
      return paramContext;
      String str = paramContext.getPackageName();
      Object localObject = null;
      try
      {
        paramContext = paramContext.getPackageManager().getApplicationInfo(str, 128);
        if (paramContext == null)
        {
          paramContext = "";
          AppMethodBeat.o(101240);
          continue;
        }
        if (paramContext.metaData == null)
        {
          paramContext = "";
          AppMethodBeat.o(101240);
          continue;
        }
        paramContext = paramContext.metaData.getString(a);
        AppMethodBeat.o(101240);
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        while (true)
          paramContext = localObject;
      }
    }
  }

  public static String f()
  {
    return h;
  }

  public static float g()
  {
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.y
 * JD-Core Version:    0.6.2
 */