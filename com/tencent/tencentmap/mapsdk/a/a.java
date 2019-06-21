package com.tencent.tencentmap.mapsdk.a;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.ag;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class a
{
  protected static String a = null;
  public static boolean b = false;
  private static String c = null;
  private static String d = null;
  private static Boolean e = null;
  private static int f = 0;
  private static String g = "";

  public static String a()
  {
    AppMethodBeat.i(97753);
    Object localObject;
    if (!"".equals(g))
    {
      localObject = g;
      AppMethodBeat.o(97753);
    }
    while (true)
    {
      return localObject;
      try
      {
        if (f == 0)
          f = Process.myPid();
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        g = g + f + "_";
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append(g);
        Date localDate = new java/util/Date;
        localDate.<init>();
        g = localDate.getTime();
        label109: localObject = g;
        AppMethodBeat.o(97753);
      }
      catch (Exception localException)
      {
        break label109;
      }
    }
  }

  // ERROR //
  public static String a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 93
    //   5: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_0
    //   9: ifnonnull +16 -> 25
    //   12: ldc 29
    //   14: astore_0
    //   15: ldc 93
    //   17: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   20: ldc 2
    //   22: monitorexit
    //   23: aload_0
    //   24: areturn
    //   25: ldc 29
    //   27: astore_1
    //   28: aload_0
    //   29: invokevirtual 99	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   32: astore_2
    //   33: aload_0
    //   34: ldc 101
    //   36: iconst_0
    //   37: invokevirtual 105	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   40: ldc 107
    //   42: ldc 29
    //   44: invokeinterface 113 3 0
    //   49: astore_3
    //   50: aload_3
    //   51: astore 4
    //   53: aload_3
    //   54: ldc 29
    //   56: invokevirtual 53	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   59: ifeq +34 -> 93
    //   62: ldc 115
    //   64: astore 4
    //   66: aload_0
    //   67: ldc 101
    //   69: iconst_0
    //   70: invokevirtual 105	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   73: invokeinterface 119 1 0
    //   78: ldc 107
    //   80: ldc 115
    //   82: invokeinterface 125 3 0
    //   87: invokeinterface 129 1 0
    //   92: pop
    //   93: ldc 131
    //   95: aload 4
    //   97: invokestatic 135	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   100: invokevirtual 139	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   103: iconst_0
    //   104: anewarray 4	java/lang/Object
    //   107: invokestatic 144	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   110: aload 4
    //   112: ldc 29
    //   114: invokevirtual 53	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   117: ifne +316 -> 433
    //   120: aload_2
    //   121: aload 4
    //   123: invokevirtual 150	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   126: astore 4
    //   128: aload 4
    //   130: astore_3
    //   131: new 152	java/util/Properties
    //   134: astore_2
    //   135: aload 4
    //   137: astore_3
    //   138: aload_2
    //   139: invokespecial 153	java/util/Properties:<init>	()V
    //   142: aload 4
    //   144: astore_3
    //   145: aload_2
    //   146: aload 4
    //   148: invokevirtual 157	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   151: aload 4
    //   153: astore_3
    //   154: aload_2
    //   155: ldc 159
    //   157: ldc 29
    //   159: invokevirtual 162	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   162: astore_2
    //   163: aload_2
    //   164: astore_1
    //   165: aload 4
    //   167: astore_3
    //   168: ldc 164
    //   170: aload_1
    //   171: invokestatic 135	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   174: invokevirtual 139	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   177: iconst_0
    //   178: anewarray 4	java/lang/Object
    //   181: invokestatic 144	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   184: aload 4
    //   186: astore_3
    //   187: ldc 29
    //   189: aload_1
    //   190: invokevirtual 53	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   193: istore 5
    //   195: iload 5
    //   197: ifne +37 -> 234
    //   200: aload 4
    //   202: ifnull +8 -> 210
    //   205: aload 4
    //   207: invokevirtual 169	java/io/InputStream:close	()V
    //   210: ldc 93
    //   212: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   215: aload_1
    //   216: astore_0
    //   217: goto -197 -> 20
    //   220: astore_0
    //   221: ldc 2
    //   223: monitorexit
    //   224: aload_0
    //   225: athrow
    //   226: astore_0
    //   227: aload_0
    //   228: invokestatic 172	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   231: goto -21 -> 210
    //   234: aload_1
    //   235: astore_3
    //   236: aload 4
    //   238: ifnull +190 -> 428
    //   241: aload 4
    //   243: invokevirtual 169	java/io/InputStream:close	()V
    //   246: aload_0
    //   247: invokevirtual 176	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   250: aload_0
    //   251: invokevirtual 179	android/content/Context:getPackageName	()Ljava/lang/String;
    //   254: sipush 128
    //   257: invokevirtual 185	android/content/pm/PackageManager:getApplicationInfo	(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   260: getfield 191	android/content/pm/ApplicationInfo:metaData	Landroid/os/Bundle;
    //   263: ldc 193
    //   265: invokevirtual 199	android/os/Bundle:get	(Ljava/lang/String;)Ljava/lang/Object;
    //   268: astore 4
    //   270: aload_1
    //   271: astore_0
    //   272: aload 4
    //   274: ifnull +9 -> 283
    //   277: aload 4
    //   279: invokevirtual 200	java/lang/Object:toString	()Ljava/lang/String;
    //   282: astore_0
    //   283: ldc 93
    //   285: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   288: goto -268 -> 20
    //   291: astore 4
    //   293: aload 4
    //   295: invokestatic 172	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   298: goto -52 -> 246
    //   301: astore 4
    //   303: aconst_null
    //   304: astore 4
    //   306: aload 4
    //   308: astore_3
    //   309: aload_0
    //   310: ldc 101
    //   312: iconst_0
    //   313: invokevirtual 105	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   316: invokeinterface 119 1 0
    //   321: ldc 107
    //   323: ldc 29
    //   325: invokeinterface 125 3 0
    //   330: invokeinterface 129 1 0
    //   335: pop
    //   336: aload 4
    //   338: astore_3
    //   339: ldc 202
    //   341: iconst_0
    //   342: anewarray 4	java/lang/Object
    //   345: invokestatic 204	com/tencent/tencentmap/mapsdk/maps/a/ag:c	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   348: aload_1
    //   349: astore_3
    //   350: aload 4
    //   352: ifnull +76 -> 428
    //   355: aload 4
    //   357: invokevirtual 169	java/io/InputStream:close	()V
    //   360: goto -114 -> 246
    //   363: astore 4
    //   365: aload 4
    //   367: invokestatic 172	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   370: goto -124 -> 246
    //   373: astore_0
    //   374: aconst_null
    //   375: astore_1
    //   376: aload_1
    //   377: ifnull +7 -> 384
    //   380: aload_1
    //   381: invokevirtual 169	java/io/InputStream:close	()V
    //   384: ldc 93
    //   386: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   389: aload_0
    //   390: athrow
    //   391: astore_1
    //   392: aload_1
    //   393: invokestatic 172	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   396: goto -12 -> 384
    //   399: astore_0
    //   400: ldc 206
    //   402: iconst_0
    //   403: anewarray 4	java/lang/Object
    //   406: invokestatic 144	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   409: aload_1
    //   410: astore_0
    //   411: goto -128 -> 283
    //   414: astore_0
    //   415: aload_3
    //   416: astore_1
    //   417: goto -41 -> 376
    //   420: astore_3
    //   421: goto -115 -> 306
    //   424: astore_3
    //   425: goto -119 -> 306
    //   428: aload_3
    //   429: astore_1
    //   430: goto -184 -> 246
    //   433: aconst_null
    //   434: astore 4
    //   436: goto -202 -> 234
    //
    // Exception table:
    //   from	to	target	type
    //   3	8	220	finally
    //   15	20	220	finally
    //   28	33	220	finally
    //   205	210	220	finally
    //   210	215	220	finally
    //   227	231	220	finally
    //   241	246	220	finally
    //   246	270	220	finally
    //   277	283	220	finally
    //   283	288	220	finally
    //   293	298	220	finally
    //   355	360	220	finally
    //   365	370	220	finally
    //   380	384	220	finally
    //   384	391	220	finally
    //   392	396	220	finally
    //   400	409	220	finally
    //   205	210	226	java/io/IOException
    //   241	246	291	java/io/IOException
    //   33	50	301	java/lang/Exception
    //   53	62	301	java/lang/Exception
    //   66	93	301	java/lang/Exception
    //   93	128	301	java/lang/Exception
    //   355	360	363	java/io/IOException
    //   33	50	373	finally
    //   53	62	373	finally
    //   66	93	373	finally
    //   93	128	373	finally
    //   380	384	391	java/io/IOException
    //   246	270	399	java/lang/Throwable
    //   277	283	399	java/lang/Throwable
    //   131	135	414	finally
    //   138	142	414	finally
    //   145	151	414	finally
    //   154	163	414	finally
    //   168	184	414	finally
    //   187	195	414	finally
    //   309	336	414	finally
    //   339	348	414	finally
    //   131	135	420	java/lang/Exception
    //   138	142	420	java/lang/Exception
    //   145	151	420	java/lang/Exception
    //   154	163	420	java/lang/Exception
    //   168	184	424	java/lang/Exception
    //   187	195	424	java/lang/Exception
  }

  public static void a(Context paramContext, String paramString)
  {
    AppMethodBeat.i(97761);
    paramContext.getSharedPreferences("DENGTA_META", 0).edit().putString("querytimes", paramString).commit();
    AppMethodBeat.o(97761);
  }

  public static void a(String paramString)
  {
    AppMethodBeat.i(97750);
    try
    {
      a = paramString;
      c localc = c.m();
      if (localc != null)
        localc.a(paramString);
      AppMethodBeat.o(97750);
      return;
    }
    finally
    {
      AppMethodBeat.o(97750);
    }
    throw paramString;
  }

  public static boolean a(Context paramContext, int paramInt)
  {
    AppMethodBeat.i(97755);
    try
    {
      Iterator localIterator = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses().iterator();
      do
      {
        ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo;
        do
        {
          if (!localIterator.hasNext())
            break;
          localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
        }
        while (localRunningAppProcessInfo.pid != paramInt);
        bool = localRunningAppProcessInfo.processName.split(":")[0].equals(i(paramContext).split(":")[0]);
      }
      while (!bool);
      bool = true;
      AppMethodBeat.o(97755);
      return bool;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        AppMethodBeat.o(97755);
        boolean bool = false;
      }
    }
  }

  public static boolean a(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(97759);
    boolean bool = paramContext.getSharedPreferences("DENGTA_META", 0).edit().putString(paramString1, paramString2).commit();
    AppMethodBeat.o(97759);
    return bool;
  }

  public static String b(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(97760);
    paramContext = paramContext.getSharedPreferences("DENGTA_META", 0).getString(paramString1, paramString2);
    AppMethodBeat.o(97760);
    return paramContext;
  }

  public static void b(Context paramContext, String paramString)
  {
    AppMethodBeat.i(97762);
    paramContext.getSharedPreferences("DENGTA_META", 0).edit().putString("initsdkdate", paramString).commit();
    AppMethodBeat.o(97762);
  }

  // ERROR //
  public static boolean b(Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: ldc 2
    //   6: monitorenter
    //   7: ldc_w 273
    //   10: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   13: aload_0
    //   14: ifnonnull +26 -> 40
    //   17: ldc_w 275
    //   20: iconst_0
    //   21: anewarray 4	java/lang/Object
    //   24: invokestatic 277	com/tencent/tencentmap/mapsdk/maps/a/ag:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   27: ldc_w 273
    //   30: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   33: iload_2
    //   34: istore_1
    //   35: ldc 2
    //   37: monitorexit
    //   38: iload_1
    //   39: ireturn
    //   40: aload_0
    //   41: ldc 101
    //   43: iconst_4
    //   44: invokevirtual 105	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   47: ldc_w 279
    //   50: aconst_null
    //   51: invokeinterface 113 3 0
    //   56: astore_3
    //   57: invokestatic 283	com/tencent/tencentmap/mapsdk/maps/a/an:d	()Ljava/lang/String;
    //   60: astore 4
    //   62: aload_3
    //   63: ifnull +29 -> 92
    //   66: aload_3
    //   67: aload 4
    //   69: invokevirtual 53	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   72: istore_2
    //   73: iload_2
    //   74: ifeq +18 -> 92
    //   77: ldc_w 273
    //   80: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   83: goto -48 -> 35
    //   86: astore_0
    //   87: ldc 2
    //   89: monitorexit
    //   90: aload_0
    //   91: athrow
    //   92: iconst_1
    //   93: istore_1
    //   94: aload_0
    //   95: ldc 101
    //   97: iconst_0
    //   98: invokevirtual 105	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   101: invokeinterface 119 1 0
    //   106: astore_0
    //   107: aload_0
    //   108: ldc_w 279
    //   111: aload 4
    //   113: invokeinterface 125 3 0
    //   118: pop
    //   119: aload_0
    //   120: invokeinterface 129 1 0
    //   125: pop
    //   126: iconst_1
    //   127: istore_1
    //   128: goto -51 -> 77
    //   131: astore_0
    //   132: iconst_0
    //   133: istore_1
    //   134: ldc_w 285
    //   137: iconst_0
    //   138: anewarray 4	java/lang/Object
    //   141: invokestatic 287	com/tencent/tencentmap/mapsdk/maps/a/ag:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   144: aload_0
    //   145: invokestatic 172	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   148: goto -71 -> 77
    //   151: astore_0
    //   152: goto -18 -> 134
    //
    // Exception table:
    //   from	to	target	type
    //   7	13	86	finally
    //   17	33	86	finally
    //   40	62	86	finally
    //   66	73	86	finally
    //   77	83	86	finally
    //   94	126	86	finally
    //   134	148	86	finally
    //   40	62	131	java/lang/Exception
    //   66	73	131	java/lang/Exception
    //   94	126	151	java/lang/Exception
  }

  public static void c(Context paramContext, String paramString)
  {
    AppMethodBeat.i(97763);
    paramContext.getSharedPreferences("DENGTA_META", 0).edit().putString("pid_stat", paramString).commit();
    AppMethodBeat.o(97763);
  }

  // ERROR //
  public static boolean c(Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: ldc_w 291
    //   7: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: ifnonnull +23 -> 34
    //   14: ldc_w 275
    //   17: iconst_0
    //   18: anewarray 4	java/lang/Object
    //   21: invokestatic 277	com/tencent/tencentmap/mapsdk/maps/a/ag:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   24: ldc_w 291
    //   27: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   30: iload_2
    //   31: istore_1
    //   32: iload_1
    //   33: ireturn
    //   34: aload_0
    //   35: ldc 101
    //   37: iconst_0
    //   38: invokevirtual 105	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   41: ldc_w 293
    //   44: aconst_null
    //   45: invokeinterface 113 3 0
    //   50: astore_3
    //   51: aload_0
    //   52: invokestatic 296	com/tencent/tencentmap/mapsdk/a/a:j	(Landroid/content/Context;)Ljava/lang/String;
    //   55: astore 4
    //   57: aload_3
    //   58: ifnull +23 -> 81
    //   61: aload_3
    //   62: aload 4
    //   64: invokevirtual 53	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   67: istore_2
    //   68: iload_2
    //   69: ifeq +12 -> 81
    //   72: ldc_w 291
    //   75: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   78: goto -46 -> 32
    //   81: iconst_1
    //   82: istore_1
    //   83: aload_0
    //   84: ldc 101
    //   86: iconst_0
    //   87: invokevirtual 105	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   90: invokeinterface 119 1 0
    //   95: astore_0
    //   96: aload_0
    //   97: ldc_w 293
    //   100: aload 4
    //   102: invokeinterface 125 3 0
    //   107: pop
    //   108: aload_0
    //   109: invokeinterface 129 1 0
    //   114: pop
    //   115: iconst_1
    //   116: istore_1
    //   117: goto -45 -> 72
    //   120: astore_0
    //   121: iconst_0
    //   122: istore_1
    //   123: ldc_w 285
    //   126: iconst_0
    //   127: anewarray 4	java/lang/Object
    //   130: invokestatic 287	com/tencent/tencentmap/mapsdk/maps/a/ag:b	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   133: aload_0
    //   134: invokestatic 172	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   137: goto -65 -> 72
    //   140: astore_0
    //   141: goto -18 -> 123
    //
    // Exception table:
    //   from	to	target	type
    //   34	57	120	java/lang/Exception
    //   61	68	120	java/lang/Exception
    //   83	115	140	java/lang/Exception
  }

  public static String d(Context paramContext)
  {
    AppMethodBeat.i(97747);
    if (paramContext == null)
    {
      paramContext = null;
      AppMethodBeat.o(97747);
    }
    while (true)
    {
      return paramContext;
      paramContext = paramContext.getPackageName();
      AppMethodBeat.o(97747);
    }
  }

  private static boolean d(Context paramContext, String paramString)
  {
    boolean bool1 = true;
    AppMethodBeat.i(97757);
    boolean bool2;
    boolean bool3;
    if ((paramContext != null) && (paramString != null))
      if (paramContext.checkPermission(paramString, Process.myPid(), Process.myUid()) == 0)
      {
        bool2 = true;
        bool3 = bool2;
        if (bool2);
      }
    label187: 
    while (true)
    {
      try
      {
        paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 4096).requestedPermissions;
        if (paramContext == null)
          break label187;
        int i = paramContext.length;
        int j = 0;
        if (j >= i)
          break label187;
        bool3 = paramString.equals(paramContext[j]);
        if (bool3)
        {
          bool2 = bool1;
          ag.b("AppInfo.isContainReadLogPermission() end", new Object[0]);
          bool3 = bool2;
          AppMethodBeat.o(97757);
          return bool3;
          bool2 = false;
          break;
        }
        j++;
        continue;
      }
      catch (Throwable paramContext)
      {
        ag.a(paramContext);
        ag.b("AppInfo.isContainReadLogPermission() end", new Object[0]);
        bool3 = bool2;
        continue;
      }
      finally
      {
        ag.b("AppInfo.isContainReadLogPermission() end", new Object[0]);
        AppMethodBeat.o(97757);
      }
      ag.d("context or permission is null.", new Object[0]);
      AppMethodBeat.o(97757);
      bool3 = false;
    }
  }

  public static String e(Context paramContext)
  {
    AppMethodBeat.i(97748);
    if (c == null)
      c = j(paramContext);
    paramContext = c;
    AppMethodBeat.o(97748);
    return paramContext;
  }

  private static boolean e(Context paramContext, String paramString)
  {
    AppMethodBeat.i(97758);
    boolean bool;
    if ((paramContext == null) || (paramString == null) || (paramString.trim().length() <= 0))
    {
      AppMethodBeat.o(97758);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        paramContext = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
        if ((paramContext == null) || (paramContext.size() == 0))
        {
          ag.b("no running proc", new Object[0]);
          AppMethodBeat.o(97758);
          bool = false;
        }
        else
        {
          paramContext = paramContext.iterator();
          label163: 
          while (true)
          {
            if (!paramContext.hasNext())
              break label187;
            Object localObject = (ActivityManager.RunningAppProcessInfo)paramContext.next();
            if (((ActivityManager.RunningAppProcessInfo)localObject).importance == 100)
            {
              localObject = ((ActivityManager.RunningAppProcessInfo)localObject).pkgList;
              int i = localObject.length;
              for (int j = 0; ; j++)
              {
                if (j >= i)
                  break label163;
                bool = paramString.equals(localObject[j]);
                if (bool)
                {
                  AppMethodBeat.o(97758);
                  bool = true;
                  break;
                }
              }
            }
          }
        }
      }
      catch (Throwable paramContext)
      {
        ag.a(paramContext);
        ag.d("Failed to judge }[%s]", new Object[] { paramContext.getLocalizedMessage() });
        label187: AppMethodBeat.o(97758);
        bool = false;
      }
    }
  }

  public static boolean f(Context paramContext)
  {
    try
    {
      AppMethodBeat.i(97751);
      ag.b("Read phone state permission check! start ", new Object[0]);
      if (e == null)
        e = Boolean.valueOf(d(paramContext, "android.permission.READ_PHONE_STATE"));
      boolean bool = e.booleanValue();
      AppMethodBeat.o(97751);
      return bool;
    }
    finally
    {
    }
    throw paramContext;
  }

  public static boolean g(Context paramContext)
  {
    AppMethodBeat.i(97752);
    boolean bool = e(paramContext, paramContext.getPackageName());
    AppMethodBeat.o(97752);
    return bool;
  }

  public static int h(Context paramContext)
  {
    AppMethodBeat.i(97754);
    try
    {
      if (f == 0)
        f = Process.myPid();
      Iterator localIterator = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses().iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        paramContext = (ActivityManager.RunningAppProcessInfo)localIterator.next();
      }
      while (paramContext.pid != f);
      i = paramContext.importance;
      AppMethodBeat.o(97754);
      return i;
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        int i = 0;
        AppMethodBeat.o(97754);
      }
    }
  }

  public static String i(Context paramContext)
  {
    AppMethodBeat.i(97756);
    if (d != null)
    {
      paramContext = d;
      AppMethodBeat.o(97756);
    }
    while (true)
    {
      return paramContext;
      try
      {
        if (f == 0)
          f = Process.myPid();
        Iterator localIterator = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses().iterator();
        while (localIterator.hasNext())
        {
          paramContext = (ActivityManager.RunningAppProcessInfo)localIterator.next();
          if (paramContext.pid == f)
          {
            paramContext = paramContext.processName;
            d = paramContext;
            AppMethodBeat.o(97756);
          }
        }
      }
      catch (Throwable paramContext)
      {
        ag.a(paramContext);
        paramContext = "";
        AppMethodBeat.o(97756);
      }
    }
  }

  // ERROR //
  private static String j(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc_w 367
    //   6: invokestatic 47	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: ifnonnull +55 -> 65
    //   13: aconst_null
    //   14: astore_1
    //   15: aload_0
    //   16: invokevirtual 176	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   19: aload_1
    //   20: iconst_0
    //   21: invokevirtual 310	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   24: astore_1
    //   25: aload_1
    //   26: getfield 370	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   29: astore_0
    //   30: aload_1
    //   31: getfield 373	android/content/pm/PackageInfo:versionCode	I
    //   34: istore_2
    //   35: aload_0
    //   36: ifnull +13 -> 49
    //   39: aload_0
    //   40: invokevirtual 325	java/lang/String:trim	()Ljava/lang/String;
    //   43: invokevirtual 328	java/lang/String:length	()I
    //   46: ifgt +27 -> 73
    //   49: iload_2
    //   50: invokestatic 376	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   53: astore_0
    //   54: ldc_w 367
    //   57: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   60: ldc 2
    //   62: monitorexit
    //   63: aload_0
    //   64: areturn
    //   65: aload_0
    //   66: invokevirtual 179	android/content/Context:getPackageName	()Ljava/lang/String;
    //   69: astore_1
    //   70: goto -55 -> 15
    //   73: aload_0
    //   74: invokevirtual 325	java/lang/String:trim	()Ljava/lang/String;
    //   77: bipush 10
    //   79: bipush 32
    //   81: invokevirtual 380	java/lang/String:replace	(CC)Ljava/lang/String;
    //   84: bipush 13
    //   86: bipush 32
    //   88: invokevirtual 380	java/lang/String:replace	(CC)Ljava/lang/String;
    //   91: ldc_w 382
    //   94: ldc_w 384
    //   97: invokevirtual 387	java/lang/String:replace	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   100: astore_0
    //   101: aload_0
    //   102: invokevirtual 391	java/lang/String:toCharArray	()[C
    //   105: astore_1
    //   106: iconst_0
    //   107: istore_3
    //   108: iconst_0
    //   109: istore 4
    //   111: iload_3
    //   112: aload_1
    //   113: arraylength
    //   114: if_icmpge +31 -> 145
    //   117: iload 4
    //   119: istore 5
    //   121: aload_1
    //   122: iload_3
    //   123: caload
    //   124: bipush 46
    //   126: if_icmpne +9 -> 135
    //   129: iload 4
    //   131: iconst_1
    //   132: iadd
    //   133: istore 5
    //   135: iinc 3 1
    //   138: iload 5
    //   140: istore 4
    //   142: goto -31 -> 111
    //   145: iload 4
    //   147: iconst_3
    //   148: if_icmpge +104 -> 252
    //   151: ldc_w 393
    //   154: iconst_1
    //   155: anewarray 4	java/lang/Object
    //   158: dup
    //   159: iconst_0
    //   160: iload_2
    //   161: invokestatic 398	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   164: aastore
    //   165: invokestatic 144	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   168: new 64	java/lang/StringBuilder
    //   171: astore_1
    //   172: aload_1
    //   173: invokespecial 65	java/lang/StringBuilder:<init>	()V
    //   176: aload_1
    //   177: aload_0
    //   178: invokevirtual 69	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: ldc_w 400
    //   184: invokevirtual 69	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: iload_2
    //   188: invokevirtual 72	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   191: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   194: astore_0
    //   195: ldc_w 402
    //   198: iconst_1
    //   199: anewarray 4	java/lang/Object
    //   202: dup
    //   203: iconst_0
    //   204: aload_0
    //   205: aastore
    //   206: invokestatic 144	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   209: ldc_w 367
    //   212: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   215: goto -155 -> 60
    //   218: astore_0
    //   219: ldc 2
    //   221: monitorexit
    //   222: aload_0
    //   223: athrow
    //   224: astore_0
    //   225: aload_0
    //   226: invokestatic 172	com/tencent/tencentmap/mapsdk/maps/a/ag:a	(Ljava/lang/Throwable;)V
    //   229: aload_0
    //   230: invokevirtual 403	java/lang/Exception:toString	()Ljava/lang/String;
    //   233: iconst_0
    //   234: anewarray 4	java/lang/Object
    //   237: invokestatic 277	com/tencent/tencentmap/mapsdk/maps/a/ag:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   240: ldc 29
    //   242: astore_0
    //   243: ldc_w 367
    //   246: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   249: goto -189 -> 60
    //   252: goto -57 -> 195
    //
    // Exception table:
    //   from	to	target	type
    //   3	9	218	finally
    //   15	35	218	finally
    //   39	49	218	finally
    //   54	60	218	finally
    //   65	70	218	finally
    //   73	106	218	finally
    //   111	117	218	finally
    //   151	195	218	finally
    //   195	209	218	finally
    //   209	215	218	finally
    //   225	240	218	finally
    //   243	249	218	finally
    //   15	35	224	java/lang/Exception
    //   39	49	224	java/lang/Exception
    //   73	106	224	java/lang/Exception
    //   111	117	224	java/lang/Exception
    //   151	195	224	java/lang/Exception
    //   195	209	224	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.a
 * JD-Core Version:    0.6.2
 */