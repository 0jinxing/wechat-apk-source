package com.tencent.mars.comm;

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
    try
    {
      ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      label13: return;
    }
    catch (Exception paramContext)
    {
      break label13;
    }
  }

  public static int getBackgroundLimitType(Context paramContext)
  {
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
          i = 0;
          continue;
        }
        if ((j == 1) || (j == 0))
          i = 3;
      }
      catch (Exception paramContext)
      {
        i = 0;
      }
    }
  }

  public static int getISPCode(Context paramContext)
  {
    paramContext = (TelephonyManager)paramContext.getSystemService("phone");
    int i;
    if (paramContext == null)
      i = 0;
    while (true)
    {
      return i;
      paramContext = paramContext.getSimOperator();
      if ((paramContext == null) || (paramContext.length() < 5))
      {
        i = 0;
      }
      else
      {
        StringBuilder localStringBuilder = new StringBuilder();
        try
        {
          int j = paramContext.length();
          i = j;
          if (j > 6)
            i = 6;
          j = 0;
          if (j >= i)
            break label114;
          if (!Character.isDigit(paramContext.charAt(j)))
            if (localStringBuilder.length() > 0)
              break label114;
          while (true)
          {
            j++;
            break;
            localStringBuilder.append(paramContext.charAt(j));
          }
        }
        catch (Exception paramContext)
        {
          i = 0;
        }
        continue;
        label114: i = Integer.valueOf(localStringBuilder.toString()).intValue();
      }
    }
  }

  public static String getISPName(Context paramContext)
  {
    paramContext = (TelephonyManager)paramContext.getSystemService("phone");
    if (paramContext == null)
      paramContext = "";
    while (true)
    {
      return paramContext;
      if (paramContext.getSimOperatorName().length() <= 100)
        paramContext = paramContext.getSimOperatorName();
      else
        paramContext = paramContext.getSimOperatorName().substring(0, 100);
    }
  }

  public static int getNetType(Context paramContext)
  {
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    int i;
    if (paramContext == null)
      i = -1;
    while (true)
    {
      return i;
      paramContext = paramContext.getActiveNetworkInfo();
      if (paramContext == null)
        i = -1;
      else if (paramContext.getType() == 1)
        i = 0;
      else if (paramContext.getExtraInfo() != null)
      {
        if (paramContext.getExtraInfo().equalsIgnoreCase("uninet"))
          i = 1;
        else if (paramContext.getExtraInfo().equalsIgnoreCase("uniwap"))
          i = 2;
        else if (paramContext.getExtraInfo().equalsIgnoreCase("3gwap"))
          i = 3;
        else if (paramContext.getExtraInfo().equalsIgnoreCase("3gnet"))
          i = 4;
        else if (paramContext.getExtraInfo().equalsIgnoreCase("cmwap"))
          i = 5;
        else if (paramContext.getExtraInfo().equalsIgnoreCase("cmnet"))
          i = 6;
        else if (paramContext.getExtraInfo().equalsIgnoreCase("ctwap"))
          i = 7;
        else if (paramContext.getExtraInfo().equalsIgnoreCase("ctnet"))
          i = 8;
        else if (paramContext.getExtraInfo().equalsIgnoreCase("LTE"))
          i = 10;
      }
      else
        i = 9;
    }
  }

  public static int getNetTypeForStat(Context paramContext)
  {
    int i;
    if (paramContext == null)
      i = 999;
    while (true)
    {
      return i;
      try
      {
        paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
        if (paramContext == null)
        {
          i = 999;
        }
        else
        {
          paramContext = paramContext.getActiveNetworkInfo();
          if (paramContext == null)
          {
            i = 999;
          }
          else if (paramContext.getType() == 1)
          {
            i = 1;
          }
          else
          {
            i = paramContext.getSubtype();
            if (i == 0)
              i = 999;
            else
              i *= 1000;
          }
        }
      }
      catch (Exception paramContext)
      {
        i = 999;
      }
    }
  }

  public static String getNetTypeString(Context paramContext)
  {
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (paramContext == null)
      paramContext = "NON_NETWORK";
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getActiveNetworkInfo();
      if (paramContext == null)
        paramContext = "NON_NETWORK";
      else if (paramContext.getType() == 1)
        paramContext = "WIFI";
      else if (paramContext.getExtraInfo() != null)
        paramContext = paramContext.getExtraInfo();
      else
        paramContext = "MOBILE";
    }
  }

  public static int getNetWorkType(Context paramContext)
  {
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext != null)
      {
        i = paramContext.getType();
        return i;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
        int i = -1;
    }
  }

  public static int getProxyInfo(Context paramContext, StringBuffer paramStringBuffer)
  {
    try
    {
      paramContext = Proxy.getDefaultHost();
      i = Proxy.getDefaultPort();
      if ((paramContext != null) && (paramContext.length() > 0) && (i > 0))
        paramStringBuffer.append(paramContext);
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
      }
    }
    catch (Exception paramContext)
    {
      while (true)
        int i = 0;
    }
  }

  public static int getStrength(Context paramContext)
  {
    int i;
    if (paramContext == null)
      i = 0;
    while (true)
    {
      return i;
      try
      {
        if (getNetTypeForStat(paramContext) == 1)
        {
          i = Math.abs(((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo().getRssi());
        }
        else
        {
          TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
          paramContext = new com/tencent/mars/comm/NetStatusUtil$StrengthListener;
          paramContext.<init>();
          localTelephonyManager.listen(paramContext, 256);
          i = Math.abs(nowStrength);
        }
      }
      catch (Exception paramContext)
      {
        i = 0;
      }
    }
  }

  public static WifiInfo getWifiInfo(Context paramContext)
  {
    try
    {
      Object localObject = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (localObject == null)
        paramContext = null;
      while (true)
      {
        return paramContext;
        localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
        if ((localObject == null) || (1 != ((NetworkInfo)localObject).getType()))
        {
          paramContext = null;
        }
        else
        {
          paramContext = (WifiManager)paramContext.getSystemService("wifi");
          if (paramContext == null)
            paramContext = null;
          else
            paramContext = paramContext.getConnectionInfo();
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
        paramContext = null;
    }
  }

  public static int getWifiSleeepPolicy(Context paramContext)
  {
    return Settings.System.getInt(paramContext.getContentResolver(), "wifi_sleep_policy", 2);
  }

  public static int guessNetSpeed(Context paramContext)
  {
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      int i;
      if (paramContext.getType() == 1)
        i = 102400;
      while (true)
      {
        return i;
        i = paramContext.getSubtype();
        switch (i)
        {
        default:
          i = 102400;
          break;
        case 1:
          i = 4096;
          break;
        case 2:
          i = 8192;
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
          label108: i = 102400;
        }
      }
    }
    catch (Exception paramContext)
    {
      break label108;
    }
  }

  public static boolean is2G(Context paramContext)
  {
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext.getType() == 1);
      for (bool = false; ; bool = true)
      {
        return bool;
        if ((paramContext.getSubtype() != 2) && (paramContext.getSubtype() != 1))
        {
          int i = paramContext.getSubtype();
          if (i != 4)
            break;
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
        boolean bool = false;
    }
  }

  public static boolean is3G(Context paramContext)
  {
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext.getType() == 1);
      for (bool = false; ; bool = true)
      {
        return bool;
        if (paramContext.getSubtype() < 5)
          break;
        int i = paramContext.getSubtype();
        if (i >= 13)
          break;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
        boolean bool = false;
    }
  }

  public static boolean is4G(Context paramContext)
  {
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext.getType() == 1);
      for (bool = false; ; bool = true)
      {
        return bool;
        int i = paramContext.getSubtype();
        if (i < 13)
          break;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
        boolean bool = false;
    }
  }

  public static boolean isConnected(Context paramContext)
  {
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    boolean bool1 = false;
    try
    {
      bool2 = paramContext.isConnected();
      return bool2;
    }
    catch (Exception paramContext)
    {
      while (true)
        boolean bool2 = bool1;
    }
  }

  public static boolean isImmediatelyDestroyActivities(Context paramContext)
  {
    boolean bool = false;
    if (Settings.System.getInt(paramContext.getContentResolver(), "always_finish_activities", 0) != 0)
      bool = true;
    return bool;
  }

  public static boolean isKnownDirectNet(Context paramContext)
  {
    boolean bool1 = true;
    int i = getNetType(paramContext);
    boolean bool2 = bool1;
    if (6 != i)
    {
      bool2 = bool1;
      if (1 != i)
      {
        bool2 = bool1;
        if (4 != i)
        {
          bool2 = bool1;
          if (8 != i)
          {
            bool2 = bool1;
            if (10 != i)
              if (i != 0)
                break label53;
          }
        }
      }
    }
    label53: for (bool2 = bool1; ; bool2 = false)
      return bool2;
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
    try
    {
      int i = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo().getType();
      if (i != 1);
      for (bool = true; ; bool = false)
        return bool;
    }
    catch (Exception paramContext)
    {
      while (true)
        boolean bool = false;
    }
  }

  public static boolean isNetworkConnected(Context paramContext)
  {
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    boolean bool;
    if (paramContext == null)
      bool = false;
    while (true)
    {
      return bool;
      paramContext = paramContext.getActiveNetworkInfo();
      if (paramContext == null)
        bool = false;
      else if (paramContext.getState() == NetworkInfo.State.CONNECTED)
        bool = true;
      else
        bool = false;
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
    return isWap(getNetType(paramContext));
  }

  public static boolean isWifi(int paramInt)
  {
    if (paramInt == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean isWifi(Context paramContext)
  {
    return isWifi(getNetType(paramContext));
  }

  // ERROR //
  private static Intent searchIntentByClass(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 317	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   4: astore_2
    //   5: aload_2
    //   6: iconst_0
    //   7: invokevirtual 323	android/content/pm/PackageManager:getInstalledPackages	(I)Ljava/util/List;
    //   10: astore_3
    //   11: aload_3
    //   12: ifnull +209 -> 221
    //   15: aload_3
    //   16: invokeinterface 328 1 0
    //   21: ifle +200 -> 221
    //   24: iconst_0
    //   25: istore 4
    //   27: aload_3
    //   28: invokeinterface 328 1 0
    //   33: istore 5
    //   35: iload 4
    //   37: iload 5
    //   39: if_icmpge +182 -> 221
    //   42: new 330	android/content/Intent
    //   45: astore 6
    //   47: aload 6
    //   49: invokespecial 331	android/content/Intent:<init>	()V
    //   52: aload 6
    //   54: aload_3
    //   55: iload 4
    //   57: invokeinterface 335 2 0
    //   62: checkcast 337	android/content/pm/PackageInfo
    //   65: getfield 340	android/content/pm/PackageInfo:packageName	Ljava/lang/String;
    //   68: invokevirtual 344	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   71: pop
    //   72: aload_2
    //   73: aload 6
    //   75: iconst_0
    //   76: invokevirtual 348	android/content/pm/PackageManager:queryIntentActivities	(Landroid/content/Intent;I)Ljava/util/List;
    //   79: astore 6
    //   81: aload 6
    //   83: ifnull +117 -> 200
    //   86: aload 6
    //   88: invokeinterface 328 1 0
    //   93: istore 5
    //   95: iload 5
    //   97: ifle +117 -> 214
    //   100: iconst_0
    //   101: istore 7
    //   103: iload 7
    //   105: iload 5
    //   107: if_icmpge +107 -> 214
    //   110: aload 6
    //   112: iload 7
    //   114: invokeinterface 335 2 0
    //   119: checkcast 350	android/content/pm/ResolveInfo
    //   122: getfield 354	android/content/pm/ResolveInfo:activityInfo	Landroid/content/pm/ActivityInfo;
    //   125: astore 8
    //   127: aload 8
    //   129: getfield 359	android/content/pm/ActivityInfo:name	Ljava/lang/String;
    //   132: aload_1
    //   133: invokevirtual 363	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   136: ifeq +70 -> 206
    //   139: new 330	android/content/Intent
    //   142: astore 6
    //   144: aload 6
    //   146: ldc_w 365
    //   149: invokespecial 368	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   152: new 370	android/content/ComponentName
    //   155: astore 9
    //   157: aload 9
    //   159: aload 8
    //   161: getfield 371	android/content/pm/ActivityInfo:packageName	Ljava/lang/String;
    //   164: aload 8
    //   166: getfield 359	android/content/pm/ActivityInfo:name	Ljava/lang/String;
    //   169: invokespecial 374	android/content/ComponentName:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   172: aload 6
    //   174: aload 9
    //   176: invokevirtual 378	android/content/Intent:setComponent	(Landroid/content/ComponentName;)Landroid/content/Intent;
    //   179: pop
    //   180: aload 6
    //   182: ldc_w 380
    //   185: invokevirtual 383	android/content/Intent:setAction	(Ljava/lang/String;)Landroid/content/Intent;
    //   188: pop
    //   189: aload_0
    //   190: aload 6
    //   192: invokevirtual 387	android/content/Context:startActivity	(Landroid/content/Intent;)V
    //   195: aload 6
    //   197: astore_0
    //   198: aload_0
    //   199: areturn
    //   200: iconst_0
    //   201: istore 5
    //   203: goto -108 -> 95
    //   206: iinc 7 1
    //   209: goto -106 -> 103
    //   212: astore 6
    //   214: iinc 4 1
    //   217: goto -190 -> 27
    //   220: astore_0
    //   221: aconst_null
    //   222: astore_0
    //   223: goto -25 -> 198
    //   226: astore 6
    //   228: goto -14 -> 214
    //
    // Exception table:
    //   from	to	target	type
    //   42	81	212	java/lang/Exception
    //   86	95	212	java/lang/Exception
    //   0	11	220	java/lang/Exception
    //   15	24	220	java/lang/Exception
    //   27	35	220	java/lang/Exception
    //   110	195	226	java/lang/Exception
  }

  public static void startSettingItent(Context paramContext, int paramInt)
  {
    switch (paramInt)
    {
    case 0:
    default:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      return;
      Object localObject;
      try
      {
        localObject = new android/content/Intent;
        ((Intent)localObject).<init>("/");
        ComponentName localComponentName1 = new android/content/ComponentName;
        localComponentName1.<init>("com.android.providers.subscribedfeeds", "com.android.settings.ManageAccountsSettings");
        ((Intent)localObject).setComponent(localComponentName1);
        ((Intent)localObject).setAction("android.intent.action.VIEW");
        paramContext.startActivity((Intent)localObject);
      }
      catch (Exception localException1)
      {
        try
        {
          localObject = new android/content/Intent;
          ((Intent)localObject).<init>("/");
          ComponentName localComponentName2 = new android/content/ComponentName;
          localComponentName2.<init>("com.htc.settings.accountsync", "com.htc.settings.accountsync.ManageAccountsSettings");
          ((Intent)localObject).setComponent(localComponentName2);
          ((Intent)localObject).setAction("android.intent.action.VIEW");
          paramContext.startActivity((Intent)localObject);
        }
        catch (Exception localException2)
        {
          searchIntentByClass(paramContext, "ManageAccountsSettings");
        }
      }
      continue;
      try
      {
        Intent localIntent1 = new android/content/Intent;
        localIntent1.<init>("/");
        localObject = new android/content/ComponentName;
        ((ComponentName)localObject).<init>("com.android.settings", "com.android.settings.DevelopmentSettings");
        localIntent1.setComponent((ComponentName)localObject);
        localIntent1.setAction("android.intent.action.VIEW");
        paramContext.startActivity(localIntent1);
      }
      catch (Exception localException3)
      {
        searchIntentByClass(paramContext, "DevelopmentSettings");
      }
      continue;
      try
      {
        Intent localIntent2 = new android/content/Intent;
        localIntent2.<init>();
        localIntent2.setAction("android.settings.WIFI_IP_SETTINGS");
        paramContext.startActivity(localIntent2);
      }
      catch (Exception localException4)
      {
        searchIntentByClass(paramContext, "AdvancedSettings");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mars.comm.NetStatusUtil
 * JD-Core Version:    0.6.2
 */