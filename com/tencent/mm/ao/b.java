package com.tencent.mm.ao;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.c.g;
import com.tencent.mm.g.a.bf;
import com.tencent.mm.pluginsdk.g.a.a.b.c;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import org.json.JSONObject;

public class b
{
  public static final String fAI;
  public static final String fAJ;
  public static final String fAK;
  public static final String fAL;
  private static b fAM;
  private String fAN;
  public boolean fAO;
  public c<bf> fAP;

  static
  {
    AppMethodBeat.i(62293);
    fAI = com.tencent.mm.compatible.util.e.eSk + "fonts/";
    fAJ = fAI + "temp/";
    fAK = fAI + "WXkatonglemiao.ttf";
    fAL = fAI + "WXxiari.ttf";
    AppMethodBeat.o(62293);
  }

  public b()
  {
    AppMethodBeat.i(62285);
    this.fAN = "emoji_font_meta.json";
    this.fAO = false;
    this.fAP = new b.1(this);
    AppMethodBeat.o(62285);
  }

  // ERROR //
  private static boolean aJ(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 91
    //   2: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_2
    //   7: aconst_null
    //   8: astore_3
    //   9: aconst_null
    //   10: astore 4
    //   12: aload_2
    //   13: astore 5
    //   15: aload_3
    //   16: astore 6
    //   18: new 93	java/io/File
    //   21: astore 7
    //   23: aload_2
    //   24: astore 5
    //   26: aload_3
    //   27: astore 6
    //   29: aload 7
    //   31: aload_1
    //   32: invokespecial 96	java/io/File:<init>	(Ljava/lang/String;)V
    //   35: aload_2
    //   36: astore 5
    //   38: aload_3
    //   39: astore 6
    //   41: aload 7
    //   43: invokevirtual 100	java/io/File:mkdirs	()Z
    //   46: pop
    //   47: aload_2
    //   48: astore 5
    //   50: aload_3
    //   51: astore 6
    //   53: new 93	java/io/File
    //   56: astore_1
    //   57: aload_2
    //   58: astore 5
    //   60: aload_3
    //   61: astore 6
    //   63: aload_1
    //   64: aload_0
    //   65: invokespecial 96	java/io/File:<init>	(Ljava/lang/String;)V
    //   68: aload_2
    //   69: astore 5
    //   71: aload_3
    //   72: astore 6
    //   74: new 102	java/util/zip/ZipFile
    //   77: astore 8
    //   79: aload_2
    //   80: astore 5
    //   82: aload_3
    //   83: astore 6
    //   85: aload 8
    //   87: aload_1
    //   88: iconst_1
    //   89: invokespecial 105	java/util/zip/ZipFile:<init>	(Ljava/io/File;I)V
    //   92: aload_2
    //   93: astore 5
    //   95: aload_3
    //   96: astore 6
    //   98: aload 8
    //   100: invokevirtual 109	java/util/zip/ZipFile:entries	()Ljava/util/Enumeration;
    //   103: astore_3
    //   104: aload 4
    //   106: astore_0
    //   107: aload_0
    //   108: astore 5
    //   110: aload_0
    //   111: astore 6
    //   113: aload_3
    //   114: invokeinterface 114 1 0
    //   119: ifeq +477 -> 596
    //   122: aload_0
    //   123: astore 5
    //   125: aload_0
    //   126: astore 6
    //   128: aload_3
    //   129: invokeinterface 118 1 0
    //   134: checkcast 120	java/util/zip/ZipEntry
    //   137: astore_2
    //   138: aload_0
    //   139: astore 5
    //   141: aload_0
    //   142: astore 6
    //   144: ldc 122
    //   146: ldc 124
    //   148: iconst_1
    //   149: anewarray 4	java/lang/Object
    //   152: dup
    //   153: iconst_0
    //   154: aload_2
    //   155: invokevirtual 127	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   158: aastore
    //   159: invokestatic 132	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   162: aload_0
    //   163: astore 5
    //   165: aload_0
    //   166: astore 6
    //   168: aload_2
    //   169: invokevirtual 127	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   172: ldc 134
    //   174: invokevirtual 140	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   177: ifne +21 -> 198
    //   180: aload_0
    //   181: astore 5
    //   183: aload_0
    //   184: astore 6
    //   186: aload_2
    //   187: invokevirtual 127	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   190: ldc 142
    //   192: invokevirtual 140	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   195: ifeq +60 -> 255
    //   198: aload_0
    //   199: astore 5
    //   201: aload_0
    //   202: astore 6
    //   204: ldc 122
    //   206: ldc 144
    //   208: iconst_1
    //   209: anewarray 4	java/lang/Object
    //   212: dup
    //   213: iconst_0
    //   214: aload_2
    //   215: aastore
    //   216: invokestatic 132	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   219: goto -112 -> 107
    //   222: astore_0
    //   223: aload 5
    //   225: astore 6
    //   227: ldc 122
    //   229: aload_0
    //   230: ldc 146
    //   232: iconst_0
    //   233: anewarray 4	java/lang/Object
    //   236: invokestatic 150	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   239: aload 5
    //   241: invokestatic 156	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   244: iconst_0
    //   245: istore 9
    //   247: ldc 91
    //   249: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   252: iload 9
    //   254: ireturn
    //   255: aload_0
    //   256: astore 5
    //   258: aload_0
    //   259: astore 6
    //   261: new 93	java/io/File
    //   264: astore_1
    //   265: aload_0
    //   266: astore 5
    //   268: aload_0
    //   269: astore 6
    //   271: aload_1
    //   272: aload 7
    //   274: aload_2
    //   275: invokevirtual 127	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   278: invokespecial 159	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   281: aload_0
    //   282: astore 5
    //   284: aload_0
    //   285: astore 6
    //   287: aload_1
    //   288: invokevirtual 163	java/io/File:getParentFile	()Ljava/io/File;
    //   291: invokevirtual 100	java/io/File:mkdirs	()Z
    //   294: pop
    //   295: aload_0
    //   296: astore 5
    //   298: aload_0
    //   299: astore 6
    //   301: aload_2
    //   302: invokevirtual 166	java/util/zip/ZipEntry:isDirectory	()Z
    //   305: ifne -198 -> 107
    //   308: aload_0
    //   309: astore 5
    //   311: aload_0
    //   312: astore 6
    //   314: new 168	java/io/BufferedInputStream
    //   317: dup
    //   318: aload 8
    //   320: aload_2
    //   321: invokevirtual 172	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   324: invokespecial 175	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   327: astore_0
    //   328: sipush 512
    //   331: newarray byte
    //   333: astore 10
    //   335: new 177	java/io/FileOutputStream
    //   338: astore 6
    //   340: aload 6
    //   342: aload_1
    //   343: invokespecial 180	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   346: new 182	java/io/BufferedOutputStream
    //   349: astore_1
    //   350: aload_1
    //   351: aload 6
    //   353: sipush 512
    //   356: invokespecial 185	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;I)V
    //   359: aload_1
    //   360: astore 5
    //   362: aload 6
    //   364: astore 4
    //   366: ldc 122
    //   368: ldc 187
    //   370: iconst_2
    //   371: anewarray 4	java/lang/Object
    //   374: dup
    //   375: iconst_0
    //   376: aload_2
    //   377: invokevirtual 127	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   380: aastore
    //   381: dup
    //   382: iconst_1
    //   383: aload_0
    //   384: invokevirtual 191	java/io/BufferedInputStream:available	()I
    //   387: invokestatic 197	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   390: aastore
    //   391: invokestatic 132	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   394: aload_1
    //   395: astore 5
    //   397: aload 6
    //   399: astore 4
    //   401: aload_0
    //   402: invokevirtual 191	java/io/BufferedInputStream:available	()I
    //   405: sipush 512
    //   408: if_icmpgt +67 -> 475
    //   411: aload_1
    //   412: astore 5
    //   414: aload 6
    //   416: astore 4
    //   418: aload_0
    //   419: aload 10
    //   421: iconst_0
    //   422: sipush 512
    //   425: invokevirtual 201	java/io/BufferedInputStream:read	([BII)I
    //   428: istore 11
    //   430: iload 11
    //   432: iconst_m1
    //   433: if_icmpeq +30 -> 463
    //   436: aload_1
    //   437: astore 5
    //   439: aload 6
    //   441: astore 4
    //   443: aload_1
    //   444: aload 10
    //   446: iconst_0
    //   447: iload 11
    //   449: invokevirtual 205	java/io/BufferedOutputStream:write	([BII)V
    //   452: aload_1
    //   453: astore 5
    //   455: aload 6
    //   457: astore 4
    //   459: aload_1
    //   460: invokevirtual 208	java/io/BufferedOutputStream:flush	()V
    //   463: aload 6
    //   465: invokestatic 214	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   468: aload_1
    //   469: invokestatic 214	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   472: goto -365 -> 107
    //   475: aload_1
    //   476: astore 5
    //   478: aload 6
    //   480: astore 4
    //   482: aload_0
    //   483: aload 10
    //   485: iconst_0
    //   486: sipush 512
    //   489: invokevirtual 201	java/io/BufferedInputStream:read	([BII)I
    //   492: istore 11
    //   494: iload 11
    //   496: iconst_m1
    //   497: if_icmpeq +54 -> 551
    //   500: aload_1
    //   501: astore 5
    //   503: aload 6
    //   505: astore 4
    //   507: aload_1
    //   508: aload 10
    //   510: iconst_0
    //   511: iload 11
    //   513: invokevirtual 205	java/io/BufferedOutputStream:write	([BII)V
    //   516: goto -41 -> 475
    //   519: astore_2
    //   520: aload_1
    //   521: astore 5
    //   523: aload 6
    //   525: astore 4
    //   527: ldc 122
    //   529: aload_2
    //   530: ldc 146
    //   532: iconst_0
    //   533: anewarray 4	java/lang/Object
    //   536: invokestatic 150	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   539: aload 6
    //   541: invokestatic 214	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   544: aload_1
    //   545: invokestatic 214	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   548: goto -441 -> 107
    //   551: aload_1
    //   552: astore 5
    //   554: aload 6
    //   556: astore 4
    //   558: aload_1
    //   559: invokevirtual 208	java/io/BufferedOutputStream:flush	()V
    //   562: goto -99 -> 463
    //   565: astore_1
    //   566: aload 4
    //   568: astore 6
    //   570: aload 6
    //   572: invokestatic 214	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   575: aload 5
    //   577: invokestatic 214	com/tencent/mm/a/e:closeOutputStream	(Ljava/io/OutputStream;)V
    //   580: ldc 91
    //   582: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   585: aload_1
    //   586: athrow
    //   587: astore_1
    //   588: aload_0
    //   589: astore 5
    //   591: aload_1
    //   592: astore_0
    //   593: goto -370 -> 223
    //   596: aload_0
    //   597: invokestatic 156	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   600: iconst_1
    //   601: istore 9
    //   603: ldc 91
    //   605: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   608: goto -356 -> 252
    //   611: astore_0
    //   612: aload 6
    //   614: invokestatic 156	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   617: ldc 91
    //   619: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   622: aload_0
    //   623: athrow
    //   624: astore_1
    //   625: aload_0
    //   626: astore 6
    //   628: aload_1
    //   629: astore_0
    //   630: goto -18 -> 612
    //   633: astore_1
    //   634: aconst_null
    //   635: astore 5
    //   637: aconst_null
    //   638: astore 6
    //   640: goto -70 -> 570
    //   643: astore_1
    //   644: aconst_null
    //   645: astore 5
    //   647: goto -77 -> 570
    //   650: astore_2
    //   651: aconst_null
    //   652: astore_1
    //   653: aconst_null
    //   654: astore 6
    //   656: goto -136 -> 520
    //   659: astore_2
    //   660: aconst_null
    //   661: astore_1
    //   662: goto -142 -> 520
    //
    // Exception table:
    //   from	to	target	type
    //   18	23	222	java/lang/Exception
    //   29	35	222	java/lang/Exception
    //   41	47	222	java/lang/Exception
    //   53	57	222	java/lang/Exception
    //   63	68	222	java/lang/Exception
    //   74	79	222	java/lang/Exception
    //   85	92	222	java/lang/Exception
    //   98	104	222	java/lang/Exception
    //   113	122	222	java/lang/Exception
    //   128	138	222	java/lang/Exception
    //   144	162	222	java/lang/Exception
    //   168	180	222	java/lang/Exception
    //   186	198	222	java/lang/Exception
    //   204	219	222	java/lang/Exception
    //   261	265	222	java/lang/Exception
    //   271	281	222	java/lang/Exception
    //   287	295	222	java/lang/Exception
    //   301	308	222	java/lang/Exception
    //   314	328	222	java/lang/Exception
    //   366	394	519	java/lang/Exception
    //   401	411	519	java/lang/Exception
    //   418	430	519	java/lang/Exception
    //   443	452	519	java/lang/Exception
    //   459	463	519	java/lang/Exception
    //   482	494	519	java/lang/Exception
    //   507	516	519	java/lang/Exception
    //   558	562	519	java/lang/Exception
    //   366	394	565	finally
    //   401	411	565	finally
    //   418	430	565	finally
    //   443	452	565	finally
    //   459	463	565	finally
    //   482	494	565	finally
    //   507	516	565	finally
    //   527	539	565	finally
    //   558	562	565	finally
    //   328	335	587	java/lang/Exception
    //   463	472	587	java/lang/Exception
    //   539	548	587	java/lang/Exception
    //   570	587	587	java/lang/Exception
    //   18	23	611	finally
    //   29	35	611	finally
    //   41	47	611	finally
    //   53	57	611	finally
    //   63	68	611	finally
    //   74	79	611	finally
    //   85	92	611	finally
    //   98	104	611	finally
    //   113	122	611	finally
    //   128	138	611	finally
    //   144	162	611	finally
    //   168	180	611	finally
    //   186	198	611	finally
    //   204	219	611	finally
    //   227	239	611	finally
    //   261	265	611	finally
    //   271	281	611	finally
    //   287	295	611	finally
    //   301	308	611	finally
    //   314	328	611	finally
    //   328	335	624	finally
    //   463	472	624	finally
    //   539	548	624	finally
    //   570	587	624	finally
    //   335	346	633	finally
    //   346	359	643	finally
    //   335	346	650	java/lang/Exception
    //   346	359	659	java/lang/Exception
  }

  public static b afY()
  {
    AppMethodBeat.i(62286);
    try
    {
      if (fAM == null)
      {
        localb = new com/tencent/mm/ao/b;
        localb.<init>();
        fAM = localb;
      }
      b localb = fAM;
      AppMethodBeat.o(62286);
      return localb;
    }
    finally
    {
      AppMethodBeat.o(62286);
    }
  }

  public static void aga()
  {
    AppMethodBeat.i(62287);
    b.c.dif();
    com.tencent.mm.pluginsdk.g.a.a.b.Ky(57);
    AppMethodBeat.o(62287);
  }

  public static String[] agc()
  {
    return new String[] { fAL, fAK };
  }

  private static boolean b(JSONObject paramJSONObject, String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(62290);
    String str1 = paramJSONObject.optString("name");
    String str2 = paramJSONObject.optString("md5");
    String str3 = fAJ + str1;
    paramJSONObject = g.cz(str3);
    if ((bo.isNullOrNil(paramJSONObject)) || (!paramJSONObject.equalsIgnoreCase(str2)))
    {
      ab.e("MicroMsg.FontResLogic", "download %s not match! %s %s", new Object[] { str1, paramJSONObject, str2 });
      AppMethodBeat.o(62290);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (!paramString.equalsIgnoreCase(str3))
        com.tencent.mm.vfs.e.aQ(str3, paramString);
      AppMethodBeat.o(62290);
    }
  }

  public final boolean afZ()
  {
    return this.fAO;
  }

  public final boolean agb()
  {
    AppMethodBeat.i(62288);
    if ((com.tencent.mm.vfs.e.ct(fAK)) && (com.tencent.mm.vfs.e.ct(fAL)))
      ab.i("MicroMsg.FontResLogic", "font file exist");
    for (this.fAO = true; ; this.fAO = false)
    {
      boolean bool = this.fAO;
      AppMethodBeat.o(62288);
      return bool;
    }
  }

  // ERROR //
  public final void e(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 5
    //   3: aload_0
    //   4: monitorenter
    //   5: ldc_w 280
    //   8: invokestatic 26	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   11: ldc 122
    //   13: ldc_w 282
    //   16: iconst_1
    //   17: anewarray 4	java/lang/Object
    //   20: dup
    //   21: iconst_0
    //   22: aload_1
    //   23: aastore
    //   24: invokestatic 132	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   27: aload_1
    //   28: invokestatic 274	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   31: ifeq +448 -> 479
    //   34: aload_1
    //   35: getstatic 52	com/tencent/mm/ao/b:fAJ	Ljava/lang/String;
    //   38: invokestatic 284	com/tencent/mm/ao/b:aJ	(Ljava/lang/String;Ljava/lang/String;)Z
    //   41: istore 6
    //   43: ldc 122
    //   45: ldc_w 286
    //   48: iconst_1
    //   49: anewarray 4	java/lang/Object
    //   52: dup
    //   53: iconst_0
    //   54: iload 6
    //   56: invokestatic 291	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   59: aastore
    //   60: invokestatic 132	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   63: iload 6
    //   65: ifeq +414 -> 479
    //   68: new 28	java/lang/StringBuilder
    //   71: astore_1
    //   72: aload_1
    //   73: invokespecial 31	java/lang/StringBuilder:<init>	()V
    //   76: aload_1
    //   77: getstatic 52	com/tencent/mm/ao/b:fAJ	Ljava/lang/String;
    //   80: invokevirtual 40	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   83: aload_0
    //   84: getfield 70	com/tencent/mm/ao/b:fAN	Ljava/lang/String;
    //   87: invokevirtual 40	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: invokevirtual 46	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   93: invokestatic 274	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   96: ifeq +392 -> 488
    //   99: new 28	java/lang/StringBuilder
    //   102: astore_1
    //   103: aload_1
    //   104: invokespecial 31	java/lang/StringBuilder:<init>	()V
    //   107: aload_1
    //   108: getstatic 52	com/tencent/mm/ao/b:fAJ	Ljava/lang/String;
    //   111: invokevirtual 40	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: aload_0
    //   115: getfield 70	com/tencent/mm/ao/b:fAN	Ljava/lang/String;
    //   118: invokevirtual 40	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: invokevirtual 46	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   124: invokestatic 294	com/tencent/mm/vfs/e:cy	(Ljava/lang/String;)Ljava/lang/String;
    //   127: astore_1
    //   128: ldc 122
    //   130: ldc_w 296
    //   133: iconst_1
    //   134: anewarray 4	java/lang/Object
    //   137: dup
    //   138: iconst_0
    //   139: aload_1
    //   140: aastore
    //   141: invokestatic 132	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   144: new 241	org/json/JSONObject
    //   147: astore 7
    //   149: aload 7
    //   151: aload_1
    //   152: invokespecial 297	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   155: aload 7
    //   157: ldc 54
    //   159: invokevirtual 301	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   162: astore_1
    //   163: aload 7
    //   165: ldc 58
    //   167: invokevirtual 301	org/json/JSONObject:optJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   170: astore 7
    //   172: aload_1
    //   173: ifnull +315 -> 488
    //   176: aload 7
    //   178: ifnull +310 -> 488
    //   181: aload_1
    //   182: getstatic 56	com/tencent/mm/ao/b:fAK	Ljava/lang/String;
    //   185: invokestatic 303	com/tencent/mm/ao/b:b	(Lorg/json/JSONObject;Ljava/lang/String;)Z
    //   188: ifne +46 -> 234
    //   191: getstatic 309	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   194: ldc2_w 310
    //   197: ldc2_w 312
    //   200: lconst_1
    //   201: invokevirtual 317	com/tencent/mm/plugin/report/service/h:k	(JJJ)V
    //   204: ldc 122
    //   206: ldc_w 319
    //   209: invokestatic 279	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   212: aload_0
    //   213: iconst_0
    //   214: putfield 72	com/tencent/mm/ao/b:fAO	Z
    //   217: getstatic 52	com/tencent/mm/ao/b:fAJ	Ljava/lang/String;
    //   220: iconst_1
    //   221: invokestatic 323	com/tencent/mm/vfs/e:N	(Ljava/lang/String;Z)Z
    //   224: pop
    //   225: ldc_w 280
    //   228: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   231: aload_0
    //   232: monitorexit
    //   233: return
    //   234: aload 7
    //   236: getstatic 60	com/tencent/mm/ao/b:fAL	Ljava/lang/String;
    //   239: invokestatic 303	com/tencent/mm/ao/b:b	(Lorg/json/JSONObject;Ljava/lang/String;)Z
    //   242: ifne +51 -> 293
    //   245: getstatic 309	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   248: ldc2_w 310
    //   251: ldc2_w 324
    //   254: lconst_1
    //   255: invokevirtual 317	com/tencent/mm/plugin/report/service/h:k	(JJJ)V
    //   258: ldc 122
    //   260: ldc_w 319
    //   263: invokestatic 279	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   266: aload_0
    //   267: iconst_0
    //   268: putfield 72	com/tencent/mm/ao/b:fAO	Z
    //   271: getstatic 52	com/tencent/mm/ao/b:fAJ	Ljava/lang/String;
    //   274: iconst_1
    //   275: invokestatic 323	com/tencent/mm/vfs/e:N	(Ljava/lang/String;Z)Z
    //   278: pop
    //   279: ldc_w 280
    //   282: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   285: goto -54 -> 231
    //   288: astore_1
    //   289: aload_0
    //   290: monitorexit
    //   291: aload_1
    //   292: athrow
    //   293: ldc 122
    //   295: ldc_w 327
    //   298: invokestatic 279	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   301: aload_0
    //   302: invokevirtual 329	com/tencent/mm/ao/b:agb	()Z
    //   305: ifeq +183 -> 488
    //   308: ldc 122
    //   310: ldc_w 331
    //   313: invokestatic 279	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   316: iload 5
    //   318: ifne +33 -> 351
    //   321: ldc 122
    //   323: ldc_w 319
    //   326: invokestatic 279	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   329: aload_0
    //   330: iconst_0
    //   331: putfield 72	com/tencent/mm/ao/b:fAO	Z
    //   334: getstatic 52	com/tencent/mm/ao/b:fAJ	Ljava/lang/String;
    //   337: iconst_1
    //   338: invokestatic 323	com/tencent/mm/vfs/e:N	(Ljava/lang/String;Z)Z
    //   341: pop
    //   342: ldc_w 280
    //   345: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   348: goto -117 -> 231
    //   351: ldc 122
    //   353: ldc_w 333
    //   356: invokestatic 279	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   359: getstatic 309	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   362: ldc2_w 310
    //   365: ldc2_w 334
    //   368: lconst_1
    //   369: invokevirtual 317	com/tencent/mm/plugin/report/service/h:k	(JJJ)V
    //   372: invokestatic 228	com/tencent/mm/pluginsdk/g/a/a/b$c:dif	()Lcom/tencent/mm/pluginsdk/g/a/a/b;
    //   375: iload_2
    //   376: iload_3
    //   377: iload 4
    //   379: invokevirtual 339	com/tencent/mm/pluginsdk/g/a/a/b:as	(III)V
    //   382: goto -48 -> 334
    //   385: astore_1
    //   386: ldc 122
    //   388: aload_1
    //   389: ldc_w 341
    //   392: iconst_1
    //   393: anewarray 4	java/lang/Object
    //   396: dup
    //   397: iconst_0
    //   398: aload_1
    //   399: invokevirtual 344	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   402: aastore
    //   403: invokestatic 150	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   406: getstatic 309	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   409: ldc2_w 310
    //   412: ldc2_w 345
    //   415: lconst_1
    //   416: invokevirtual 317	com/tencent/mm/plugin/report/service/h:k	(JJJ)V
    //   419: ldc 122
    //   421: ldc_w 319
    //   424: invokestatic 279	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   427: aload_0
    //   428: iconst_0
    //   429: putfield 72	com/tencent/mm/ao/b:fAO	Z
    //   432: getstatic 52	com/tencent/mm/ao/b:fAJ	Ljava/lang/String;
    //   435: iconst_1
    //   436: invokestatic 323	com/tencent/mm/vfs/e:N	(Ljava/lang/String;Z)Z
    //   439: pop
    //   440: ldc_w 280
    //   443: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   446: goto -215 -> 231
    //   449: astore_1
    //   450: ldc 122
    //   452: ldc_w 319
    //   455: invokestatic 279	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   458: aload_0
    //   459: iconst_0
    //   460: putfield 72	com/tencent/mm/ao/b:fAO	Z
    //   463: getstatic 52	com/tencent/mm/ao/b:fAJ	Ljava/lang/String;
    //   466: iconst_1
    //   467: invokestatic 323	com/tencent/mm/vfs/e:N	(Ljava/lang/String;Z)Z
    //   470: pop
    //   471: ldc_w 280
    //   474: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   477: aload_1
    //   478: athrow
    //   479: ldc_w 280
    //   482: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   485: goto -254 -> 231
    //   488: iconst_0
    //   489: istore 5
    //   491: goto -175 -> 316
    //
    // Exception table:
    //   from	to	target	type
    //   5	63	288	finally
    //   204	231	288	finally
    //   258	285	288	finally
    //   321	334	288	finally
    //   334	348	288	finally
    //   351	382	288	finally
    //   419	446	288	finally
    //   450	479	288	finally
    //   479	485	288	finally
    //   68	172	385	java/lang/Exception
    //   181	204	385	java/lang/Exception
    //   234	258	385	java/lang/Exception
    //   293	316	385	java/lang/Exception
    //   68	172	449	finally
    //   181	204	449	finally
    //   234	258	449	finally
    //   293	316	449	finally
    //   386	419	449	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ao.b
 * JD-Core Version:    0.6.2
 */