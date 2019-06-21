package com.tencent.smtt.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.sdk.WebView;

public class s
{
  private static String a = null;
  private static String b = "GA";
  private static String c = "GE";
  private static String d = "9422";
  private static String e = "0";
  private static String f = "";
  private static boolean g = false;
  private static boolean h = false;
  private static boolean i = false;

  private static String a()
  {
    AppMethodBeat.i(65297);
    String str = " " + Build.MODEL.replaceAll("[ |\\/|\\_|\\&|\\|]", "") + " ";
    AppMethodBeat.o(65297);
    return str;
  }

  public static String a(Context paramContext)
  {
    AppMethodBeat.i(65291);
    if (!TextUtils.isEmpty(a))
    {
      paramContext = a;
      AppMethodBeat.o(65291);
    }
    while (true)
    {
      return paramContext;
      paramContext = a(paramContext, String.valueOf(WebView.getTbsSDKVersion(paramContext)), "0", b, c, d, e, f, g);
      a = paramContext;
      AppMethodBeat.o(65291);
    }
  }

  private static String a(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, boolean paramBoolean)
  {
    AppMethodBeat.i(65292);
    String str1 = "";
    StringBuilder localStringBuilder = new StringBuilder();
    String str2 = b(paramContext) + "*" + c(paramContext);
    String str3 = str1;
    try
    {
      ApplicationInfo localApplicationInfo = paramContext.getApplicationContext().getApplicationInfo();
      str3 = str1;
      localPackageInfo = paramContext.getPackageManager().getPackageInfo(localApplicationInfo.packageName, 0);
      str3 = str1;
      str1 = localApplicationInfo.packageName;
      str3 = str1;
      boolean bool = TextUtils.isEmpty(paramString7);
      if (!bool)
      {
        str3 = str1;
        str1 = a(str3);
        if (!"QB".equals(str1))
          break label422;
        if (!paramBoolean)
          break label443;
        paramContext = "PAD";
        localStringBuilder.append("QV=3");
        a(localStringBuilder, "PL", "ADR");
        a(localStringBuilder, "PR", str1);
        a(localStringBuilder, "PP", str3);
        a(localStringBuilder, "PPVN", paramString7);
        if (!TextUtils.isEmpty(paramString1))
          a(localStringBuilder, "TBSVC", paramString1);
        a(localStringBuilder, "CO", "SYS");
        if (!TextUtils.isEmpty(paramString2))
          a(localStringBuilder, "COVC", paramString2);
        a(localStringBuilder, "PB", paramString4);
        a(localStringBuilder, "VE", paramString3);
        a(localStringBuilder, "DE", paramContext);
        paramContext = paramString6;
        if (TextUtils.isEmpty(paramString6))
          paramContext = "0";
        a(localStringBuilder, "CHID", paramContext);
        a(localStringBuilder, "LCID", paramString5);
        paramContext = a();
      }
    }
    catch (PackageManager.NameNotFoundException paramString1)
    {
      while (true)
      {
        try
        {
          paramString1 = new java/lang/String;
          paramString1.<init>(paramContext.getBytes("UTF-8"), "ISO8859-1");
          paramContext = paramString1;
          if (!TextUtils.isEmpty(paramContext))
            a(localStringBuilder, "MO", paramContext);
          a(localStringBuilder, "RL", str2);
          paramContext = Build.VERSION.RELEASE;
        }
        catch (Exception paramString1)
        {
          try
          {
            PackageInfo localPackageInfo;
            paramString1 = new java/lang/String;
            paramString1.<init>(paramContext.getBytes("UTF-8"), "ISO8859-1");
            paramContext = paramString1;
            if (!TextUtils.isEmpty(paramContext))
              a(localStringBuilder, "OS", paramContext);
            a(localStringBuilder, "API", Build.VERSION.SDK_INT);
            paramContext = localStringBuilder.toString();
            AppMethodBeat.o(65292);
            return paramContext;
            str3 = str1;
            paramString7 = localPackageInfo.versionName;
            str3 = str1;
            continue;
            paramString7 = paramString7;
            paramString7 = "";
            continue;
            label422: if (d(paramContext))
            {
              paramContext = "PAD";
              continue;
              paramString1 = paramString1;
            }
          }
          catch (Exception paramString1)
          {
            continue;
          }
        }
        label443: paramContext = "PHONE";
      }
    }
  }

  private static String a(String paramString)
  {
    AppMethodBeat.i(65294);
    if ("com.tencent.mm".equals(paramString))
    {
      paramString = "WX";
      AppMethodBeat.o(65294);
    }
    while (true)
    {
      return paramString;
      if ("com.tencent.mobileqq".equals(paramString))
      {
        paramString = "QQ";
        AppMethodBeat.o(65294);
      }
      else if ("com.qzone".equals(paramString))
      {
        paramString = "QZ";
        AppMethodBeat.o(65294);
      }
      else if ("com.tencent.mtt".equals(paramString))
      {
        paramString = "QB";
        AppMethodBeat.o(65294);
      }
      else
      {
        paramString = "TRD";
        AppMethodBeat.o(65294);
      }
    }
  }

  private static void a(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    AppMethodBeat.i(65293);
    paramStringBuilder.append("&").append(paramString1).append("=").append(paramString2);
    AppMethodBeat.o(65293);
  }

  private static int b(Context paramContext)
  {
    AppMethodBeat.i(65295);
    paramContext = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    int j;
    if (paramContext != null)
    {
      j = paramContext.getWidth();
      AppMethodBeat.o(65295);
    }
    while (true)
    {
      return j;
      j = -1;
      AppMethodBeat.o(65295);
    }
  }

  private static int c(Context paramContext)
  {
    AppMethodBeat.i(65296);
    paramContext = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay();
    int j;
    if (paramContext != null)
    {
      j = paramContext.getHeight();
      AppMethodBeat.o(65296);
    }
    while (true)
    {
      return j;
      j = -1;
      AppMethodBeat.o(65296);
    }
  }

  private static boolean d(Context paramContext)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    AppMethodBeat.i(65298);
    if (h)
    {
      bool1 = i;
      AppMethodBeat.o(65298);
    }
    while (true)
    {
      return bool1;
      try
      {
        if (Math.min(b(paramContext), c(paramContext)) * 160 / e(paramContext) >= 700);
        while (true)
        {
          i = bool1;
          h = true;
          bool1 = i;
          AppMethodBeat.o(65298);
          break;
          bool1 = false;
        }
      }
      catch (Throwable paramContext)
      {
        AppMethodBeat.o(65298);
        bool1 = bool2;
      }
    }
  }

  private static int e(Context paramContext)
  {
    AppMethodBeat.i(65299);
    Object localObject = (WindowManager)paramContext.getSystemService("window");
    paramContext = new DisplayMetrics();
    localObject = ((WindowManager)localObject).getDefaultDisplay();
    int j;
    if (localObject != null)
    {
      ((Display)localObject).getMetrics(paramContext);
      j = paramContext.densityDpi;
      AppMethodBeat.o(65299);
    }
    while (true)
    {
      return j;
      j = 160;
      AppMethodBeat.o(65299);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.utils.s
 * JD-Core Version:    0.6.2
 */