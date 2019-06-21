package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.k;
import java.nio.channels.FileLock;

class bv
{
  private static bv a;
  private static FileLock e = null;
  private bw b;
  private boolean c;
  private boolean d;

  public static bv a()
  {
    AppMethodBeat.i(65041);
    if (a == null);
    try
    {
      if (a == null)
      {
        localbv = new com/tencent/smtt/sdk/bv;
        localbv.<init>();
        a = localbv;
      }
      bv localbv = a;
      AppMethodBeat.o(65041);
      return localbv;
    }
    finally
    {
      AppMethodBeat.o(65041);
    }
  }

  public bw a(boolean paramBoolean)
  {
    AppMethodBeat.i(65042);
    bw localbw;
    if (paramBoolean)
    {
      localbw = this.b;
      AppMethodBeat.o(65042);
    }
    while (true)
    {
      return localbw;
      localbw = c();
      AppMethodBeat.o(65042);
    }
  }

  public FileLock a(Context paramContext)
  {
    AppMethodBeat.i(65044);
    TbsLog.i("X5CoreEngine", "tryTbsCoreLoadFileLock ##");
    if (e != null)
    {
      paramContext = e;
      AppMethodBeat.o(65044);
    }
    while (true)
    {
      return paramContext;
      try
      {
        if (e != null)
        {
          paramContext = k.e(paramContext);
          e = paramContext;
          if (paramContext != null)
            break label73;
          TbsLog.i("X5CoreEngine", "init -- sTbsCoreLoadFileLock failed!");
        }
        while (true)
        {
          paramContext = e;
          AppMethodBeat.o(65044);
          break;
          label73: TbsLog.i("X5CoreEngine", "init -- sTbsCoreLoadFileLock succeeded!");
        }
      }
      finally
      {
        AppMethodBeat.o(65044);
      }
    }
    throw paramContext;
  }

  // ERROR //
  public void a(Context paramContext, am paramam)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: monitorenter
    //   4: ldc 67
    //   6: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: ldc 46
    //   11: ldc 69
    //   13: invokestatic 53	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   16: aload_2
    //   17: ifnull +10 -> 27
    //   20: aload_2
    //   21: ldc 71
    //   23: iconst_2
    //   24: invokevirtual 76	com/tencent/smtt/sdk/am:a	(Ljava/lang/String;B)V
    //   27: iconst_1
    //   28: invokestatic 81	com/tencent/smtt/sdk/o:a	(Z)Lcom/tencent/smtt/sdk/o;
    //   31: astore 4
    //   33: aload 4
    //   35: aload_1
    //   36: iconst_0
    //   37: iconst_0
    //   38: aload_2
    //   39: invokevirtual 84	com/tencent/smtt/sdk/o:a	(Landroid/content/Context;ZZLcom/tencent/smtt/sdk/am;)V
    //   42: new 86	java/lang/StringBuilder
    //   45: astore 5
    //   47: aload 5
    //   49: invokespecial 87	java/lang/StringBuilder:<init>	()V
    //   52: aload_2
    //   53: ifnull +10 -> 63
    //   56: aload_2
    //   57: ldc 89
    //   59: iconst_1
    //   60: invokevirtual 76	com/tencent/smtt/sdk/am:a	(Ljava/lang/String;B)V
    //   63: aload 4
    //   65: invokevirtual 92	com/tencent/smtt/sdk/o:a	()Lcom/tencent/smtt/sdk/bi;
    //   68: astore 6
    //   70: aload 4
    //   72: invokevirtual 95	com/tencent/smtt/sdk/o:b	()Z
    //   75: ifeq +437 -> 512
    //   78: aload 6
    //   80: ifnull +432 -> 512
    //   83: aload_0
    //   84: getfield 97	com/tencent/smtt/sdk/bv:d	Z
    //   87: ifne +438 -> 525
    //   90: aload_2
    //   91: ifnull +8 -> 99
    //   94: aload_2
    //   95: iconst_1
    //   96: putfield 99	com/tencent/smtt/sdk/am:a	Z
    //   99: new 101	com/tencent/smtt/sdk/bw
    //   102: astore 7
    //   104: aload 7
    //   106: aload 6
    //   108: invokevirtual 106	com/tencent/smtt/sdk/bi:b	()Lcom/tencent/smtt/export/external/DexLoader;
    //   111: invokespecial 109	com/tencent/smtt/sdk/bw:<init>	(Lcom/tencent/smtt/export/external/DexLoader;)V
    //   114: aload_0
    //   115: aload 7
    //   117: putfield 39	com/tencent/smtt/sdk/bv:b	Lcom/tencent/smtt/sdk/bw;
    //   120: aload_0
    //   121: aload_0
    //   122: getfield 39	com/tencent/smtt/sdk/bv:b	Lcom/tencent/smtt/sdk/bw;
    //   125: invokevirtual 111	com/tencent/smtt/sdk/bw:a	()Z
    //   128: putfield 113	com/tencent/smtt/sdk/bv:c	Z
    //   131: aload_0
    //   132: getfield 113	com/tencent/smtt/sdk/bv:c	Z
    //   135: ifne +11 -> 146
    //   138: aload 5
    //   140: ldc 115
    //   142: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: pop
    //   146: aconst_null
    //   147: astore 7
    //   149: aload 7
    //   151: astore 8
    //   153: aload_0
    //   154: getfield 113	com/tencent/smtt/sdk/bv:c	Z
    //   157: ifeq +22 -> 179
    //   160: invokestatic 125	com/tencent/smtt/sdk/CookieManager:getInstance	()Lcom/tencent/smtt/sdk/CookieManager;
    //   163: aload_1
    //   164: iconst_1
    //   165: iconst_1
    //   166: invokevirtual 128	com/tencent/smtt/sdk/CookieManager:a	(Landroid/content/Context;ZZ)V
    //   169: invokestatic 125	com/tencent/smtt/sdk/CookieManager:getInstance	()Lcom/tencent/smtt/sdk/CookieManager;
    //   172: invokevirtual 130	com/tencent/smtt/sdk/CookieManager:a	()V
    //   175: aload 7
    //   177: astore 8
    //   179: new 86	java/lang/StringBuilder
    //   182: astore 7
    //   184: aload 7
    //   186: ldc 132
    //   188: invokespecial 135	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   191: ldc 46
    //   193: aload 7
    //   195: aload_0
    //   196: getfield 113	com/tencent/smtt/sdk/bv:c	Z
    //   199: invokevirtual 138	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   202: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   205: invokestatic 53	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   208: aload_0
    //   209: getfield 113	com/tencent/smtt/sdk/bv:c	Z
    //   212: ifne +451 -> 663
    //   215: ldc 46
    //   217: ldc 144
    //   219: invokestatic 146	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   222: aload 4
    //   224: invokevirtual 95	com/tencent/smtt/sdk/o:b	()Z
    //   227: istore 9
    //   229: iload 9
    //   231: ifeq +351 -> 582
    //   234: aload 6
    //   236: ifnull +346 -> 582
    //   239: aload 8
    //   241: ifnonnull +341 -> 582
    //   244: aload 6
    //   246: invokevirtual 106	com/tencent/smtt/sdk/bi:b	()Lcom/tencent/smtt/export/external/DexLoader;
    //   249: astore 8
    //   251: aload_3
    //   252: astore 7
    //   254: aload 8
    //   256: ifnull +22 -> 278
    //   259: aload 8
    //   261: ldc 148
    //   263: ldc 150
    //   265: iconst_0
    //   266: anewarray 152	java/lang/Class
    //   269: iconst_0
    //   270: anewarray 4	java/lang/Object
    //   273: invokevirtual 158	com/tencent/smtt/export/external/DexLoader:invokeStaticMethod	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    //   276: astore 7
    //   278: aload 7
    //   280: instanceof 66
    //   283: ifeq +61 -> 344
    //   286: aload 7
    //   288: checkcast 66	java/lang/Throwable
    //   291: astore 8
    //   293: new 86	java/lang/StringBuilder
    //   296: astore_3
    //   297: aload_3
    //   298: ldc 160
    //   300: invokespecial 135	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   303: aload 5
    //   305: aload_3
    //   306: aload 8
    //   308: invokevirtual 163	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   311: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   314: ldc 165
    //   316: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   319: aload 8
    //   321: invokevirtual 169	java/lang/Throwable:getCause	()Ljava/lang/Throwable;
    //   324: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   327: ldc 174
    //   329: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   332: aload 8
    //   334: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   337: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   340: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: pop
    //   344: aload 7
    //   346: instanceof 176
    //   349: ifeq +19 -> 368
    //   352: aload 5
    //   354: ldc 178
    //   356: aload 7
    //   358: invokestatic 182	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   361: invokevirtual 186	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   364: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   367: pop
    //   368: aload 5
    //   370: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   373: ldc 188
    //   375: invokevirtual 192	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   378: ifeq +153 -> 531
    //   381: invokestatic 197	com/tencent/smtt/sdk/TbsCoreLoadStat:getInstance	()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;
    //   384: astore 8
    //   386: new 66	java/lang/Throwable
    //   389: astore_3
    //   390: new 86	java/lang/StringBuilder
    //   393: astore 7
    //   395: aload 7
    //   397: ldc 199
    //   399: invokespecial 135	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   402: aload_3
    //   403: aload 7
    //   405: aload 5
    //   407: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   410: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   413: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   416: invokespecial 200	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   419: aload 8
    //   421: aload_1
    //   422: sipush 408
    //   425: aload_3
    //   426: invokevirtual 203	com/tencent/smtt/sdk/TbsCoreLoadStat:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   429: aload_0
    //   430: iconst_1
    //   431: putfield 97	com/tencent/smtt/sdk/bv:d	Z
    //   434: aload_2
    //   435: ifnull +10 -> 445
    //   438: aload_2
    //   439: ldc 89
    //   441: iconst_2
    //   442: invokevirtual 76	com/tencent/smtt/sdk/am:a	(Ljava/lang/String;B)V
    //   445: ldc 67
    //   447: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   450: aload_0
    //   451: monitorexit
    //   452: return
    //   453: astore 7
    //   455: aload_0
    //   456: iconst_1
    //   457: putfield 113	com/tencent/smtt/sdk/bv:c	Z
    //   460: aconst_null
    //   461: astore 7
    //   463: goto -314 -> 149
    //   466: astore 7
    //   468: aload_0
    //   469: iconst_0
    //   470: putfield 113	com/tencent/smtt/sdk/bv:c	Z
    //   473: new 86	java/lang/StringBuilder
    //   476: astore 8
    //   478: aload 8
    //   480: ldc 205
    //   482: invokespecial 135	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   485: aload 5
    //   487: aload 8
    //   489: aload 7
    //   491: invokestatic 211	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   494: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   497: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   500: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   503: pop
    //   504: goto -355 -> 149
    //   507: astore_1
    //   508: aload_0
    //   509: monitorexit
    //   510: aload_1
    //   511: athrow
    //   512: aload_0
    //   513: iconst_0
    //   514: putfield 113	com/tencent/smtt/sdk/bv:c	Z
    //   517: aload 5
    //   519: ldc 213
    //   521: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   524: pop
    //   525: aconst_null
    //   526: astore 8
    //   528: goto -349 -> 179
    //   531: invokestatic 197	com/tencent/smtt/sdk/TbsCoreLoadStat:getInstance	()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;
    //   534: astore 8
    //   536: new 66	java/lang/Throwable
    //   539: astore_3
    //   540: new 86	java/lang/StringBuilder
    //   543: astore 7
    //   545: aload 7
    //   547: ldc 199
    //   549: invokespecial 135	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   552: aload_3
    //   553: aload 7
    //   555: aload 5
    //   557: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   560: invokevirtual 119	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   563: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   566: invokespecial 200	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   569: aload 8
    //   571: aload_1
    //   572: sipush 407
    //   575: aload_3
    //   576: invokevirtual 203	com/tencent/smtt/sdk/TbsCoreLoadStat:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   579: goto -150 -> 429
    //   582: aload 4
    //   584: invokevirtual 95	com/tencent/smtt/sdk/o:b	()Z
    //   587: ifeq +39 -> 626
    //   590: invokestatic 197	com/tencent/smtt/sdk/TbsCoreLoadStat:getInstance	()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;
    //   593: astore 7
    //   595: new 66	java/lang/Throwable
    //   598: astore_3
    //   599: aload_3
    //   600: ldc 215
    //   602: aload 8
    //   604: invokestatic 182	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   607: invokevirtual 186	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   610: invokespecial 200	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   613: aload 7
    //   615: aload_1
    //   616: sipush 409
    //   619: aload_3
    //   620: invokevirtual 203	com/tencent/smtt/sdk/TbsCoreLoadStat:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   623: goto -194 -> 429
    //   626: invokestatic 197	com/tencent/smtt/sdk/TbsCoreLoadStat:getInstance	()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;
    //   629: astore_3
    //   630: new 66	java/lang/Throwable
    //   633: astore 7
    //   635: aload 7
    //   637: ldc 217
    //   639: aload 8
    //   641: invokestatic 182	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   644: invokevirtual 186	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   647: invokespecial 200	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   650: aload_3
    //   651: aload_1
    //   652: sipush 410
    //   655: aload 7
    //   657: invokevirtual 203	com/tencent/smtt/sdk/TbsCoreLoadStat:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   660: goto -231 -> 429
    //   663: new 86	java/lang/StringBuilder
    //   666: astore 7
    //   668: aload 7
    //   670: ldc 219
    //   672: invokespecial 135	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   675: ldc 46
    //   677: aload 7
    //   679: getstatic 17	com/tencent/smtt/sdk/bv:e	Ljava/nio/channels/FileLock;
    //   682: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   685: invokevirtual 142	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   688: invokestatic 53	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   691: getstatic 17	com/tencent/smtt/sdk/bv:e	Ljava/nio/channels/FileLock;
    //   694: ifnonnull -265 -> 429
    //   697: aload_0
    //   698: aload_1
    //   699: invokevirtual 221	com/tencent/smtt/sdk/bv:a	(Landroid/content/Context;)Ljava/nio/channels/FileLock;
    //   702: pop
    //   703: goto -274 -> 429
    //   706: astore 7
    //   708: goto -340 -> 368
    //
    // Exception table:
    //   from	to	target	type
    //   120	146	453	java/lang/NoSuchMethodException
    //   120	146	466	java/lang/Throwable
    //   4	16	507	finally
    //   20	27	507	finally
    //   27	52	507	finally
    //   56	63	507	finally
    //   63	78	507	finally
    //   83	90	507	finally
    //   94	99	507	finally
    //   99	120	507	finally
    //   120	146	507	finally
    //   153	175	507	finally
    //   179	229	507	finally
    //   244	251	507	finally
    //   259	278	507	finally
    //   278	344	507	finally
    //   344	368	507	finally
    //   368	429	507	finally
    //   429	434	507	finally
    //   438	445	507	finally
    //   445	450	507	finally
    //   455	460	507	finally
    //   468	504	507	finally
    //   512	525	507	finally
    //   531	579	507	finally
    //   582	623	507	finally
    //   626	660	507	finally
    //   663	703	507	finally
    //   244	251	706	java/lang/Throwable
    //   259	278	706	java/lang/Throwable
    //   278	344	706	java/lang/Throwable
    //   344	368	706	java/lang/Throwable
  }

  public boolean b()
  {
    if (QbSdk.a);
    for (boolean bool = false; ; bool = this.c)
      return bool;
  }

  public bw c()
  {
    if (QbSdk.a);
    for (bw localbw = null; ; localbw = this.b)
      return localbw;
  }

  boolean d()
  {
    return this.d;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.bv
 * JD-Core Version:    0.6.2
 */