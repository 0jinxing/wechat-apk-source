package com.tencent.mm.plugin.backup.bakoldlogic.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class a extends com.tencent.mm.plugin.backup.b.a
{
  private static String END = "img";
  private static String jvG = "icon_";
  private static String jvH = "iphone";
  private static String jvI = "android";
  private static String jvJ = "s60v3";
  private static String jvK = "s60v5";
  private static a jyT;
  private Map<String, a.a> jvM;

  public a()
  {
    AppMethodBeat.i(17765);
    this.jvM = null;
    aTB();
    AppMethodBeat.o(17765);
  }

  public static a.a Fq(String paramString)
  {
    AppMethodBeat.i(17763);
    if (jyT == null)
      jyT = new a();
    Object localObject = jyT;
    if (((a)localObject).jvM == null)
      ((a)localObject).aTB();
    Iterator localIterator = ((a)localObject).jvM.values().iterator();
    while (localIterator.hasNext())
    {
      localObject = (a.a)localIterator.next();
      if ((((a.a)localObject).jvO != null) && (((a.a)localObject).jvO.equals(paramString)))
      {
        AppMethodBeat.o(17763);
        paramString = (String)localObject;
      }
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(17763);
    }
  }

  public static a.a Fr(String paramString)
  {
    AppMethodBeat.i(17764);
    if (jyT == null)
    {
      locala = new a();
      jyT = locala;
      a(locala);
    }
    a locala = jyT;
    if (locala.jvM == null)
      locala.aTB();
    paramString = (a.a)locala.jvM.get(paramString);
    AppMethodBeat.o(17764);
    return paramString;
  }

  // ERROR //
  private void aTB()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_1
    //   2: iconst_0
    //   3: istore_2
    //   4: sipush 17766
    //   7: invokestatic 54	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: new 113	java/util/HashMap
    //   14: dup
    //   15: invokespecial 114	java/util/HashMap:<init>	()V
    //   18: putfield 56	com/tencent/mm/plugin/backup/bakoldlogic/b/a:jvM	Ljava/util/Map;
    //   21: invokestatic 120	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   24: invokevirtual 126	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   27: astore_3
    //   28: aload_3
    //   29: ldc 128
    //   31: invokevirtual 134	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   34: astore_3
    //   35: new 136	java/io/BufferedReader
    //   38: astore 4
    //   40: new 138	java/io/InputStreamReader
    //   43: astore 5
    //   45: aload 5
    //   47: aload_3
    //   48: ldc 140
    //   50: invokespecial 143	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   53: aload 4
    //   55: aload 5
    //   57: invokespecial 146	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   60: aload 4
    //   62: astore 5
    //   64: aload_3
    //   65: astore 6
    //   67: aload 4
    //   69: invokevirtual 150	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   72: astore 7
    //   74: aload 7
    //   76: ifnull +425 -> 501
    //   79: aload 4
    //   81: astore 5
    //   83: aload_3
    //   84: astore 6
    //   86: aload 7
    //   88: getstatic 24	com/tencent/mm/plugin/backup/bakoldlogic/b/a:jvG	Ljava/lang/String;
    //   91: invokevirtual 154	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   94: ifeq -34 -> 60
    //   97: aload 4
    //   99: astore 5
    //   101: aload_3
    //   102: astore 6
    //   104: new 6	com/tencent/mm/plugin/backup/bakoldlogic/b/a$a
    //   107: astore 8
    //   109: aload 4
    //   111: astore 5
    //   113: aload_3
    //   114: astore 6
    //   116: aload 8
    //   118: invokespecial 155	com/tencent/mm/plugin/backup/bakoldlogic/b/a$a:<init>	()V
    //   121: aload 4
    //   123: astore 5
    //   125: aload_3
    //   126: astore 6
    //   128: aload 4
    //   130: invokevirtual 150	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   133: astore 7
    //   135: aload 7
    //   137: ifnull +332 -> 469
    //   140: aload 4
    //   142: astore 5
    //   144: aload_3
    //   145: astore 6
    //   147: aload 7
    //   149: getstatic 28	com/tencent/mm/plugin/backup/bakoldlogic/b/a:END	Ljava/lang/String;
    //   152: invokevirtual 154	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   155: ifne +314 -> 469
    //   158: aload 4
    //   160: astore 5
    //   162: aload_3
    //   163: astore 6
    //   165: aload 7
    //   167: ldc 157
    //   169: invokevirtual 161	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   172: istore_1
    //   173: aload 4
    //   175: astore 5
    //   177: aload_3
    //   178: astore 6
    //   180: iload_1
    //   181: iconst_1
    //   182: iadd
    //   183: aload 7
    //   185: invokevirtual 165	java/lang/String:length	()I
    //   188: if_icmpge +281 -> 469
    //   191: aload 4
    //   193: astore 5
    //   195: aload_3
    //   196: astore 6
    //   198: aload 7
    //   200: iload_1
    //   201: iconst_1
    //   202: iadd
    //   203: invokevirtual 169	java/lang/String:substring	(I)Ljava/lang/String;
    //   206: astore 9
    //   208: aload 4
    //   210: astore 5
    //   212: aload_3
    //   213: astore 6
    //   215: aload 7
    //   217: getstatic 32	com/tencent/mm/plugin/backup/bakoldlogic/b/a:jvH	Ljava/lang/String;
    //   220: invokevirtual 173	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   223: ifeq +109 -> 332
    //   226: aload 4
    //   228: astore 5
    //   230: aload_3
    //   231: astore 6
    //   233: aload 8
    //   235: aload 9
    //   237: putfield 92	com/tencent/mm/plugin/backup/bakoldlogic/b/a$a:jvO	Ljava/lang/String;
    //   240: aload 4
    //   242: astore 5
    //   244: aload_3
    //   245: astore 6
    //   247: aload_0
    //   248: getfield 56	com/tencent/mm/plugin/backup/bakoldlogic/b/a:jvM	Ljava/util/Map;
    //   251: aload 8
    //   253: getfield 176	com/tencent/mm/plugin/backup/bakoldlogic/b/a$a:jvN	Ljava/lang/String;
    //   256: aload 8
    //   258: invokeinterface 180 3 0
    //   263: pop
    //   264: goto -143 -> 121
    //   267: astore 7
    //   269: aload 4
    //   271: astore 5
    //   273: aload_3
    //   274: astore 6
    //   276: ldc 182
    //   278: aload 7
    //   280: ldc 184
    //   282: iconst_0
    //   283: anewarray 186	java/lang/Object
    //   286: invokestatic 192	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   289: aload 4
    //   291: ifnull +8 -> 299
    //   294: aload 4
    //   296: invokevirtual 195	java/io/BufferedReader:close	()V
    //   299: iload_2
    //   300: istore_1
    //   301: aload_3
    //   302: ifnull +9 -> 311
    //   305: aload_3
    //   306: invokevirtual 198	java/io/InputStream:close	()V
    //   309: iload_2
    //   310: istore_1
    //   311: ldc 182
    //   313: ldc 200
    //   315: iload_1
    //   316: invokestatic 203	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   319: invokevirtual 207	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   322: invokestatic 211	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   325: sipush 17766
    //   328: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   331: return
    //   332: aload 4
    //   334: astore 5
    //   336: aload_3
    //   337: astore 6
    //   339: aload 7
    //   341: getstatic 36	com/tencent/mm/plugin/backup/bakoldlogic/b/a:jvI	Ljava/lang/String;
    //   344: invokevirtual 173	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   347: ifeq +52 -> 399
    //   350: aload 4
    //   352: astore 5
    //   354: aload_3
    //   355: astore 6
    //   357: aload 8
    //   359: aload 9
    //   361: putfield 176	com/tencent/mm/plugin/backup/bakoldlogic/b/a$a:jvN	Ljava/lang/String;
    //   364: goto -124 -> 240
    //   367: astore 4
    //   369: aload 6
    //   371: astore_3
    //   372: aload 5
    //   374: ifnull +8 -> 382
    //   377: aload 5
    //   379: invokevirtual 195	java/io/BufferedReader:close	()V
    //   382: aload_3
    //   383: ifnull +7 -> 390
    //   386: aload_3
    //   387: invokevirtual 198	java/io/InputStream:close	()V
    //   390: sipush 17766
    //   393: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   396: aload 4
    //   398: athrow
    //   399: aload 4
    //   401: astore 5
    //   403: aload_3
    //   404: astore 6
    //   406: aload 7
    //   408: getstatic 40	com/tencent/mm/plugin/backup/bakoldlogic/b/a:jvJ	Ljava/lang/String;
    //   411: invokevirtual 173	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   414: ifeq +20 -> 434
    //   417: aload 4
    //   419: astore 5
    //   421: aload_3
    //   422: astore 6
    //   424: aload 8
    //   426: aload 9
    //   428: putfield 214	com/tencent/mm/plugin/backup/bakoldlogic/b/a$a:jvP	Ljava/lang/String;
    //   431: goto -191 -> 240
    //   434: aload 4
    //   436: astore 5
    //   438: aload_3
    //   439: astore 6
    //   441: aload 7
    //   443: getstatic 44	com/tencent/mm/plugin/backup/bakoldlogic/b/a:jvK	Ljava/lang/String;
    //   446: invokevirtual 173	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   449: ifeq -209 -> 240
    //   452: aload 4
    //   454: astore 5
    //   456: aload_3
    //   457: astore 6
    //   459: aload 8
    //   461: aload 9
    //   463: putfield 217	com/tencent/mm/plugin/backup/bakoldlogic/b/a$a:jvQ	Ljava/lang/String;
    //   466: goto -226 -> 240
    //   469: aload 4
    //   471: astore 5
    //   473: aload_3
    //   474: astore 6
    //   476: ldc 182
    //   478: ldc 219
    //   480: iconst_1
    //   481: anewarray 186	java/lang/Object
    //   484: dup
    //   485: iconst_0
    //   486: aload 8
    //   488: invokevirtual 222	com/tencent/mm/plugin/backup/bakoldlogic/b/a$a:toString	()Ljava/lang/String;
    //   491: aastore
    //   492: invokestatic 225	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   495: iinc 2 1
    //   498: goto -438 -> 60
    //   501: aload 4
    //   503: invokevirtual 195	java/io/BufferedReader:close	()V
    //   506: iload_2
    //   507: istore_1
    //   508: aload_3
    //   509: ifnull -198 -> 311
    //   512: aload_3
    //   513: invokevirtual 198	java/io/InputStream:close	()V
    //   516: iload_2
    //   517: istore_1
    //   518: goto -207 -> 311
    //   521: astore_3
    //   522: iload_2
    //   523: istore_1
    //   524: goto -213 -> 311
    //   527: astore_3
    //   528: goto -138 -> 390
    //   531: astore 4
    //   533: aconst_null
    //   534: astore 5
    //   536: aconst_null
    //   537: astore_3
    //   538: goto -166 -> 372
    //   541: astore 4
    //   543: aconst_null
    //   544: astore 5
    //   546: goto -174 -> 372
    //   549: astore_3
    //   550: iload_2
    //   551: istore_1
    //   552: goto -241 -> 311
    //   555: astore 7
    //   557: aconst_null
    //   558: astore 4
    //   560: aconst_null
    //   561: astore_3
    //   562: iload_1
    //   563: istore_2
    //   564: goto -295 -> 269
    //   567: astore 7
    //   569: aconst_null
    //   570: astore 4
    //   572: iload_1
    //   573: istore_2
    //   574: goto -305 -> 269
    //
    // Exception table:
    //   from	to	target	type
    //   67	74	267	java/io/IOException
    //   86	97	267	java/io/IOException
    //   104	109	267	java/io/IOException
    //   116	121	267	java/io/IOException
    //   128	135	267	java/io/IOException
    //   147	158	267	java/io/IOException
    //   165	173	267	java/io/IOException
    //   180	191	267	java/io/IOException
    //   198	208	267	java/io/IOException
    //   215	226	267	java/io/IOException
    //   233	240	267	java/io/IOException
    //   247	264	267	java/io/IOException
    //   339	350	267	java/io/IOException
    //   357	364	267	java/io/IOException
    //   406	417	267	java/io/IOException
    //   424	431	267	java/io/IOException
    //   441	452	267	java/io/IOException
    //   459	466	267	java/io/IOException
    //   476	495	267	java/io/IOException
    //   67	74	367	finally
    //   86	97	367	finally
    //   104	109	367	finally
    //   116	121	367	finally
    //   128	135	367	finally
    //   147	158	367	finally
    //   165	173	367	finally
    //   180	191	367	finally
    //   198	208	367	finally
    //   215	226	367	finally
    //   233	240	367	finally
    //   247	264	367	finally
    //   276	289	367	finally
    //   339	350	367	finally
    //   357	364	367	finally
    //   406	417	367	finally
    //   424	431	367	finally
    //   441	452	367	finally
    //   459	466	367	finally
    //   476	495	367	finally
    //   501	506	521	java/lang/Exception
    //   512	516	521	java/lang/Exception
    //   377	382	527	java/lang/Exception
    //   386	390	527	java/lang/Exception
    //   28	35	531	finally
    //   35	60	541	finally
    //   294	299	549	java/lang/Exception
    //   305	309	549	java/lang/Exception
    //   28	35	555	java/io/IOException
    //   35	60	567	java/io/IOException
  }

  public final void aSp()
  {
    jyT = null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.b.a
 * JD-Core Version:    0.6.2
 */