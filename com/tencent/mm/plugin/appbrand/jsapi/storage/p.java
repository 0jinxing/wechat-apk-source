package com.tencent.mm.plugin.appbrand.jsapi.storage;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.n.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.io.File;

public final class p
{
  public static String BL(String paramString)
  {
    AppMethodBeat.i(102094);
    paramString = I(new File(ah.getContext().getCacheDir(), paramString));
    AppMethodBeat.o(102094);
    return paramString;
  }

  public static void BM(String paramString)
  {
    AppMethodBeat.i(102095);
    boolean bool = new File(ah.getContext().getCacheDir(), paramString).delete();
    ab.i("MicroMsg.JsApiStorageHelper", "deleteTmpFile: " + paramString + ":" + bool);
    AppMethodBeat.o(102095);
  }

  // ERROR //
  private static String I(File paramFile)
  {
    // Byte code:
    //   0: ldc 77
    //   2: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokevirtual 80	java/io/File:exists	()Z
    //   9: ifne +13 -> 22
    //   12: ldc 82
    //   14: astore_0
    //   15: ldc 77
    //   17: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   20: aload_0
    //   21: areturn
    //   22: new 84	java/lang/StringBuffer
    //   25: dup
    //   26: invokespecial 87	java/lang/StringBuffer:<init>	()V
    //   29: astore_1
    //   30: new 89	java/io/BufferedReader
    //   33: astore_2
    //   34: new 91	java/io/FileReader
    //   37: astore_3
    //   38: aload_3
    //   39: aload_0
    //   40: invokespecial 94	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   43: aload_2
    //   44: aload_3
    //   45: invokespecial 97	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   48: aload_2
    //   49: astore_0
    //   50: sipush 1024
    //   53: newarray char
    //   55: astore_3
    //   56: aload_2
    //   57: astore_0
    //   58: aload_2
    //   59: aload_3
    //   60: invokevirtual 101	java/io/BufferedReader:read	([C)I
    //   63: istore 4
    //   65: iload 4
    //   67: iconst_m1
    //   68: if_icmpeq +48 -> 116
    //   71: aload_2
    //   72: astore_0
    //   73: aload_1
    //   74: aload_3
    //   75: iconst_0
    //   76: iload 4
    //   78: invokestatic 107	java/lang/String:valueOf	([CII)Ljava/lang/String;
    //   81: invokevirtual 110	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   84: pop
    //   85: goto -29 -> 56
    //   88: astore_1
    //   89: aload_2
    //   90: astore_0
    //   91: ldc 77
    //   93: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   96: aload_2
    //   97: astore_0
    //   98: aload_1
    //   99: athrow
    //   100: astore_2
    //   101: aload_0
    //   102: ifnull +7 -> 109
    //   105: aload_0
    //   106: invokevirtual 113	java/io/BufferedReader:close	()V
    //   109: ldc 77
    //   111: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   114: aload_2
    //   115: athrow
    //   116: aload_2
    //   117: invokevirtual 113	java/io/BufferedReader:close	()V
    //   120: aload_1
    //   121: invokevirtual 114	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   124: astore_0
    //   125: ldc 77
    //   127: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   130: goto -110 -> 20
    //   133: astore_0
    //   134: ldc 77
    //   136: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   139: aload_0
    //   140: athrow
    //   141: astore_0
    //   142: ldc 77
    //   144: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   147: aload_0
    //   148: athrow
    //   149: astore_2
    //   150: aconst_null
    //   151: astore_0
    //   152: goto -51 -> 101
    //   155: astore_1
    //   156: aconst_null
    //   157: astore_2
    //   158: goto -69 -> 89
    //
    // Exception table:
    //   from	to	target	type
    //   50	56	88	java/io/IOException
    //   58	65	88	java/io/IOException
    //   73	85	88	java/io/IOException
    //   50	56	100	finally
    //   58	65	100	finally
    //   73	85	100	finally
    //   91	96	100	finally
    //   98	100	100	finally
    //   116	120	133	java/lang/Exception
    //   105	109	141	java/lang/Exception
    //   30	48	149	finally
    //   30	48	155	java/io/IOException
  }

  static String a(n.a parama)
  {
    if (parama == n.a.gXV)
      parama = "ok";
    while (true)
    {
      return parama;
      if (parama == n.a.gXZ)
        parama = "fail:quota reached";
      else
        parama = "fail:internal error set DB data fail";
    }
  }

  // ERROR //
  public static void g(String paramString, String[] paramArrayOfString)
  {
    // Byte code:
    //   0: ldc 134
    //   2: invokestatic 13	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 15	java/io/File
    //   8: dup
    //   9: invokestatic 21	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   12: invokevirtual 27	android/content/Context:getCacheDir	()Ljava/io/File;
    //   15: aload_0
    //   16: invokespecial 31	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   19: astore_0
    //   20: new 136	java/io/FileWriter
    //   23: astore_2
    //   24: aload_2
    //   25: aload_0
    //   26: invokespecial 137	java/io/FileWriter:<init>	(Ljava/io/File;)V
    //   29: aload_1
    //   30: arraylength
    //   31: istore_3
    //   32: iconst_0
    //   33: istore 4
    //   35: iload 4
    //   37: iload_3
    //   38: if_icmpge +17 -> 55
    //   41: aload_2
    //   42: aload_1
    //   43: iload 4
    //   45: aaload
    //   46: invokevirtual 140	java/io/FileWriter:write	(Ljava/lang/String;)V
    //   49: iinc 4 1
    //   52: goto -17 -> 35
    //   55: aload_2
    //   56: invokevirtual 141	java/io/FileWriter:close	()V
    //   59: ldc 134
    //   61: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   64: return
    //   65: astore_0
    //   66: ldc 134
    //   68: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   71: goto -7 -> 64
    //   74: astore_0
    //   75: aconst_null
    //   76: astore_1
    //   77: aload_1
    //   78: ifnull +7 -> 85
    //   81: aload_1
    //   82: invokevirtual 141	java/io/FileWriter:close	()V
    //   85: ldc 134
    //   87: invokestatic 38	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   90: aload_0
    //   91: athrow
    //   92: astore_1
    //   93: goto -8 -> 85
    //   96: astore_0
    //   97: aload_2
    //   98: astore_1
    //   99: goto -22 -> 77
    //
    // Exception table:
    //   from	to	target	type
    //   55	59	65	java/io/IOException
    //   20	29	74	finally
    //   81	85	92	java/io/IOException
    //   29	32	96	finally
    //   41	49	96	finally
  }

  public static int m(String[] paramArrayOfString)
  {
    AppMethodBeat.i(102091);
    int i = paramArrayOfString.length;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m)
    {
      String str = paramArrayOfString[j];
      m = k;
      if (str != null)
        m = k + str.length();
      j++;
    }
    AppMethodBeat.o(102091);
    return k;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.storage.p
 * JD-Core Version:    0.6.2
 */