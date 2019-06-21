package com.tencent.d.f;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.Proxy;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public final class d
{
  public static String atU(String paramString)
  {
    AppMethodBeat.i(114608);
    try
    {
      Object localObject = Class.forName("android.os.SystemProperties").getMethod("get", new Class[] { String.class });
      ((Method)localObject).setAccessible(true);
      localObject = (String)((Method)localObject).invoke(null, new Object[] { paramString });
      paramString = (String)localObject;
      if (localObject == null)
        paramString = "";
      AppMethodBeat.o(114608);
      return paramString;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        paramString = "";
        h.db(" getBuildPropByReflect: ".concat(String.valueOf(localThrowable)));
      }
    }
  }

  public static int dQD()
  {
    AppMethodBeat.i(114603);
    try
    {
      i = Integer.parseInt(Build.VERSION.SDK);
      AppMethodBeat.o(114603);
      return i;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        h.db("getSDKVersion: ".concat(String.valueOf(localThrowable)));
        int i = 0;
        AppMethodBeat.o(114603);
      }
    }
  }

  public static String dQE()
  {
    AppMethodBeat.i(114606);
    Object localObject1 = "";
    try
    {
      localFileInputStream = new java/io/FileInputStream;
      localFileInputStream.<init>("/proc/version");
      localBufferedReader = new BufferedReader(new InputStreamReader(localFileInputStream), 8192);
      localObject1 = new StringBuilder("");
    }
    catch (Throwable localThrowable6)
    {
      try
      {
        while (true)
        {
          String str = localBufferedReader.readLine();
          if (str == null)
            break;
          ((StringBuilder)localObject1).append(str);
        }
      }
      catch (Throwable localThrowable8)
      {
        FileInputStream localFileInputStream;
        BufferedReader localBufferedReader;
        localThrowable8 = localThrowable8;
        h.dc(localThrowable8);
        try
        {
          localBufferedReader.close();
        }
        catch (Throwable localThrowable6)
        {
          try
          {
            while (true)
            {
              localFileInputStream.close();
              localObject1 = ((StringBuilder)localObject1).toString();
              while (true)
              {
                AppMethodBeat.o(114606);
                while (true)
                {
                  return localObject1;
                  localThrowable1 = localThrowable1;
                  h.dc(localThrowable1);
                  AppMethodBeat.o(114606);
                }
                try
                {
                  localBufferedReader.close();
                }
                catch (Throwable localThrowable5)
                {
                  try
                  {
                    while (true)
                    {
                      localThrowable1.close();
                      localObject1 = ((StringBuilder)localObject1).toString();
                      break;
                      localThrowable5 = localThrowable5;
                      h.dc(localThrowable5);
                    }
                  }
                  catch (Throwable localThrowable2)
                  {
                    while (true)
                      h.dc(localThrowable2);
                  }
                }
              }
              localThrowable6 = localThrowable6;
              h.dc(localThrowable6);
            }
          }
          catch (Throwable localThrowable3)
          {
            while (true)
              h.dc(localThrowable3);
          }
        }
      }
      finally
      {
      }
    }
    try
    {
      localThrowable6.close();
    }
    catch (Throwable localThrowable7)
    {
      try
      {
        while (true)
        {
          localThrowable3.close();
          AppMethodBeat.o(114606);
          throw localObject2;
          localThrowable7 = localThrowable7;
          h.dc(localThrowable7);
        }
      }
      catch (Throwable localThrowable4)
      {
        while (true)
          h.dc(localThrowable4);
      }
    }
  }

  private static String dQF()
  {
    AppMethodBeat.i(114610);
    Object localObject1 = "";
    try
    {
      Object localObject2 = NetworkInterface.getNetworkInterfaces();
      if (localObject2 == null)
      {
        h.db("[tomys] getMac2, itfs is null.");
        AppMethodBeat.o(114610);
      }
      while (true)
      {
        return localObject1;
        localObject1 = Collections.list((Enumeration)localObject2).iterator();
        do
        {
          do
          {
            if (!((Iterator)localObject1).hasNext())
              break;
            localObject2 = (NetworkInterface)((Iterator)localObject1).next();
          }
          while (!((NetworkInterface)localObject2).getName().equalsIgnoreCase("wlan0"));
          localObject2 = ((NetworkInterface)localObject2).getHardwareAddress();
        }
        while (localObject2 == null);
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        int i = localObject2.length;
        for (int j = 0; j < i; j++)
          ((StringBuilder)localObject1).append(String.format("%02x:", new Object[] { Byte.valueOf(localObject2[j]) }));
        if (((StringBuilder)localObject1).length() > 0)
          ((StringBuilder)localObject1).deleteCharAt(((StringBuilder)localObject1).length() - 1);
        localObject1 = ((StringBuilder)localObject1).toString();
        AppMethodBeat.o(114610);
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        h.db("getMac2: ".concat(String.valueOf(localThrowable)));
        String str = "";
      }
    }
  }

  public static String getIMEI(Context paramContext)
  {
    AppMethodBeat.i(114601);
    try
    {
      paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
      AppMethodBeat.o(114601);
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        h.db("getIMEI: ".concat(String.valueOf(paramContext)));
        paramContext = "";
      }
    }
  }

  public static String iK(Context paramContext)
  {
    AppMethodBeat.i(114602);
    try
    {
      paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getSubscriberId();
      AppMethodBeat.o(114602);
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        h.db("getIMSI: ".concat(String.valueOf(paramContext)));
        paramContext = "";
      }
    }
  }

  public static String iL(Context paramContext)
  {
    AppMethodBeat.i(114604);
    try
    {
      paramContext = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
      AppMethodBeat.o(114604);
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        h.db("getAndroidId: ".concat(String.valueOf(paramContext)));
        paramContext = "";
        AppMethodBeat.o(114604);
      }
    }
  }

  public static d.a iM(Context paramContext)
  {
    AppMethodBeat.i(114607);
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((localNetworkInfo == null) || ((localNetworkInfo.getState() != NetworkInfo.State.CONNECTING) && (localNetworkInfo.getState() != NetworkInfo.State.CONNECTED)))
    {
      paramContext = d.a.Auw;
      AppMethodBeat.o(114607);
    }
    while (true)
    {
      return paramContext;
      if (localNetworkInfo.getType() == 1)
      {
        paramContext = d.a.Aut;
        AppMethodBeat.o(114607);
      }
      else if (localNetworkInfo.getType() == 0)
      {
        if ((Proxy.getDefaultHost() != null) || (Proxy.getHost(paramContext) != null))
        {
          paramContext = d.a.Auu;
          AppMethodBeat.o(114607);
        }
        else
        {
          paramContext = d.a.Auv;
          AppMethodBeat.o(114607);
        }
      }
      else
      {
        paramContext = d.a.Auw;
        AppMethodBeat.o(114607);
      }
    }
  }

  public static String iN(Context paramContext)
  {
    AppMethodBeat.i(114609);
    try
    {
      paramContext = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo();
      if (paramContext != null)
      {
        paramContext = paramContext.getMacAddress();
        Object localObject;
        if (!TextUtils.isEmpty(paramContext))
        {
          localObject = paramContext;
          if (!paramContext.equals("02:00:00:00:00:00"));
        }
        else
        {
          localObject = dQF();
        }
        AppMethodBeat.o(114609);
        return localObject;
      }
    }
    catch (Throwable paramContext)
    {
      while (true)
      {
        h.db("getMac: ".concat(String.valueOf(paramContext)));
        paramContext = "";
      }
    }
  }

  // ERROR //
  public static String ro(boolean paramBoolean)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc_w 319
    //   5: invokestatic 17	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: iload_0
    //   9: ifeq +161 -> 170
    //   12: ldc_w 321
    //   15: astore_2
    //   16: ldc_w 323
    //   19: astore_3
    //   20: new 94	java/io/BufferedReader
    //   23: astore 4
    //   25: new 325	java/io/FileReader
    //   28: astore 5
    //   30: new 104	java/lang/StringBuilder
    //   33: astore 6
    //   35: aload 6
    //   37: invokespecial 172	java/lang/StringBuilder:<init>	()V
    //   40: aload 5
    //   42: aload 6
    //   44: aload_2
    //   45: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: ldc_w 327
    //   51: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   54: invokevirtual 125	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   57: invokespecial 328	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   60: aload 4
    //   62: aload 5
    //   64: invokespecial 331	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   67: aload 4
    //   69: invokevirtual 108	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   72: astore 6
    //   74: aload_1
    //   75: astore 5
    //   77: aload 6
    //   79: ifnull +105 -> 184
    //   82: aload_1
    //   83: astore 5
    //   85: aload 6
    //   87: invokevirtual 334	java/lang/String:toUpperCase	()Ljava/lang/String;
    //   90: aload_3
    //   91: invokevirtual 310	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   94: ifeq +90 -> 184
    //   97: new 94	java/io/BufferedReader
    //   100: astore_3
    //   101: new 325	java/io/FileReader
    //   104: astore_1
    //   105: new 104	java/lang/StringBuilder
    //   108: astore 5
    //   110: aload 5
    //   112: invokespecial 172	java/lang/StringBuilder:<init>	()V
    //   115: aload_1
    //   116: aload 5
    //   118: aload_2
    //   119: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   122: ldc_w 336
    //   125: invokevirtual 112	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: invokevirtual 125	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   131: invokespecial 328	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   134: aload_3
    //   135: aload_1
    //   136: invokespecial 331	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   139: aload_3
    //   140: invokevirtual 108	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   143: astore_2
    //   144: aload_2
    //   145: ifnull +36 -> 181
    //   148: aload_2
    //   149: invokevirtual 339	java/lang/String:trim	()Ljava/lang/String;
    //   152: astore_2
    //   153: aload 4
    //   155: invokevirtual 119	java/io/BufferedReader:close	()V
    //   158: aload_3
    //   159: invokevirtual 119	java/io/BufferedReader:close	()V
    //   162: ldc_w 319
    //   165: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   168: aload_2
    //   169: areturn
    //   170: ldc_w 341
    //   173: astore_2
    //   174: ldc_w 343
    //   177: astore_3
    //   178: goto -158 -> 20
    //   181: aload_3
    //   182: astore 5
    //   184: aload 4
    //   186: invokevirtual 119	java/io/BufferedReader:close	()V
    //   189: aload 5
    //   191: ifnull +8 -> 199
    //   194: aload 5
    //   196: invokevirtual 119	java/io/BufferedReader:close	()V
    //   199: ldc 45
    //   201: astore_2
    //   202: ldc_w 319
    //   205: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   208: goto -40 -> 168
    //   211: astore_3
    //   212: aconst_null
    //   213: astore_2
    //   214: aconst_null
    //   215: astore 4
    //   217: ldc_w 345
    //   220: aload_3
    //   221: invokestatic 54	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   224: invokevirtual 57	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   227: invokestatic 63	com/tencent/d/f/h:db	(Ljava/lang/Object;)V
    //   230: aload 4
    //   232: ifnull +8 -> 240
    //   235: aload 4
    //   237: invokevirtual 119	java/io/BufferedReader:close	()V
    //   240: aload_2
    //   241: ifnull -42 -> 199
    //   244: aload_2
    //   245: invokevirtual 119	java/io/BufferedReader:close	()V
    //   248: goto -49 -> 199
    //   251: astore_3
    //   252: goto -53 -> 199
    //   255: astore_3
    //   256: aconst_null
    //   257: astore_2
    //   258: aconst_null
    //   259: astore 4
    //   261: aload 4
    //   263: ifnull +8 -> 271
    //   266: aload 4
    //   268: invokevirtual 119	java/io/BufferedReader:close	()V
    //   271: aload_2
    //   272: ifnull +7 -> 279
    //   275: aload_2
    //   276: invokevirtual 119	java/io/BufferedReader:close	()V
    //   279: ldc_w 319
    //   282: invokestatic 48	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   285: aload_3
    //   286: athrow
    //   287: astore 4
    //   289: goto -131 -> 158
    //   292: astore_3
    //   293: goto -131 -> 162
    //   296: astore_3
    //   297: goto -108 -> 189
    //   300: astore_3
    //   301: goto -102 -> 199
    //   304: astore_3
    //   305: goto -65 -> 240
    //   308: astore 4
    //   310: goto -39 -> 271
    //   313: astore_2
    //   314: goto -35 -> 279
    //   317: astore_3
    //   318: aconst_null
    //   319: astore_2
    //   320: goto -59 -> 261
    //   323: astore_2
    //   324: aload_3
    //   325: astore 5
    //   327: aload_2
    //   328: astore_3
    //   329: aload 5
    //   331: astore_2
    //   332: goto -71 -> 261
    //   335: astore_3
    //   336: goto -75 -> 261
    //   339: astore_3
    //   340: aconst_null
    //   341: astore_2
    //   342: goto -125 -> 217
    //   345: astore_2
    //   346: aload_3
    //   347: astore 5
    //   349: aload_2
    //   350: astore_3
    //   351: aload 5
    //   353: astore_2
    //   354: goto -137 -> 217
    //
    // Exception table:
    //   from	to	target	type
    //   20	67	211	java/lang/Throwable
    //   244	248	251	java/io/IOException
    //   20	67	255	finally
    //   153	158	287	java/io/IOException
    //   158	162	292	java/io/IOException
    //   184	189	296	java/io/IOException
    //   194	199	300	java/io/IOException
    //   235	240	304	java/io/IOException
    //   266	271	308	java/io/IOException
    //   275	279	313	java/io/IOException
    //   67	74	317	finally
    //   85	139	317	finally
    //   139	144	323	finally
    //   148	153	323	finally
    //   217	230	335	finally
    //   67	74	339	java/lang/Throwable
    //   85	139	339	java/lang/Throwable
    //   139	144	345	java/lang/Throwable
    //   148	153	345	java/lang/Throwable
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.d.f.d
 * JD-Core Version:    0.6.2
 */