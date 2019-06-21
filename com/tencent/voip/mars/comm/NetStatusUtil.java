package com.tencent.voip.mars.comm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.Proxy;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.voip.mars.xlog.Log;
import java.lang.reflect.Method;

public class NetStatusUtil
{
  public static final int CMNET = 6;
  public static final int CMWAP = 5;
  public static final int CTNET = 8;
  public static final int CTWAP = 7;
  public static final int LTE = 10;
  public static final int MOBILE = 9;
  public static final int NETTYPE_NOT_WIFI = 0;
  public static final int NETTYPE_WIFI = 1;
  public static final int NET_3G = 4;
  public static final int NON_NETWORK = -1;
  public static final int NO_SIM_OPERATOR = 0;
  public static final int POLICY_NONE = 0;
  public static final int POLICY_REJECT_METERED_BACKGROUND = 1;
  private static final String TAG = "MicroMsg.NetStatusUtil";
  public static final int TBACKGROUND_DATA_LIMITED = 2;
  public static final int TBACKGROUND_NOT_LIMITED = 0;
  public static final int TBACKGROUND_PROCESS_LIMITED = 1;
  public static final int TBACKGROUND_WIFI_LIMITED = 3;
  public static final int UNINET = 1;
  public static final int UNIWAP = 2;
  public static final int UNKNOW_TYPE = 999;
  public static final int WAP_3G = 3;
  public static final int WIFI = 0;
  private static int nowStrength = 0;

  public static void dumpNetStatus(Context paramContext)
  {
    AppMethodBeat.i(92764);
    try
    {
      Log.i("MicroMsg.NetStatusUtil", ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo().toString());
      AppMethodBeat.o(92764);
      return;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        Log.e("MicroMsg.NetStatusUtil", "", new Object[] { paramContext });
        AppMethodBeat.o(92764);
      }
    }
  }

  public static int getBackgroundLimitType(Context paramContext)
  {
    AppMethodBeat.i(92782);
    if (Build.VERSION.SDK_INT >= 14);
    while (true)
    {
      int i;
      try
      {
        Object localObject = Class.forName("android.app.ActivityManagerNative");
        localObject = ((Class)localObject).getMethod("getDefault", new Class[0]).invoke(localObject, new Object[0]);
        i = ((Integer)localObject.getClass().getMethod("getProcessLimit", new Class[0]).invoke(localObject, new Object[0])).intValue();
        if (i == 0)
        {
          AppMethodBeat.o(92782);
          i = 1;
          return i;
        }
      }
      catch (Exception localException)
      {
      }
      try
      {
        int j = getWifiSleeepPolicy(paramContext);
        if (j != 2)
        {
          i = getNetType(paramContext);
          if (i == 0);
        }
        else
        {
          AppMethodBeat.o(92782);
          i = 0;
          continue;
        }
        if ((j == 1) || (j == 0))
        {
          i = 3;
          AppMethodBeat.o(92782);
        }
      }
      catch (Exception paramContext)
      {
        AppMethodBeat.o(92782);
        i = 0;
      }
    }
  }

  public static int getISPCode(Context paramContext)
  {
    AppMethodBeat.i(92769);
    paramContext = (TelephonyManager)paramContext.getSystemService("phone");
    int i;
    if (paramContext == null)
    {
      AppMethodBeat.o(92769);
      i = 0;
    }
    while (true)
    {
      return i;
      String str = paramContext.getSimOperator();
      if ((str == null) || (str.length() < 5))
      {
        AppMethodBeat.o(92769);
        i = 0;
      }
      else
      {
        paramContext = new StringBuilder();
        try
        {
          int j = str.length();
          i = j;
          if (j > 6)
            i = 6;
          j = 0;
          if (j >= i)
            break label134;
          if (!Character.isDigit(str.charAt(j)))
            if (paramContext.length() > 0)
              break label134;
          while (true)
          {
            j++;
            break;
            paramContext.append(str.charAt(j));
          }
        }
        catch (Exception paramContext)
        {
          AppMethodBeat.o(92769);
          i = 0;
        }
        continue;
        label134: i = Integer.valueOf(paramContext.toString()).intValue();
        AppMethodBeat.o(92769);
      }
    }
  }

  public static String getISPName(Context paramContext)
  {
    AppMethodBeat.i(92770);
    paramContext = (TelephonyManager)paramContext.getSystemService("phone");
    if (paramContext == null)
    {
      paramContext = "";
      AppMethodBeat.o(92770);
    }
    while (true)
    {
      return paramContext;
      if (paramContext.getSimOperatorName().length() <= 100)
      {
        paramContext = paramContext.getSimOperatorName();
        AppMethodBeat.o(92770);
      }
      else
      {
        paramContext = paramContext.getSimOperatorName().substring(0, 100);
        AppMethodBeat.o(92770);
      }
    }
  }

  public static int getNetType(Context paramContext)
  {
    AppMethodBeat.i(92768);
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    int i;
    if (paramContext == null)
    {
      AppMethodBeat.o(92768);
      i = -1;
    }
    while (true)
    {
      return i;
      paramContext = paramContext.getActiveNetworkInfo();
      if (paramContext == null)
      {
        AppMethodBeat.o(92768);
        i = -1;
      }
      else if (paramContext.getType() == 1)
      {
        i = 0;
        AppMethodBeat.o(92768);
      }
      else if (paramContext.getExtraInfo() != null)
      {
        if (paramContext.getExtraInfo().equalsIgnoreCase("uninet"))
        {
          AppMethodBeat.o(92768);
          i = 1;
        }
        else if (paramContext.getExtraInfo().equalsIgnoreCase("uniwap"))
        {
          i = 2;
          AppMethodBeat.o(92768);
        }
        else if (paramContext.getExtraInfo().equalsIgnoreCase("3gwap"))
        {
          i = 3;
          AppMethodBeat.o(92768);
        }
        else if (paramContext.getExtraInfo().equalsIgnoreCase("3gnet"))
        {
          i = 4;
          AppMethodBeat.o(92768);
        }
        else if (paramContext.getExtraInfo().equalsIgnoreCase("cmwap"))
        {
          i = 5;
          AppMethodBeat.o(92768);
        }
        else if (paramContext.getExtraInfo().equalsIgnoreCase("cmnet"))
        {
          i = 6;
          AppMethodBeat.o(92768);
        }
        else if (paramContext.getExtraInfo().equalsIgnoreCase("ctwap"))
        {
          i = 7;
          AppMethodBeat.o(92768);
        }
        else if (paramContext.getExtraInfo().equalsIgnoreCase("ctnet"))
        {
          i = 8;
          AppMethodBeat.o(92768);
        }
        else if (paramContext.getExtraInfo().equalsIgnoreCase("LTE"))
        {
          i = 10;
          AppMethodBeat.o(92768);
        }
      }
      else
      {
        i = 9;
        AppMethodBeat.o(92768);
      }
    }
  }

  public static int getNetTypeForStat(Context paramContext)
  {
    AppMethodBeat.i(92787);
    int i;
    if (paramContext == null)
    {
      AppMethodBeat.o(92787);
      i = 999;
    }
    while (true)
    {
      return i;
      try
      {
        paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
        if (paramContext == null)
        {
          AppMethodBeat.o(92787);
          i = 999;
        }
        else
        {
          paramContext = paramContext.getActiveNetworkInfo();
          if (paramContext == null)
          {
            AppMethodBeat.o(92787);
            i = 999;
          }
          else
          {
            i = paramContext.getType();
            if (i == 1)
            {
              AppMethodBeat.o(92787);
              i = 1;
            }
            else
            {
              i = paramContext.getSubtype();
              if (i == 0)
              {
                AppMethodBeat.o(92787);
                i = 999;
              }
              else
              {
                i *= 1000;
                AppMethodBeat.o(92787);
              }
            }
          }
        }
      }
      catch (Exception paramContext)
      {
        AppMethodBeat.o(92787);
        i = 999;
      }
    }
  }

  public static String getNetTypeString(Context paramContext)
  {
    AppMethodBeat.i(92766);
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (paramContext == null)
    {
      paramContext = "NON_NETWORK";
      AppMethodBeat.o(92766);
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getActiveNetworkInfo();
      if (paramContext == null)
      {
        paramContext = "NON_NETWORK";
        AppMethodBeat.o(92766);
      }
      else if (paramContext.getType() == 1)
      {
        paramContext = "WIFI";
        AppMethodBeat.o(92766);
      }
      else if (paramContext.getExtraInfo() != null)
      {
        paramContext = paramContext.getExtraInfo();
        AppMethodBeat.o(92766);
      }
      else
      {
        paramContext = "MOBILE";
        AppMethodBeat.o(92766);
      }
    }
  }

  public static int getNetWorkType(Context paramContext)
  {
    AppMethodBeat.i(92767);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext != null)
      {
        i = paramContext.getType();
        AppMethodBeat.o(92767);
        return i;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        int i = -1;
        AppMethodBeat.o(92767);
      }
    }
  }

  public static int getProxyInfo(Context paramContext, StringBuffer paramStringBuffer)
  {
    AppMethodBeat.i(92784);
    try
    {
      paramContext = Proxy.getDefaultHost();
      i = Proxy.getDefaultPort();
      if ((paramContext != null) && (paramContext.length() > 0) && (i > 0))
      {
        paramStringBuffer.append(paramContext);
        AppMethodBeat.o(92784);
      }
      while (true)
      {
        return i;
        paramContext = System.getProperty("http.proxyHost");
        String str = System.getProperty("http.proxyPort");
        int j = 80;
        i = j;
        if (str != null)
        {
          i = j;
          if (str.length() > 0)
            i = Integer.parseInt(str);
        }
        if ((paramContext == null) || (paramContext.length() <= 0))
          break;
        paramStringBuffer.append(paramContext);
        AppMethodBeat.o(92784);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        int i = 0;
        AppMethodBeat.o(92784);
      }
    }
  }

  public static int getStrength(Context paramContext)
  {
    AppMethodBeat.i(92788);
    int i;
    if (paramContext == null)
    {
      AppMethodBeat.o(92788);
      i = 0;
    }
    while (true)
    {
      return i;
      try
      {
        if (getNetTypeForStat(paramContext) == 1)
        {
          i = Math.abs(((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo().getRssi());
          AppMethodBeat.o(92788);
        }
        else
        {
          paramContext = (TelephonyManager)paramContext.getSystemService("phone");
          NetStatusUtil.StrengthListener localStrengthListener = new com/tencent/voip/mars/comm/NetStatusUtil$StrengthListener;
          localStrengthListener.<init>();
          paramContext.listen(localStrengthListener, 256);
          i = Math.abs(nowStrength);
          AppMethodBeat.o(92788);
        }
      }
      catch (Exception paramContext)
      {
        AppMethodBeat.o(92788);
        i = 0;
      }
    }
  }

  public static WifiInfo getWifiInfo(Context paramContext)
  {
    AppMethodBeat.i(92778);
    try
    {
      Object localObject = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (localObject == null)
      {
        AppMethodBeat.o(92778);
        paramContext = null;
      }
      while (true)
      {
        return paramContext;
        localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
        if (localObject != null)
        {
          int i = ((NetworkInfo)localObject).getType();
          if (1 == i);
        }
        else
        {
          AppMethodBeat.o(92778);
          paramContext = null;
          continue;
        }
        paramContext = (WifiManager)paramContext.getSystemService("wifi");
        if (paramContext == null)
        {
          AppMethodBeat.o(92778);
          paramContext = null;
        }
        else
        {
          paramContext = paramContext.getConnectionInfo();
          AppMethodBeat.o(92778);
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(92778);
        paramContext = null;
      }
    }
  }

  public static int getWifiSleeepPolicy(Context paramContext)
  {
    AppMethodBeat.i(92781);
    int i = Settings.System.getInt(paramContext.getContentResolver(), "wifi_sleep_policy", 2);
    AppMethodBeat.o(92781);
    return i;
  }

  public static int guessNetSpeed(Context paramContext)
  {
    AppMethodBeat.i(92771);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      int i = paramContext.getType();
      if (i == 1)
      {
        AppMethodBeat.o(92771);
        i = 102400;
      }
      while (true)
      {
        return i;
        i = paramContext.getSubtype();
        switch (i)
        {
        default:
          AppMethodBeat.o(92771);
          i = 102400;
          break;
        case 1:
          i = 4096;
          AppMethodBeat.o(92771);
          break;
        case 2:
          i = 8192;
          AppMethodBeat.o(92771);
          break;
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
          label120: AppMethodBeat.o(92771);
          i = 102400;
        }
      }
    }
    catch (Exception paramContext)
    {
      break label120;
    }
  }

  public static boolean is2G(Context paramContext)
  {
    AppMethodBeat.i(92773);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      int i = paramContext.getType();
      if (i == 1)
        AppMethodBeat.o(92773);
      for (bool = false; ; bool = true)
      {
        return bool;
        if ((paramContext.getSubtype() != 2) && (paramContext.getSubtype() != 1))
        {
          i = paramContext.getSubtype();
          if (i != 4)
            break;
        }
        AppMethodBeat.o(92773);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(92773);
        boolean bool = false;
      }
    }
  }

  public static boolean is3G(Context paramContext)
  {
    AppMethodBeat.i(92776);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      int i = paramContext.getType();
      if (i == 1)
        AppMethodBeat.o(92776);
      for (bool = false; ; bool = true)
      {
        return bool;
        if (paramContext.getSubtype() < 5)
          break;
        i = paramContext.getSubtype();
        if (i >= 13)
          break;
        AppMethodBeat.o(92776);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(92776);
        boolean bool = false;
      }
    }
  }

  public static boolean is4G(Context paramContext)
  {
    AppMethodBeat.i(92774);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      int i = paramContext.getType();
      if (i == 1)
        AppMethodBeat.o(92774);
      for (bool = false; ; bool = true)
      {
        return bool;
        i = paramContext.getSubtype();
        if (i < 13)
          break;
        AppMethodBeat.o(92774);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(92774);
        boolean bool = false;
      }
    }
  }

  public static boolean isConnected(Context paramContext)
  {
    AppMethodBeat.i(92765);
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    boolean bool1 = false;
    try
    {
      boolean bool2 = paramContext.isConnected();
      bool1 = bool2;
      label28: AppMethodBeat.o(92765);
      return bool1;
    }
    catch (Exception paramContext)
    {
      break label28;
    }
  }

  public static boolean isImmediatelyDestroyActivities(Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(92783);
    if (Settings.System.getInt(paramContext.getContentResolver(), "always_finish_activities", 0) != 0)
    {
      bool = true;
      AppMethodBeat.o(92783);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(92783);
    }
  }

  public static boolean isKnownDirectNet(Context paramContext)
  {
    boolean bool = true;
    AppMethodBeat.i(92785);
    int i = getNetType(paramContext);
    if ((6 == i) || (1 == i) || (4 == i) || (8 == i) || (10 == i) || (i == 0))
      AppMethodBeat.o(92785);
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(92785);
    }
  }

  public static boolean isLimited(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (paramInt != 2)
    {
      bool2 = bool1;
      if (paramInt != 1)
        if (paramInt != 3)
          break label25;
    }
    label25: for (bool2 = bool1; ; bool2 = false)
      return bool2;
  }

  public static boolean isMobile(Context paramContext)
  {
    AppMethodBeat.i(92772);
    try
    {
      if (((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo().getType() != 1)
        AppMethodBeat.o(92772);
      for (bool = true; ; bool = false)
      {
        return bool;
        AppMethodBeat.o(92772);
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(92772);
        boolean bool = false;
      }
    }
  }

  public static boolean isNetworkConnected(Context paramContext)
  {
    AppMethodBeat.i(92786);
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    boolean bool;
    if (paramContext == null)
    {
      AppMethodBeat.o(92786);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramContext = paramContext.getActiveNetworkInfo();
      if (paramContext == null)
      {
        AppMethodBeat.o(92786);
        bool = false;
      }
      else if (paramContext.getState() == NetworkInfo.State.CONNECTED)
      {
        bool = true;
        AppMethodBeat.o(92786);
      }
      else
      {
        AppMethodBeat.o(92786);
        bool = false;
      }
    }
  }

  public static boolean isWap(int paramInt)
  {
    if ((paramInt == 2) || (paramInt == 5) || (paramInt == 7) || (paramInt == 3));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isWap(Context paramContext)
  {
    AppMethodBeat.i(92775);
    boolean bool = isWap(getNetType(paramContext));
    AppMethodBeat.o(92775);
    return bool;
  }

  public static boolean isWifi(int paramInt)
  {
    if (paramInt == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isWifi(Context paramContext)
  {
    AppMethodBeat.i(92777);
    boolean bool = isWifi(getNetType(paramContext));
    AppMethodBeat.o(92777);
    return bool;
  }

  // ERROR //
  private static Intent searchIntentByClass(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc_w 356
    //   3: invokestatic 68	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: invokevirtual 360	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   10: astore_2
    //   11: aload_2
    //   12: iconst_0
    //   13: invokevirtual 366	android/content/pm/PackageManager:getInstalledPackages	(I)Ljava/util/List;
    //   16: astore_3
    //   17: aload_3
    //   18: ifnull +215 -> 233
    //   21: aload_3
    //   22: invokeinterface 371 1 0
    //   27: ifle +206 -> 233
    //   30: iconst_0
    //   31: istore 4
    //   33: aload_3
    //   34: invokeinterface 371 1 0
    //   39: istore 5
    //   41: iload 4
    //   43: iload 5
    //   45: if_icmpge +188 -> 233
    //   48: new 373	android/content/Intent
    //   51: astore 6
    //   53: aload 6
    //   55: invokespecial 374	android/content/Intent:<init>	()V
    //   58: aload 6
    //   60: aload_3
    //   61: iload 4
    //   63: invokeinterface 378 2 0
    //   68: checkcast 380	android/content/pm/PackageInfo
    //   71: getfield 383	android/content/pm/PackageInfo:packageName	Ljava/lang/String;
    //   74: invokevirtual 387	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   77: pop
    //   78: aload_2
    //   79: aload 6
    //   81: iconst_0
    //   82: invokevirtual 391	android/content/pm/PackageManager:queryIntentActivities	(Landroid/content/Intent;I)Ljava/util/List;
    //   85: astore 6
    //   87: aload 6
    //   89: ifnull +123 -> 212
    //   92: aload 6
    //   94: invokeinterface 371 1 0
    //   99: istore 5
    //   101: iload 5
    //   103: ifle +123 -> 226
    //   106: iconst_0
    //   107: istore 7
    //   109: iload 7
    //   111: iload 5
    //   113: if_icmpge +113 -> 226
    //   116: aload 6
    //   118: iload 7
    //   120: invokeinterface 378 2 0
    //   125: checkcast 393	android/content/pm/ResolveInfo
    //   128: getfield 397	android/content/pm/ResolveInfo:activityInfo	Landroid/content/pm/ActivityInfo;
    //   131: astore 8
    //   133: aload 8
    //   135: getfield 402	android/content/pm/ActivityInfo:name	Ljava/lang/String;
    //   138: aload_1
    //   139: invokevirtual 406	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   142: ifeq +76 -> 218
    //   145: new 373	android/content/Intent
    //   148: astore 6
    //   150: aload 6
    //   152: ldc_w 408
    //   155: invokespecial 411	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   158: new 413	android/content/ComponentName
    //   161: astore 9
    //   163: aload 9
    //   165: aload 8
    //   167: getfield 414	android/content/pm/ActivityInfo:packageName	Ljava/lang/String;
    //   170: aload 8
    //   172: getfield 402	android/content/pm/ActivityInfo:name	Ljava/lang/String;
    //   175: invokespecial 416	android/content/ComponentName:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   178: aload 6
    //   180: aload 9
    //   182: invokevirtual 420	android/content/Intent:setComponent	(Landroid/content/ComponentName;)Landroid/content/Intent;
    //   185: pop
    //   186: aload 6
    //   188: ldc_w 422
    //   191: invokevirtual 425	android/content/Intent:setAction	(Ljava/lang/String;)Landroid/content/Intent;
    //   194: pop
    //   195: aload_0
    //   196: aload 6
    //   198: invokevirtual 429	android/content/Context:startActivity	(Landroid/content/Intent;)V
    //   201: ldc_w 356
    //   204: invokestatic 96	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   207: aload 6
    //   209: astore_0
    //   210: aload_0
    //   211: areturn
    //   212: iconst_0
    //   213: istore 5
    //   215: goto -114 -> 101
    //   218: iinc 7 1
    //   221: goto -112 -> 109
    //   224: astore 6
    //   226: iinc 4 1
    //   229: goto -196 -> 33
    //   232: astore_0
    //   233: aconst_null
    //   234: astore_0
    //   235: ldc_w 356
    //   238: invokestatic 96	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   241: goto -31 -> 210
    //   244: astore 6
    //   246: goto -20 -> 226
    //
    // Exception table:
    //   from	to	target	type
    //   48	87	224	java/lang/Exception
    //   92	101	224	java/lang/Exception
    //   6	17	232	java/lang/Exception
    //   21	30	232	java/lang/Exception
    //   33	41	232	java/lang/Exception
    //   116	201	244	java/lang/Exception
  }

  public static void startSettingItent(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(92780);
    switch (paramInt)
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(92780);
      while (true)
      {
        return;
        AppMethodBeat.o(92780);
        continue;
        Object localObject;
        try
        {
          Intent localIntent1 = new android/content/Intent;
          localIntent1.<init>("/");
          localObject = new android/content/ComponentName;
          ((ComponentName)localObject).<init>("com.android.providers.subscribedfeeds", "com.android.settings.ManageAccountsSettings");
          localIntent1.setComponent((ComponentName)localObject);
          localIntent1.setAction("android.intent.action.VIEW");
          paramContext.startActivity(localIntent1);
          AppMethodBeat.o(92780);
        }
        catch (Exception localException1)
        {
          try
          {
            localObject = new android/content/Intent;
            ((Intent)localObject).<init>("/");
            ComponentName localComponentName1 = new android/content/ComponentName;
            localComponentName1.<init>("com.htc.settings.accountsync", "com.htc.settings.accountsync.ManageAccountsSettings");
            ((Intent)localObject).setComponent(localComponentName1);
            ((Intent)localObject).setAction("android.intent.action.VIEW");
            paramContext.startActivity((Intent)localObject);
            AppMethodBeat.o(92780);
          }
          catch (Exception localException2)
          {
            searchIntentByClass(paramContext, "ManageAccountsSettings");
            AppMethodBeat.o(92780);
          }
        }
        continue;
        try
        {
          localObject = new android/content/Intent;
          ((Intent)localObject).<init>("/");
          ComponentName localComponentName2 = new android/content/ComponentName;
          localComponentName2.<init>("com.android.settings", "com.android.settings.DevelopmentSettings");
          ((Intent)localObject).setComponent(localComponentName2);
          ((Intent)localObject).setAction("android.intent.action.VIEW");
          paramContext.startActivity((Intent)localObject);
          AppMethodBeat.o(92780);
        }
        catch (Exception localException3)
        {
          searchIntentByClass(paramContext, "DevelopmentSettings");
          AppMethodBeat.o(92780);
        }
        continue;
        try
        {
          Intent localIntent2 = new android/content/Intent;
          localIntent2.<init>();
          localIntent2.setAction("android.settings.WIFI_IP_SETTINGS");
          paramContext.startActivity(localIntent2);
          AppMethodBeat.o(92780);
        }
        catch (Exception localException4)
        {
          searchIntentByClass(paramContext, "AdvancedSettings");
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.voip.mars.comm.NetStatusUtil
 * JD-Core Version:    0.6.2
 */