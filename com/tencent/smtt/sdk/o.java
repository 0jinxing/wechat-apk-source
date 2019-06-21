package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

class o
{
  static boolean a = false;
  private static o d = null;
  private static int g = 0;
  private static int h = 0;
  private static int i = 3;
  private static String k = null;
  private bi b = null;
  private bi c = null;
  private boolean e = false;
  private boolean f = false;
  private File j = null;

  public static o a(boolean paramBoolean)
  {
    AppMethodBeat.i(64072);
    if ((d == null) && (paramBoolean));
    try
    {
      if (d == null)
      {
        localo = new com/tencent/smtt/sdk/o;
        localo.<init>();
        d = localo;
      }
      o localo = d;
      AppMethodBeat.o(64072);
      return localo;
    }
    finally
    {
      AppMethodBeat.o(64072);
    }
  }

  static void a(int paramInt)
  {
    g = paramInt;
  }

  private void b(int paramInt)
  {
    AppMethodBeat.i(64077);
    Properties localProperties = new Properties();
    localProperties.setProperty(k, String.valueOf(paramInt));
    try
    {
      FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
      File localFile = new java/io/File;
      localFile.<init>(this.j, "count.prop");
      localFileOutputStream.<init>(localFile);
      localProperties.store(localFileOutputStream, null);
      AppMethodBeat.o(64077);
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      while (true)
        AppMethodBeat.o(64077);
    }
    catch (IOException localIOException)
    {
      while (true)
        AppMethodBeat.o(64077);
    }
  }

  public static int d()
  {
    return g;
  }

  // ERROR //
  private int i()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: ldc 98
    //   4: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aconst_null
    //   8: astore_2
    //   9: new 82	java/io/File
    //   12: astore_3
    //   13: aload_3
    //   14: aload_0
    //   15: getfield 49	com/tencent/smtt/sdk/o:j	Ljava/io/File;
    //   18: ldc 84
    //   20: invokespecial 87	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   23: aload_3
    //   24: invokevirtual 102	java/io/File:exists	()Z
    //   27: istore 4
    //   29: iload 4
    //   31: ifne +14 -> 45
    //   34: ldc 98
    //   36: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   39: iload_1
    //   40: istore 5
    //   42: iload 5
    //   44: ireturn
    //   45: new 104	java/io/FileInputStream
    //   48: astore 6
    //   50: aload 6
    //   52: aload_3
    //   53: invokespecial 105	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   56: new 107	java/io/BufferedInputStream
    //   59: astore_3
    //   60: aload_3
    //   61: aload 6
    //   63: invokespecial 110	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   66: new 67	java/util/Properties
    //   69: astore 6
    //   71: aload 6
    //   73: invokespecial 68	java/util/Properties:<init>	()V
    //   76: aload 6
    //   78: aload_3
    //   79: invokevirtual 113	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   82: aload 6
    //   84: getstatic 35	com/tencent/smtt/sdk/o:k	Ljava/lang/String;
    //   87: ldc 115
    //   89: invokevirtual 119	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   92: invokestatic 124	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   95: invokevirtual 127	java/lang/Integer:intValue	()I
    //   98: istore 5
    //   100: aload_3
    //   101: invokevirtual 130	java/io/BufferedInputStream:close	()V
    //   104: ldc 98
    //   106: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   109: goto -67 -> 42
    //   112: astore_3
    //   113: aconst_null
    //   114: astore_3
    //   115: aload_3
    //   116: ifnull +7 -> 123
    //   119: aload_3
    //   120: invokevirtual 130	java/io/BufferedInputStream:close	()V
    //   123: ldc 98
    //   125: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   128: iload_1
    //   129: istore 5
    //   131: goto -89 -> 42
    //   134: astore_3
    //   135: aload_2
    //   136: ifnull +7 -> 143
    //   139: aload_2
    //   140: invokevirtual 130	java/io/BufferedInputStream:close	()V
    //   143: ldc 98
    //   145: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   148: aload_3
    //   149: athrow
    //   150: astore_3
    //   151: goto -47 -> 104
    //   154: astore_3
    //   155: goto -32 -> 123
    //   158: astore 6
    //   160: goto -17 -> 143
    //   163: astore 6
    //   165: aload_3
    //   166: astore_2
    //   167: aload 6
    //   169: astore_3
    //   170: goto -35 -> 135
    //   173: astore 6
    //   175: goto -60 -> 115
    //
    // Exception table:
    //   from	to	target	type
    //   9	29	112	java/lang/Exception
    //   45	66	112	java/lang/Exception
    //   9	29	134	finally
    //   45	66	134	finally
    //   100	104	150	java/io/IOException
    //   119	123	154	java/io/IOException
    //   139	143	158	java/io/IOException
    //   66	100	163	finally
    //   66	100	173	java/lang/Exception
  }

  public bi a()
  {
    if (this.e);
    for (bi localbi = this.b; ; localbi = null)
      return localbi;
  }

  // ERROR //
  public void a(android.content.Context paramContext, boolean paramBoolean1, boolean paramBoolean2, am paramam)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 135
    //   4: invokestatic 56	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: sipush 999
    //   10: aconst_null
    //   11: iconst_0
    //   12: anewarray 4	java/lang/Object
    //   15: invokestatic 141	com/tencent/smtt/utils/TbsLog:addLog	(ILjava/lang/String;[Ljava/lang/Object;)V
    //   18: aload_1
    //   19: invokestatic 145	com/tencent/smtt/utils/TbsLog:initIfNeed	(Landroid/content/Context;)V
    //   22: new 147	java/lang/StringBuilder
    //   25: astore 5
    //   27: aload 5
    //   29: ldc 149
    //   31: invokespecial 152	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   34: ldc 154
    //   36: aload 5
    //   38: aload_1
    //   39: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   42: ldc 160
    //   44: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: iload_3
    //   48: invokevirtual 166	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   51: invokevirtual 170	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   54: invokestatic 173	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   57: getstatic 29	com/tencent/smtt/sdk/o:h	I
    //   60: iconst_1
    //   61: iadd
    //   62: putstatic 29	com/tencent/smtt/sdk/o:h	I
    //   65: aload 4
    //   67: ifnull +20 -> 87
    //   70: getstatic 29	com/tencent/smtt/sdk/o:h	I
    //   73: iconst_1
    //   74: if_icmpne +220 -> 294
    //   77: iconst_1
    //   78: istore 6
    //   80: aload 4
    //   82: iload 6
    //   84: putfield 177	com/tencent/smtt/sdk/am:b	Z
    //   87: invokestatic 183	com/tencent/smtt/sdk/TbsCoreLoadStat:getInstance	()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;
    //   90: invokevirtual 185	com/tencent/smtt/sdk/TbsCoreLoadStat:a	()V
    //   93: aload 4
    //   95: ifnull +11 -> 106
    //   98: aload 4
    //   100: ldc 187
    //   102: iconst_1
    //   103: invokevirtual 190	com/tencent/smtt/sdk/am:a	(Ljava/lang/String;B)V
    //   106: invokestatic 195	com/tencent/smtt/sdk/an:a	()Lcom/tencent/smtt/sdk/an;
    //   109: astore 5
    //   111: getstatic 29	com/tencent/smtt/sdk/o:h	I
    //   114: iconst_1
    //   115: if_icmpne +185 -> 300
    //   118: iconst_1
    //   119: istore 6
    //   121: aload 5
    //   123: aload_1
    //   124: iload 6
    //   126: invokevirtual 198	com/tencent/smtt/sdk/an:b	(Landroid/content/Context;Z)V
    //   129: invokestatic 195	com/tencent/smtt/sdk/an:a	()Lcom/tencent/smtt/sdk/an;
    //   132: aload_1
    //   133: invokevirtual 201	com/tencent/smtt/sdk/an:l	(Landroid/content/Context;)V
    //   136: aload 4
    //   138: ifnull +11 -> 149
    //   141: aload 4
    //   143: ldc 187
    //   145: iconst_2
    //   146: invokevirtual 190	com/tencent/smtt/sdk/am:a	(Ljava/lang/String;B)V
    //   149: aload_1
    //   150: iconst_1
    //   151: invokestatic 206	com/tencent/smtt/sdk/TbsShareManager:forceToLoadX5ForThirdApp	(Landroid/content/Context;Z)V
    //   154: aload 4
    //   156: ifnull +11 -> 167
    //   159: aload 4
    //   161: ldc 208
    //   163: iconst_1
    //   164: invokevirtual 190	com/tencent/smtt/sdk/am:a	(Ljava/lang/String;B)V
    //   167: aload_1
    //   168: iload_2
    //   169: iload_3
    //   170: invokestatic 213	com/tencent/smtt/sdk/QbSdk:a	(Landroid/content/Context;ZZ)Z
    //   173: istore 7
    //   175: aload 4
    //   177: ifnull +11 -> 188
    //   180: aload 4
    //   182: ldc 208
    //   184: iconst_2
    //   185: invokevirtual 190	com/tencent/smtt/sdk/am:a	(Ljava/lang/String;B)V
    //   188: getstatic 218	android/os/Build$VERSION:SDK_INT	I
    //   191: bipush 7
    //   193: if_icmplt +113 -> 306
    //   196: iconst_1
    //   197: istore_3
    //   198: iload 7
    //   200: ifeq +111 -> 311
    //   203: iload_3
    //   204: ifeq +107 -> 311
    //   207: iconst_1
    //   208: istore_2
    //   209: iload_2
    //   210: istore 6
    //   212: iload_2
    //   213: ifeq +61 -> 274
    //   216: invokestatic 224	java/lang/System:currentTimeMillis	()J
    //   219: lstore 8
    //   221: invokestatic 195	com/tencent/smtt/sdk/an:a	()Lcom/tencent/smtt/sdk/an;
    //   224: aload_1
    //   225: invokestatic 226	com/tencent/smtt/sdk/o:d	()I
    //   228: invokevirtual 229	com/tencent/smtt/sdk/an:e	(Landroid/content/Context;I)Z
    //   231: istore 6
    //   233: new 147	java/lang/StringBuilder
    //   236: astore 5
    //   238: aload 5
    //   240: ldc 231
    //   242: invokespecial 152	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   245: ldc 154
    //   247: aload 5
    //   249: iload 6
    //   251: invokevirtual 166	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   254: ldc 233
    //   256: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   259: invokestatic 224	java/lang/System:currentTimeMillis	()J
    //   262: lload 8
    //   264: lsub
    //   265: invokevirtual 236	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   268: invokevirtual 170	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   271: invokestatic 173	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   274: iload 6
    //   276: ifeq +465 -> 741
    //   279: aload_0
    //   280: getfield 45	com/tencent/smtt/sdk/o:e	Z
    //   283: ifeq +33 -> 316
    //   286: ldc 135
    //   288: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   291: aload_0
    //   292: monitorexit
    //   293: return
    //   294: iconst_0
    //   295: istore 6
    //   297: goto -217 -> 80
    //   300: iconst_0
    //   301: istore 6
    //   303: goto -182 -> 121
    //   306: iconst_0
    //   307: istore_3
    //   308: goto -110 -> 198
    //   311: iconst_0
    //   312: istore_2
    //   313: goto -104 -> 209
    //   316: aload_1
    //   317: invokestatic 240	com/tencent/smtt/sdk/TbsShareManager:isThirdPartyApp	(Landroid/content/Context;)Z
    //   320: ifeq +233 -> 553
    //   323: sipush 995
    //   326: aconst_null
    //   327: iconst_0
    //   328: anewarray 4	java/lang/Object
    //   331: invokestatic 141	com/tencent/smtt/utils/TbsLog:addLog	(ILjava/lang/String;[Ljava/lang/Object;)V
    //   334: aload 4
    //   336: ifnull +11 -> 347
    //   339: aload 4
    //   341: ldc 242
    //   343: iconst_1
    //   344: invokevirtual 190	com/tencent/smtt/sdk/am:a	(Ljava/lang/String;B)V
    //   347: aload_1
    //   348: invokestatic 244	com/tencent/smtt/sdk/TbsShareManager:j	(Landroid/content/Context;)Z
    //   351: istore_2
    //   352: aload 4
    //   354: ifnull +11 -> 365
    //   357: aload 4
    //   359: ldc 242
    //   361: iconst_2
    //   362: invokevirtual 190	com/tencent/smtt/sdk/am:a	(Ljava/lang/String;B)V
    //   365: iload_2
    //   366: ifeq +62 -> 428
    //   369: new 82	java/io/File
    //   372: astore 10
    //   374: aload 10
    //   376: aload_1
    //   377: invokestatic 247	com/tencent/smtt/sdk/TbsShareManager:c	(Landroid/content/Context;)Ljava/lang/String;
    //   380: invokespecial 248	java/io/File:<init>	(Ljava/lang/String;)V
    //   383: invokestatic 195	com/tencent/smtt/sdk/an:a	()Lcom/tencent/smtt/sdk/an;
    //   386: aload_1
    //   387: invokevirtual 252	com/tencent/smtt/sdk/an:r	(Landroid/content/Context;)Ljava/io/File;
    //   390: astore 11
    //   392: aload_1
    //   393: invokestatic 255	com/tencent/smtt/sdk/TbsShareManager:e	(Landroid/content/Context;)Landroid/content/Context;
    //   396: astore 5
    //   398: aload 11
    //   400: ifnonnull +48 -> 448
    //   403: aload_0
    //   404: iconst_0
    //   405: putfield 45	com/tencent/smtt/sdk/o:e	Z
    //   408: aload_1
    //   409: ldc_w 257
    //   412: invokestatic 260	com/tencent/smtt/sdk/QbSdk:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   415: ldc 135
    //   417: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   420: goto -129 -> 291
    //   423: astore_1
    //   424: aload_0
    //   425: monitorexit
    //   426: aload_1
    //   427: athrow
    //   428: aload_0
    //   429: iconst_0
    //   430: putfield 45	com/tencent/smtt/sdk/o:e	Z
    //   433: aload_1
    //   434: ldc_w 262
    //   437: invokestatic 260	com/tencent/smtt/sdk/QbSdk:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   440: ldc 135
    //   442: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   445: goto -154 -> 291
    //   448: aload_1
    //   449: aload 5
    //   451: aload 10
    //   453: invokevirtual 265	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   456: invokestatic 269	com/tencent/smtt/sdk/QbSdk:getDexLoaderFileList	(Landroid/content/Context;Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/String;
    //   459: astore 12
    //   461: invokestatic 272	com/tencent/smtt/sdk/TbsShareManager:getHostCorePathAppDefined	()Ljava/lang/String;
    //   464: ifnull +178 -> 642
    //   467: invokestatic 272	com/tencent/smtt/sdk/TbsShareManager:getHostCorePathAppDefined	()Ljava/lang/String;
    //   470: astore 11
    //   472: ldc 154
    //   474: ldc_w 274
    //   477: aload 11
    //   479: invokestatic 277	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   482: invokevirtual 281	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   485: invokestatic 173	com/tencent/smtt/utils/TbsLog:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   488: aload_0
    //   489: getfield 43	com/tencent/smtt/sdk/o:c	Lcom/tencent/smtt/sdk/bi;
    //   492: ifnull +160 -> 652
    //   495: aload_0
    //   496: aload_0
    //   497: getfield 43	com/tencent/smtt/sdk/o:c	Lcom/tencent/smtt/sdk/bi;
    //   500: putfield 41	com/tencent/smtt/sdk/o:b	Lcom/tencent/smtt/sdk/bi;
    //   503: aload_0
    //   504: getfield 41	com/tencent/smtt/sdk/o:b	Lcom/tencent/smtt/sdk/bi;
    //   507: aload_1
    //   508: aload 5
    //   510: aload 10
    //   512: invokevirtual 265	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   515: aload 11
    //   517: aload 12
    //   519: getstatic 283	com/tencent/smtt/sdk/QbSdk:d	Ljava/lang/String;
    //   522: aload 4
    //   524: invokevirtual 288	com/tencent/smtt/sdk/bi:a	(Landroid/content/Context;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lcom/tencent/smtt/sdk/am;)V
    //   527: aload_0
    //   528: iconst_1
    //   529: putfield 45	com/tencent/smtt/sdk/o:e	Z
    //   532: aload_0
    //   533: aload_1
    //   534: invokestatic 291	com/tencent/smtt/sdk/an:t	(Landroid/content/Context;)Ljava/io/File;
    //   537: putfield 49	com/tencent/smtt/sdk/o:j	Ljava/io/File;
    //   540: aload_0
    //   541: iconst_1
    //   542: putfield 47	com/tencent/smtt/sdk/o:f	Z
    //   545: ldc 135
    //   547: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   550: goto -259 -> 291
    //   553: sipush 996
    //   556: aconst_null
    //   557: iconst_0
    //   558: anewarray 4	java/lang/Object
    //   561: invokestatic 141	com/tencent/smtt/utils/TbsLog:addLog	(ILjava/lang/String;[Ljava/lang/Object;)V
    //   564: invokestatic 195	com/tencent/smtt/sdk/an:a	()Lcom/tencent/smtt/sdk/an;
    //   567: aload_1
    //   568: invokevirtual 252	com/tencent/smtt/sdk/an:r	(Landroid/content/Context;)Ljava/io/File;
    //   571: astore 10
    //   573: getstatic 27	com/tencent/smtt/sdk/o:g	I
    //   576: sipush 25436
    //   579: if_icmpeq +12 -> 591
    //   582: getstatic 27	com/tencent/smtt/sdk/o:g	I
    //   585: sipush 25437
    //   588: if_icmpne +42 -> 630
    //   591: iconst_1
    //   592: istore 13
    //   594: iload 13
    //   596: ifeq +40 -> 636
    //   599: aload_1
    //   600: invokevirtual 297	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   603: astore 5
    //   605: aload 10
    //   607: ifnonnull +234 -> 841
    //   610: aload_0
    //   611: iconst_0
    //   612: putfield 45	com/tencent/smtt/sdk/o:e	Z
    //   615: aload_1
    //   616: ldc_w 299
    //   619: invokestatic 260	com/tencent/smtt/sdk/QbSdk:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   622: ldc 135
    //   624: invokestatic 60	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   627: goto -336 -> 291
    //   630: iconst_0
    //   631: istore 13
    //   633: goto -39 -> 594
    //   636: aload_1
    //   637: astore 5
    //   639: goto -34 -> 605
    //   642: aload 11
    //   644: invokevirtual 265	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   647: astore 11
    //   649: goto -177 -> 472
    //   652: new 285	com/tencent/smtt/sdk/bi
    //   655: astore 14
    //   657: aload 14
    //   659: aload_1
    //   660: aload 5
    //   662: aload 10
    //   664: invokevirtual 265	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   667: aload 11
    //   669: aload 12
    //   671: getstatic 283	com/tencent/smtt/sdk/QbSdk:d	Ljava/lang/String;
    //   674: aload 4
    //   676: invokespecial 301	com/tencent/smtt/sdk/bi:<init>	(Landroid/content/Context;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Lcom/tencent/smtt/sdk/am;)V
    //   679: aload_0
    //   680: aload 14
    //   682: putfield 41	com/tencent/smtt/sdk/o:b	Lcom/tencent/smtt/sdk/bi;
    //   685: goto -158 -> 527
    //   688: astore 4
    //   690: ldc 154
    //   692: ldc_w 303
    //   695: aload 4
    //   697: invokestatic 277	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   700: invokevirtual 281	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   703: invokestatic 305	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   706: invokestatic 183	com/tencent/smtt/sdk/TbsCoreLoadStat:getInstance	()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;
    //   709: aload_1
    //   710: sipush 327
    //   713: aload 4
    //   715: invokevirtual 308	com/tencent/smtt/sdk/TbsCoreLoadStat:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   718: aload_0
    //   719: iconst_0
    //   720: putfield 45	com/tencent/smtt/sdk/o:e	Z
    //   723: aload_1
    //   724: ldc_w 310
    //   727: aload 4
    //   729: invokestatic 277	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   732: invokevirtual 281	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   735: invokestatic 260	com/tencent/smtt/sdk/QbSdk:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   738: goto -206 -> 532
    //   741: new 147	java/lang/StringBuilder
    //   744: astore 4
    //   746: aload 4
    //   748: ldc_w 312
    //   751: invokespecial 152	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   754: aload 4
    //   756: iload 7
    //   758: invokevirtual 166	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   761: ldc_w 314
    //   764: invokevirtual 163	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   767: iload_3
    //   768: invokevirtual 166	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   771: invokevirtual 170	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   774: astore 5
    //   776: ldc 154
    //   778: ldc_w 316
    //   781: aload 5
    //   783: invokestatic 277	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   786: invokevirtual 281	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   789: invokestatic 305	com/tencent/smtt/utils/TbsLog:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   792: getstatic 317	com/tencent/smtt/sdk/QbSdk:a	Z
    //   795: ifeq +10 -> 805
    //   798: aload_0
    //   799: getfield 45	com/tencent/smtt/sdk/o:e	Z
    //   802: ifne -270 -> 532
    //   805: aload_0
    //   806: iconst_0
    //   807: putfield 45	com/tencent/smtt/sdk/o:e	Z
    //   810: invokestatic 183	com/tencent/smtt/sdk/TbsCoreLoadStat:getInstance	()Lcom/tencent/smtt/sdk/TbsCoreLoadStat;
    //   813: astore 10
    //   815: new 134	java/lang/Throwable
    //   818: astore 4
    //   820: aload 4
    //   822: aload 5
    //   824: invokespecial 318	java/lang/Throwable:<init>	(Ljava/lang/String;)V
    //   827: aload 10
    //   829: aload_1
    //   830: sipush 405
    //   833: aload 4
    //   835: invokevirtual 308	com/tencent/smtt/sdk/TbsCoreLoadStat:a	(Landroid/content/Context;ILjava/lang/Throwable;)V
    //   838: goto -306 -> 532
    //   841: aload 10
    //   843: astore 11
    //   845: goto -397 -> 448
    //
    // Exception table:
    //   from	to	target	type
    //   2	65	423	finally
    //   70	77	423	finally
    //   80	87	423	finally
    //   87	93	423	finally
    //   98	106	423	finally
    //   106	118	423	finally
    //   121	136	423	finally
    //   141	149	423	finally
    //   149	154	423	finally
    //   159	167	423	finally
    //   167	175	423	finally
    //   180	188	423	finally
    //   188	196	423	finally
    //   216	274	423	finally
    //   279	291	423	finally
    //   316	334	423	finally
    //   339	347	423	finally
    //   347	352	423	finally
    //   357	365	423	finally
    //   369	398	423	finally
    //   403	415	423	finally
    //   415	420	423	finally
    //   428	440	423	finally
    //   440	445	423	finally
    //   448	472	423	finally
    //   472	527	423	finally
    //   527	532	423	finally
    //   532	550	423	finally
    //   553	591	423	finally
    //   599	605	423	finally
    //   610	622	423	finally
    //   622	627	423	finally
    //   642	649	423	finally
    //   652	685	423	finally
    //   690	738	423	finally
    //   741	805	423	finally
    //   805	838	423	finally
    //   316	334	688	java/lang/Throwable
    //   339	347	688	java/lang/Throwable
    //   347	352	688	java/lang/Throwable
    //   357	365	688	java/lang/Throwable
    //   369	398	688	java/lang/Throwable
    //   403	415	688	java/lang/Throwable
    //   428	440	688	java/lang/Throwable
    //   448	472	688	java/lang/Throwable
    //   472	527	688	java/lang/Throwable
    //   527	532	688	java/lang/Throwable
    //   553	591	688	java/lang/Throwable
    //   599	605	688	java/lang/Throwable
    //   610	622	688	java/lang/Throwable
    //   642	649	688	java/lang/Throwable
    //   652	685	688	java/lang/Throwable
  }

  void a(String paramString)
  {
    k = paramString;
  }

  public boolean b()
  {
    return this.e;
  }

  boolean b(boolean paramBoolean)
  {
    a = paramBoolean;
    return paramBoolean;
  }

  bi c()
  {
    return this.b;
  }

  public String e()
  {
    AppMethodBeat.i(64074);
    String str;
    if ((this.b == null) || (QbSdk.a))
    {
      str = "system webview get nothing...";
      AppMethodBeat.o(64074);
    }
    while (true)
    {
      return str;
      str = this.b.a();
      AppMethodBeat.o(64074);
    }
  }

  boolean f()
  {
    boolean bool = false;
    AppMethodBeat.i(64075);
    if (a)
      if (k == null)
        AppMethodBeat.o(64075);
    while (true)
    {
      return bool;
      int m = i();
      if (m == 0)
        b(1);
      while (true)
      {
        bool = a;
        AppMethodBeat.o(64075);
        break;
        if (m + 1 > i)
          break label74;
        b(m + 1);
      }
      label74: AppMethodBeat.o(64075);
    }
  }

  boolean g()
  {
    return this.f;
  }

  public boolean h()
  {
    AppMethodBeat.i(64078);
    boolean bool = QbSdk.useSoftWare();
    AppMethodBeat.o(64078);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.o
 * JD-Core Version:    0.6.2
 */