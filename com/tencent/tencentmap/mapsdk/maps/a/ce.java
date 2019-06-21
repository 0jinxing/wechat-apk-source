package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class ce
{
  private static volatile boolean a;
  private static String b;
  private static String c;
  private static volatile int d;
  private static volatile boolean e;
  private static volatile int f;
  private static Map<String, ce.a> g;
  private static BroadcastReceiver h;
  private static String i;
  private static String j;
  private static String k;
  private static String l;
  private static String m;

  static
  {
    AppMethodBeat.i(98632);
    a = true;
    b = "";
    c = "unknown";
    d = 0;
    e = false;
    f = -1;
    g = new ConcurrentHashMap();
    h = new cf();
    i = "";
    j = "cmwap";
    k = "3gwap";
    l = "uniwap";
    m = "ctwap";
    AppMethodBeat.o(98632);
  }

  public static void a()
  {
    AppMethodBeat.i(98627);
    try
    {
      e();
      IntentFilter localIntentFilter = new android/content/IntentFilter;
      localIntentFilter.<init>("android.net.conn.CONNECTIVITY_CHANGE");
      bt.a().registerReceiver(h, localIntentFilter);
      AppMethodBeat.o(98627);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(98627);
    }
  }

  public static void a(String paramString, ce.a parama)
  {
    AppMethodBeat.i(98626);
    synchronized (g)
    {
      g.put(paramString, parama);
      AppMethodBeat.o(98626);
      return;
    }
  }

  public static String b()
  {
    return c;
  }

  public static String c()
  {
    String str = "";
    switch (d)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return str;
      str = "wifi";
      continue;
      str = "2g";
      continue;
      str = "3g";
      continue;
      str = "4g";
    }
  }

  public static String d()
  {
    String str;
    switch (d)
    {
    default:
      str = "null";
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return str;
      str = "wifi";
      continue;
      str = b;
    }
  }

  // ERROR //
  public static void e()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 126
    //   5: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: getstatic 45	com/tencent/tencentmap/mapsdk/maps/a/ce:d	I
    //   11: istore_0
    //   12: invokestatic 100	com/tencent/tencentmap/mapsdk/maps/a/bt:a	()Landroid/content/Context;
    //   15: ldc 128
    //   17: invokevirtual 132	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   20: checkcast 134	android/net/ConnectivityManager
    //   23: invokevirtual 138	android/net/ConnectivityManager:getActiveNetworkInfo	()Landroid/net/NetworkInfo;
    //   26: astore_1
    //   27: aload_1
    //   28: ifnull +587 -> 615
    //   31: aload_1
    //   32: invokevirtual 144	android/net/NetworkInfo:isAvailable	()Z
    //   35: ifeq +580 -> 615
    //   38: aload_1
    //   39: invokevirtual 147	android/net/NetworkInfo:isConnected	()Z
    //   42: ifeq +573 -> 615
    //   45: iconst_1
    //   46: putstatic 35	com/tencent/tencentmap/mapsdk/maps/a/ce:a	Z
    //   49: aload_1
    //   50: invokevirtual 151	android/net/NetworkInfo:getType	()I
    //   53: istore_2
    //   54: iload_2
    //   55: iconst_1
    //   56: if_icmpne +146 -> 202
    //   59: iconst_1
    //   60: putstatic 45	com/tencent/tencentmap/mapsdk/maps/a/ce:d	I
    //   63: iconst_0
    //   64: putstatic 49	com/tencent/tencentmap/mapsdk/maps/a/ce:f	I
    //   67: iconst_0
    //   68: putstatic 47	com/tencent/tencentmap/mapsdk/maps/a/ce:e	Z
    //   71: invokestatic 100	com/tencent/tencentmap/mapsdk/maps/a/bt:a	()Landroid/content/Context;
    //   74: invokevirtual 154	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   77: ldc 117
    //   79: invokevirtual 132	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   82: checkcast 156	android/net/wifi/WifiManager
    //   85: invokevirtual 160	android/net/wifi/WifiManager:getConnectionInfo	()Landroid/net/wifi/WifiInfo;
    //   88: astore_3
    //   89: new 162	java/lang/StringBuilder
    //   92: astore_1
    //   93: aload_1
    //   94: ldc 164
    //   96: invokespecial 165	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   99: aload_1
    //   100: aload_3
    //   101: invokevirtual 170	android/net/wifi/WifiInfo:getSSID	()Ljava/lang/String;
    //   104: invokevirtual 174	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: aload_3
    //   108: invokevirtual 177	android/net/wifi/WifiInfo:getBSSID	()Ljava/lang/String;
    //   111: invokevirtual 174	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: invokevirtual 180	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   117: putstatic 43	com/tencent/tencentmap/mapsdk/maps/a/ce:c	Ljava/lang/String;
    //   120: iload_0
    //   121: getstatic 45	com/tencent/tencentmap/mapsdk/maps/a/ce:d	I
    //   124: if_icmpeq +551 -> 675
    //   127: getstatic 56	com/tencent/tencentmap/mapsdk/maps/a/ce:g	Ljava/util/Map;
    //   130: astore_1
    //   131: aload_1
    //   132: monitorenter
    //   133: getstatic 56	com/tencent/tencentmap/mapsdk/maps/a/ce:g	Ljava/util/Map;
    //   136: invokeinterface 184 1 0
    //   141: invokeinterface 190 1 0
    //   146: astore_3
    //   147: aload_3
    //   148: invokeinterface 195 1 0
    //   153: ifeq +491 -> 644
    //   156: aload_3
    //   157: invokeinterface 199 1 0
    //   162: checkcast 6	com/tencent/tencentmap/mapsdk/maps/a/ce$a
    //   165: astore 4
    //   167: aload 4
    //   169: ifnull -22 -> 147
    //   172: aload 4
    //   174: getstatic 45	com/tencent/tencentmap/mapsdk/maps/a/ce:d	I
    //   177: getstatic 43	com/tencent/tencentmap/mapsdk/maps/a/ce:c	Ljava/lang/String;
    //   180: invokevirtual 202	com/tencent/tencentmap/mapsdk/maps/a/ce$a:a	(ILjava/lang/String;)V
    //   183: goto -36 -> 147
    //   186: astore_3
    //   187: aload_1
    //   188: monitorexit
    //   189: ldc 126
    //   191: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   194: aload_3
    //   195: athrow
    //   196: astore_1
    //   197: ldc 2
    //   199: monitorexit
    //   200: aload_1
    //   201: athrow
    //   202: aload_1
    //   203: invokevirtual 205	android/net/NetworkInfo:getExtraInfo	()Ljava/lang/String;
    //   206: astore_3
    //   207: aload_3
    //   208: ifnull +382 -> 590
    //   211: aload_3
    //   212: invokevirtual 210	java/lang/String:trim	()Ljava/lang/String;
    //   215: invokevirtual 213	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   218: putstatic 39	com/tencent/tencentmap/mapsdk/maps/a/ce:b	Ljava/lang/String;
    //   221: iload_2
    //   222: ifne +343 -> 565
    //   225: new 162	java/lang/StringBuilder
    //   228: astore_3
    //   229: aload_3
    //   230: ldc 215
    //   232: invokespecial 165	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   235: aload_3
    //   236: getstatic 39	com/tencent/tencentmap/mapsdk/maps/a/ce:b	Ljava/lang/String;
    //   239: invokevirtual 174	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: invokevirtual 180	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   245: putstatic 43	com/tencent/tencentmap/mapsdk/maps/a/ce:c	Ljava/lang/String;
    //   248: aload_1
    //   249: invokevirtual 218	android/net/NetworkInfo:getSubtype	()I
    //   252: istore_2
    //   253: iload_2
    //   254: putstatic 49	com/tencent/tencentmap/mapsdk/maps/a/ce:f	I
    //   257: iload_2
    //   258: iconst_1
    //   259: if_icmpeq +13 -> 272
    //   262: iload_2
    //   263: iconst_2
    //   264: if_icmpeq +8 -> 272
    //   267: iload_2
    //   268: iconst_4
    //   269: if_icmpne +124 -> 393
    //   272: iconst_2
    //   273: putstatic 45	com/tencent/tencentmap/mapsdk/maps/a/ce:d	I
    //   276: getstatic 39	com/tencent/tencentmap/mapsdk/maps/a/ce:b	Ljava/lang/String;
    //   279: ldc 220
    //   281: invokevirtual 224	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   284: istore 5
    //   286: iload 5
    //   288: putstatic 47	com/tencent/tencentmap/mapsdk/maps/a/ce:e	Z
    //   291: iload 5
    //   293: ifeq -173 -> 120
    //   296: getstatic 39	com/tencent/tencentmap/mapsdk/maps/a/ce:b	Ljava/lang/String;
    //   299: getstatic 71	com/tencent/tencentmap/mapsdk/maps/a/ce:k	Ljava/lang/String;
    //   302: invokevirtual 224	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   305: ifeq +192 -> 497
    //   308: ldc 226
    //   310: putstatic 63	com/tencent/tencentmap/mapsdk/maps/a/ce:i	Ljava/lang/String;
    //   313: goto -193 -> 120
    //   316: astore_1
    //   317: iload_0
    //   318: getstatic 45	com/tencent/tencentmap/mapsdk/maps/a/ce:d	I
    //   321: if_icmpeq +354 -> 675
    //   324: getstatic 56	com/tencent/tencentmap/mapsdk/maps/a/ce:g	Ljava/util/Map;
    //   327: astore_1
    //   328: aload_1
    //   329: monitorenter
    //   330: getstatic 56	com/tencent/tencentmap/mapsdk/maps/a/ce:g	Ljava/util/Map;
    //   333: invokeinterface 184 1 0
    //   338: invokeinterface 190 1 0
    //   343: astore_3
    //   344: aload_3
    //   345: invokeinterface 195 1 0
    //   350: ifeq +305 -> 655
    //   353: aload_3
    //   354: invokeinterface 199 1 0
    //   359: checkcast 6	com/tencent/tencentmap/mapsdk/maps/a/ce$a
    //   362: astore 4
    //   364: aload 4
    //   366: ifnull -22 -> 344
    //   369: aload 4
    //   371: getstatic 45	com/tencent/tencentmap/mapsdk/maps/a/ce:d	I
    //   374: getstatic 43	com/tencent/tencentmap/mapsdk/maps/a/ce:c	Ljava/lang/String;
    //   377: invokevirtual 202	com/tencent/tencentmap/mapsdk/maps/a/ce$a:a	(ILjava/lang/String;)V
    //   380: goto -36 -> 344
    //   383: astore_3
    //   384: aload_1
    //   385: monitorexit
    //   386: ldc 126
    //   388: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   391: aload_3
    //   392: athrow
    //   393: iload_2
    //   394: bipush 13
    //   396: if_icmpeq +9 -> 405
    //   399: iload_2
    //   400: bipush 19
    //   402: if_icmpne +88 -> 490
    //   405: iconst_4
    //   406: putstatic 45	com/tencent/tencentmap/mapsdk/maps/a/ce:d	I
    //   409: goto -133 -> 276
    //   412: astore 4
    //   414: iload_0
    //   415: getstatic 45	com/tencent/tencentmap/mapsdk/maps/a/ce:d	I
    //   418: if_icmpeq +249 -> 667
    //   421: getstatic 56	com/tencent/tencentmap/mapsdk/maps/a/ce:g	Ljava/util/Map;
    //   424: astore_1
    //   425: aload_1
    //   426: monitorenter
    //   427: getstatic 56	com/tencent/tencentmap/mapsdk/maps/a/ce:g	Ljava/util/Map;
    //   430: invokeinterface 184 1 0
    //   435: invokeinterface 190 1 0
    //   440: astore 6
    //   442: aload 6
    //   444: invokeinterface 195 1 0
    //   449: ifeq +216 -> 665
    //   452: aload 6
    //   454: invokeinterface 199 1 0
    //   459: checkcast 6	com/tencent/tencentmap/mapsdk/maps/a/ce$a
    //   462: astore_3
    //   463: aload_3
    //   464: ifnull -22 -> 442
    //   467: aload_3
    //   468: getstatic 45	com/tencent/tencentmap/mapsdk/maps/a/ce:d	I
    //   471: getstatic 43	com/tencent/tencentmap/mapsdk/maps/a/ce:c	Ljava/lang/String;
    //   474: invokevirtual 202	com/tencent/tencentmap/mapsdk/maps/a/ce$a:a	(ILjava/lang/String;)V
    //   477: goto -35 -> 442
    //   480: astore_3
    //   481: aload_1
    //   482: monitorexit
    //   483: ldc 126
    //   485: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   488: aload_3
    //   489: athrow
    //   490: iconst_3
    //   491: putstatic 45	com/tencent/tencentmap/mapsdk/maps/a/ce:d	I
    //   494: goto -218 -> 276
    //   497: getstatic 39	com/tencent/tencentmap/mapsdk/maps/a/ce:b	Ljava/lang/String;
    //   500: getstatic 67	com/tencent/tencentmap/mapsdk/maps/a/ce:j	Ljava/lang/String;
    //   503: invokevirtual 224	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   506: ifeq +11 -> 517
    //   509: ldc 226
    //   511: putstatic 63	com/tencent/tencentmap/mapsdk/maps/a/ce:i	Ljava/lang/String;
    //   514: goto -394 -> 120
    //   517: getstatic 39	com/tencent/tencentmap/mapsdk/maps/a/ce:b	Ljava/lang/String;
    //   520: getstatic 75	com/tencent/tencentmap/mapsdk/maps/a/ce:l	Ljava/lang/String;
    //   523: invokevirtual 224	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   526: ifeq +11 -> 537
    //   529: ldc 226
    //   531: putstatic 63	com/tencent/tencentmap/mapsdk/maps/a/ce:i	Ljava/lang/String;
    //   534: goto -414 -> 120
    //   537: getstatic 39	com/tencent/tencentmap/mapsdk/maps/a/ce:b	Ljava/lang/String;
    //   540: getstatic 79	com/tencent/tencentmap/mapsdk/maps/a/ce:m	Ljava/lang/String;
    //   543: invokevirtual 224	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   546: ifeq +11 -> 557
    //   549: ldc 228
    //   551: putstatic 63	com/tencent/tencentmap/mapsdk/maps/a/ce:i	Ljava/lang/String;
    //   554: goto -434 -> 120
    //   557: ldc 37
    //   559: putstatic 63	com/tencent/tencentmap/mapsdk/maps/a/ce:i	Ljava/lang/String;
    //   562: goto -442 -> 120
    //   565: ldc 41
    //   567: putstatic 39	com/tencent/tencentmap/mapsdk/maps/a/ce:b	Ljava/lang/String;
    //   570: iconst_0
    //   571: putstatic 45	com/tencent/tencentmap/mapsdk/maps/a/ce:d	I
    //   574: iconst_m1
    //   575: putstatic 49	com/tencent/tencentmap/mapsdk/maps/a/ce:f	I
    //   578: ldc 41
    //   580: putstatic 43	com/tencent/tencentmap/mapsdk/maps/a/ce:c	Ljava/lang/String;
    //   583: iconst_0
    //   584: putstatic 47	com/tencent/tencentmap/mapsdk/maps/a/ce:e	Z
    //   587: goto -467 -> 120
    //   590: ldc 41
    //   592: putstatic 39	com/tencent/tencentmap/mapsdk/maps/a/ce:b	Ljava/lang/String;
    //   595: iconst_0
    //   596: putstatic 45	com/tencent/tencentmap/mapsdk/maps/a/ce:d	I
    //   599: iconst_m1
    //   600: putstatic 49	com/tencent/tencentmap/mapsdk/maps/a/ce:f	I
    //   603: ldc 41
    //   605: putstatic 43	com/tencent/tencentmap/mapsdk/maps/a/ce:c	Ljava/lang/String;
    //   608: iconst_0
    //   609: putstatic 47	com/tencent/tencentmap/mapsdk/maps/a/ce:e	Z
    //   612: goto -492 -> 120
    //   615: ldc 41
    //   617: putstatic 39	com/tencent/tencentmap/mapsdk/maps/a/ce:b	Ljava/lang/String;
    //   620: iconst_0
    //   621: putstatic 45	com/tencent/tencentmap/mapsdk/maps/a/ce:d	I
    //   624: iconst_m1
    //   625: putstatic 49	com/tencent/tencentmap/mapsdk/maps/a/ce:f	I
    //   628: ldc 41
    //   630: putstatic 43	com/tencent/tencentmap/mapsdk/maps/a/ce:c	Ljava/lang/String;
    //   633: iconst_0
    //   634: putstatic 47	com/tencent/tencentmap/mapsdk/maps/a/ce:e	Z
    //   637: iconst_0
    //   638: putstatic 35	com/tencent/tencentmap/mapsdk/maps/a/ce:a	Z
    //   641: goto -521 -> 120
    //   644: aload_1
    //   645: monitorexit
    //   646: ldc 126
    //   648: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   651: ldc 2
    //   653: monitorexit
    //   654: return
    //   655: aload_1
    //   656: monitorexit
    //   657: ldc 126
    //   659: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   662: goto -11 -> 651
    //   665: aload_1
    //   666: monitorexit
    //   667: ldc 126
    //   669: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   672: aload 4
    //   674: athrow
    //   675: ldc 126
    //   677: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   680: goto -29 -> 651
    //
    // Exception table:
    //   from	to	target	type
    //   133	147	186	finally
    //   147	167	186	finally
    //   172	183	186	finally
    //   187	189	186	finally
    //   644	646	186	finally
    //   3	12	196	finally
    //   120	133	196	finally
    //   189	196	196	finally
    //   317	330	196	finally
    //   386	393	196	finally
    //   414	427	196	finally
    //   483	490	196	finally
    //   646	651	196	finally
    //   657	662	196	finally
    //   667	675	196	finally
    //   675	680	196	finally
    //   12	27	316	java/lang/Throwable
    //   31	54	316	java/lang/Throwable
    //   59	120	316	java/lang/Throwable
    //   202	207	316	java/lang/Throwable
    //   211	221	316	java/lang/Throwable
    //   225	257	316	java/lang/Throwable
    //   272	276	316	java/lang/Throwable
    //   276	291	316	java/lang/Throwable
    //   296	313	316	java/lang/Throwable
    //   405	409	316	java/lang/Throwable
    //   490	494	316	java/lang/Throwable
    //   497	514	316	java/lang/Throwable
    //   517	534	316	java/lang/Throwable
    //   537	554	316	java/lang/Throwable
    //   557	562	316	java/lang/Throwable
    //   565	587	316	java/lang/Throwable
    //   590	612	316	java/lang/Throwable
    //   615	641	316	java/lang/Throwable
    //   330	344	383	finally
    //   344	364	383	finally
    //   369	380	383	finally
    //   384	386	383	finally
    //   655	657	383	finally
    //   12	27	412	finally
    //   31	54	412	finally
    //   59	120	412	finally
    //   202	207	412	finally
    //   211	221	412	finally
    //   225	257	412	finally
    //   272	276	412	finally
    //   276	291	412	finally
    //   296	313	412	finally
    //   405	409	412	finally
    //   490	494	412	finally
    //   497	514	412	finally
    //   517	534	412	finally
    //   537	554	412	finally
    //   557	562	412	finally
    //   565	587	412	finally
    //   590	612	412	finally
    //   615	641	412	finally
    //   427	442	480	finally
    //   442	463	480	finally
    //   467	477	480	finally
    //   481	483	480	finally
    //   665	667	480	finally
  }

  public static String f()
  {
    String str = "unknown";
    if (f == -1);
    while (true)
    {
      return str;
      switch (f)
      {
      default:
        break;
      case 0:
        str = "wifi";
        break;
      case 13:
        str = "LTE";
        break;
      case 1:
        str = "GPRS";
        break;
      case 2:
        str = "EDGE";
        break;
      case 4:
        str = "CDMA";
        break;
      case 3:
        str = "UMTS";
        break;
      case 8:
        str = "HSDPA";
        break;
      case 9:
        str = "HSUPA";
        break;
      case 10:
        str = "HSPA";
        break;
      case 5:
        str = "EVDO_0";
        break;
      case 6:
        str = "EVDO_A";
        break;
      case 7:
        str = "1xRTT";
        break;
      case 11:
        str = "iDen";
        break;
      case 12:
        str = "EVDO_B";
        break;
      case 14:
        str = "EHRPD";
        break;
      case 15:
        str = "HSPAP";
      }
    }
  }

  public static int g()
  {
    return d;
  }

  public static boolean h()
  {
    return a;
  }

  public static boolean i()
  {
    return e;
  }

  public static Integer j()
  {
    AppMethodBeat.i(98629);
    e();
    Object localObject1;
    Object localObject2;
    if ((d == 2) || (d == 3) || (d == 4))
    {
      n = 1;
      if (n == 0)
        break label278;
      localObject1 = bt.a();
      localObject2 = b;
      localObject1 = (TelephonyManager)((Context)localObject1).getSystemService("phone");
      if ((localObject1 == null) || (((TelephonyManager)localObject1).getSimState() != 5))
        break label161;
      localObject1 = ((TelephonyManager)localObject1).getSimOperator();
      if (((String)localObject1).length() <= 0)
        break label161;
      if ((!((String)localObject1).equals("46000")) && (!((String)localObject1).equals("46002")))
        break label125;
      localObject2 = Integer.valueOf(1);
    }
    label104: for (int n = ((Integer)localObject2).intValue(); ; n = 0)
    {
      AppMethodBeat.o(98629);
      return Integer.valueOf(n);
      n = 0;
      break;
      label125: if (((String)localObject1).equals("46001"))
      {
        localObject2 = Integer.valueOf(2);
        break label104;
      }
      if (((String)localObject1).equals("46003"))
      {
        localObject2 = Integer.valueOf(3);
        break label104;
      }
      if (localObject2 != null)
      {
        localObject2 = ((String)localObject2).toLowerCase();
        if ((((String)localObject2).contains("cmnet")) || (((String)localObject2).contains("cmwap")))
        {
          localObject2 = Integer.valueOf(1);
          break label104;
        }
        if ((((String)localObject2).contains("uninet")) || (((String)localObject2).contains("uniwap")) || (((String)localObject2).contains("3gnet")) || (((String)localObject2).contains("3gwap")))
        {
          localObject2 = Integer.valueOf(2);
          break label104;
        }
        if ((((String)localObject2).contains("ctnet")) || (((String)localObject2).contains("ctwap")))
        {
          localObject2 = Integer.valueOf(3);
          break label104;
        }
      }
      localObject2 = Integer.valueOf(0);
      break label104;
    }
  }

  public static Proxy k()
  {
    AppMethodBeat.i(98630);
    Proxy localProxy;
    if ((e) && (!TextUtils.isEmpty(i)))
    {
      localProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(i, 80));
      AppMethodBeat.o(98630);
    }
    while (true)
    {
      return localProxy;
      localProxy = null;
      AppMethodBeat.o(98630);
    }
  }

  public static boolean l()
  {
    AppMethodBeat.i(98631);
    try
    {
      PowerManager localPowerManager = (PowerManager)bt.a().getSystemService("power");
      if ((Build.VERSION.SDK_INT >= 23) && (localPowerManager != null))
      {
        bool = ((Boolean)PowerManager.class.getDeclaredMethod("isDeviceIdleMode", new Class[0]).invoke(localPowerManager, new Object[0])).booleanValue();
        AppMethodBeat.o(98631);
        return bool;
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        AppMethodBeat.o(98631);
        boolean bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ce
 * JD-Core Version:    0.6.2
 */