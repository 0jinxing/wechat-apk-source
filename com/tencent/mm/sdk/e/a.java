package com.tencent.mm.sdk.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Properties;

public final class a
{
  private String filePath;
  private Properties xCY;

  // ERROR //
  public a(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 17	java/lang/Object:<init>	()V
    //   4: ldc 18
    //   6: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: aconst_null
    //   11: putfield 26	com/tencent/mm/sdk/e/a:xCY	Ljava/util/Properties;
    //   14: aload_0
    //   15: aconst_null
    //   16: putfield 28	com/tencent/mm/sdk/e/a:filePath	Ljava/lang/String;
    //   19: aload_0
    //   20: new 30	java/util/Properties
    //   23: dup
    //   24: invokespecial 31	java/util/Properties:<init>	()V
    //   27: putfield 26	com/tencent/mm/sdk/e/a:xCY	Ljava/util/Properties;
    //   30: aload_0
    //   31: aload_1
    //   32: putfield 28	com/tencent/mm/sdk/e/a:filePath	Ljava/lang/String;
    //   35: new 33	java/io/FileInputStream
    //   38: astore_2
    //   39: aload_2
    //   40: aload_1
    //   41: invokespecial 35	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   44: aload_2
    //   45: astore_3
    //   46: aload_0
    //   47: getfield 26	com/tencent/mm/sdk/e/a:xCY	Ljava/util/Properties;
    //   50: aload_2
    //   51: invokevirtual 39	java/util/Properties:load	(Ljava/io/InputStream;)V
    //   54: aload_2
    //   55: invokevirtual 42	java/io/FileInputStream:close	()V
    //   58: ldc 18
    //   60: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   63: return
    //   64: astore_3
    //   65: ldc 47
    //   67: ldc 49
    //   69: iconst_2
    //   70: anewarray 4	java/lang/Object
    //   73: dup
    //   74: iconst_0
    //   75: aload_1
    //   76: aastore
    //   77: dup
    //   78: iconst_1
    //   79: aload_3
    //   80: invokevirtual 53	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   83: aastore
    //   84: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   87: ldc 18
    //   89: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   92: goto -29 -> 63
    //   95: astore 4
    //   97: aconst_null
    //   98: astore_2
    //   99: aload_2
    //   100: astore_3
    //   101: ldc 47
    //   103: ldc 61
    //   105: iconst_2
    //   106: anewarray 4	java/lang/Object
    //   109: dup
    //   110: iconst_0
    //   111: aload_1
    //   112: aastore
    //   113: dup
    //   114: iconst_1
    //   115: aload 4
    //   117: invokevirtual 62	java/lang/Exception:getLocalizedMessage	()Ljava/lang/String;
    //   120: aastore
    //   121: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   124: aload_2
    //   125: ifnull +90 -> 215
    //   128: aload_2
    //   129: invokevirtual 42	java/io/FileInputStream:close	()V
    //   132: ldc 18
    //   134: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   137: goto -74 -> 63
    //   140: astore_3
    //   141: ldc 47
    //   143: ldc 49
    //   145: iconst_2
    //   146: anewarray 4	java/lang/Object
    //   149: dup
    //   150: iconst_0
    //   151: aload_1
    //   152: aastore
    //   153: dup
    //   154: iconst_1
    //   155: aload_3
    //   156: invokevirtual 53	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   159: aastore
    //   160: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   163: ldc 18
    //   165: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   168: goto -105 -> 63
    //   171: astore_2
    //   172: aconst_null
    //   173: astore_3
    //   174: aload_3
    //   175: ifnull +7 -> 182
    //   178: aload_3
    //   179: invokevirtual 42	java/io/FileInputStream:close	()V
    //   182: ldc 18
    //   184: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   187: aload_2
    //   188: athrow
    //   189: astore_3
    //   190: ldc 47
    //   192: ldc 49
    //   194: iconst_2
    //   195: anewarray 4	java/lang/Object
    //   198: dup
    //   199: iconst_0
    //   200: aload_1
    //   201: aastore
    //   202: dup
    //   203: iconst_1
    //   204: aload_3
    //   205: invokevirtual 53	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   208: aastore
    //   209: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   212: goto -30 -> 182
    //   215: ldc 18
    //   217: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   220: goto -157 -> 63
    //   223: astore_2
    //   224: goto -50 -> 174
    //   227: astore 4
    //   229: goto -130 -> 99
    //
    // Exception table:
    //   from	to	target	type
    //   54	58	64	java/io/IOException
    //   35	44	95	java/lang/Exception
    //   128	132	140	java/io/IOException
    //   35	44	171	finally
    //   178	182	189	java/io/IOException
    //   46	54	223	finally
    //   101	124	223	finally
    //   46	54	227	java/lang/Exception
  }

  public static boolean aB(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(52494);
    boolean bool = new a(paramString1).hV(paramString2, paramString3);
    AppMethodBeat.o(52494);
    return bool;
  }

  public static String getValue(String paramString1, String paramString2)
  {
    AppMethodBeat.i(52492);
    paramString1 = new a(paramString1).getValue(paramString2);
    AppMethodBeat.o(52492);
    return paramString1;
  }

  public static Long hW(String paramString1, String paramString2)
  {
    AppMethodBeat.i(52493);
    paramString1 = new a(paramString1).anD(paramString2);
    AppMethodBeat.o(52493);
    return paramString1;
  }

  public static boolean hX(String paramString1, String paramString2)
  {
    AppMethodBeat.i(52496);
    boolean bool = new a(paramString1).ej(paramString2, 0);
    AppMethodBeat.o(52496);
    return bool;
  }

  public static boolean p(String paramString1, String paramString2, long paramLong)
  {
    AppMethodBeat.i(52495);
    boolean bool = new a(paramString1).aK(paramString2, paramLong);
    AppMethodBeat.o(52495);
    return bool;
  }

  public final boolean aK(String paramString, long paramLong)
  {
    AppMethodBeat.i(52487);
    boolean bool = hV(paramString, String.valueOf(paramLong));
    AppMethodBeat.o(52487);
    return bool;
  }

  public final Long anD(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(52490);
    paramString = getValue(paramString);
    if (paramString == null)
    {
      AppMethodBeat.o(52490);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        long l = Long.parseLong(paramString);
        paramString = Long.valueOf(l);
        AppMethodBeat.o(52490);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.ReadConfig", "getLongValue ParseLong : %s Failed. [%s]", new Object[] { paramString, localException.getLocalizedMessage() });
        AppMethodBeat.o(52490);
        paramString = localObject;
      }
    }
  }

  public final Integer anE(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(52491);
    paramString = getValue(paramString);
    if (paramString == null)
    {
      AppMethodBeat.o(52491);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      try
      {
        int i = Integer.parseInt(paramString);
        paramString = Integer.valueOf(i);
        AppMethodBeat.o(52491);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.ReadConfig", "getIntegerValue ParseInteger : %s Failed. [%s]", new Object[] { paramString, localException.getLocalizedMessage() });
        AppMethodBeat.o(52491);
        paramString = localObject;
      }
    }
  }

  public final boolean ej(String paramString, int paramInt)
  {
    AppMethodBeat.i(52488);
    boolean bool = hV(paramString, String.valueOf(paramInt));
    AppMethodBeat.o(52488);
    return bool;
  }

  public final String getValue(String paramString)
  {
    AppMethodBeat.i(52489);
    if ((this.xCY != null) && (this.xCY.containsKey(paramString)))
    {
      paramString = this.xCY.getProperty(paramString);
      AppMethodBeat.o(52489);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(52489);
    }
  }

  // ERROR //
  public final boolean hV(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: ldc 143
    //   4: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 145	java/io/FileOutputStream
    //   10: astore 4
    //   12: aload 4
    //   14: aload_0
    //   15: getfield 28	com/tencent/mm/sdk/e/a:filePath	Ljava/lang/String;
    //   18: invokespecial 146	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   21: aload 4
    //   23: astore 5
    //   25: aload_0
    //   26: getfield 26	com/tencent/mm/sdk/e/a:xCY	Ljava/util/Properties;
    //   29: aload_1
    //   30: aload_2
    //   31: invokevirtual 150	java/util/Properties:setProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    //   34: pop
    //   35: aload 4
    //   37: astore 5
    //   39: aload_0
    //   40: getfield 26	com/tencent/mm/sdk/e/a:xCY	Ljava/util/Properties;
    //   43: aload 4
    //   45: ldc 152
    //   47: invokevirtual 156	java/util/Properties:store	(Ljava/io/OutputStream;Ljava/lang/String;)V
    //   50: aload 4
    //   52: invokevirtual 157	java/io/FileOutputStream:close	()V
    //   55: ldc 143
    //   57: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   60: iload_3
    //   61: ireturn
    //   62: astore_1
    //   63: ldc 47
    //   65: ldc 49
    //   67: iconst_2
    //   68: anewarray 4	java/lang/Object
    //   71: dup
    //   72: iconst_0
    //   73: aload_0
    //   74: getfield 28	com/tencent/mm/sdk/e/a:filePath	Ljava/lang/String;
    //   77: aastore
    //   78: dup
    //   79: iconst_1
    //   80: aload_1
    //   81: invokevirtual 53	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   84: aastore
    //   85: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   88: goto -33 -> 55
    //   91: astore_2
    //   92: aconst_null
    //   93: astore_1
    //   94: aload_1
    //   95: astore 5
    //   97: ldc 47
    //   99: ldc 159
    //   101: iconst_2
    //   102: anewarray 4	java/lang/Object
    //   105: dup
    //   106: iconst_0
    //   107: aload_0
    //   108: getfield 28	com/tencent/mm/sdk/e/a:filePath	Ljava/lang/String;
    //   111: aastore
    //   112: dup
    //   113: iconst_1
    //   114: aload_2
    //   115: invokevirtual 62	java/lang/Exception:getLocalizedMessage	()Ljava/lang/String;
    //   118: aastore
    //   119: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   122: aload_1
    //   123: ifnull +104 -> 227
    //   126: aload_1
    //   127: invokevirtual 157	java/io/FileOutputStream:close	()V
    //   130: iconst_0
    //   131: istore_3
    //   132: goto -77 -> 55
    //   135: astore_1
    //   136: ldc 47
    //   138: ldc 49
    //   140: iconst_2
    //   141: anewarray 4	java/lang/Object
    //   144: dup
    //   145: iconst_0
    //   146: aload_0
    //   147: getfield 28	com/tencent/mm/sdk/e/a:filePath	Ljava/lang/String;
    //   150: aastore
    //   151: dup
    //   152: iconst_1
    //   153: aload_1
    //   154: invokevirtual 53	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   157: aastore
    //   158: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   161: iconst_0
    //   162: istore_3
    //   163: goto -108 -> 55
    //   166: astore_1
    //   167: aconst_null
    //   168: astore 5
    //   170: aload 5
    //   172: ifnull +8 -> 180
    //   175: aload 5
    //   177: invokevirtual 157	java/io/FileOutputStream:close	()V
    //   180: ldc 143
    //   182: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   185: aload_1
    //   186: athrow
    //   187: astore_2
    //   188: ldc 47
    //   190: ldc 49
    //   192: iconst_2
    //   193: anewarray 4	java/lang/Object
    //   196: dup
    //   197: iconst_0
    //   198: aload_0
    //   199: getfield 28	com/tencent/mm/sdk/e/a:filePath	Ljava/lang/String;
    //   202: aastore
    //   203: dup
    //   204: iconst_1
    //   205: aload_2
    //   206: invokevirtual 53	java/io/IOException:getLocalizedMessage	()Ljava/lang/String;
    //   209: aastore
    //   210: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   213: goto -33 -> 180
    //   216: astore_1
    //   217: goto -47 -> 170
    //   220: astore_2
    //   221: aload 4
    //   223: astore_1
    //   224: goto -130 -> 94
    //   227: iconst_0
    //   228: istore_3
    //   229: goto -174 -> 55
    //
    // Exception table:
    //   from	to	target	type
    //   50	55	62	java/io/IOException
    //   7	21	91	java/lang/Exception
    //   126	130	135	java/io/IOException
    //   7	21	166	finally
    //   175	180	187	java/io/IOException
    //   25	35	216	finally
    //   39	50	216	finally
    //   97	122	216	finally
    //   25	35	220	java/lang/Exception
    //   39	50	220	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.e.a
 * JD-Core Version:    0.6.2
 */