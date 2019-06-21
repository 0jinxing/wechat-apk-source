package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class er
{
  private static String a = "";
  private static String b = "";

  public static int a(Context paramContext, String paramString)
  {
    int i = -407;
    AppMethodBeat.i(98824);
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo(paramString, 128);
      if (paramContext == null)
      {
        AppMethodBeat.o(98824);
        j = i;
      }
      while (true)
      {
        return j;
        paramString = paramContext.metaData;
        if (paramString == null)
        {
          AppMethodBeat.o(98824);
          j = -408;
        }
        else
        {
          j = paramContext.metaData.getInt("halley_appid", 0);
          if (j <= 0)
          {
            AppMethodBeat.o(98824);
            j = -408;
          }
          else
          {
            AppMethodBeat.o(98824);
          }
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(98824);
        int j = i;
      }
    }
  }

  public static a a(int paramInt, Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(98814);
    if (TextUtils.isEmpty(paramString1))
    {
      AppMethodBeat.o(98814);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      try
      {
        paramContext = paramContext.getPackageManager();
        ComponentName localComponentName = new android/content/ComponentName;
        localComponentName.<init>(paramString1, paramString2);
        paramString2 = paramContext.getServiceInfo(localComponentName, 128);
        if (paramString2 != null)
        {
          paramContext = new com/tencent/tencentmap/mapsdk/maps/a/er$a;
          paramContext.<init>(paramInt, paramString1, paramString2.enabled, paramString2.exported, paramString2.processName, paramString2.metaData);
          AppMethodBeat.o(98814);
        }
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        AppMethodBeat.o(98814);
        paramContext = null;
      }
    }
  }

  public static String a()
  {
    AppMethodBeat.i(98817);
    String str;
    if (!TextUtils.isEmpty(b))
    {
      str = b;
      AppMethodBeat.o(98817);
    }
    while (true)
    {
      return str;
      str = bt.a().getSharedPreferences(a(false), 0).getString("deviceid", "");
      b = str;
      AppMethodBeat.o(98817);
    }
  }

  public static String a(int paramInt)
  {
    String str = "";
    if (paramInt == 2)
      str = "2g";
    while (true)
    {
      return str;
      if (paramInt == 3)
        str = "3g";
      else if (paramInt == 4)
        str = "4g";
      else if (paramInt == 1)
        str = "wifi";
    }
  }

  public static String a(Context paramContext)
  {
    AppMethodBeat.i(98813);
    Object localObject;
    if (!TextUtils.isEmpty(a))
    {
      localObject = a;
      AppMethodBeat.o(98813);
    }
    while (true)
    {
      return localObject;
      String str1 = paramContext.getPackageName();
      String str2 = eu.a(Process.myPid());
      if (!TextUtils.isEmpty(str2))
      {
        localObject = str2;
        if (str2.startsWith(str1));
      }
      else
      {
        localObject = eu.a(paramContext, Process.myPid());
      }
      a = (String)localObject;
      AppMethodBeat.o(98813);
    }
  }

  private static String a(boolean paramBoolean)
  {
    AppMethodBeat.i(98815);
    Object localObject1 = new StringBuilder("HalleyServicePreferences_").append(bt.c());
    if (bt.b());
    for (Object localObject2 = "_test"; ; localObject2 = "")
    {
      localObject1 = (String)localObject2;
      localObject2 = localObject1;
      if (paramBoolean)
        localObject2 = (String)localObject1 + "_" + bt.i();
      AppMethodBeat.o(98815);
      return localObject2;
    }
  }

  public static void a(String paramString)
  {
    AppMethodBeat.i(98816);
    bt.a().getSharedPreferences(a(false), 0).edit().putString("deviceid", paramString).commit();
    b = paramString;
    AppMethodBeat.o(98816);
  }

  public static void a(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(98822);
    bt.a().getSharedPreferences(a(false), 0).edit().putInt(paramString, paramInt).commit();
    AppMethodBeat.o(98822);
  }

  public static void a(String paramString, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(98820);
    bt.a().getSharedPreferences(a(false), 0).edit().putLong(paramString, paramLong).commit();
    AppMethodBeat.o(98820);
  }

  public static void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(98818);
    bt.a().getSharedPreferences(a(paramBoolean), 0).edit().putString(paramString1, paramString2).commit();
    AppMethodBeat.o(98818);
  }

  public static int b(String paramString, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(98823);
    paramInt = bt.a().getSharedPreferences(a(false), 0).getInt(paramString, 0);
    AppMethodBeat.o(98823);
    return paramInt;
  }

  public static long b(String paramString, long paramLong, boolean paramBoolean)
  {
    AppMethodBeat.i(98821);
    paramLong = bt.a().getSharedPreferences(a(false), 0).getLong(paramString, 0L);
    AppMethodBeat.o(98821);
    return paramLong;
  }

  public static String b(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(98819);
    paramString1 = bt.a().getSharedPreferences(a(paramBoolean), 0).getString(paramString1, paramString2);
    AppMethodBeat.o(98819);
    return paramString1;
  }

  public static final class a
  {
    public String a;
    public boolean b = false;
    public boolean c = false;
    public String d = "";
    public Bundle e;
    private int f;

    public a(int paramInt, String paramString1, boolean paramBoolean1, boolean paramBoolean2, String paramString2, Bundle paramBundle)
    {
      this.f = paramInt;
      this.a = paramString1;
      this.b = paramBoolean1;
      this.c = paramBoolean2;
      this.d = paramString2;
      this.e = paramBundle;
    }

    public final String toString()
    {
      AppMethodBeat.i(98812);
      String str = "appid:" + this.f + "," + this.a + "," + this.b + "," + this.c + "," + this.d;
      AppMethodBeat.o(98812);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.er
 * JD-Core Version:    0.6.2
 */