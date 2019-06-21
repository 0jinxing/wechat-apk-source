package com.tencent.mm.pluginsdk.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.al;

public final class c
{
  private static boolean[] vfY = new boolean[21];

  // ERROR //
  private static boolean ajm(java.lang.String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: iconst_1
    //   3: istore_2
    //   4: sipush 27474
    //   7: invokestatic 18	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: aload_0
    //   11: invokestatic 181	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   14: ifne +13 -> 27
    //   17: sipush 27474
    //   20: invokestatic 174	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   23: iload_2
    //   24: istore_1
    //   25: iload_1
    //   26: ireturn
    //   27: new 70	java/lang/StringBuilder
    //   30: dup
    //   31: invokespecial 73	java/lang/StringBuilder:<init>	()V
    //   34: aload_0
    //   35: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: ldc 183
    //   40: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   46: astore_3
    //   47: aload_3
    //   48: invokestatic 181	com/tencent/mm/vfs/e:ct	(Ljava/lang/String;)Z
    //   51: ifeq +8 -> 59
    //   54: aload_3
    //   55: invokestatic 186	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   58: pop
    //   59: aload_3
    //   60: invokestatic 189	com/tencent/mm/vfs/e:atc	(Ljava/lang/String;)Z
    //   63: pop
    //   64: new 191	java/io/DataOutputStream
    //   67: astore 4
    //   69: aload 4
    //   71: aload_3
    //   72: iconst_0
    //   73: invokestatic 195	com/tencent/mm/vfs/e:L	(Ljava/lang/String;Z)Ljava/io/OutputStream;
    //   76: invokespecial 198	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   79: aload 4
    //   81: iconst_1
    //   82: invokevirtual 201	java/io/DataOutputStream:writeInt	(I)V
    //   85: aload 4
    //   87: invokevirtual 204	java/io/DataOutputStream:flush	()V
    //   90: aload 4
    //   92: invokevirtual 207	java/io/DataOutputStream:close	()V
    //   95: new 209	java/io/DataInputStream
    //   98: astore 5
    //   100: aload 5
    //   102: aload_3
    //   103: invokestatic 213	com/tencent/mm/vfs/e:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   106: invokespecial 216	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   109: aload 5
    //   111: astore 6
    //   113: aload 4
    //   115: astore 7
    //   117: aload 5
    //   119: invokevirtual 220	java/io/DataInputStream:readInt	()I
    //   122: istore 8
    //   124: aload 5
    //   126: astore 6
    //   128: aload 4
    //   130: astore 7
    //   132: aload 5
    //   134: invokevirtual 221	java/io/DataInputStream:close	()V
    //   137: aload 5
    //   139: astore 6
    //   141: aload 4
    //   143: astore 7
    //   145: aload_3
    //   146: invokestatic 186	com/tencent/mm/vfs/e:deleteFile	(Ljava/lang/String;)Z
    //   149: ifeq +71 -> 220
    //   152: aload 5
    //   154: astore 6
    //   156: aload 4
    //   158: astore 7
    //   160: iconst_1
    //   161: iload 8
    //   163: invokestatic 227	com/tencent/mm/sdk/platformtools/bo:gW	(II)Z
    //   166: istore_2
    //   167: iload_2
    //   168: ifeq +52 -> 220
    //   171: aload 4
    //   173: invokevirtual 207	java/io/DataOutputStream:close	()V
    //   176: aload 5
    //   178: invokevirtual 221	java/io/DataInputStream:close	()V
    //   181: iload_1
    //   182: ifne +29 -> 211
    //   185: ldc 157
    //   187: new 70	java/lang/StringBuilder
    //   190: dup
    //   191: ldc 229
    //   193: invokespecial 162	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   196: aload_0
    //   197: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: ldc 231
    //   202: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   205: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   208: invokestatic 234	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   211: sipush 27474
    //   214: invokestatic 174	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   217: goto -192 -> 25
    //   220: iconst_0
    //   221: istore_1
    //   222: goto -51 -> 171
    //   225: astore 4
    //   227: ldc 157
    //   229: aload 4
    //   231: ldc 236
    //   233: iconst_0
    //   234: anewarray 4	java/lang/Object
    //   237: invokestatic 240	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   240: goto -64 -> 176
    //   243: astore 5
    //   245: ldc 157
    //   247: aload 5
    //   249: ldc 236
    //   251: iconst_0
    //   252: anewarray 4	java/lang/Object
    //   255: invokestatic 240	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   258: goto -77 -> 181
    //   261: astore_3
    //   262: aconst_null
    //   263: astore 5
    //   265: aconst_null
    //   266: astore 4
    //   268: aload 5
    //   270: astore 6
    //   272: aload 4
    //   274: astore 7
    //   276: new 70	java/lang/StringBuilder
    //   279: astore 9
    //   281: aload 5
    //   283: astore 6
    //   285: aload 4
    //   287: astore 7
    //   289: aload 9
    //   291: ldc 229
    //   293: invokespecial 162	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   296: aload 5
    //   298: astore 6
    //   300: aload 4
    //   302: astore 7
    //   304: ldc 157
    //   306: aload 9
    //   308: aload_0
    //   309: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   312: ldc 231
    //   314: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   317: aload_3
    //   318: invokevirtual 243	java/io/IOException:getMessage	()Ljava/lang/String;
    //   321: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   324: invokevirtual 98	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   327: invokestatic 234	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   330: aload 4
    //   332: ifnull +8 -> 340
    //   335: aload 4
    //   337: invokevirtual 207	java/io/DataOutputStream:close	()V
    //   340: aload 5
    //   342: ifnull +148 -> 490
    //   345: aload 5
    //   347: invokevirtual 221	java/io/DataInputStream:close	()V
    //   350: iconst_0
    //   351: istore_1
    //   352: goto -171 -> 181
    //   355: astore 4
    //   357: ldc 157
    //   359: aload 4
    //   361: ldc 236
    //   363: iconst_0
    //   364: anewarray 4	java/lang/Object
    //   367: invokestatic 240	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   370: goto -30 -> 340
    //   373: astore 5
    //   375: ldc 157
    //   377: aload 5
    //   379: ldc 236
    //   381: iconst_0
    //   382: anewarray 4	java/lang/Object
    //   385: invokestatic 240	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   388: iconst_0
    //   389: istore_1
    //   390: goto -209 -> 181
    //   393: astore_0
    //   394: aconst_null
    //   395: astore 6
    //   397: aconst_null
    //   398: astore 4
    //   400: aload 4
    //   402: ifnull +8 -> 410
    //   405: aload 4
    //   407: invokevirtual 207	java/io/DataOutputStream:close	()V
    //   410: aload 6
    //   412: ifnull +8 -> 420
    //   415: aload 6
    //   417: invokevirtual 221	java/io/DataInputStream:close	()V
    //   420: sipush 27474
    //   423: invokestatic 174	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   426: aload_0
    //   427: athrow
    //   428: astore 5
    //   430: ldc 157
    //   432: aload 5
    //   434: ldc 236
    //   436: iconst_0
    //   437: anewarray 4	java/lang/Object
    //   440: invokestatic 240	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   443: goto -33 -> 410
    //   446: astore 5
    //   448: ldc 157
    //   450: aload 5
    //   452: ldc 236
    //   454: iconst_0
    //   455: anewarray 4	java/lang/Object
    //   458: invokestatic 240	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   461: goto -41 -> 420
    //   464: astore_0
    //   465: aconst_null
    //   466: astore 6
    //   468: goto -68 -> 400
    //   471: astore_0
    //   472: aload 7
    //   474: astore 4
    //   476: goto -76 -> 400
    //   479: astore_3
    //   480: aconst_null
    //   481: astore 5
    //   483: goto -215 -> 268
    //   486: astore_3
    //   487: goto -219 -> 268
    //   490: iconst_0
    //   491: istore_1
    //   492: goto -311 -> 181
    //
    // Exception table:
    //   from	to	target	type
    //   171	176	225	java/io/IOException
    //   176	181	243	java/io/IOException
    //   47	59	261	java/io/IOException
    //   59	79	261	java/io/IOException
    //   335	340	355	java/io/IOException
    //   345	350	373	java/io/IOException
    //   47	59	393	finally
    //   59	79	393	finally
    //   405	410	428	java/io/IOException
    //   415	420	446	java/io/IOException
    //   79	109	464	finally
    //   117	124	471	finally
    //   132	137	471	finally
    //   145	152	471	finally
    //   160	167	471	finally
    //   276	281	471	finally
    //   289	296	471	finally
    //   304	330	471	finally
    //   79	109	479	java/io/IOException
    //   117	124	486	java/io/IOException
    //   132	137	486	java/io/IOException
    //   145	152	486	java/io/IOException
    //   160	167	486	java/io/IOException
  }

  public static boolean diH()
  {
    AppMethodBeat.i(27473);
    g.RQ();
    boolean bool;
    if (!g.RP().isSDCardAvailable())
    {
      bool = true;
      AppMethodBeat.o(27473);
    }
    while (true)
    {
      return bool;
      bool = ajm(com.tencent.mm.compatible.util.e.eSn);
      g.RS().aa(new c.1());
      AppMethodBeat.o(27473);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.i.c
 * JD-Core Version:    0.6.2
 */