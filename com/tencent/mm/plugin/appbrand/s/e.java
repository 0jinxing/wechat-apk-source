package com.tencent.mm.plugin.appbrand.s;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.tencent.luggage.g.i;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class e
{
  private static final Set<Object> hvE;
  private static final String iRj;
  private static final char[] iRk;
  private static final String[] iRl;

  static
  {
    AppMethodBeat.i(87422);
    iRj = ah.getPackageName();
    hvE = new HashSet();
    iRk = new char[] { 60, 62, 34, 39, 38, 32, 39 };
    iRl = new String[] { "&lt;", "&gt;", "&quot;", "&apos;", "&amp;", "&nbsp;", "&#39;" };
    AppMethodBeat.o(87422);
  }

  public static String Eh(String paramString)
  {
    AppMethodBeat.i(87417);
    StringBuffer localStringBuffer = new StringBuffer();
    int i = paramString.length();
    int j = 0;
    while (j < i)
    {
      for (int k = 0; k < iRk.length; k++)
      {
        String str = iRl[k];
        for (int m = 0; (m < str.length()) && (j + m < i) && (str.charAt(m) == paramString.charAt(j + m)); m++);
        if (m == str.length())
          break;
      }
      if (k != iRk.length)
      {
        localStringBuffer.append(iRk[k]);
        j = iRl[k].length() + j;
      }
      else
      {
        localStringBuffer.append(paramString.charAt(j));
        j++;
      }
    }
    paramString = localStringBuffer.toString();
    AppMethodBeat.o(87417);
    return paramString;
  }

  public static String Ei(String paramString)
  {
    AppMethodBeat.i(87418);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(87418);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.replace(' ', '\n').replace(' ', '\n');
      AppMethodBeat.o(87418);
    }
  }

  @Deprecated
  public static void aNR()
  {
    AppMethodBeat.i(87414);
    m.aNR();
    AppMethodBeat.o(87414);
  }

  @Deprecated
  public static al aNS()
  {
    AppMethodBeat.i(87415);
    al localal = m.aNS();
    AppMethodBeat.o(87415);
    return localal;
  }

  public static void aNX()
  {
    AppMethodBeat.i(87409);
    Intent localIntent = new Intent();
    localIntent.setComponent(new ComponentName(iRj, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
    localIntent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
    ah.getContext().sendBroadcast(localIntent);
    localIntent = new Intent();
    localIntent.setComponent(new ComponentName(iRj, "com.tencent.mm.booter.MMReceivers$ToolsMpProcessReceiver"));
    localIntent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
    ah.getContext().sendBroadcast(localIntent);
    AppMethodBeat.o(87409);
  }

  public static long aNY()
  {
    AppMethodBeat.i(87410);
    long l = bo.anT();
    AppMethodBeat.o(87410);
    return l;
  }

  public static void at(Object paramObject)
  {
    AppMethodBeat.i(87413);
    hvE.remove(paramObject);
    AppMethodBeat.o(87413);
  }

  public static <T> T bB(T paramT)
  {
    AppMethodBeat.i(87412);
    hvE.add(paramT);
    AppMethodBeat.o(87412);
    return paramT;
  }

  public static int c(Context paramContext, float paramFloat)
  {
    AppMethodBeat.i(87420);
    int i = Math.round(paramContext.getResources().getDisplayMetrics().density * paramFloat);
    AppMethodBeat.o(87420);
    return i;
  }

  public static String c(ComponentName paramComponentName)
  {
    AppMethodBeat.i(87419);
    String str = "[UNKNOWN]";
    if (paramComponentName == null)
    {
      AppMethodBeat.o(87419);
      paramComponentName = str;
    }
    while (true)
    {
      return paramComponentName;
      PackageManager localPackageManager = ah.getContext().getPackageManager();
      if (localPackageManager == null)
      {
        AppMethodBeat.o(87419);
        paramComponentName = str;
      }
      else
      {
        try
        {
          paramComponentName = localPackageManager.getActivityInfo(paramComponentName, 128);
          if (paramComponentName != null)
          {
            paramComponentName = paramComponentName.taskAffinity;
            AppMethodBeat.o(87419);
          }
        }
        catch (Exception paramComponentName)
        {
          ab.e("MicroMsg.AppBrandUtil", "getActivityTaskAffinity e = %s", new Object[] { paramComponentName });
          AppMethodBeat.o(87419);
          paramComponentName = str;
        }
      }
    }
  }

  public static float cZ(Context paramContext)
  {
    AppMethodBeat.i(87421);
    float f = 3.0F / paramContext.getResources().getDisplayMetrics().density;
    AppMethodBeat.o(87421);
    return f;
  }

  @Deprecated
  public static void d(Map paramMap)
  {
    AppMethodBeat.i(87416);
    i.d(paramMap);
    AppMethodBeat.o(87416);
  }

  public static String getMMString(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(87411);
    paramArrayOfObject = ah.getResources().getString(paramInt, paramArrayOfObject);
    AppMethodBeat.o(87411);
    return paramArrayOfObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.e
 * JD-Core Version:    0.6.2
 */