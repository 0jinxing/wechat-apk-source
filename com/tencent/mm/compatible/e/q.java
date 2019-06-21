package com.tencent.mm.compatible.e;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.g.a.cj;
import com.tencent.mm.plugin.report.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.au;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.File;
import java.io.FileFilter;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class q
{
  public static o etb;
  public static c etc;
  public static b etd;
  public static x ete;
  public static ac etf;
  public static s etg;
  public static w eth;
  public static aa eti;
  public static v etj;
  public static v etk;
  public static a etl;
  private static int etm;
  public static k etn;
  public static p eto;
  private static final au etp;
  private static String etq;

  static
  {
    AppMethodBeat.i(92990);
    etb = new o();
    etc = new c();
    etd = new b();
    ete = new x();
    etf = new ac();
    etg = new s();
    eth = new w();
    eti = new aa();
    etj = new v();
    etk = new v();
    etl = new a();
    etm = -1;
    etn = new k();
    eto = new p();
    etp = new au("DeviceInfo", TimeUnit.DAYS.toMillis(1L));
    etq = null;
    AppMethodBeat.o(92990);
  }

  @Deprecated
  public static String LK()
  {
    AppMethodBeat.i(92966);
    eV(11L);
    String str = (String)l.Lu().get(258);
    if (str != null)
    {
      eV(0L);
      if ("1234567890ABCDEF".equals(str))
        eV(1L);
      while (true)
      {
        AppMethodBeat.o(92966);
        return str;
        eV(2L);
      }
    }
    str = getDeviceID(ah.getContext());
    if (str == null)
    {
      eV(4L);
      str = "1234567890ABCDEF";
    }
    while (true)
    {
      l.Lu().set(258, str);
      AppMethodBeat.o(92966);
      break;
      eV(3L);
    }
  }

  public static String LL()
  {
    AppMethodBeat.i(92967);
    eV(12L);
    Object localObject = (String)l.Lu().get(258);
    if ((!bo.isNullOrNil((String)localObject)) && (!"1234567890ABCDEF".equals(localObject)))
    {
      ab.w("MicroMsg.DeviceInfo", "old cache's device id was chosen to be returned.");
      eV(7L);
      AppMethodBeat.o(92967);
    }
    while (true)
    {
      return localObject;
      as localas = as.amF("sysinfo_258");
      localObject = localas.getString("k_i_m_e_i", "1234567890ABCDEF");
      if (!"1234567890ABCDEF".equals(localObject))
      {
        ab.i("MicroMsg.DeviceInfo", "new cache's device id was chosen to be returned.");
        eV(8L);
        AppMethodBeat.o(92967);
      }
      else
      {
        localObject = ah.getContext();
        if (localObject == null)
        {
          ab.e("MicroMsg.DeviceInfo", "context is null, return fake device id now.");
          eV(10L);
          localObject = "1234567890ABCDEF";
          AppMethodBeat.o(92967);
        }
        else
        {
          localObject = bo.gN((Context)localObject);
          if (!bo.isNullOrNil((String)localObject))
          {
            localas.edit().putString("k_i_m_e_i", (String)localObject).apply();
            eV(9L);
            AppMethodBeat.o(92967);
          }
          else
          {
            ab.e("MicroMsg.DeviceInfo", "fail to get device id from system, return fake one instead.");
            eV(10L);
            localObject = "1234567890ABCDEF";
            AppMethodBeat.o(92967);
          }
        }
      }
    }
  }

  public static String LM()
  {
    AppMethodBeat.i(92969);
    String str = bH(false);
    AppMethodBeat.o(92969);
    return str;
  }

  public static boolean LN()
  {
    if (etq != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static String LO()
  {
    AppMethodBeat.i(92971);
    String str = (String)l.Lu().get(259);
    if (str != null)
    {
      ab.d("MicroMsg.DeviceInfo", "getHardWareId from file ".concat(String.valueOf(str)));
      AppMethodBeat.o(92971);
    }
    while (true)
    {
      return str;
      str = Build.MANUFACTURER + Build.MODEL + n.LB();
      l.Lu().set(259, str);
      ab.d("MicroMsg.DeviceInfo", "getHardWareId ".concat(String.valueOf(str)));
      AppMethodBeat.o(92971);
    }
  }

  public static String LP()
  {
    AppMethodBeat.i(92972);
    Object localObject = (WifiManager)ah.getContext().getSystemService("wifi");
    if (localObject == null)
    {
      localObject = null;
      if (localObject == null)
        break label50;
    }
    label50: for (localObject = ((WifiInfo)localObject).getMacAddress(); ; localObject = null)
    {
      AppMethodBeat.o(92972);
      return localObject;
      localObject = ((WifiManager)localObject).getConnectionInfo();
      break;
    }
  }

  public static String LQ()
  {
    AppMethodBeat.i(92973);
    String str = null;
    BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
    if (localBluetoothAdapter != null)
      str = localBluetoothAdapter.getAddress();
    AppMethodBeat.o(92973);
    return str;
  }

  private static String LR()
  {
    int i = 0;
    AppMethodBeat.i(92975);
    String str1 = bo.gN(ah.getContext());
    String str2;
    if ((str1 != null) && (str1.length() > 0))
    {
      str2 = ("A" + str1 + "123456789ABCDEF").substring(0, 15);
      ab.w("MicroMsg.DeviceInfo", "generated deviceId=".concat(String.valueOf(str2)));
      AppMethodBeat.o(92975);
      return str2;
    }
    Random localRandom = new Random();
    localRandom.setSeed(System.currentTimeMillis());
    str1 = "A";
    while (true)
    {
      str2 = str1;
      if (i >= 15)
        break;
      str1 = str1 + (char)(localRandom.nextInt(25) + 65);
      i++;
    }
  }

  public static String LS()
  {
    return Build.MODEL;
  }

  // ERROR //
  public static String[] LT()
  {
    // Byte code:
    //   0: ldc_w 382
    //   3: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: iconst_2
    //   7: anewarray 160	java/lang/String
    //   10: astore_0
    //   11: aload_0
    //   12: iconst_0
    //   13: ldc_w 384
    //   16: aastore
    //   17: aload_0
    //   18: iconst_1
    //   19: ldc_w 386
    //   22: aastore
    //   23: new 388	java/io/FileReader
    //   26: astore_1
    //   27: aload_1
    //   28: ldc_w 390
    //   31: invokespecial 391	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   34: new 393	java/io/BufferedReader
    //   37: astore_2
    //   38: aload_2
    //   39: aload_1
    //   40: sipush 8192
    //   43: invokespecial 396	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   46: aload_2
    //   47: invokevirtual 399	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   50: invokestatic 402	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   53: ldc_w 404
    //   56: invokevirtual 408	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   59: astore_1
    //   60: iconst_2
    //   61: istore_3
    //   62: iload_3
    //   63: aload_1
    //   64: arraylength
    //   65: if_icmpge +45 -> 110
    //   68: new 281	java/lang/StringBuilder
    //   71: astore 4
    //   73: aload 4
    //   75: invokespecial 282	java/lang/StringBuilder:<init>	()V
    //   78: aload_0
    //   79: iconst_0
    //   80: aload 4
    //   82: aload_0
    //   83: iconst_0
    //   84: aaload
    //   85: invokevirtual 291	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   88: aload_1
    //   89: iload_3
    //   90: aaload
    //   91: invokevirtual 291	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   94: ldc_w 410
    //   97: invokevirtual 291	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: invokevirtual 302	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   103: aastore
    //   104: iinc 3 1
    //   107: goto -45 -> 62
    //   110: aload_0
    //   111: iconst_1
    //   112: aload_2
    //   113: invokevirtual 399	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   116: invokestatic 402	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   119: ldc_w 404
    //   122: invokevirtual 408	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   125: iconst_2
    //   126: aaload
    //   127: aastore
    //   128: aload_2
    //   129: invokevirtual 413	java/io/BufferedReader:close	()V
    //   132: ldc_w 382
    //   135: invokestatic 137	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   138: aload_0
    //   139: areturn
    //   140: astore_2
    //   141: aconst_null
    //   142: astore_2
    //   143: aload_2
    //   144: ifnull -12 -> 132
    //   147: aload_2
    //   148: invokevirtual 413	java/io/BufferedReader:close	()V
    //   151: goto -19 -> 132
    //   154: astore_2
    //   155: goto -23 -> 132
    //   158: astore_2
    //   159: aconst_null
    //   160: astore_0
    //   161: aload_0
    //   162: ifnull +7 -> 169
    //   165: aload_0
    //   166: invokevirtual 413	java/io/BufferedReader:close	()V
    //   169: ldc_w 382
    //   172: invokestatic 137	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   175: aload_2
    //   176: athrow
    //   177: astore_2
    //   178: goto -46 -> 132
    //   181: astore_0
    //   182: goto -13 -> 169
    //   185: astore_1
    //   186: aload_2
    //   187: astore_0
    //   188: aload_1
    //   189: astore_2
    //   190: goto -29 -> 161
    //   193: astore_1
    //   194: goto -51 -> 143
    //
    // Exception table:
    //   from	to	target	type
    //   23	46	140	java/io/IOException
    //   147	151	154	java/lang/Exception
    //   23	46	158	finally
    //   128	132	177	java/lang/Exception
    //   165	169	181	java/lang/Exception
    //   46	60	185	finally
    //   62	104	185	finally
    //   110	128	185	finally
    //   46	60	193	java/io/IOException
    //   62	104	193	java/io/IOException
    //   110	128	193	java/io/IOException
  }

  public static String LU()
  {
    AppMethodBeat.i(92982);
    Object localObject1 = null;
    try
    {
      BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
      Object localObject2 = localObject1;
      if (localBluetoothAdapter != null)
      {
        localObject2 = localObject1;
        if (localBluetoothAdapter.isEnabled())
          localObject2 = localBluetoothAdapter.getAddress();
      }
      localObject2 = bo.nullAsNil((String)localObject2);
      AppMethodBeat.o(92982);
      return localObject2;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.DeviceInfo", "getBlueToothAddress failed: %s", new Object[] { bo.l(localException) });
        String str = "";
        AppMethodBeat.o(92982);
      }
    }
  }

  @SuppressLint({"NewApi"})
  public static String LV()
  {
    AppMethodBeat.i(92983);
    Object localObject = null;
    try
    {
      String str;
      if (Build.VERSION.SDK_INT >= 14)
        str = Build.getRadioVersion();
      for (localObject = str; ; localObject = str)
      {
        label22: localObject = bo.nullAsNil((String)localObject);
        AppMethodBeat.o(92983);
        return localObject;
        str = Build.RADIO;
      }
    }
    catch (IncompatibleClassChangeError localIncompatibleClassChangeError1)
    {
      ab.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError1, "May cause dvmFindCatchBlock crash!", new Object[0]);
      IncompatibleClassChangeError localIncompatibleClassChangeError2 = (IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError1);
      AppMethodBeat.o(92983);
      throw localIncompatibleClassChangeError2;
    }
    catch (Throwable localThrowable)
    {
      break label22;
    }
  }

  public static String LW()
  {
    return Build.VERSION.RELEASE;
  }

  public static String LX()
  {
    AppMethodBeat.i(92984);
    try
    {
      String str1 = bo.nullAsNil(((TelephonyManager)ah.getContext().getSystemService("phone")).getSubscriberId());
      AppMethodBeat.o(92984);
      return str1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.DeviceInfo", localException, "getPhoneIMSI", new Object[0]);
        String str2 = "";
        AppMethodBeat.o(92984);
      }
    }
  }

  public static String LY()
  {
    AppMethodBeat.i(92985);
    try
    {
      String str1 = bo.nullAsNil(((TelephonyManager)ah.getContext().getSystemService("phone")).getSimSerialNumber());
      AppMethodBeat.o(92985);
      return str1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.DeviceInfo", localException, "getPhoneICCID", new Object[0]);
        String str2 = "";
        AppMethodBeat.o(92985);
      }
    }
  }

  @SuppressLint({"NewApi"})
  public static String LZ()
  {
    AppMethodBeat.i(92986);
    String str = null;
    if (Build.VERSION.SDK_INT >= 9)
      str = Build.SERIAL;
    str = bo.nullAsNil(str);
    AppMethodBeat.o(92986);
    return str;
  }

  // ERROR //
  public static Map<String, String> Ma()
  {
    // Byte code:
    //   0: ldc_w 491
    //   3: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 493	java/util/HashMap
    //   9: dup
    //   10: invokespecial 494	java/util/HashMap:<init>	()V
    //   13: astore_0
    //   14: new 393	java/io/BufferedReader
    //   17: astore_1
    //   18: new 496	java/io/InputStreamReader
    //   21: astore_2
    //   22: new 498	java/io/FileInputStream
    //   25: astore_3
    //   26: aload_3
    //   27: ldc_w 390
    //   30: invokespecial 499	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   33: aload_2
    //   34: aload_3
    //   35: ldc_w 501
    //   38: invokespecial 504	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   41: aload_1
    //   42: aload_2
    //   43: invokespecial 507	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   46: aload_1
    //   47: astore_3
    //   48: aload_1
    //   49: invokevirtual 399	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   52: astore_2
    //   53: aload_2
    //   54: ifnull +91 -> 145
    //   57: aload_1
    //   58: astore_3
    //   59: aload_2
    //   60: invokevirtual 510	java/lang/String:trim	()Ljava/lang/String;
    //   63: ldc_w 384
    //   66: invokevirtual 166	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   69: ifne -23 -> 46
    //   72: aload_1
    //   73: astore_3
    //   74: aload_2
    //   75: ldc_w 512
    //   78: invokevirtual 408	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   81: astore_2
    //   82: aload_1
    //   83: astore_3
    //   84: aload_2
    //   85: arraylength
    //   86: iconst_1
    //   87: if_icmple -41 -> 46
    //   90: aload_1
    //   91: astore_3
    //   92: aload_0
    //   93: aload_2
    //   94: iconst_0
    //   95: aaload
    //   96: invokevirtual 510	java/lang/String:trim	()Ljava/lang/String;
    //   99: invokevirtual 515	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   102: aload_2
    //   103: iconst_1
    //   104: aaload
    //   105: invokevirtual 510	java/lang/String:trim	()Ljava/lang/String;
    //   108: invokeinterface 521 3 0
    //   113: pop
    //   114: goto -68 -> 46
    //   117: astore_2
    //   118: aload_1
    //   119: astore_3
    //   120: ldc 199
    //   122: aload_2
    //   123: ldc_w 523
    //   126: iconst_0
    //   127: anewarray 4	java/lang/Object
    //   130: invokestatic 455	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   133: aload_1
    //   134: invokestatic 527	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   137: ldc_w 491
    //   140: invokestatic 137	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   143: aload_0
    //   144: areturn
    //   145: aload_1
    //   146: invokestatic 527	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   149: goto -12 -> 137
    //   152: astore_3
    //   153: aconst_null
    //   154: astore_1
    //   155: aload_3
    //   156: astore_2
    //   157: aload_1
    //   158: invokestatic 527	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   161: ldc_w 491
    //   164: invokestatic 137	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   167: aload_2
    //   168: athrow
    //   169: astore_2
    //   170: aload_3
    //   171: astore_1
    //   172: goto -15 -> 157
    //   175: astore_2
    //   176: aconst_null
    //   177: astore_1
    //   178: goto -60 -> 118
    //
    // Exception table:
    //   from	to	target	type
    //   48	53	117	java/io/IOException
    //   59	72	117	java/io/IOException
    //   74	82	117	java/io/IOException
    //   84	90	117	java/io/IOException
    //   92	114	117	java/io/IOException
    //   14	46	152	finally
    //   48	53	169	finally
    //   59	72	169	finally
    //   74	82	169	finally
    //   84	90	169	finally
    //   92	114	169	finally
    //   120	133	169	finally
    //   14	46	175	java/io/IOException
  }

  public static int Mb()
  {
    AppMethodBeat.i(92988);
    try
    {
      File localFile = new java/io/File;
      localFile.<init>("/sys/devices/system/cpu");
      a locala = new com/tencent/mm/compatible/e/q$a;
      locala.<init>();
      i = localFile.listFiles(locala).length;
      AppMethodBeat.o(92988);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
      {
        int i = 1;
        AppMethodBeat.o(92988);
      }
    }
  }

  public static String Mc()
  {
    AppMethodBeat.i(92989);
    String str = "android-" + Build.MODEL + "-" + Build.VERSION.SDK_INT;
    AppMethodBeat.o(92989);
    return str;
  }

  public static String bB(Context paramContext)
  {
    AppMethodBeat.i(92977);
    try
    {
      ab.i("MicroMsg.DeviceInfo", "lm: getManufacturer CurrentLanguage is %s", new Object[] { com.tencent.mm.sdk.platformtools.aa.gw(paramContext) });
      if ((eth == null) || (eth.etS == null) || (eth.etS.size() == 0))
      {
        ab.i("MicroMsg.DeviceInfo", "lm: getManufacturer return is %s", new Object[] { Build.MANUFACTURER });
        paramContext = Build.MANUFACTURER;
        AppMethodBeat.o(92977);
      }
      while (true)
      {
        return paramContext;
        Map localMap = eth.etS;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(".manufacturerName.");
        paramContext = (String)localMap.get(com.tencent.mm.sdk.platformtools.aa.gw(paramContext));
        ab.i("MicroMsg.DeviceInfo", "lm: getManufacturer is %s", new Object[] { paramContext });
        boolean bool = bo.isNullOrNil(paramContext);
        if (!bool)
        {
          AppMethodBeat.o(92977);
        }
        else
        {
          paramContext = (String)eth.etS.get(".manufacturerName.en");
          ab.i("MicroMsg.DeviceInfo", "lm: getManufacturer is %s", new Object[] { paramContext });
          bool = bo.isNullOrNil(paramContext);
          if (!bool)
          {
            AppMethodBeat.o(92977);
          }
          else
          {
            paramContext = Build.MANUFACTURER;
            AppMethodBeat.o(92977);
          }
        }
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        paramContext = Build.MANUFACTURER;
        AppMethodBeat.o(92977);
      }
    }
  }

  public static String bC(Context paramContext)
  {
    AppMethodBeat.i(92978);
    try
    {
      paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getSimOperatorName();
      AppMethodBeat.o(92978);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.DeviceInfo", paramContext, "getMobileSPType", new Object[0]);
        paramContext = "";
        AppMethodBeat.o(92978);
      }
    }
  }

  public static String bH(boolean paramBoolean)
  {
    AppMethodBeat.i(92970);
    if ((paramBoolean) || (etq == null))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(Settings.Secure.getString(ah.getContext().getContentResolver(), "android_id"));
      ((StringBuilder)localObject).append(bI(paramBoolean));
      ((StringBuilder)localObject).append(LO());
      localObject = ((StringBuilder)localObject).toString();
      etq = "A" + g.x(((String)localObject).getBytes()).substring(0, 15);
      ab.w("MicroMsg.DeviceInfo", "guid:%s, dev=%s", new Object[] { etq, localObject });
    }
    Object localObject = etq;
    AppMethodBeat.o(92970);
    return localObject;
  }

  private static String bI(boolean paramBoolean)
  {
    AppMethodBeat.i(92974);
    String str;
    if (!paramBoolean)
    {
      str = (String)l.Lu().get(256);
      if (str != null)
        AppMethodBeat.o(92974);
    }
    while (true)
    {
      return str;
      str = LR();
      l.Lu().set(256, str);
      AppMethodBeat.o(92974);
    }
  }

  private static void eV(long paramLong)
  {
    AppMethodBeat.i(92965);
    au localau = etp;
    Object localObject = "idkey_1008_".concat(String.valueOf(paramLong));
    if (localObject == null)
    {
      localObject = new IllegalArgumentException("key is null.");
      AppMethodBeat.o(92965);
      throw ((Throwable)localObject);
    }
    localau.dpe();
    long l;
    if (localau.xAv)
    {
      l = System.currentTimeMillis();
      if (localau.xAy.containsKey(localObject))
        break label146;
      localau.xAy.put(localObject, Long.valueOf(l));
      localau.xAx.edit().putLong((String)localObject, l).apply();
    }
    label111: for (int i = 0; ; i = 1)
    {
      if (i != 0)
        e.pXa.a(1008L, paramLong, 1L, false);
      AppMethodBeat.o(92965);
      return;
      l = SystemClock.elapsedRealtime();
      break;
      if (l - ((Long)localau.xAy.get(localObject)).longValue() <= localau.xAz)
        break label111;
      localau.xAy.put(localObject, Long.valueOf(l));
      localau.xAx.edit().putLong((String)localObject, l).apply();
    }
  }

  public static String getAndroidId()
  {
    AppMethodBeat.i(92981);
    String str = Settings.Secure.getString(ah.getContext().getContentResolver(), "android_id");
    ab.i("MicroMsg.DeviceInfo", "androidid:[%s]", new Object[] { str });
    AppMethodBeat.o(92981);
    return str;
  }

  public static String getDeviceID(Context paramContext)
  {
    AppMethodBeat.i(92968);
    paramContext = bo.gN(paramContext);
    if (bo.isNullOrNil(paramContext))
      eV(6L);
    while (true)
    {
      AppMethodBeat.o(92968);
      return paramContext;
      eV(5L);
    }
  }

  public static String getSimCountryIso()
  {
    AppMethodBeat.i(92979);
    Object localObject = (TelephonyManager)ah.getContext().getSystemService("phone");
    if (localObject != null)
    {
      localObject = ((TelephonyManager)localObject).getSimCountryIso();
      ab.i("MicroMsg.DeviceInfo", "get isoCode:[%s]", new Object[] { localObject });
      AppMethodBeat.o(92979);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(92979);
    }
  }

  public static void ku(String paramString)
  {
    AppMethodBeat.i(92976);
    ab.i("MicroMsg.DeviceInfo", "update deviceInfo %s", new Object[] { paramString });
    if ((paramString == null) || (paramString.length() <= 0))
      AppMethodBeat.o(92976);
    while (true)
    {
      return;
      if (paramString.hashCode() == etm)
      {
        AppMethodBeat.o(92976);
      }
      else
      {
        etm = paramString.hashCode();
        etb.reset();
        etc.reset();
        etd.reset();
        etn.reset();
        ete.reset();
        etf.reset();
        Object localObject = etg;
        ((s)localObject).etr = 0;
        ((s)localObject).ets = 0;
        localObject = eth;
        ((w)localObject).etR = "";
        ((w)localObject).etS = null;
        localObject = eti;
        ((aa)localObject).cOQ = false;
        ((aa)localObject).eue = 0;
        ((aa)localObject).euf = false;
        etj.reset();
        etk.reset();
        localObject = etl;
        ((a)localObject).epE = false;
        ((a)localObject).epF = "";
        new r();
        if (!r.a(paramString, etb, etc, etd, etn, ete, etf, etg, eth, eti, etj, etl, etk))
        {
          AppMethodBeat.o(92976);
        }
        else
        {
          ab.i("MicroMsg.DeviceInfo", "steve: mCameraInfo.mSupportVoipBeauty = " + etc.erz);
          paramString = new cj();
          com.tencent.mm.sdk.b.a.xxA.m(paramString);
          AppMethodBeat.o(92976);
        }
      }
    }
  }

  final class a
    implements FileFilter
  {
    public final boolean accept(File paramFile)
    {
      AppMethodBeat.i(92964);
      boolean bool;
      if (Pattern.matches("cpu[0-9]+", paramFile.getName()))
      {
        bool = true;
        AppMethodBeat.o(92964);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(92964);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.e.q
 * JD-Core Version:    0.6.2
 */