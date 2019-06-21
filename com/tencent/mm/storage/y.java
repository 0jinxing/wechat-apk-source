package com.tencent.mm.storage;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class y
{
  private boolean esJ;
  private String filePath;
  private Map<Integer, Object> values;
  public boolean xIr;
  public boolean xIs;

  public y(String paramString)
  {
    AppMethodBeat.i(58952);
    this.esJ = false;
    this.filePath = "";
    this.xIr = false;
    this.xIs = false;
    if (!new File(paramString).exists())
      ab.e("MicroMsg.ConfigFileStorage", "ConfigFileStorage not exit path[%s]", new Object[] { paramString });
    this.filePath = paramString;
    dsa();
    this.esJ = false;
    AppMethodBeat.o(58952);
  }

  // ERROR //
  private void Lv()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 66
    //   4: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: invokestatic 72	com/tencent/mm/sdk/platformtools/bo:anU	()J
    //   10: lstore_1
    //   11: new 74	java/io/FileOutputStream
    //   14: astore_3
    //   15: aload_3
    //   16: aload_0
    //   17: getfield 31	com/tencent/mm/storage/y:filePath	Ljava/lang/String;
    //   20: invokespecial 75	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   23: new 77	java/io/ObjectOutputStream
    //   26: astore 4
    //   28: aload 4
    //   30: aload_3
    //   31: invokespecial 80	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   34: aload 4
    //   36: aload_0
    //   37: getfield 82	com/tencent/mm/storage/y:values	Ljava/util/Map;
    //   40: invokevirtual 86	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   43: aload_3
    //   44: invokevirtual 89	java/io/FileOutputStream:flush	()V
    //   47: aload_0
    //   48: iconst_0
    //   49: putfield 35	com/tencent/mm/storage/y:xIs	Z
    //   52: ldc 45
    //   54: ldc 91
    //   56: iconst_2
    //   57: anewarray 4	java/lang/Object
    //   60: dup
    //   61: iconst_0
    //   62: aload_0
    //   63: getfield 82	com/tencent/mm/storage/y:values	Ljava/util/Map;
    //   66: invokeinterface 97 1 0
    //   71: invokeinterface 103 1 0
    //   76: arraylength
    //   77: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   80: aastore
    //   81: dup
    //   82: iconst_1
    //   83: lload_1
    //   84: invokestatic 113	com/tencent/mm/sdk/platformtools/bo:gb	(J)J
    //   87: invokestatic 118	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   90: aastore
    //   91: invokestatic 121	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   94: aload 4
    //   96: invokevirtual 124	java/io/ObjectOutputStream:close	()V
    //   99: aload_3
    //   100: invokevirtual 125	java/io/FileOutputStream:close	()V
    //   103: ldc 66
    //   105: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   108: aload_0
    //   109: monitorexit
    //   110: return
    //   111: astore 5
    //   113: ldc 66
    //   115: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   118: goto -10 -> 108
    //   121: astore 5
    //   123: aload_0
    //   124: monitorexit
    //   125: aload 5
    //   127: athrow
    //   128: astore_3
    //   129: aconst_null
    //   130: astore 4
    //   132: aconst_null
    //   133: astore 5
    //   135: ldc 45
    //   137: ldc 127
    //   139: iconst_1
    //   140: anewarray 4	java/lang/Object
    //   143: dup
    //   144: iconst_0
    //   145: aload_3
    //   146: invokestatic 131	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   149: aastore
    //   150: invokestatic 53	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   153: ldc 45
    //   155: aload_3
    //   156: ldc 133
    //   158: iconst_0
    //   159: anewarray 4	java/lang/Object
    //   162: invokestatic 137	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   165: getstatic 143	com/tencent/mm/plugin/report/e:pXa	Lcom/tencent/mm/plugin/report/e;
    //   168: ldc2_w 144
    //   171: ldc2_w 146
    //   174: lconst_1
    //   175: iconst_1
    //   176: invokevirtual 151	com/tencent/mm/plugin/report/e:a	(JJJZ)V
    //   179: aload_0
    //   180: iconst_1
    //   181: putfield 35	com/tencent/mm/storage/y:xIs	Z
    //   184: aload 4
    //   186: ifnull +8 -> 194
    //   189: aload 4
    //   191: invokevirtual 124	java/io/ObjectOutputStream:close	()V
    //   194: aload 5
    //   196: ifnull +8 -> 204
    //   199: aload 5
    //   201: invokevirtual 125	java/io/FileOutputStream:close	()V
    //   204: ldc 66
    //   206: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   209: goto -101 -> 108
    //   212: astore 5
    //   214: ldc 66
    //   216: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   219: goto -111 -> 108
    //   222: astore 5
    //   224: aconst_null
    //   225: astore 4
    //   227: aconst_null
    //   228: astore_3
    //   229: aload 4
    //   231: ifnull +8 -> 239
    //   234: aload 4
    //   236: invokevirtual 124	java/io/ObjectOutputStream:close	()V
    //   239: aload_3
    //   240: ifnull +7 -> 247
    //   243: aload_3
    //   244: invokevirtual 125	java/io/FileOutputStream:close	()V
    //   247: ldc 66
    //   249: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   252: aload 5
    //   254: athrow
    //   255: astore 4
    //   257: goto -10 -> 247
    //   260: astore 5
    //   262: aconst_null
    //   263: astore 4
    //   265: goto -36 -> 229
    //   268: astore 5
    //   270: goto -41 -> 229
    //   273: astore_3
    //   274: aload 5
    //   276: astore 6
    //   278: aload_3
    //   279: astore 5
    //   281: aload 6
    //   283: astore_3
    //   284: goto -55 -> 229
    //   287: astore 4
    //   289: aconst_null
    //   290: astore 6
    //   292: aload_3
    //   293: astore 5
    //   295: aload 4
    //   297: astore_3
    //   298: aload 6
    //   300: astore 4
    //   302: goto -167 -> 135
    //   305: astore 5
    //   307: aload_3
    //   308: astore 6
    //   310: aload 5
    //   312: astore_3
    //   313: aload 6
    //   315: astore 5
    //   317: goto -182 -> 135
    //
    // Exception table:
    //   from	to	target	type
    //   94	103	111	java/lang/Exception
    //   2	7	121	finally
    //   94	103	121	finally
    //   103	108	121	finally
    //   113	118	121	finally
    //   189	194	121	finally
    //   199	204	121	finally
    //   204	209	121	finally
    //   214	219	121	finally
    //   234	239	121	finally
    //   243	247	121	finally
    //   247	255	121	finally
    //   7	23	128	java/io/IOException
    //   189	194	212	java/lang/Exception
    //   199	204	212	java/lang/Exception
    //   7	23	222	finally
    //   234	239	255	java/lang/Exception
    //   243	247	255	java/lang/Exception
    //   23	34	260	finally
    //   34	94	268	finally
    //   135	184	273	finally
    //   23	34	287	java/io/IOException
    //   34	94	305	java/io/IOException
  }

  // ERROR //
  private void dsa()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 152
    //   4: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 37	java/io/File
    //   10: astore_1
    //   11: aload_1
    //   12: aload_0
    //   13: getfield 31	com/tencent/mm/storage/y:filePath	Ljava/lang/String;
    //   16: invokespecial 39	java/io/File:<init>	(Ljava/lang/String;)V
    //   19: aload_1
    //   20: invokevirtual 43	java/io/File:exists	()Z
    //   23: ifne +33 -> 56
    //   26: aload_1
    //   27: invokevirtual 155	java/io/File:createNewFile	()Z
    //   30: istore_2
    //   31: ldc 45
    //   33: ldc 157
    //   35: iconst_2
    //   36: anewarray 4	java/lang/Object
    //   39: dup
    //   40: iconst_0
    //   41: aload_0
    //   42: getfield 31	com/tencent/mm/storage/y:filePath	Ljava/lang/String;
    //   45: aastore
    //   46: dup
    //   47: iconst_1
    //   48: iload_2
    //   49: invokestatic 162	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   52: aastore
    //   53: invokestatic 165	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   56: aload_1
    //   57: invokevirtual 168	java/io/File:length	()J
    //   60: lconst_0
    //   61: lcmp
    //   62: ifne +42 -> 104
    //   65: new 170	java/util/HashMap
    //   68: astore_1
    //   69: aload_1
    //   70: invokespecial 171	java/util/HashMap:<init>	()V
    //   73: aload_0
    //   74: aload_1
    //   75: putfield 82	com/tencent/mm/storage/y:values	Ljava/util/Map;
    //   78: ldc 45
    //   80: ldc 173
    //   82: iconst_1
    //   83: anewarray 4	java/lang/Object
    //   86: dup
    //   87: iconst_0
    //   88: aload_0
    //   89: getfield 31	com/tencent/mm/storage/y:filePath	Ljava/lang/String;
    //   92: aastore
    //   93: invokestatic 165	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   96: ldc 152
    //   98: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   101: aload_0
    //   102: monitorexit
    //   103: return
    //   104: new 175	java/io/FileInputStream
    //   107: dup
    //   108: aload_1
    //   109: invokespecial 178	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   112: astore_3
    //   113: new 180	java/io/ObjectInputStream
    //   116: astore_1
    //   117: aload_1
    //   118: aload_3
    //   119: invokespecial 183	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   122: aload_1
    //   123: astore 4
    //   125: aload_3
    //   126: astore 5
    //   128: aload_0
    //   129: aload_1
    //   130: invokevirtual 187	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   133: checkcast 93	java/util/Map
    //   136: putfield 82	com/tencent/mm/storage/y:values	Ljava/util/Map;
    //   139: aload_1
    //   140: astore 4
    //   142: aload_3
    //   143: astore 5
    //   145: ldc 45
    //   147: ldc 189
    //   149: iconst_1
    //   150: anewarray 4	java/lang/Object
    //   153: dup
    //   154: iconst_0
    //   155: aload_0
    //   156: getfield 82	com/tencent/mm/storage/y:values	Ljava/util/Map;
    //   159: invokeinterface 193 1 0
    //   164: invokestatic 109	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   167: aastore
    //   168: invokestatic 195	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   171: aload_1
    //   172: astore 4
    //   174: aload_3
    //   175: astore 5
    //   177: aload_0
    //   178: iconst_0
    //   179: putfield 33	com/tencent/mm/storage/y:xIr	Z
    //   182: aload_1
    //   183: invokevirtual 196	java/io/ObjectInputStream:close	()V
    //   186: aload_3
    //   187: invokevirtual 197	java/io/FileInputStream:close	()V
    //   190: ldc 152
    //   192: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   195: goto -94 -> 101
    //   198: astore_1
    //   199: aload_0
    //   200: monitorexit
    //   201: aload_1
    //   202: athrow
    //   203: astore_1
    //   204: ldc 152
    //   206: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   209: goto -108 -> 101
    //   212: astore 6
    //   214: aconst_null
    //   215: astore_1
    //   216: aconst_null
    //   217: astore_3
    //   218: aload_1
    //   219: astore 4
    //   221: aload_3
    //   222: astore 5
    //   224: new 170	java/util/HashMap
    //   227: astore 7
    //   229: aload_1
    //   230: astore 4
    //   232: aload_3
    //   233: astore 5
    //   235: aload 7
    //   237: invokespecial 171	java/util/HashMap:<init>	()V
    //   240: aload_1
    //   241: astore 4
    //   243: aload_3
    //   244: astore 5
    //   246: aload_0
    //   247: aload 7
    //   249: putfield 82	com/tencent/mm/storage/y:values	Ljava/util/Map;
    //   252: aload_1
    //   253: astore 4
    //   255: aload_3
    //   256: astore 5
    //   258: ldc 45
    //   260: aload 6
    //   262: ldc 199
    //   264: iconst_0
    //   265: anewarray 4	java/lang/Object
    //   268: invokestatic 137	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   271: aload_1
    //   272: astore 4
    //   274: aload_3
    //   275: astore 5
    //   277: aload_0
    //   278: iconst_1
    //   279: putfield 33	com/tencent/mm/storage/y:xIr	Z
    //   282: aload_1
    //   283: ifnull +7 -> 290
    //   286: aload_1
    //   287: invokevirtual 196	java/io/ObjectInputStream:close	()V
    //   290: aload_3
    //   291: ifnull +7 -> 298
    //   294: aload_3
    //   295: invokevirtual 197	java/io/FileInputStream:close	()V
    //   298: ldc 152
    //   300: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   303: goto -202 -> 101
    //   306: astore_1
    //   307: ldc 152
    //   309: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   312: goto -211 -> 101
    //   315: astore_1
    //   316: aconst_null
    //   317: astore 4
    //   319: aconst_null
    //   320: astore_3
    //   321: aload 4
    //   323: ifnull +8 -> 331
    //   326: aload 4
    //   328: invokevirtual 196	java/io/ObjectInputStream:close	()V
    //   331: aload_3
    //   332: ifnull +7 -> 339
    //   335: aload_3
    //   336: invokevirtual 197	java/io/FileInputStream:close	()V
    //   339: ldc 152
    //   341: invokestatic 59	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   344: aload_1
    //   345: athrow
    //   346: astore_3
    //   347: goto -8 -> 339
    //   350: astore_1
    //   351: aconst_null
    //   352: astore 4
    //   354: goto -33 -> 321
    //   357: astore_1
    //   358: aload 5
    //   360: astore_3
    //   361: goto -40 -> 321
    //   364: astore 6
    //   366: aconst_null
    //   367: astore_1
    //   368: goto -150 -> 218
    //   371: astore 6
    //   373: goto -155 -> 218
    //
    // Exception table:
    //   from	to	target	type
    //   2	7	198	finally
    //   96	101	198	finally
    //   182	190	198	finally
    //   190	195	198	finally
    //   204	209	198	finally
    //   286	290	198	finally
    //   294	298	198	finally
    //   298	303	198	finally
    //   307	312	198	finally
    //   326	331	198	finally
    //   335	339	198	finally
    //   339	346	198	finally
    //   182	190	203	java/lang/Exception
    //   7	56	212	java/lang/Exception
    //   56	96	212	java/lang/Exception
    //   104	113	212	java/lang/Exception
    //   286	290	306	java/lang/Exception
    //   294	298	306	java/lang/Exception
    //   7	56	315	finally
    //   56	96	315	finally
    //   104	113	315	finally
    //   326	331	346	java/lang/Exception
    //   335	339	346	java/lang/Exception
    //   113	122	350	finally
    //   128	139	357	finally
    //   145	171	357	finally
    //   177	182	357	finally
    //   224	229	357	finally
    //   235	240	357	finally
    //   246	252	357	finally
    //   258	271	357	finally
    //   277	282	357	finally
    //   113	122	364	java/lang/Exception
    //   128	139	371	java/lang/Exception
    //   145	171	371	java/lang/Exception
    //   177	182	371	java/lang/Exception
  }

  public final int Ml(int paramInt)
  {
    try
    {
      AppMethodBeat.i(58961);
      Integer localInteger = (Integer)get(paramInt);
      if (localInteger == null)
      {
        paramInt = 0;
        AppMethodBeat.o(58961);
      }
      while (true)
      {
        return paramInt;
        paramInt = localInteger.intValue();
        AppMethodBeat.o(58961);
      }
    }
    finally
    {
    }
  }

  public final void doc()
  {
    try
    {
      this.esJ = true;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void drZ()
  {
    try
    {
      AppMethodBeat.i(58956);
      this.esJ = false;
      Lv();
      AppMethodBeat.o(58956);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final Object get(int paramInt)
  {
    try
    {
      AppMethodBeat.i(58954);
      Object localObject1 = this.values.get(Integer.valueOf(paramInt));
      AppMethodBeat.o(58954);
      return localObject1;
    }
    finally
    {
      localObject2 = finally;
      throw localObject2;
    }
  }

  public final Object get(int paramInt, Object paramObject)
  {
    try
    {
      AppMethodBeat.i(58955);
      Object localObject = this.values.get(Integer.valueOf(paramInt));
      if (localObject == null)
        AppMethodBeat.o(58955);
      while (true)
      {
        return paramObject;
        AppMethodBeat.o(58955);
        paramObject = localObject;
      }
    }
    finally
    {
    }
    throw paramObject;
  }

  public long getLong(int paramInt, long paramLong)
  {
    try
    {
      AppMethodBeat.i(58963);
      Long localLong = (Long)get(paramInt);
      if (localLong == null)
        AppMethodBeat.o(58963);
      while (true)
      {
        return paramLong;
        paramLong = localLong.longValue();
        AppMethodBeat.o(58963);
      }
    }
    finally
    {
    }
  }

  public final void reset()
  {
    try
    {
      AppMethodBeat.i(58959);
      ab.i("MicroMsg.ConfigFileStorage", "ConfigFileStorage reset ");
      Object localObject1 = new java/io/File;
      ((File)localObject1).<init>(this.filePath);
      if (((File)localObject1).exists())
        ((File)localObject1).delete();
      localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>();
      this.values = ((Map)localObject1);
      AppMethodBeat.o(58959);
      return;
    }
    finally
    {
    }
  }

  public final void set(int paramInt, Object paramObject)
  {
    try
    {
      AppMethodBeat.i(58953);
      this.values.put(Integer.valueOf(paramInt), paramObject);
      if (!this.esJ)
        Lv();
      AppMethodBeat.o(58953);
      return;
    }
    finally
    {
    }
    throw paramObject;
  }

  public final void setInt(int paramInt1, int paramInt2)
  {
    try
    {
      AppMethodBeat.i(58960);
      set(paramInt1, Integer.valueOf(paramInt2));
      AppMethodBeat.o(58960);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void setLong(int paramInt, long paramLong)
  {
    try
    {
      AppMethodBeat.i(58962);
      set(paramInt, Long.valueOf(paramLong));
      AppMethodBeat.o(58962);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.y
 * JD-Core Version:    0.6.2
 */