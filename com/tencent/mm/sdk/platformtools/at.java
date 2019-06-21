package com.tencent.mm.sdk.platformtools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class at
{
  private static int nowStrength = 10000;
  private static int nwY = -1;
  private static PhoneStateListener xAt = null;
  private static int xAu = 10000;

  private static String Mv(String paramString)
  {
    AppMethodBeat.i(52194);
    String str;
    if (bo.isNullOrNil(paramString))
    {
      str = "";
      AppMethodBeat.o(52194);
    }
    while (true)
    {
      return str;
      str = paramString;
      if (paramString.startsWith("\""))
      {
        str = paramString;
        if (paramString.endsWith("\""))
          str = paramString.substring(1, paramString.length() - 1);
      }
      AppMethodBeat.o(52194);
    }
  }

  private static String dpd()
  {
    AppMethodBeat.i(52193);
    long l = System.currentTimeMillis();
    try
    {
      if (NetworkInterface.getNetworkInterfaces() != null)
      {
        Object localObject1 = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
        do
        {
          if (!((Iterator)localObject1).hasNext())
            break;
          localObject2 = (NetworkInterface)((Iterator)localObject1).next();
        }
        while (!((NetworkInterface)localObject2).getName().equalsIgnoreCase("wlan0"));
        Object localObject2 = ((NetworkInterface)localObject2).getHardwareAddress();
        if (localObject2 == null)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>("et mobile mac from net time cost :");
          ab.d("MicroMsg.NetStatusUtil", System.currentTimeMillis() - l);
          localObject1 = "02:00:00:00:00:00";
          AppMethodBeat.o(52193);
        }
        while (true)
        {
          return localObject1;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          int i = localObject2.length;
          for (int j = 0; j < i; j++)
            ((StringBuilder)localObject1).append(String.format("%02X:", new Object[] { Byte.valueOf(localObject2[j]) }));
          if (((StringBuilder)localObject1).length() > 0)
            ((StringBuilder)localObject1).deleteCharAt(((StringBuilder)localObject1).length() - 1);
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("et mobile mac from net time cost :");
          ab.d("MicroMsg.NetStatusUtil", System.currentTimeMillis() - l);
          localObject1 = ((StringBuilder)localObject1).toString();
          AppMethodBeat.o(52193);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.NetStatusUtil", "get mobile mac from net fail!".concat(String.valueOf(localException)));
        ab.d("MicroMsg.NetStatusUtil", "et mobile mac from net time cost :" + (System.currentTimeMillis() - l));
        String str = "02:00:00:00:00:00";
        AppMethodBeat.o(52193);
      }
    }
  }

  public static String gA(Context paramContext)
  {
    AppMethodBeat.i(52171);
    StringBuilder localStringBuilder1 = new StringBuilder();
    try
    {
      Object localObject = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
      localStringBuilder2.<init>("isAvailable ");
      localStringBuilder1.append(((NetworkInfo)localObject).isAvailable() + "\r\n");
      localStringBuilder2 = new java/lang/StringBuilder;
      localStringBuilder2.<init>("isAvailable ");
      localStringBuilder1.append(((NetworkInfo)localObject).isAvailable() + "\r\n");
      localStringBuilder2 = new java/lang/StringBuilder;
      localStringBuilder2.<init>("isConnected ");
      localStringBuilder1.append(((NetworkInfo)localObject).isConnected() + "\r\n");
      localStringBuilder2 = new java/lang/StringBuilder;
      localStringBuilder2.<init>("isRoaming ");
      localStringBuilder1.append(((NetworkInfo)localObject).isRoaming() + "\r\n");
      localStringBuilder2 = new java/lang/StringBuilder;
      localStringBuilder2.<init>("isFailover ");
      localStringBuilder1.append(((NetworkInfo)localObject).isFailover() + "\r\n");
      localStringBuilder2 = new java/lang/StringBuilder;
      localStringBuilder2.<init>("getSubtypeName ");
      localStringBuilder1.append(((NetworkInfo)localObject).getSubtypeName() + "\r\n");
      localStringBuilder2 = new java/lang/StringBuilder;
      localStringBuilder2.<init>("getSubtype ");
      localStringBuilder1.append(((NetworkInfo)localObject).getSubtype() + "\r\n");
      localStringBuilder2 = new java/lang/StringBuilder;
      localStringBuilder2.<init>("getType ");
      localStringBuilder1.append(((NetworkInfo)localObject).getType() + "\r\n");
      localStringBuilder2 = new java/lang/StringBuilder;
      localStringBuilder2.<init>("getExtraInfo ");
      localStringBuilder1.append(((NetworkInfo)localObject).getExtraInfo() + "\r\n");
      localStringBuilder2 = new java/lang/StringBuilder;
      localStringBuilder2.<init>("activeNetInfo ");
      localStringBuilder1.append(((NetworkInfo)localObject).toString() + "\r\n");
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("is2G ");
      localStringBuilder1.append(is2G(paramContext) + "\r\n");
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("is3G ");
      localStringBuilder1.append(is3G(paramContext) + "\r\n");
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("is4G ");
      localStringBuilder1.append(is4G(paramContext) + "\r\n");
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>("isWifi ");
      localStringBuilder1.append(isWifi(paramContext) + "\r\n");
      paramContext = new java/lang/StringBuilder;
      paramContext.<init>("netstatus ");
      ab.i("MicroMsg.NetStatusUtil", localStringBuilder1.toString());
      paramContext = localStringBuilder1.toString();
      AppMethodBeat.o(52171);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.i("MicroMsg.NetStatusUtil", paramContext.getMessage());
        ab.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
      }
    }
  }

  public static String gB(Context paramContext)
  {
    AppMethodBeat.i(52174);
    if (is2G(paramContext))
    {
      paramContext = "2G";
      AppMethodBeat.o(52174);
    }
    while (true)
    {
      return paramContext;
      if (is3G(paramContext))
      {
        paramContext = "3G";
        AppMethodBeat.o(52174);
      }
      else if (is4G(paramContext))
      {
        paramContext = "4G";
        AppMethodBeat.o(52174);
      }
      else if (isWifi(paramContext))
      {
        paramContext = "WIFI";
        AppMethodBeat.o(52174);
      }
      else
      {
        paramContext = getNetTypeString(paramContext);
        AppMethodBeat.o(52174);
      }
    }
  }

  public static int gC(Context paramContext)
  {
    AppMethodBeat.i(52175);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext == null)
      {
        AppMethodBeat.o(52175);
        i = 0;
      }
      while (true)
      {
        return i;
        i = paramContext.getType();
        if (i == 1)
        {
          AppMethodBeat.o(52175);
          i = 1;
        }
        else
        {
          if (paramContext.getSubtype() != 1)
          {
            i = paramContext.getSubtype();
            if (i != 2);
          }
          else
          {
            AppMethodBeat.o(52175);
            i = 2;
            continue;
          }
          i = paramContext.getSubtype();
          if (i >= 13)
          {
            i = 4;
            AppMethodBeat.o(52175);
          }
          else
          {
            i = paramContext.getSubtype();
            if (i < 3)
              break;
            AppMethodBeat.o(52175);
            i = 3;
          }
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(52175);
        int i = 0;
      }
    }
  }

  public static int gD(Context paramContext)
  {
    AppMethodBeat.i(52176);
    try
    {
      i = getNetType(paramContext);
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext == null)
      {
        AppMethodBeat.o(52176);
        i = 0;
      }
      while (true)
      {
        return i;
        int j = paramContext.getType();
        if (j == 1)
        {
          AppMethodBeat.o(52176);
          i = 1;
        }
        else
        {
          if (paramContext.getSubtype() != 1)
          {
            j = paramContext.getSubtype();
            if (j != 2);
          }
          else
          {
            AppMethodBeat.o(52176);
            i = 3;
            continue;
          }
          j = paramContext.getSubtype();
          if (j >= 13)
          {
            i = 5;
            AppMethodBeat.o(52176);
          }
          else
          {
            j = paramContext.getSubtype();
            if (j >= 3)
            {
              i = 4;
              AppMethodBeat.o(52176);
            }
            else
            {
              boolean bool = isWap(i);
              if (!bool)
                break;
              AppMethodBeat.o(52176);
              i = 2;
            }
          }
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(52176);
        int i = 0;
      }
    }
  }

  public static String gE(Context paramContext)
  {
    AppMethodBeat.i(52190);
    if (getNetType(paramContext) != 0)
    {
      ab.i("MicroMsg.NetStatusUtil", "wifi not connected. getConnectedWifiSsid() is empty");
      paramContext = "";
      AppMethodBeat.o(52190);
    }
    Object localObject;
    WifiInfo localWifiInfo;
    while (true)
    {
      return paramContext;
      localObject = (WifiManager)paramContext.getSystemService("wifi");
      if (localObject == null)
      {
        paramContext = "";
        AppMethodBeat.o(52190);
      }
      else
      {
        localWifiInfo = ((WifiManager)localObject).getConnectionInfo();
        if (localWifiInfo != null)
          break;
        paramContext = "";
        AppMethodBeat.o(52190);
      }
    }
    paramContext = localWifiInfo.getSSID();
    if (Build.VERSION.SDK_INT >= 27)
    {
      Iterator localIterator = ((WifiManager)localObject).getConfiguredNetworks().iterator();
      while (localIterator.hasNext())
      {
        localObject = (WifiConfiguration)localIterator.next();
        if (((WifiConfiguration)localObject).networkId == localWifiInfo.getNetworkId())
        {
          ab.i("MicroMsg.NetStatusUtil", "get wifi config ssid %s", new Object[] { ((WifiConfiguration)localObject).SSID });
          paramContext = ((WifiConfiguration)localObject).SSID;
        }
      }
    }
    while (true)
    {
      paramContext = bo.nullAsNil(paramContext);
      ab.i("MicroMsg.NetStatusUtil", "getConnectedWifiSsid()=" + Mv(paramContext));
      paramContext = Mv(paramContext);
      AppMethodBeat.o(52190);
      break;
    }
  }

  public static String gF(Context paramContext)
  {
    AppMethodBeat.i(52191);
    if (getNetType(paramContext) != 0)
    {
      ab.i("MicroMsg.NetStatusUtil", "wifi not connected. getConnectedWifiBssid() is empty");
      paramContext = "";
      AppMethodBeat.o(52191);
    }
    while (true)
    {
      return paramContext;
      paramContext = (WifiManager)paramContext.getSystemService("wifi");
      if (paramContext == null)
      {
        paramContext = "";
        AppMethodBeat.o(52191);
      }
      else
      {
        paramContext = paramContext.getConnectionInfo();
        if (paramContext == null)
        {
          paramContext = "";
          AppMethodBeat.o(52191);
        }
        else
        {
          paramContext = bo.nullAsNil(paramContext.getBSSID()).toLowerCase();
          ab.i("MicroMsg.NetStatusUtil", "getConnectedWifiBssid()=".concat(String.valueOf(paramContext)));
          AppMethodBeat.o(52191);
        }
      }
    }
  }

  public static String gG(Context paramContext)
  {
    AppMethodBeat.i(52192);
    paramContext = (WifiManager)paramContext.getSystemService("wifi");
    if (paramContext == null)
    {
      ab.e("MicroMsg.NetStatusUtil", "error wifiManager is null!!");
      paramContext = "";
      AppMethodBeat.o(52192);
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getConnectionInfo();
      if (paramContext == null)
      {
        ab.e("MicroMsg.NetStatusUtil", "error wifiInfo is null!!");
        paramContext = "";
        AppMethodBeat.o(52192);
      }
      else
      {
        String str = paramContext.getMacAddress();
        paramContext = str;
        if (Build.VERSION.SDK_INT > 22)
          if (str != null)
          {
            paramContext = str;
            if (!str.equals("02:00:00:00:00:00"));
          }
          else
          {
            paramContext = dpd();
          }
        paramContext = bo.nullAsNil(paramContext).toLowerCase();
        ab.i("MicroMsg.NetStatusUtil", "getConnectedWifiClientMac()=".concat(String.valueOf(paramContext)));
        AppMethodBeat.o(52192);
      }
    }
  }

  public static boolean gH(Context paramContext)
  {
    AppMethodBeat.i(52198);
    int i = getNetType(paramContext);
    boolean bool;
    if ((i == 0) || (i == 10))
    {
      ab.d("MicroMsg.NetStatusUtil", "[cpan] is wifi or 4g network");
      bool = true;
      AppMethodBeat.o(52198);
    }
    while (true)
    {
      return bool;
      ab.d("MicroMsg.NetStatusUtil", "[cpan] is mobile network");
      bool = false;
      AppMethodBeat.o(52198);
    }
  }

  public static void gI(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(52199);
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      nwY = paramContext.getPhoneType();
      if (xAt == null)
      {
        PhoneStateListener local1 = new com/tencent/mm/sdk/platformtools/at$1;
        local1.<init>();
        xAt = local1;
        paramContext.listen(xAt, 256);
      }
      AppMethodBeat.o(52199);
      return;
    }
    finally
    {
    }
    throw paramContext;
  }

  // ERROR //
  public static List<a> gJ(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc_w 404
    //   6: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: getstatic 19	com/tencent/mm/sdk/platformtools/at:xAt	Landroid/telephony/PhoneStateListener;
    //   12: ifnonnull +24 -> 36
    //   15: ldc 127
    //   17: ldc_w 406
    //   20: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   23: aconst_null
    //   24: astore_0
    //   25: ldc_w 404
    //   28: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   31: ldc 2
    //   33: monitorexit
    //   34: aload_0
    //   35: areturn
    //   36: aload_0
    //   37: ldc_w 391
    //   40: invokevirtual 186	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   43: checkcast 393	android/telephony/TelephonyManager
    //   46: astore_1
    //   47: new 408	java/util/LinkedList
    //   50: astore_2
    //   51: aload_2
    //   52: invokespecial 409	java/util/LinkedList:<init>	()V
    //   55: ldc_w 411
    //   58: astore_3
    //   59: ldc 43
    //   61: astore 4
    //   63: aload_1
    //   64: invokevirtual 414	android/telephony/TelephonyManager:getNetworkOperator	()Ljava/lang/String;
    //   67: astore_0
    //   68: aload_0
    //   69: ifnull +210 -> 279
    //   72: aload_0
    //   73: ldc 43
    //   75: invokevirtual 376	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   78: ifne +201 -> 279
    //   81: aload_0
    //   82: iconst_0
    //   83: iconst_3
    //   84: invokevirtual 64	java/lang/String:substring	(II)Ljava/lang/String;
    //   87: astore 5
    //   89: aload_0
    //   90: iconst_3
    //   91: iconst_5
    //   92: invokevirtual 64	java/lang/String:substring	(II)Ljava/lang/String;
    //   95: astore_0
    //   96: aload_1
    //   97: invokevirtual 396	android/telephony/TelephonyManager:getPhoneType	()I
    //   100: istore 6
    //   102: iload 6
    //   104: iconst_2
    //   105: if_icmpne +568 -> 673
    //   108: aload_1
    //   109: invokevirtual 418	android/telephony/TelephonyManager:getCellLocation	()Landroid/telephony/CellLocation;
    //   112: checkcast 420	android/telephony/cdma/CdmaCellLocation
    //   115: astore 4
    //   117: aload 4
    //   119: ifnull +149 -> 268
    //   122: getstatic 23	com/tencent/mm/sdk/platformtools/at:nowStrength	I
    //   125: getstatic 21	com/tencent/mm/sdk/platformtools/at:xAu	I
    //   128: if_icmpne +236 -> 364
    //   131: ldc 43
    //   133: astore_3
    //   134: aload 4
    //   136: invokevirtual 423	android/telephony/cdma/CdmaCellLocation:getBaseStationId	()I
    //   139: iconst_m1
    //   140: if_icmpeq +128 -> 268
    //   143: aload 4
    //   145: invokevirtual 424	android/telephony/cdma/CdmaCellLocation:getNetworkId	()I
    //   148: iconst_m1
    //   149: if_icmpeq +119 -> 268
    //   152: aload 4
    //   154: invokevirtual 427	android/telephony/cdma/CdmaCellLocation:getSystemId	()I
    //   157: iconst_m1
    //   158: if_icmpeq +110 -> 268
    //   161: new 8	com/tencent/mm/sdk/platformtools/at$a
    //   164: astore 7
    //   166: new 119	java/lang/StringBuilder
    //   169: astore 8
    //   171: aload 8
    //   173: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   176: aload 8
    //   178: aload 4
    //   180: invokevirtual 423	android/telephony/cdma/CdmaCellLocation:getBaseStationId	()I
    //   183: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   186: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   189: astore 8
    //   191: new 119	java/lang/StringBuilder
    //   194: astore 9
    //   196: aload 9
    //   198: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   201: aload 9
    //   203: aload 4
    //   205: invokevirtual 424	android/telephony/cdma/CdmaCellLocation:getNetworkId	()I
    //   208: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   211: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   214: astore 9
    //   216: new 119	java/lang/StringBuilder
    //   219: astore 10
    //   221: aload 10
    //   223: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   226: aload 7
    //   228: aload 5
    //   230: aload_0
    //   231: ldc 43
    //   233: ldc 43
    //   235: aload_3
    //   236: ldc_w 429
    //   239: aload 8
    //   241: aload 9
    //   243: aload 10
    //   245: aload 4
    //   247: invokevirtual 427	android/telephony/cdma/CdmaCellLocation:getSystemId	()I
    //   250: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   253: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   256: invokespecial 432	com/tencent/mm/sdk/platformtools/at$a:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   259: aload_2
    //   260: aload 7
    //   262: invokeinterface 435 2 0
    //   267: pop
    //   268: ldc_w 404
    //   271: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   274: aload_2
    //   275: astore_0
    //   276: goto -245 -> 31
    //   279: aload_1
    //   280: invokevirtual 438	android/telephony/TelephonyManager:getSimOperator	()Ljava/lang/String;
    //   283: astore 7
    //   285: aload 4
    //   287: astore 5
    //   289: aload_3
    //   290: astore_0
    //   291: aload 7
    //   293: ifnull +36 -> 329
    //   296: aload 4
    //   298: astore 5
    //   300: aload_3
    //   301: astore_0
    //   302: aload 7
    //   304: ldc 43
    //   306: invokevirtual 376	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   309: ifne +20 -> 329
    //   312: aload 7
    //   314: iconst_0
    //   315: iconst_3
    //   316: invokevirtual 64	java/lang/String:substring	(II)Ljava/lang/String;
    //   319: astore_0
    //   320: aload 7
    //   322: iconst_3
    //   323: iconst_5
    //   324: invokevirtual 64	java/lang/String:substring	(II)Ljava/lang/String;
    //   327: astore 5
    //   329: aload 5
    //   331: astore_3
    //   332: aload_0
    //   333: astore 5
    //   335: aload_3
    //   336: astore_0
    //   337: goto -241 -> 96
    //   340: astore_0
    //   341: ldc 127
    //   343: aload_0
    //   344: ldc 43
    //   346: iconst_0
    //   347: anewarray 4	java/lang/Object
    //   350: invokestatic 276	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   353: ldc_w 404
    //   356: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   359: aload_2
    //   360: astore_0
    //   361: goto -330 -> 31
    //   364: new 119	java/lang/StringBuilder
    //   367: astore_3
    //   368: aload_3
    //   369: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   372: aload_3
    //   373: getstatic 23	com/tencent/mm/sdk/platformtools/at:nowStrength	I
    //   376: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   379: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   382: astore_3
    //   383: goto -249 -> 134
    //   386: astore_3
    //   387: aload_1
    //   388: invokevirtual 418	android/telephony/TelephonyManager:getCellLocation	()Landroid/telephony/CellLocation;
    //   391: checkcast 440	android/telephony/gsm/GsmCellLocation
    //   394: astore_3
    //   395: aload_3
    //   396: ifnull +75 -> 471
    //   399: aload_3
    //   400: invokevirtual 443	android/telephony/gsm/GsmCellLocation:getCid	()I
    //   403: istore 11
    //   405: aload_3
    //   406: invokevirtual 446	android/telephony/gsm/GsmCellLocation:getLac	()I
    //   409: istore 6
    //   411: iload 6
    //   413: ldc_w 447
    //   416: if_icmpge +55 -> 471
    //   419: iload 6
    //   421: iconst_m1
    //   422: if_icmpeq +49 -> 471
    //   425: iload 11
    //   427: iconst_m1
    //   428: if_icmpeq +43 -> 471
    //   431: new 8	com/tencent/mm/sdk/platformtools/at$a
    //   434: astore_3
    //   435: aload_3
    //   436: aload 5
    //   438: aload_0
    //   439: iload 6
    //   441: invokestatic 450	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   444: iload 11
    //   446: invokestatic 450	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   449: ldc 43
    //   451: ldc_w 452
    //   454: ldc 43
    //   456: ldc 43
    //   458: ldc 43
    //   460: invokespecial 432	com/tencent/mm/sdk/platformtools/at$a:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   463: aload_2
    //   464: aload_3
    //   465: invokeinterface 435 2 0
    //   470: pop
    //   471: aload_1
    //   472: invokevirtual 455	android/telephony/TelephonyManager:getNeighboringCellInfo	()Ljava/util/List;
    //   475: astore_3
    //   476: aload_3
    //   477: ifnull -209 -> 268
    //   480: aload_3
    //   481: invokeinterface 458 1 0
    //   486: ifle -218 -> 268
    //   489: aload_3
    //   490: invokeinterface 95 1 0
    //   495: astore 4
    //   497: aload 4
    //   499: invokeinterface 101 1 0
    //   504: ifeq -236 -> 268
    //   507: aload 4
    //   509: invokeinterface 105 1 0
    //   514: checkcast 460	android/telephony/NeighboringCellInfo
    //   517: astore_3
    //   518: aload_3
    //   519: invokevirtual 461	android/telephony/NeighboringCellInfo:getCid	()I
    //   522: iconst_m1
    //   523: if_icmpeq -26 -> 497
    //   526: aload_3
    //   527: invokevirtual 462	android/telephony/NeighboringCellInfo:getLac	()I
    //   530: ldc_w 447
    //   533: if_icmpgt -36 -> 497
    //   536: aload_3
    //   537: invokevirtual 462	android/telephony/NeighboringCellInfo:getLac	()I
    //   540: iconst_m1
    //   541: if_icmpeq -44 -> 497
    //   544: new 119	java/lang/StringBuilder
    //   547: astore_1
    //   548: aload_1
    //   549: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   552: aload_1
    //   553: aload_3
    //   554: invokevirtual 465	android/telephony/NeighboringCellInfo:getRssi	()I
    //   557: iconst_2
    //   558: imul
    //   559: bipush 113
    //   561: isub
    //   562: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   565: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   568: astore 7
    //   570: new 8	com/tencent/mm/sdk/platformtools/at$a
    //   573: astore_1
    //   574: new 119	java/lang/StringBuilder
    //   577: astore 8
    //   579: aload 8
    //   581: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   584: aload 8
    //   586: aload_3
    //   587: invokevirtual 462	android/telephony/NeighboringCellInfo:getLac	()I
    //   590: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   593: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   596: astore 8
    //   598: new 119	java/lang/StringBuilder
    //   601: astore 9
    //   603: aload 9
    //   605: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   608: aload_1
    //   609: aload 5
    //   611: aload_0
    //   612: aload 8
    //   614: aload 9
    //   616: aload_3
    //   617: invokevirtual 461	android/telephony/NeighboringCellInfo:getCid	()I
    //   620: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   623: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   626: aload 7
    //   628: ldc_w 452
    //   631: ldc 43
    //   633: ldc 43
    //   635: ldc 43
    //   637: invokespecial 432	com/tencent/mm/sdk/platformtools/at$a:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   640: aload_2
    //   641: aload_1
    //   642: invokeinterface 435 2 0
    //   647: pop
    //   648: goto -151 -> 497
    //   651: astore_0
    //   652: ldc 2
    //   654: monitorexit
    //   655: aload_0
    //   656: athrow
    //   657: astore_3
    //   658: ldc 127
    //   660: aload_3
    //   661: ldc 43
    //   663: iconst_0
    //   664: anewarray 4	java/lang/Object
    //   667: invokestatic 276	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   670: goto -199 -> 471
    //   673: aload_1
    //   674: invokevirtual 418	android/telephony/TelephonyManager:getCellLocation	()Landroid/telephony/CellLocation;
    //   677: checkcast 440	android/telephony/gsm/GsmCellLocation
    //   680: astore_3
    //   681: aload_3
    //   682: ifnull +89 -> 771
    //   685: aload_3
    //   686: invokevirtual 443	android/telephony/gsm/GsmCellLocation:getCid	()I
    //   689: istore 6
    //   691: aload_3
    //   692: invokevirtual 446	android/telephony/gsm/GsmCellLocation:getLac	()I
    //   695: istore 11
    //   697: iload 11
    //   699: ldc_w 447
    //   702: if_icmpge +69 -> 771
    //   705: iload 11
    //   707: iconst_m1
    //   708: if_icmpeq +63 -> 771
    //   711: iload 6
    //   713: iconst_m1
    //   714: if_icmpeq +57 -> 771
    //   717: getstatic 23	com/tencent/mm/sdk/platformtools/at:nowStrength	I
    //   720: getstatic 21	com/tencent/mm/sdk/platformtools/at:xAu	I
    //   723: if_icmpne +275 -> 998
    //   726: ldc 43
    //   728: astore_3
    //   729: new 8	com/tencent/mm/sdk/platformtools/at$a
    //   732: astore 4
    //   734: aload 4
    //   736: aload 5
    //   738: aload_0
    //   739: iload 11
    //   741: invokestatic 450	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   744: iload 6
    //   746: invokestatic 450	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   749: aload_3
    //   750: ldc_w 452
    //   753: ldc 43
    //   755: ldc 43
    //   757: ldc 43
    //   759: invokespecial 432	com/tencent/mm/sdk/platformtools/at$a:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   762: aload_2
    //   763: aload 4
    //   765: invokeinterface 435 2 0
    //   770: pop
    //   771: aload_1
    //   772: invokevirtual 455	android/telephony/TelephonyManager:getNeighboringCellInfo	()Ljava/util/List;
    //   775: astore_3
    //   776: aload_3
    //   777: ifnull -509 -> 268
    //   780: aload_3
    //   781: invokeinterface 458 1 0
    //   786: ifle -518 -> 268
    //   789: aload_3
    //   790: invokeinterface 95 1 0
    //   795: astore 4
    //   797: aload 4
    //   799: invokeinterface 101 1 0
    //   804: ifeq -536 -> 268
    //   807: aload 4
    //   809: invokeinterface 105 1 0
    //   814: checkcast 460	android/telephony/NeighboringCellInfo
    //   817: astore_3
    //   818: aload_3
    //   819: invokevirtual 461	android/telephony/NeighboringCellInfo:getCid	()I
    //   822: iconst_m1
    //   823: if_icmpeq -26 -> 797
    //   826: aload_3
    //   827: invokevirtual 462	android/telephony/NeighboringCellInfo:getLac	()I
    //   830: ldc_w 447
    //   833: if_icmpgt -36 -> 797
    //   836: new 119	java/lang/StringBuilder
    //   839: astore_1
    //   840: aload_1
    //   841: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   844: aload_1
    //   845: aload_3
    //   846: invokevirtual 465	android/telephony/NeighboringCellInfo:getRssi	()I
    //   849: iconst_2
    //   850: imul
    //   851: bipush 113
    //   853: isub
    //   854: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   857: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   860: astore_1
    //   861: new 119	java/lang/StringBuilder
    //   864: astore 7
    //   866: aload 7
    //   868: ldc_w 467
    //   871: invokespecial 125	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   874: ldc_w 469
    //   877: aload 7
    //   879: aload_3
    //   880: invokevirtual 462	android/telephony/NeighboringCellInfo:getLac	()I
    //   883: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   886: ldc_w 471
    //   889: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   892: aload_3
    //   893: invokevirtual 461	android/telephony/NeighboringCellInfo:getCid	()I
    //   896: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   899: ldc_w 473
    //   902: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   905: aload_1
    //   906: invokevirtual 159	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   909: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   912: invokestatic 476	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   915: new 8	com/tencent/mm/sdk/platformtools/at$a
    //   918: astore 7
    //   920: new 119	java/lang/StringBuilder
    //   923: astore 8
    //   925: aload 8
    //   927: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   930: aload 8
    //   932: aload_3
    //   933: invokevirtual 462	android/telephony/NeighboringCellInfo:getLac	()I
    //   936: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   939: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   942: astore 8
    //   944: new 119	java/lang/StringBuilder
    //   947: astore 9
    //   949: aload 9
    //   951: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   954: aload 7
    //   956: aload 5
    //   958: aload_0
    //   959: aload 8
    //   961: aload 9
    //   963: aload_3
    //   964: invokevirtual 461	android/telephony/NeighboringCellInfo:getCid	()I
    //   967: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   970: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   973: aload_1
    //   974: ldc_w 452
    //   977: ldc 43
    //   979: ldc 43
    //   981: ldc 43
    //   983: invokespecial 432	com/tencent/mm/sdk/platformtools/at$a:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   986: aload_2
    //   987: aload 7
    //   989: invokeinterface 435 2 0
    //   994: pop
    //   995: goto -198 -> 797
    //   998: new 119	java/lang/StringBuilder
    //   1001: astore_3
    //   1002: aload_3
    //   1003: invokespecial 144	java/lang/StringBuilder:<init>	()V
    //   1006: aload_3
    //   1007: getstatic 23	com/tencent/mm/sdk/platformtools/at:nowStrength	I
    //   1010: invokevirtual 231	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1013: invokevirtual 134	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1016: astore_3
    //   1017: goto -288 -> 729
    //   1020: astore_3
    //   1021: ldc 127
    //   1023: aload_3
    //   1024: ldc 43
    //   1026: iconst_0
    //   1027: anewarray 4	java/lang/Object
    //   1030: invokestatic 276	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1033: goto -262 -> 771
    //
    // Exception table:
    //   from	to	target	type
    //   63	68	340	java/lang/Exception
    //   72	96	340	java/lang/Exception
    //   279	285	340	java/lang/Exception
    //   302	329	340	java/lang/Exception
    //   108	117	386	java/lang/Exception
    //   122	131	386	java/lang/Exception
    //   134	268	386	java/lang/Exception
    //   364	383	386	java/lang/Exception
    //   3	23	651	finally
    //   25	31	651	finally
    //   36	55	651	finally
    //   63	68	651	finally
    //   72	96	651	finally
    //   96	102	651	finally
    //   108	117	651	finally
    //   122	131	651	finally
    //   134	268	651	finally
    //   268	274	651	finally
    //   279	285	651	finally
    //   302	329	651	finally
    //   341	359	651	finally
    //   364	383	651	finally
    //   387	395	651	finally
    //   399	411	651	finally
    //   431	471	651	finally
    //   471	476	651	finally
    //   480	497	651	finally
    //   497	648	651	finally
    //   658	670	651	finally
    //   673	681	651	finally
    //   685	697	651	finally
    //   717	726	651	finally
    //   729	771	651	finally
    //   771	776	651	finally
    //   780	797	651	finally
    //   797	995	651	finally
    //   998	1017	651	finally
    //   1021	1033	651	finally
    //   387	395	657	java/lang/Exception
    //   399	411	657	java/lang/Exception
    //   431	471	657	java/lang/Exception
    //   673	681	1020	java/lang/Exception
    //   685	697	1020	java/lang/Exception
    //   717	726	1020	java/lang/Exception
    //   729	771	1020	java/lang/Exception
    //   998	1017	1020	java/lang/Exception
  }

  public static int getBackgroundLimitType(Context paramContext)
  {
    AppMethodBeat.i(52195);
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
          AppMethodBeat.o(52195);
          i = 1;
          return i;
        }
      }
      catch (Exception localException)
      {
        ab.printErrStackTrace("MicroMsg.NetStatusUtil", localException, "", new Object[0]);
      }
      try
      {
        i = Settings.System.getInt(paramContext.getContentResolver(), "wifi_sleep_policy", 2);
        if (i != 2)
        {
          int j = getNetType(paramContext);
          if (j == 0);
        }
        else
        {
          AppMethodBeat.o(52195);
          i = 0;
          continue;
        }
        if ((i == 1) || (i == 0))
        {
          i = 3;
          AppMethodBeat.o(52195);
        }
      }
      catch (Exception paramContext)
      {
        ab.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
        AppMethodBeat.o(52195);
        i = 0;
      }
    }
  }

  public static int getISPCode(Context paramContext)
  {
    AppMethodBeat.i(52179);
    paramContext = (TelephonyManager)paramContext.getSystemService("phone");
    int i;
    if (paramContext == null)
    {
      AppMethodBeat.o(52179);
      i = 0;
    }
    while (true)
    {
      return i;
      paramContext = paramContext.getSimOperator();
      if ((paramContext == null) || (paramContext.length() < 5))
      {
        AppMethodBeat.o(52179);
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
            break label151;
          if (!Character.isDigit(paramContext.charAt(j)))
            if (localStringBuilder.length() > 0)
              break label151;
          while (true)
          {
            j++;
            break;
            localStringBuilder.append(paramContext.charAt(j));
          }
        }
        catch (Exception paramContext)
        {
          ab.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
          AppMethodBeat.o(52179);
          i = 0;
        }
        continue;
        label151: i = Integer.valueOf(localStringBuilder.toString()).intValue();
        AppMethodBeat.o(52179);
      }
    }
  }

  public static String getISPName(Context paramContext)
  {
    AppMethodBeat.i(52180);
    try
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext == null)
      {
        paramContext = "";
        AppMethodBeat.o(52180);
      }
      while (true)
      {
        return paramContext;
        ab.d("MicroMsg.NetStatusUtil", "getISPName ISPName=%s", new Object[] { paramContext.getSimOperatorName() });
        if (paramContext.getSimOperatorName().length() <= 100)
        {
          paramContext = paramContext.getSimOperatorName();
          AppMethodBeat.o(52180);
        }
        else
        {
          paramContext = paramContext.getSimOperatorName().substring(0, 100);
          AppMethodBeat.o(52180);
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        paramContext = "";
        AppMethodBeat.o(52180);
      }
    }
  }

  public static int getNetType(Context paramContext)
  {
    AppMethodBeat.i(52178);
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    int i;
    if (paramContext == null)
    {
      AppMethodBeat.o(52178);
      i = -1;
    }
    while (true)
    {
      return i;
      paramContext = paramContext.getActiveNetworkInfo();
      if (paramContext == null)
      {
        AppMethodBeat.o(52178);
        i = -1;
      }
      else if (paramContext.getType() == 1)
      {
        AppMethodBeat.o(52178);
        i = 0;
      }
      else
      {
        ab.d("MicroMsg.NetStatusUtil", "activeNetInfo extra=%s, type=%d", new Object[] { paramContext.getExtraInfo(), Integer.valueOf(paramContext.getType()) });
        if (paramContext.getExtraInfo() != null)
        {
          if (paramContext.getExtraInfo().equalsIgnoreCase("uninet"))
          {
            AppMethodBeat.o(52178);
            i = 1;
          }
          else if (paramContext.getExtraInfo().equalsIgnoreCase("uniwap"))
          {
            AppMethodBeat.o(52178);
            i = 2;
          }
          else if (paramContext.getExtraInfo().equalsIgnoreCase("3gwap"))
          {
            i = 3;
            AppMethodBeat.o(52178);
          }
          else if (paramContext.getExtraInfo().equalsIgnoreCase("3gnet"))
          {
            i = 4;
            AppMethodBeat.o(52178);
          }
          else if (paramContext.getExtraInfo().equalsIgnoreCase("cmwap"))
          {
            i = 5;
            AppMethodBeat.o(52178);
          }
          else if (paramContext.getExtraInfo().equalsIgnoreCase("cmnet"))
          {
            i = 6;
            AppMethodBeat.o(52178);
          }
          else if (paramContext.getExtraInfo().equalsIgnoreCase("ctwap"))
          {
            i = 7;
            AppMethodBeat.o(52178);
          }
          else if (paramContext.getExtraInfo().equalsIgnoreCase("ctnet"))
          {
            i = 8;
            AppMethodBeat.o(52178);
          }
          else if (paramContext.getExtraInfo().equalsIgnoreCase("LTE"))
          {
            i = 10;
            AppMethodBeat.o(52178);
          }
        }
        else
        {
          i = 9;
          AppMethodBeat.o(52178);
        }
      }
    }
  }

  public static int getNetTypeForStat(Context paramContext)
  {
    AppMethodBeat.i(52197);
    int i;
    if (paramContext == null)
    {
      AppMethodBeat.o(52197);
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
          AppMethodBeat.o(52197);
          i = 999;
        }
        else
        {
          paramContext = paramContext.getActiveNetworkInfo();
          if (paramContext == null)
          {
            AppMethodBeat.o(52197);
            i = 999;
          }
          else
          {
            i = paramContext.getType();
            if (i == 1)
            {
              AppMethodBeat.o(52197);
              i = 1;
            }
            else
            {
              i = paramContext.getSubtype();
              if (i == 0)
              {
                AppMethodBeat.o(52197);
                i = 999;
              }
              else
              {
                i *= 1000;
                AppMethodBeat.o(52197);
              }
            }
          }
        }
      }
      catch (Exception paramContext)
      {
        ab.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
        AppMethodBeat.o(52197);
        i = 999;
      }
    }
  }

  public static String getNetTypeString(Context paramContext)
  {
    AppMethodBeat.i(52173);
    try
    {
      paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (paramContext == null)
      {
        paramContext = "NON_NETWORK";
        AppMethodBeat.o(52173);
      }
      while (true)
      {
        return paramContext;
        paramContext = paramContext.getActiveNetworkInfo();
        if (paramContext == null)
        {
          paramContext = "NON_NETWORK";
          AppMethodBeat.o(52173);
        }
        else if (paramContext.getType() == 1)
        {
          paramContext = "WIFI";
          AppMethodBeat.o(52173);
        }
        else
        {
          ab.d("MicroMsg.NetStatusUtil", "activeNetInfo extra=%s, type=%d", new Object[] { paramContext.getExtraInfo(), Integer.valueOf(paramContext.getType()) });
          if (paramContext.getExtraInfo() != null)
          {
            paramContext = paramContext.getExtraInfo();
            AppMethodBeat.o(52173);
          }
          else
          {
            paramContext = "MOBILE";
            AppMethodBeat.o(52173);
          }
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
        paramContext = "NON_NETWORK";
        AppMethodBeat.o(52173);
      }
    }
  }

  public static int getNetWorkType(Context paramContext)
  {
    AppMethodBeat.i(52177);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext != null)
      {
        i = paramContext.getType();
        AppMethodBeat.o(52177);
        return i;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
        int i = -1;
        AppMethodBeat.o(52177);
      }
    }
  }

  // ERROR //
  public static int getStrength(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc_w 585
    //   6: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: ifnonnull +16 -> 26
    //   13: ldc_w 585
    //   16: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: iconst_0
    //   20: istore_1
    //   21: ldc 2
    //   23: monitorexit
    //   24: iload_1
    //   25: ireturn
    //   26: aload_0
    //   27: invokestatic 587	com/tencent/mm/sdk/platformtools/at:getNetTypeForStat	(Landroid/content/Context;)I
    //   30: iconst_1
    //   31: if_icmpne +38 -> 69
    //   34: aload_0
    //   35: ldc_w 307
    //   38: invokevirtual 186	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   41: checkcast 309	android/net/wifi/WifiManager
    //   44: invokevirtual 313	android/net/wifi/WifiManager:getConnectionInfo	()Landroid/net/wifi/WifiInfo;
    //   47: invokevirtual 588	android/net/wifi/WifiInfo:getRssi	()I
    //   50: invokestatic 594	java/lang/Math:abs	(I)I
    //   53: istore_1
    //   54: ldc_w 585
    //   57: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   60: goto -39 -> 21
    //   63: astore_0
    //   64: ldc 2
    //   66: monitorexit
    //   67: aload_0
    //   68: athrow
    //   69: getstatic 19	com/tencent/mm/sdk/platformtools/at:xAt	Landroid/telephony/PhoneStateListener;
    //   72: ifnonnull +11 -> 83
    //   75: ldc 127
    //   77: ldc_w 406
    //   80: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   83: getstatic 23	com/tencent/mm/sdk/platformtools/at:nowStrength	I
    //   86: invokestatic 594	java/lang/Math:abs	(I)I
    //   89: istore_1
    //   90: ldc_w 585
    //   93: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   96: goto -75 -> 21
    //   99: astore_0
    //   100: ldc 127
    //   102: aload_0
    //   103: ldc 43
    //   105: iconst_0
    //   106: anewarray 4	java/lang/Object
    //   109: invokestatic 276	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   112: ldc_w 585
    //   115: invokestatic 46	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   118: iconst_0
    //   119: istore_1
    //   120: goto -99 -> 21
    //
    // Exception table:
    //   from	to	target	type
    //   3	9	63	finally
    //   13	19	63	finally
    //   26	54	63	finally
    //   54	60	63	finally
    //   69	83	63	finally
    //   83	90	63	finally
    //   90	96	63	finally
    //   100	118	63	finally
    //   26	54	99	java/lang/Exception
    //   69	83	99	java/lang/Exception
    //   83	90	99	java/lang/Exception
  }

  public static WifiInfo getWifiInfo(Context paramContext)
  {
    AppMethodBeat.i(52187);
    try
    {
      Object localObject = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (localObject == null)
      {
        AppMethodBeat.o(52187);
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
          AppMethodBeat.o(52187);
          paramContext = null;
          continue;
        }
        paramContext = (WifiManager)paramContext.getSystemService("wifi");
        if (paramContext == null)
        {
          AppMethodBeat.o(52187);
          paramContext = null;
        }
        else
        {
          paramContext = paramContext.getConnectionInfo();
          AppMethodBeat.o(52187);
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
        AppMethodBeat.o(52187);
        paramContext = null;
      }
    }
  }

  public static boolean is2G(Context paramContext)
  {
    AppMethodBeat.i(52182);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext == null)
      {
        AppMethodBeat.o(52182);
        bool = false;
      }
      while (true)
      {
        return bool;
        int i = paramContext.getType();
        if (i == 1)
        {
          AppMethodBeat.o(52182);
          bool = false;
        }
        else
        {
          ab.d("MicroMsg.NetStatusUtil", "is2G subtype %d", new Object[] { Integer.valueOf(paramContext.getSubtype()) });
          if ((paramContext.getSubtype() != 2) && (paramContext.getSubtype() != 1))
          {
            i = paramContext.getSubtype();
            if (i != 4)
              break;
          }
          AppMethodBeat.o(52182);
          bool = true;
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
        AppMethodBeat.o(52182);
        boolean bool = false;
      }
    }
  }

  public static boolean is3G(Context paramContext)
  {
    AppMethodBeat.i(52185);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext == null)
      {
        AppMethodBeat.o(52185);
        bool = false;
      }
      while (true)
      {
        return bool;
        int i = paramContext.getType();
        if (i == 1)
        {
          AppMethodBeat.o(52185);
          bool = false;
        }
        else
        {
          ab.d("MicroMsg.NetStatusUtil", "is3G subtype %d", new Object[] { Integer.valueOf(paramContext.getSubtype()) });
          if (paramContext.getSubtype() < 5)
            break;
          i = paramContext.getSubtype();
          if (i >= 13)
            break;
          AppMethodBeat.o(52185);
          bool = true;
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
        AppMethodBeat.o(52185);
        boolean bool = false;
      }
    }
  }

  public static boolean is4G(Context paramContext)
  {
    AppMethodBeat.i(52183);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext == null)
      {
        AppMethodBeat.o(52183);
        bool = false;
      }
      while (true)
      {
        return bool;
        int i = paramContext.getType();
        if (i == 1)
        {
          AppMethodBeat.o(52183);
          bool = false;
        }
        else
        {
          ab.d("MicroMsg.NetStatusUtil", "is4G subtype %d", new Object[] { Integer.valueOf(paramContext.getSubtype()) });
          i = paramContext.getSubtype();
          if (i < 13)
            break;
          AppMethodBeat.o(52183);
          bool = true;
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
        AppMethodBeat.o(52183);
        boolean bool = false;
      }
    }
  }

  public static boolean isConnected(Context paramContext)
  {
    boolean bool = false;
    AppMethodBeat.i(52172);
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (paramContext == null)
      AppMethodBeat.o(52172);
    while (true)
    {
      return bool;
      paramContext = paramContext.getActiveNetworkInfo();
      try
      {
        bool = paramContext.isConnected();
        AppMethodBeat.o(52172);
      }
      catch (Exception paramContext)
      {
        while (true)
          bool = false;
      }
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
    AppMethodBeat.i(52181);
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext == null)
      {
        AppMethodBeat.o(52181);
        bool = false;
      }
      while (true)
      {
        return bool;
        int i = paramContext.getType();
        if (i == 1)
        {
          AppMethodBeat.o(52181);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(52181);
          bool = true;
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
        AppMethodBeat.o(52181);
        boolean bool = false;
      }
    }
  }

  public static boolean isNetworkConnected(Context paramContext)
  {
    AppMethodBeat.i(52196);
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    boolean bool;
    if (paramContext == null)
    {
      AppMethodBeat.o(52196);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramContext = paramContext.getActiveNetworkInfo();
      if (paramContext == null)
      {
        AppMethodBeat.o(52196);
        bool = false;
      }
      else if (paramContext.getState() != NetworkInfo.State.CONNECTED)
      {
        AppMethodBeat.o(52196);
        bool = false;
      }
      else
      {
        bool = true;
        AppMethodBeat.o(52196);
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
    AppMethodBeat.i(52184);
    boolean bool = isWap(getNetType(paramContext));
    AppMethodBeat.o(52184);
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
    AppMethodBeat.i(52186);
    boolean bool;
    if (getNetType(paramContext) == 0)
    {
      bool = true;
      AppMethodBeat.o(52186);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52186);
    }
  }

  private static Intent searchIntentByClass(Context paramContext, String paramString)
  {
    AppMethodBeat.i(52188);
    try
    {
      PackageManager localPackageManager = paramContext.getPackageManager();
      List localList = localPackageManager.getInstalledPackages(0);
      if ((localList != null) && (localList.size() > 0))
      {
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("package  size");
        ab.e("MicroMsg.NetStatusUtil", localList.size());
        int i = 0;
        while (true)
        {
          int j = localList.size();
          if (i < j)
            try
            {
              localObject = new java/lang/StringBuilder;
              ((StringBuilder)localObject).<init>("package ");
              ab.e("MicroMsg.NetStatusUtil", ((PackageInfo)localList.get(i)).packageName);
              localObject = new android/content/Intent;
              ((Intent)localObject).<init>();
              ((Intent)localObject).setPackage(((PackageInfo)localList.get(i)).packageName);
              localObject = localPackageManager.queryIntentActivities((Intent)localObject, 0);
              if (localObject != null)
                j = ((List)localObject).size();
              while (true)
                if (j > 0)
                  try
                  {
                    ab.e("MicroMsg.NetStatusUtil", "activityName count ".concat(String.valueOf(j)));
                    for (int k = 0; ; k++)
                    {
                      if (k >= j)
                        break label327;
                      ActivityInfo localActivityInfo = ((ResolveInfo)((List)localObject).get(k)).activityInfo;
                      if (localActivityInfo.name.contains(paramString))
                      {
                        localObject = new android/content/Intent;
                        ((Intent)localObject).<init>("/");
                        ComponentName localComponentName = new android/content/ComponentName;
                        localComponentName.<init>(localActivityInfo.packageName, localActivityInfo.name);
                        ((Intent)localObject).setComponent(localComponentName);
                        ((Intent)localObject).setAction("android.intent.action.VIEW");
                        paramContext.startActivity((Intent)localObject);
                        AppMethodBeat.o(52188);
                        paramContext = (Context)localObject;
                        return paramContext;
                        j = 0;
                        break;
                      }
                    }
                  }
                  catch (Exception localException1)
                  {
                    ab.printErrStackTrace("MicroMsg.NetStatusUtil", localException1, "", new Object[0]);
                  }
              label327: i++;
            }
            catch (Exception localException2)
            {
              while (true)
                ab.printErrStackTrace("MicroMsg.NetStatusUtil", localException2, "", new Object[0]);
            }
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.NetStatusUtil", paramContext, "", new Object[0]);
        paramContext = null;
        AppMethodBeat.o(52188);
      }
    }
  }

  public static void startSettingItent(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(52189);
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
      AppMethodBeat.o(52189);
      while (true)
      {
        return;
        AppMethodBeat.o(52189);
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
          AppMethodBeat.o(52189);
        }
        catch (Exception localException1)
        {
          try
          {
            localObject = new android/content/Intent;
            ((Intent)localObject).<init>("/");
            ComponentName localComponentName = new android/content/ComponentName;
            localComponentName.<init>("com.htc.settings.accountsync", "com.htc.settings.accountsync.ManageAccountsSettings");
            ((Intent)localObject).setComponent(localComponentName);
            ((Intent)localObject).setAction("android.intent.action.VIEW");
            paramContext.startActivity((Intent)localObject);
            AppMethodBeat.o(52189);
          }
          catch (Exception localException2)
          {
            searchIntentByClass(paramContext, "ManageAccountsSettings");
            AppMethodBeat.o(52189);
          }
        }
        continue;
        try
        {
          Intent localIntent2 = new android/content/Intent;
          localIntent2.<init>("/");
          localObject = new android/content/ComponentName;
          ((ComponentName)localObject).<init>("com.android.settings", "com.android.settings.DevelopmentSettings");
          localIntent2.setComponent((ComponentName)localObject);
          localIntent2.setAction("android.intent.action.VIEW");
          paramContext.startActivity(localIntent2);
          AppMethodBeat.o(52189);
        }
        catch (Exception localException3)
        {
          searchIntentByClass(paramContext, "DevelopmentSettings");
          AppMethodBeat.o(52189);
        }
        continue;
        try
        {
          Intent localIntent3 = new android/content/Intent;
          localIntent3.<init>();
          localIntent3.setAction("android.settings.WIFI_IP_SETTINGS");
          paramContext.startActivity(localIntent3);
          AppMethodBeat.o(52189);
        }
        catch (Exception localException4)
        {
          searchIntentByClass(paramContext, "AdvancedSettings");
        }
      }
    }
  }

  public static final class a
  {
    public String org;
    public String orh;
    public String ori;
    public String systemId;
    public String type;
    public String tzp;
    public String tzr;
    public String tzs;
    public String tzt;

    public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
    {
      this.org = paramString1;
      this.orh = paramString2;
      this.tzp = paramString3;
      this.type = paramString6;
      this.ori = paramString4;
      this.tzr = paramString7;
      this.tzs = paramString8;
      this.systemId = paramString9;
      this.tzt = paramString5;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.at
 * JD-Core Version:    0.6.2
 */