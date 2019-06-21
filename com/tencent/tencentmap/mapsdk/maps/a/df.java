package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class df
{
  public static String a = "";
  public static String b = "";
  public static String c = "";
  public static String d = "";

  private static String a()
  {
    try
    {
      String str1 = Build.MODEL;
      return str1;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        String str2 = "null";
    }
  }

  public static void a(Context paramContext)
  {
    AppMethodBeat.i(98699);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(a());
    localStringBuffer.append(";Android ");
    localStringBuffer.append(b());
    localStringBuffer.append(",level ");
    localStringBuffer.append(c());
    a = localStringBuffer.toString();
    b = b(paramContext);
    paramContext.getPackageName();
    c = d();
    d = a();
    AppMethodBeat.o(98699);
  }

  private static String b()
  {
    try
    {
      String str1 = Build.VERSION.RELEASE;
      return str1;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        String str2 = "null";
    }
  }

  private static String b(Context paramContext)
  {
    AppMethodBeat.i(98700);
    Object localObject = paramContext.getPackageName();
    try
    {
      localObject = paramContext.getPackageManager().getPackageInfo((String)localObject, 0);
      paramContext = ((PackageInfo)localObject).versionName;
      int i = ((PackageInfo)localObject).versionCode;
      if ((paramContext == null) || (paramContext.trim().length() <= 0))
      {
        paramContext = String.valueOf(i);
        AppMethodBeat.o(98700);
      }
      while (true)
      {
        return paramContext;
        paramContext = paramContext.trim().replace('\n', ' ').replace('\r', ' ').replace("|", "%7C");
        localObject = paramContext.toCharArray();
        int j = 0;
        int m;
        for (int k = 0; j < localObject.length; k = m)
        {
          m = k;
          if (localObject[j] == '.')
            m = k + 1;
          j++;
        }
        if (k >= 3)
          break;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        paramContext = paramContext + "." + i;
        AppMethodBeat.o(98700);
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        paramContext = "";
        AppMethodBeat.o(98700);
      }
    }
  }

  private static String c()
  {
    try
    {
      String str1 = Build.VERSION.SDK;
      return str1;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        String str2 = "null";
    }
  }

  private static String d()
  {
    Object localObject = null;
    try
    {
      String str = Build.BRAND;
      localObject = str;
      label8: return localObject;
    }
    catch (Throwable localThrowable)
    {
      break label8;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.df
 * JD-Core Version:    0.6.2
 */