package com.tencent.mm.compatible.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.e;
import java.util.Map;

public final class l
{
  private static l esK = null;
  private boolean esJ;
  private String filePath;
  private Map<Integer, Object> values;

  // ERROR //
  private l(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 26	java/lang/Object:<init>	()V
    //   4: ldc 27
    //   6: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: iconst_0
    //   11: putfield 35	com/tencent/mm/compatible/e/l:esJ	Z
    //   14: aload_0
    //   15: ldc 37
    //   17: putfield 39	com/tencent/mm/compatible/e/l:filePath	Ljava/lang/String;
    //   20: aload_0
    //   21: aload_1
    //   22: putfield 39	com/tencent/mm/compatible/e/l:filePath	Ljava/lang/String;
    //   25: new 41	java/io/File
    //   28: astore_1
    //   29: aload_1
    //   30: aload_0
    //   31: getfield 39	com/tencent/mm/compatible/e/l:filePath	Ljava/lang/String;
    //   34: invokespecial 43	java/io/File:<init>	(Ljava/lang/String;)V
    //   37: aload_1
    //   38: invokevirtual 47	java/io/File:exists	()Z
    //   41: ifne +8 -> 49
    //   44: aload_1
    //   45: invokevirtual 50	java/io/File:createNewFile	()Z
    //   48: pop
    //   49: aload_1
    //   50: invokevirtual 54	java/io/File:length	()J
    //   53: lconst_0
    //   54: lcmp
    //   55: ifne +27 -> 82
    //   58: new 56	java/util/HashMap
    //   61: astore_1
    //   62: aload_1
    //   63: invokespecial 57	java/util/HashMap:<init>	()V
    //   66: aload_0
    //   67: aload_1
    //   68: putfield 59	com/tencent/mm/compatible/e/l:values	Ljava/util/Map;
    //   71: aload_0
    //   72: iconst_0
    //   73: putfield 35	com/tencent/mm/compatible/e/l:esJ	Z
    //   76: ldc 27
    //   78: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   81: return
    //   82: new 64	java/io/FileInputStream
    //   85: dup
    //   86: aload_1
    //   87: invokespecial 67	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   90: astore_2
    //   91: new 69	java/io/ObjectInputStream
    //   94: astore_1
    //   95: aload_1
    //   96: aload_2
    //   97: invokespecial 72	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   100: aload_1
    //   101: astore_3
    //   102: aload_2
    //   103: astore 4
    //   105: aload_0
    //   106: aload_1
    //   107: invokevirtual 76	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   110: checkcast 78	java/util/Map
    //   113: putfield 59	com/tencent/mm/compatible/e/l:values	Ljava/util/Map;
    //   116: aload_1
    //   117: astore_3
    //   118: aload_2
    //   119: astore 4
    //   121: aload_1
    //   122: invokevirtual 81	java/io/ObjectInputStream:close	()V
    //   125: aload_1
    //   126: astore_3
    //   127: aload_2
    //   128: astore 4
    //   130: aload_2
    //   131: invokevirtual 82	java/io/FileInputStream:close	()V
    //   134: aload_2
    //   135: invokevirtual 82	java/io/FileInputStream:close	()V
    //   138: aload_1
    //   139: invokevirtual 81	java/io/ObjectInputStream:close	()V
    //   142: goto -71 -> 71
    //   145: astore_1
    //   146: ldc 84
    //   148: aload_1
    //   149: ldc 37
    //   151: iconst_0
    //   152: anewarray 4	java/lang/Object
    //   155: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   158: goto -87 -> 71
    //   161: astore_2
    //   162: ldc 84
    //   164: aload_2
    //   165: ldc 37
    //   167: iconst_0
    //   168: anewarray 4	java/lang/Object
    //   171: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   174: goto -36 -> 138
    //   177: astore 5
    //   179: aconst_null
    //   180: astore_1
    //   181: aconst_null
    //   182: astore_2
    //   183: aload_1
    //   184: astore_3
    //   185: aload_2
    //   186: astore 4
    //   188: new 56	java/util/HashMap
    //   191: astore 6
    //   193: aload_1
    //   194: astore_3
    //   195: aload_2
    //   196: astore 4
    //   198: aload 6
    //   200: invokespecial 57	java/util/HashMap:<init>	()V
    //   203: aload_1
    //   204: astore_3
    //   205: aload_2
    //   206: astore 4
    //   208: aload_0
    //   209: aload 6
    //   211: putfield 59	com/tencent/mm/compatible/e/l:values	Ljava/util/Map;
    //   214: aload_1
    //   215: astore_3
    //   216: aload_2
    //   217: astore 4
    //   219: ldc 84
    //   221: aload 5
    //   223: ldc 37
    //   225: iconst_0
    //   226: anewarray 4	java/lang/Object
    //   229: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   232: aload_2
    //   233: ifnull +7 -> 240
    //   236: aload_2
    //   237: invokevirtual 82	java/io/FileInputStream:close	()V
    //   240: aload_1
    //   241: ifnull -170 -> 71
    //   244: aload_1
    //   245: invokevirtual 81	java/io/ObjectInputStream:close	()V
    //   248: goto -177 -> 71
    //   251: astore_1
    //   252: ldc 84
    //   254: aload_1
    //   255: ldc 37
    //   257: iconst_0
    //   258: anewarray 4	java/lang/Object
    //   261: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   264: goto -193 -> 71
    //   267: astore_2
    //   268: ldc 84
    //   270: aload_2
    //   271: ldc 37
    //   273: iconst_0
    //   274: anewarray 4	java/lang/Object
    //   277: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   280: goto -40 -> 240
    //   283: astore_1
    //   284: aconst_null
    //   285: astore_3
    //   286: aconst_null
    //   287: astore_2
    //   288: aload_2
    //   289: ifnull +7 -> 296
    //   292: aload_2
    //   293: invokevirtual 82	java/io/FileInputStream:close	()V
    //   296: aload_3
    //   297: ifnull +7 -> 304
    //   300: aload_3
    //   301: invokevirtual 81	java/io/ObjectInputStream:close	()V
    //   304: ldc 27
    //   306: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   309: aload_1
    //   310: athrow
    //   311: astore_2
    //   312: ldc 84
    //   314: aload_2
    //   315: ldc 37
    //   317: iconst_0
    //   318: anewarray 4	java/lang/Object
    //   321: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   324: goto -28 -> 296
    //   327: astore_2
    //   328: ldc 84
    //   330: aload_2
    //   331: ldc 37
    //   333: iconst_0
    //   334: anewarray 4	java/lang/Object
    //   337: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   340: goto -36 -> 304
    //   343: astore_1
    //   344: aconst_null
    //   345: astore_3
    //   346: goto -58 -> 288
    //   349: astore_1
    //   350: aload 4
    //   352: astore_2
    //   353: goto -65 -> 288
    //   356: astore 5
    //   358: aconst_null
    //   359: astore_1
    //   360: goto -177 -> 183
    //   363: astore 5
    //   365: goto -182 -> 183
    //
    // Exception table:
    //   from	to	target	type
    //   138	142	145	java/io/IOException
    //   134	138	161	java/io/IOException
    //   25	49	177	java/lang/Exception
    //   49	71	177	java/lang/Exception
    //   82	91	177	java/lang/Exception
    //   244	248	251	java/io/IOException
    //   236	240	267	java/io/IOException
    //   25	49	283	finally
    //   49	71	283	finally
    //   82	91	283	finally
    //   292	296	311	java/io/IOException
    //   300	304	327	java/io/IOException
    //   91	100	343	finally
    //   105	116	349	finally
    //   121	125	349	finally
    //   130	134	349	finally
    //   188	193	349	finally
    //   198	203	349	finally
    //   208	214	349	finally
    //   219	232	349	finally
    //   91	100	356	java/lang/Exception
    //   105	116	363	java/lang/Exception
    //   121	125	363	java/lang/Exception
    //   130	134	363	java/lang/Exception
  }

  public static l Lu()
  {
    try
    {
      AppMethodBeat.i(92935);
      if (esK == null)
      {
        l locall = new com/tencent/mm/compatible/e/l;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        locall.<init>(e.eSj + "CompatibleInfo.cfg");
        esK = locall;
      }
      Object localObject1 = esK;
      AppMethodBeat.o(92935);
      return localObject1;
    }
    finally
    {
    }
  }

  // ERROR //
  private void Lv()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 114
    //   4: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 116	java/io/FileOutputStream
    //   10: astore_1
    //   11: aload_1
    //   12: aload_0
    //   13: getfield 39	com/tencent/mm/compatible/e/l:filePath	Ljava/lang/String;
    //   16: invokespecial 117	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   19: new 119	java/io/ObjectOutputStream
    //   22: astore_2
    //   23: aload_2
    //   24: aload_1
    //   25: invokespecial 122	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   28: aload_2
    //   29: astore_3
    //   30: aload_1
    //   31: astore 4
    //   33: aload_2
    //   34: aload_0
    //   35: getfield 59	com/tencent/mm/compatible/e/l:values	Ljava/util/Map;
    //   38: invokevirtual 126	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   41: aload_2
    //   42: astore_3
    //   43: aload_1
    //   44: astore 4
    //   46: aload_2
    //   47: invokevirtual 127	java/io/ObjectOutputStream:close	()V
    //   50: aload_2
    //   51: astore_3
    //   52: aload_1
    //   53: astore 4
    //   55: aload_1
    //   56: invokevirtual 130	java/io/FileOutputStream:flush	()V
    //   59: aload_2
    //   60: astore_3
    //   61: aload_1
    //   62: astore 4
    //   64: aload_1
    //   65: invokevirtual 131	java/io/FileOutputStream:close	()V
    //   68: aload_1
    //   69: invokevirtual 131	java/io/FileOutputStream:close	()V
    //   72: aload_2
    //   73: invokevirtual 127	java/io/ObjectOutputStream:close	()V
    //   76: ldc 114
    //   78: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   81: aload_0
    //   82: monitorexit
    //   83: return
    //   84: astore_1
    //   85: ldc 84
    //   87: aload_1
    //   88: ldc 37
    //   90: iconst_0
    //   91: anewarray 4	java/lang/Object
    //   94: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   97: goto -25 -> 72
    //   100: astore_2
    //   101: aload_0
    //   102: monitorexit
    //   103: aload_2
    //   104: athrow
    //   105: astore_2
    //   106: ldc 84
    //   108: aload_2
    //   109: ldc 37
    //   111: iconst_0
    //   112: anewarray 4	java/lang/Object
    //   115: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   118: ldc 114
    //   120: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   123: goto -42 -> 81
    //   126: astore 5
    //   128: aconst_null
    //   129: astore_2
    //   130: aconst_null
    //   131: astore_1
    //   132: aload_2
    //   133: astore_3
    //   134: aload_1
    //   135: astore 4
    //   137: ldc 84
    //   139: aload 5
    //   141: ldc 37
    //   143: iconst_0
    //   144: anewarray 4	java/lang/Object
    //   147: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   150: aload_1
    //   151: ifnull +7 -> 158
    //   154: aload_1
    //   155: invokevirtual 131	java/io/FileOutputStream:close	()V
    //   158: aload_2
    //   159: ifnull +112 -> 271
    //   162: aload_2
    //   163: invokevirtual 127	java/io/ObjectOutputStream:close	()V
    //   166: ldc 114
    //   168: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   171: goto -90 -> 81
    //   174: astore_1
    //   175: ldc 84
    //   177: aload_1
    //   178: ldc 37
    //   180: iconst_0
    //   181: anewarray 4	java/lang/Object
    //   184: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   187: goto -29 -> 158
    //   190: astore_2
    //   191: ldc 84
    //   193: aload_2
    //   194: ldc 37
    //   196: iconst_0
    //   197: anewarray 4	java/lang/Object
    //   200: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   203: ldc 114
    //   205: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   208: goto -127 -> 81
    //   211: astore_2
    //   212: aconst_null
    //   213: astore_3
    //   214: aconst_null
    //   215: astore_1
    //   216: aload_1
    //   217: ifnull +7 -> 224
    //   220: aload_1
    //   221: invokevirtual 131	java/io/FileOutputStream:close	()V
    //   224: aload_3
    //   225: ifnull +7 -> 232
    //   228: aload_3
    //   229: invokevirtual 127	java/io/ObjectOutputStream:close	()V
    //   232: ldc 114
    //   234: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   237: aload_2
    //   238: athrow
    //   239: astore_1
    //   240: ldc 84
    //   242: aload_1
    //   243: ldc 37
    //   245: iconst_0
    //   246: anewarray 4	java/lang/Object
    //   249: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   252: goto -28 -> 224
    //   255: astore_1
    //   256: ldc 84
    //   258: aload_1
    //   259: ldc 37
    //   261: iconst_0
    //   262: anewarray 4	java/lang/Object
    //   265: invokestatic 90	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   268: goto -36 -> 232
    //   271: ldc 114
    //   273: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   276: goto -195 -> 81
    //   279: astore_2
    //   280: aconst_null
    //   281: astore_3
    //   282: goto -66 -> 216
    //   285: astore_2
    //   286: aload 4
    //   288: astore_1
    //   289: goto -73 -> 216
    //   292: astore 5
    //   294: aconst_null
    //   295: astore_2
    //   296: goto -164 -> 132
    //   299: astore 5
    //   301: goto -169 -> 132
    //
    // Exception table:
    //   from	to	target	type
    //   68	72	84	java/io/IOException
    //   2	7	100	finally
    //   68	72	100	finally
    //   72	76	100	finally
    //   76	81	100	finally
    //   85	97	100	finally
    //   106	123	100	finally
    //   154	158	100	finally
    //   162	166	100	finally
    //   166	171	100	finally
    //   175	187	100	finally
    //   191	208	100	finally
    //   220	224	100	finally
    //   228	232	100	finally
    //   232	239	100	finally
    //   240	252	100	finally
    //   256	268	100	finally
    //   271	276	100	finally
    //   72	76	105	java/io/IOException
    //   7	19	126	java/io/IOException
    //   154	158	174	java/io/IOException
    //   162	166	190	java/io/IOException
    //   7	19	211	finally
    //   220	224	239	java/io/IOException
    //   228	232	255	java/io/IOException
    //   19	28	279	finally
    //   33	41	285	finally
    //   46	50	285	finally
    //   55	59	285	finally
    //   64	68	285	finally
    //   137	150	285	finally
    //   19	28	292	java/io/IOException
    //   33	41	299	java/io/IOException
    //   46	50	299	java/io/IOException
    //   55	59	299	java/io/IOException
    //   64	68	299	java/io/IOException
  }

  public final Object aH(int paramInt)
  {
    AppMethodBeat.i(92939);
    Object localObject = this.values.get(Integer.valueOf(paramInt));
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(92939);
    }
    while (true)
    {
      return localObject;
      AppMethodBeat.o(92939);
    }
  }

  public final Object get(int paramInt)
  {
    AppMethodBeat.i(92938);
    Object localObject = this.values.get(Integer.valueOf(paramInt));
    AppMethodBeat.o(92938);
    return localObject;
  }

  public final void set(int paramInt, Object paramObject)
  {
    try
    {
      AppMethodBeat.i(92937);
      this.values.put(Integer.valueOf(paramInt), paramObject);
      if (!this.esJ)
        Lv();
      AppMethodBeat.o(92937);
      return;
    }
    finally
    {
    }
    throw paramObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.e.l
 * JD-Core Version:    0.6.2
 */