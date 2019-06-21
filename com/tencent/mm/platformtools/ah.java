package com.tencent.mm.platformtools;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Debug;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.p.a;
import com.tencent.mm.plugin.p.c;
import com.tencent.mm.plugin.p.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.g;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Deprecated
public final class ah
{
  private static final TimeZone GMT;
  private static final long[] gjH;

  static
  {
    AppMethodBeat.i(16706);
    gjH = new long[] { 300L, 200L, 300L, 200L };
    GMT = TimeZone.getTimeZone("GMT");
    AppMethodBeat.o(16706);
  }

  public static boolean M(Context paramContext, String paramString)
  {
    AppMethodBeat.i(16701);
    Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    boolean bool;
    if (!k(paramContext, localIntent))
    {
      ab.e("MicroMsg.Util", "jump to url failed, ".concat(String.valueOf(paramString)));
      bool = false;
      AppMethodBeat.o(16701);
    }
    while (true)
    {
      return bool;
      paramContext.startActivity(localIntent);
      bool = true;
      AppMethodBeat.o(16701);
    }
  }

  public static boolean a(Context paramContext, View paramView)
  {
    boolean bool = false;
    AppMethodBeat.i(16705);
    if (paramView == null)
      AppMethodBeat.o(16705);
    while (true)
    {
      return bool;
      paramContext = (InputMethodManager)paramContext.getSystemService("input_method");
      if (paramContext == null)
      {
        AppMethodBeat.o(16705);
        continue;
      }
      paramView = paramView.getWindowToken();
      if (paramView == null)
      {
        AppMethodBeat.o(16705);
        continue;
      }
      try
      {
        bool = paramContext.hideSoftInputFromWindow(paramView, 0);
        AppMethodBeat.o(16705);
      }
      catch (IllegalArgumentException paramContext)
      {
        while (true)
        {
          ab.e("MicroMsg.Util", "hide VKB(View) exception %s", new Object[] { paramContext });
          bool = false;
        }
      }
    }
  }

  public static long anT()
  {
    AppMethodBeat.i(16678);
    long l = System.currentTimeMillis() / 1000L;
    AppMethodBeat.o(16678);
    return l;
  }

  public static long anU()
  {
    AppMethodBeat.i(16680);
    long l = System.currentTimeMillis();
    AppMethodBeat.o(16680);
    return l;
  }

  public static void anV()
  {
    AppMethodBeat.i(16689);
    ab.w("MicroMsg.Util", "memory usage: h=%s/%s, e=%s/%s, n=%s/%s", new Object[] { ga(Debug.getGlobalAllocSize()), ga(Debug.getGlobalAllocSize() + Debug.getGlobalFreedSize()), ga(Debug.getGlobalExternalAllocSize()), ga(Debug.getGlobalExternalAllocSize() + Debug.getGlobalExternalFreedSize()), ga(Debug.getNativeHeapAllocatedSize()), ga(Debug.getNativeHeapSize()) });
    AppMethodBeat.o(16689);
  }

  public static a anW()
  {
    AppMethodBeat.i(16702);
    a locala = new a();
    AppMethodBeat.o(16702);
    return locala;
  }

  public static long az(long paramLong)
  {
    AppMethodBeat.i(16683);
    long l = SystemClock.elapsedRealtime();
    AppMethodBeat.o(16683);
    return l - paramLong;
  }

  public static String bc(String paramString1, String paramString2)
  {
    if (paramString1 == null);
    while (true)
    {
      return paramString2;
      paramString2 = paramString1;
    }
  }

  public static List<String> bd(String paramString1, String paramString2)
  {
    AppMethodBeat.i(16703);
    String str = null;
    if (paramString1 != null)
    {
      paramString2 = Pattern.compile(paramString2).matcher(paramString1);
      int i = paramString2.groupCount();
      int j = 1;
      paramString1 = new ArrayList();
      str = paramString1;
      if (paramString2.find())
        while (true)
        {
          str = paramString1;
          if (j > i)
            break;
          paramString1.add(paramString2.group(j));
          j++;
        }
    }
    AppMethodBeat.o(16703);
    return str;
  }

  public static int bh(Object paramObject)
  {
    int i = 0;
    AppMethodBeat.i(16697);
    if (paramObject == null)
      AppMethodBeat.o(16697);
    while (true)
    {
      return i;
      if ((paramObject instanceof Integer))
      {
        i = ((Integer)paramObject).intValue();
        AppMethodBeat.o(16697);
      }
      else if ((paramObject instanceof Long))
      {
        i = ((Long)paramObject).intValue();
        AppMethodBeat.o(16697);
      }
      else
      {
        AppMethodBeat.o(16697);
      }
    }
  }

  public static long c(Long paramLong)
  {
    AppMethodBeat.i(16691);
    long l;
    if (paramLong == null)
    {
      l = 0L;
      AppMethodBeat.o(16691);
    }
    while (true)
    {
      return l;
      l = paramLong.longValue();
      AppMethodBeat.o(16691);
    }
  }

  public static String c(List<String> paramList, String paramString)
  {
    AppMethodBeat.i(16675);
    if (paramList == null)
    {
      paramList = "";
      AppMethodBeat.o(16675);
    }
    while (true)
    {
      return paramList;
      StringBuilder localStringBuilder = new StringBuilder("");
      int i = 0;
      if (i < paramList.size())
      {
        if (i == paramList.size() - 1)
          localStringBuilder.append(((String)paramList.get(i)).trim());
        while (true)
        {
          i++;
          break;
          localStringBuilder.append(((String)paramList.get(i)).trim() + paramString);
        }
      }
      paramList = localStringBuilder.toString();
      AppMethodBeat.o(16675);
    }
  }

  public static boolean cI(int paramInt1, int paramInt2)
  {
    if (paramInt2 > paramInt1 * 2.0D);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean cJ(int paramInt1, int paramInt2)
  {
    if (paramInt1 > paramInt2 * 2.0D);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static String cc(Context paramContext)
  {
    AppMethodBeat.i(16686);
    try
    {
      paramContext = ((ActivityManager.RunningTaskInfo)((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity.getClassName();
      ab.i("MicroMsg.Util", "top activity name =".concat(String.valueOf(paramContext)));
      AppMethodBeat.o(16686);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Util", paramContext, "", new Object[0]);
        paramContext = "(null)";
        AppMethodBeat.o(16686);
      }
    }
  }

  public static boolean cv(Context paramContext)
  {
    AppMethodBeat.i(16685);
    String str = paramContext.getClass().getName();
    paramContext = cc(paramContext);
    ab.d("MicroMsg.Util", "top activity=" + paramContext + ", context=" + str);
    boolean bool = paramContext.equalsIgnoreCase(str);
    AppMethodBeat.o(16685);
    return bool;
  }

  public static boolean cw(Context paramContext)
  {
    boolean bool = true;
    AppMethodBeat.i(16704);
    if (d.bQU() != null)
      d.bQU().bQS();
    Intent localIntent;
    if ((g.cdh & 0x1) != 0)
    {
      ab.e("MicroMsg.Util", "package has set external update mode");
      Uri localUri = Uri.parse(g.xyc);
      localIntent = new Intent("android.intent.action.VIEW", localUri).addFlags(268435456);
      if ((localUri == null) || (localIntent == null) || (!k(paramContext, localIntent)))
      {
        ab.e("MicroMsg.Util", "parse market uri failed, jump to weixin.qq.com");
        paramContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://weixin.qq.com")).addFlags(268435456));
        AppMethodBeat.o(16704);
      }
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.Util", "parse market uri ok");
      paramContext.startActivity(localIntent);
      break;
      com.tencent.mm.sdk.platformtools.ah.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", System.currentTimeMillis() / 1000L).commit();
      if (d.bQU() != null)
      {
        paramContext = d.bQU().c(paramContext, new ah.1());
        if (paramContext == null)
        {
          AppMethodBeat.o(16704);
          bool = false;
        }
        else
        {
          paramContext.update(3);
        }
      }
      else
      {
        AppMethodBeat.o(16704);
      }
    }
  }

  public static long d(Long paramLong)
  {
    AppMethodBeat.i(16695);
    long l;
    if (paramLong == null)
    {
      l = 0L;
      AppMethodBeat.o(16695);
    }
    while (true)
    {
      return l;
      l = paramLong.longValue();
      AppMethodBeat.o(16695);
    }
  }

  public static boolean d(Boolean paramBoolean)
  {
    AppMethodBeat.i(16692);
    boolean bool;
    if (paramBoolean == null)
    {
      bool = true;
      AppMethodBeat.o(16692);
    }
    while (true)
    {
      return bool;
      bool = paramBoolean.booleanValue();
      AppMethodBeat.o(16692);
    }
  }

  public static boolean e(Boolean paramBoolean)
  {
    AppMethodBeat.i(16693);
    boolean bool;
    if (paramBoolean == null)
    {
      bool = false;
      AppMethodBeat.o(16693);
    }
    while (true)
    {
      return bool;
      bool = paramBoolean.booleanValue();
      AppMethodBeat.o(16693);
    }
  }

  public static boolean f(Boolean paramBoolean)
  {
    AppMethodBeat.i(16696);
    boolean bool;
    if (paramBoolean == null)
    {
      bool = true;
      AppMethodBeat.o(16696);
    }
    while (true)
    {
      return bool;
      bool = paramBoolean.booleanValue();
      AppMethodBeat.o(16696);
    }
  }

  public static long fp(long paramLong)
  {
    AppMethodBeat.i(16681);
    long l = System.currentTimeMillis() / 1000L;
    AppMethodBeat.o(16681);
    return l - paramLong;
  }

  public static String ga(long paramLong)
  {
    AppMethodBeat.i(16677);
    float f;
    String str;
    if (paramLong >> 20 > 0L)
    {
      f = Math.round((float)paramLong * 10.0F / 1048576.0F) / 10.0F;
      str = f + "MB";
      AppMethodBeat.o(16677);
    }
    while (true)
    {
      return str;
      if (paramLong >> 9 > 0L)
      {
        f = Math.round((float)paramLong * 10.0F / 1024.0F) / 10.0F;
        str = f + "KB";
        AppMethodBeat.o(16677);
      }
      else
      {
        str = paramLong + "B";
        AppMethodBeat.o(16677);
      }
    }
  }

  public static long gb(long paramLong)
  {
    AppMethodBeat.i(16682);
    long l = System.currentTimeMillis();
    AppMethodBeat.o(16682);
    return l - paramLong;
  }

  @Deprecated
  public static int getInt(String paramString, int paramInt)
  {
    AppMethodBeat.i(16699);
    if (paramString != null);
    try
    {
      if (paramString.length() <= 0)
        AppMethodBeat.o(16699);
      while (true)
      {
        return paramInt;
        int i = Integer.parseInt(paramString);
        paramInt = i;
        AppMethodBeat.o(16699);
      }
    }
    catch (NumberFormatException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Util", paramString, "", new Object[0]);
        AppMethodBeat.o(16699);
      }
    }
  }

  public static int h(Integer paramInteger)
  {
    AppMethodBeat.i(16690);
    int i;
    if (paramInteger == null)
    {
      i = 0;
      AppMethodBeat.o(16690);
    }
    while (true)
    {
      return i;
      i = paramInteger.intValue();
      AppMethodBeat.o(16690);
    }
  }

  public static int i(Integer paramInteger)
  {
    AppMethodBeat.i(16694);
    int i;
    if (paramInteger == null)
    {
      i = 0;
      AppMethodBeat.o(16694);
    }
    while (true)
    {
      return i;
      i = paramInteger.intValue();
      AppMethodBeat.o(16694);
    }
  }

  public static boolean isNullOrNil(String paramString)
  {
    AppMethodBeat.i(16698);
    boolean bool;
    if ((paramString == null) || (paramString.length() <= 0))
    {
      bool = true;
      AppMethodBeat.o(16698);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(16698);
    }
  }

  public static List<String> j(String[] paramArrayOfString)
  {
    AppMethodBeat.i(16676);
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
    {
      paramArrayOfString = null;
      AppMethodBeat.o(16676);
    }
    while (true)
    {
      return paramArrayOfString;
      ArrayList localArrayList = new ArrayList();
      for (int i = 0; i < paramArrayOfString.length; i++)
        localArrayList.add(paramArrayOfString[i]);
      AppMethodBeat.o(16676);
      paramArrayOfString = localArrayList;
    }
  }

  private static boolean k(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(16687);
    boolean bool;
    if (paramContext.getPackageManager().queryIntentActivities(paramIntent, 65536).size() > 0)
    {
      bool = true;
      AppMethodBeat.o(16687);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(16687);
    }
  }

  @Deprecated
  public static long lb(String paramString)
  {
    long l1 = -1L;
    AppMethodBeat.i(16700);
    if (paramString == null);
    try
    {
      AppMethodBeat.o(16700);
      l2 = l1;
      while (true)
      {
        return l2;
        l2 = Long.parseLong(paramString);
        AppMethodBeat.o(16700);
      }
    }
    catch (NumberFormatException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Util", paramString, "", new Object[0]);
        AppMethodBeat.o(16700);
        long l2 = l1;
      }
    }
  }

  public static String mK(int paramInt)
  {
    AppMethodBeat.i(16679);
    String str = String.format("%d:%02d", new Object[] { Long.valueOf(paramInt / 60L), Long.valueOf(paramInt % 60L) });
    AppMethodBeat.o(16679);
    return str;
  }

  public static boolean mL(int paramInt)
  {
    AppMethodBeat.i(16688);
    long l1 = paramInt * 1000L;
    long l2 = l1 - System.currentTimeMillis();
    ab.d("MicroMsg.Util", "time " + l1 + "  systime " + System.currentTimeMillis() + " diff " + l2);
    boolean bool;
    if (l2 < 0L)
    {
      bool = true;
      AppMethodBeat.o(16688);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(16688);
    }
  }

  public static String nullAsNil(String paramString)
  {
    String str = paramString;
    if (paramString == null)
      str = "";
    return str;
  }

  public static String vA(String paramString)
  {
    AppMethodBeat.i(16674);
    String str = paramString;
    if (paramString != null)
      str = paramString.replace("\\[", "[[]").replace("%", "").replace("\\^", "").replace("'", "").replace("\\{", "").replace("\\}", "").replace("\"", "");
    AppMethodBeat.o(16674);
    return str;
  }

  public static long yz()
  {
    AppMethodBeat.i(16684);
    long l = SystemClock.elapsedRealtime();
    AppMethodBeat.o(16684);
    return l;
  }

  public static final class a
  {
    public final String toString()
    {
      AppMethodBeat.i(16673);
      Object localObject = new Throwable().getStackTrace();
      if ((localObject == null) || (localObject.length < 4))
      {
        localObject = "";
        AppMethodBeat.o(16673);
      }
      while (true)
      {
        return localObject;
        StringBuilder localStringBuilder = new StringBuilder();
        for (int i = 3; i < localObject.length; i++)
          if (localObject[i].getClassName().contains("com.tencent.mm"))
          {
            localStringBuilder.append("[");
            localStringBuilder.append(localObject[i].getClassName().substring(15));
            localStringBuilder.append(":");
            localStringBuilder.append(localObject[i].getMethodName());
            localStringBuilder.append("(" + localObject[i].getLineNumber() + ")]");
          }
        localObject = localStringBuilder.toString();
        AppMethodBeat.o(16673);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.ah
 * JD-Core Version:    0.6.2
 */