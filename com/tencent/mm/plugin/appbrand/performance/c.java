package com.tencent.mm.plugin.appbrand.performance;

import android.annotation.SuppressLint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@SuppressLint({"DefaultLocale"})
public final class c
{
  private static long cdW;
  private static final List<c.a> ivN;

  static
  {
    AppMethodBeat.i(114389);
    ivN = Collections.synchronizedList(new LinkedList());
    AppMethodBeat.o(114389);
  }

  static boolean Do(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(114387);
    StringBuilder localStringBuilder = new StringBuilder();
    while (true)
    {
      synchronized (ivN)
      {
        if (ivN.size() == 0)
        {
          AppMethodBeat.o(114387);
          return bool;
        }
        ab.d("MicroMsg.AppBrandPerformanceTracer", "dumpTrace events size: %d", new Object[] { Integer.valueOf(ivN.size()) });
        Iterator localIterator = ivN.iterator();
        if (localIterator.hasNext())
        {
          c.a locala = (c.a)localIterator.next();
          if ((!locala.appId.equals(paramString)) || (locala.start < cdW))
            continue;
          localStringBuilder.append(locala.toString()).append("\n");
        }
      }
      ivN.clear();
      bool = cJ(paramString, localStringBuilder.toString());
      AppMethodBeat.o(114387);
    }
  }

  public static void a(String paramString1, String paramString2, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(114383);
    a(paramString1, "Native", paramString2, paramLong1, paramLong2, null);
    AppMethodBeat.o(114383);
  }

  public static void a(String paramString1, String paramString2, String paramString3, double paramDouble)
  {
    AppMethodBeat.i(114385);
    long l = System.currentTimeMillis();
    a(paramString1, paramString2, paramString3, "C", l, l, String.format("{ \"%s\": %f }", new Object[] { paramString3, Double.valueOf(paramDouble) }));
    AppMethodBeat.o(114385);
  }

  public static void a(String paramString1, String paramString2, String paramString3, long paramLong1, long paramLong2, String paramString4)
  {
    AppMethodBeat.i(114384);
    a(paramString1, paramString2, paramString3, "X", paramLong1, paramLong2, paramString4);
    AppMethodBeat.o(114384);
  }

  public static void a(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong1, long paramLong2, String paramString5)
  {
    AppMethodBeat.i(114386);
    c.a locala = new c.a();
    locala.appId = paramString1;
    locala.name = paramString3;
    locala.category = paramString2;
    locala.ivO = paramString4;
    locala.start = paramLong1;
    locala.aZV = paramLong2;
    if (paramString5 != null);
    for (paramString1 = URLEncoder.encode(paramString5); ; paramString1 = "")
    {
      locala.ivP = paramString1;
      if (ivN.size() < 10000)
        ivN.add(locala);
      AppMethodBeat.o(114386);
      return;
    }
  }

  // ERROR //
  private static final boolean cJ(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: iconst_0
    //   3: istore_3
    //   4: ldc 182
    //   6: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: invokestatic 187	com/tencent/mm/compatible/util/f:Mn	()Z
    //   12: ifne +19 -> 31
    //   15: ldc 54
    //   17: ldc 189
    //   19: invokestatic 193	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   22: ldc 182
    //   24: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   27: iload_3
    //   28: istore_2
    //   29: iload_2
    //   30: ireturn
    //   31: aconst_null
    //   32: astore 4
    //   34: aconst_null
    //   35: astore 5
    //   37: aload 4
    //   39: astore 6
    //   41: new 45	java/lang/StringBuilder
    //   44: astore 7
    //   46: aload 4
    //   48: astore 6
    //   50: aload 7
    //   52: invokespecial 46	java/lang/StringBuilder:<init>	()V
    //   55: aload 4
    //   57: astore 6
    //   59: aload 7
    //   61: invokestatic 199	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   64: invokevirtual 204	java/io/File:getAbsolutePath	()Ljava/lang/String;
    //   67: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   70: ldc 206
    //   72: invokevirtual 105	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   78: astore 8
    //   80: aload 4
    //   82: astore 6
    //   84: new 201	java/io/File
    //   87: astore 7
    //   89: aload 4
    //   91: astore 6
    //   93: aload 7
    //   95: aload 8
    //   97: invokespecial 209	java/io/File:<init>	(Ljava/lang/String;)V
    //   100: aload 4
    //   102: astore 6
    //   104: aload 7
    //   106: invokevirtual 212	java/io/File:exists	()Z
    //   109: ifne +13 -> 122
    //   112: aload 4
    //   114: astore 6
    //   116: aload 7
    //   118: invokevirtual 215	java/io/File:mkdirs	()Z
    //   121: pop
    //   122: aload 4
    //   124: astore 6
    //   126: ldc 217
    //   128: iconst_2
    //   129: anewarray 4	java/lang/Object
    //   132: dup
    //   133: iconst_0
    //   134: aload_0
    //   135: aastore
    //   136: dup
    //   137: iconst_1
    //   138: getstatic 97	com/tencent/mm/plugin/appbrand/performance/c:cdW	J
    //   141: invokestatic 222	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   144: aastore
    //   145: invokestatic 144	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   148: astore_0
    //   149: aload 4
    //   151: astore 6
    //   153: new 201	java/io/File
    //   156: astore 8
    //   158: aload 4
    //   160: astore 6
    //   162: aload 8
    //   164: aload 7
    //   166: aload_0
    //   167: invokespecial 225	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   170: aload 4
    //   172: astore 6
    //   174: new 227	java/io/FileWriter
    //   177: astore_0
    //   178: aload 4
    //   180: astore 6
    //   182: aload_0
    //   183: aload 8
    //   185: iconst_1
    //   186: invokespecial 230	java/io/FileWriter:<init>	(Ljava/io/File;Z)V
    //   189: aload_0
    //   190: aload_1
    //   191: invokevirtual 233	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   194: aload_0
    //   195: invokevirtual 236	java/io/FileWriter:close	()V
    //   198: ldc 182
    //   200: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   203: goto -174 -> 29
    //   206: astore_1
    //   207: aload 5
    //   209: astore_0
    //   210: aload_0
    //   211: astore 6
    //   213: ldc 54
    //   215: ldc 238
    //   217: aload_1
    //   218: invokestatic 241	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   221: invokevirtual 244	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   224: invokestatic 193	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   227: aload_0
    //   228: ifnull +59 -> 287
    //   231: aload_0
    //   232: invokevirtual 236	java/io/FileWriter:close	()V
    //   235: iconst_0
    //   236: istore_2
    //   237: goto -39 -> 198
    //   240: astore_0
    //   241: iconst_0
    //   242: istore_2
    //   243: goto -45 -> 198
    //   246: astore_0
    //   247: aload 6
    //   249: astore_1
    //   250: aload_1
    //   251: ifnull +7 -> 258
    //   254: aload_1
    //   255: invokevirtual 236	java/io/FileWriter:close	()V
    //   258: ldc 182
    //   260: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   263: aload_0
    //   264: athrow
    //   265: astore_0
    //   266: goto -68 -> 198
    //   269: astore_1
    //   270: goto -12 -> 258
    //   273: astore 6
    //   275: aload_0
    //   276: astore_1
    //   277: aload 6
    //   279: astore_0
    //   280: goto -30 -> 250
    //   283: astore_1
    //   284: goto -74 -> 210
    //   287: iconst_0
    //   288: istore_2
    //   289: goto -91 -> 198
    //
    // Exception table:
    //   from	to	target	type
    //   41	46	206	java/lang/Exception
    //   50	55	206	java/lang/Exception
    //   59	80	206	java/lang/Exception
    //   84	89	206	java/lang/Exception
    //   93	100	206	java/lang/Exception
    //   104	112	206	java/lang/Exception
    //   116	122	206	java/lang/Exception
    //   126	149	206	java/lang/Exception
    //   153	158	206	java/lang/Exception
    //   162	170	206	java/lang/Exception
    //   174	178	206	java/lang/Exception
    //   182	189	206	java/lang/Exception
    //   231	235	240	java/lang/Exception
    //   41	46	246	finally
    //   50	55	246	finally
    //   59	80	246	finally
    //   84	89	246	finally
    //   93	100	246	finally
    //   104	112	246	finally
    //   116	122	246	finally
    //   126	149	246	finally
    //   153	158	246	finally
    //   162	170	246	finally
    //   174	178	246	finally
    //   182	189	246	finally
    //   213	227	246	finally
    //   194	198	265	java/lang/Exception
    //   254	258	269	java/lang/Exception
    //   189	194	273	finally
    //   189	194	283	java/lang/Exception
  }

  public static void gs(long paramLong)
  {
    cdW = paramLong;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.performance.c
 * JD-Core Version:    0.6.2
 */