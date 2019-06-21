package com.tencent.d.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Closeable;

public final class f
{
  // ERROR //
  public static java.lang.String ag(java.io.File paramFile)
  {
    // Byte code:
    //   0: ldc 9
    //   2: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: ldc 17
    //   7: astore_1
    //   8: aconst_null
    //   9: astore_2
    //   10: new 19	java/io/BufferedReader
    //   13: astore_3
    //   14: new 21	java/io/FileReader
    //   17: astore 4
    //   19: aload 4
    //   21: aload_0
    //   22: invokespecial 25	java/io/FileReader:<init>	(Ljava/io/File;)V
    //   25: aload_3
    //   26: aload 4
    //   28: invokespecial 28	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   31: aload_3
    //   32: invokevirtual 32	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   35: astore_0
    //   36: aload_0
    //   37: ifnull +14 -> 51
    //   40: aload_3
    //   41: invokestatic 36	com/tencent/d/f/f:closeQuietly	(Ljava/io/Closeable;)V
    //   44: ldc 9
    //   46: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   49: aload_0
    //   50: areturn
    //   51: aload_3
    //   52: invokestatic 36	com/tencent/d/f/f:closeQuietly	(Ljava/io/Closeable;)V
    //   55: ldc 9
    //   57: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   60: goto -11 -> 49
    //   63: astore_0
    //   64: aconst_null
    //   65: astore_3
    //   66: aload_1
    //   67: astore_0
    //   68: aload_3
    //   69: ifnull -14 -> 55
    //   72: aload_3
    //   73: invokestatic 36	com/tencent/d/f/f:closeQuietly	(Ljava/io/Closeable;)V
    //   76: aload_1
    //   77: astore_0
    //   78: goto -23 -> 55
    //   81: astore_0
    //   82: aload_2
    //   83: astore_3
    //   84: aload_3
    //   85: ifnull +7 -> 92
    //   88: aload_3
    //   89: invokestatic 36	com/tencent/d/f/f:closeQuietly	(Ljava/io/Closeable;)V
    //   92: ldc 9
    //   94: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   97: aload_0
    //   98: athrow
    //   99: astore_0
    //   100: goto -16 -> 84
    //   103: astore_0
    //   104: goto -38 -> 66
    //
    // Exception table:
    //   from	to	target	type
    //   10	31	63	java/lang/Throwable
    //   10	31	81	finally
    //   31	36	99	finally
    //   31	36	103	java/lang/Throwable
  }

  // ERROR //
  public static byte[] ah(java.io.File paramFile)
  {
    // Byte code:
    //   0: ldc 45
    //   2: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 47	java/io/RandomAccessFile
    //   8: astore_1
    //   9: aload_1
    //   10: aload_0
    //   11: ldc 49
    //   13: invokespecial 52	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   16: aload_1
    //   17: astore_0
    //   18: aload_1
    //   19: invokevirtual 56	java/io/RandomAccessFile:length	()J
    //   22: lstore_2
    //   23: lload_2
    //   24: l2i
    //   25: istore 4
    //   27: iload 4
    //   29: i2l
    //   30: lload_2
    //   31: lcmp
    //   32: ifeq +57 -> 89
    //   35: aload_1
    //   36: astore_0
    //   37: new 44	java/io/IOException
    //   40: astore 5
    //   42: aload_1
    //   43: astore_0
    //   44: aload 5
    //   46: ldc 17
    //   48: invokespecial 59	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   51: aload_1
    //   52: astore_0
    //   53: ldc 45
    //   55: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   58: aload_1
    //   59: astore_0
    //   60: aload 5
    //   62: athrow
    //   63: astore_0
    //   64: aload_1
    //   65: astore_0
    //   66: iconst_0
    //   67: newarray byte
    //   69: astore 5
    //   71: aload_1
    //   72: ifnull +7 -> 79
    //   75: aload_1
    //   76: invokevirtual 63	java/io/RandomAccessFile:close	()V
    //   79: ldc 45
    //   81: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   84: aload 5
    //   86: astore_0
    //   87: aload_0
    //   88: areturn
    //   89: aload_1
    //   90: astore_0
    //   91: iload 4
    //   93: newarray byte
    //   95: astore 5
    //   97: aload_1
    //   98: astore_0
    //   99: aload_1
    //   100: aload 5
    //   102: invokevirtual 67	java/io/RandomAccessFile:readFully	([B)V
    //   105: aload_1
    //   106: invokevirtual 63	java/io/RandomAccessFile:close	()V
    //   109: ldc 45
    //   111: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   114: aload 5
    //   116: astore_0
    //   117: goto -30 -> 87
    //   120: astore_0
    //   121: aconst_null
    //   122: astore_1
    //   123: aload_1
    //   124: ifnull +7 -> 131
    //   127: aload_1
    //   128: invokevirtual 63	java/io/RandomAccessFile:close	()V
    //   131: ldc 45
    //   133: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   136: aload_0
    //   137: athrow
    //   138: astore_0
    //   139: goto -30 -> 109
    //   142: astore_0
    //   143: goto -64 -> 79
    //   146: astore_1
    //   147: goto -16 -> 131
    //   150: astore_1
    //   151: aload_0
    //   152: astore 5
    //   154: aload_1
    //   155: astore_0
    //   156: aload 5
    //   158: astore_1
    //   159: goto -36 -> 123
    //   162: astore_0
    //   163: aconst_null
    //   164: astore_1
    //   165: goto -101 -> 64
    //
    // Exception table:
    //   from	to	target	type
    //   18	23	63	java/lang/Throwable
    //   37	42	63	java/lang/Throwable
    //   44	51	63	java/lang/Throwable
    //   53	58	63	java/lang/Throwable
    //   60	63	63	java/lang/Throwable
    //   91	97	63	java/lang/Throwable
    //   99	105	63	java/lang/Throwable
    //   5	16	120	finally
    //   105	109	138	java/io/IOException
    //   75	79	142	java/io/IOException
    //   127	131	146	java/io/IOException
    //   18	23	150	finally
    //   37	42	150	finally
    //   44	51	150	finally
    //   53	58	150	finally
    //   60	63	150	finally
    //   66	71	150	finally
    //   91	97	150	finally
    //   99	105	150	finally
    //   5	16	162	java/lang/Throwable
  }

  public static void closeQuietly(Closeable paramCloseable)
  {
    AppMethodBeat.i(114615);
    if (paramCloseable != null);
    try
    {
      paramCloseable.close();
      AppMethodBeat.o(114615);
      return;
    }
    catch (Throwable paramCloseable)
    {
      while (true)
        AppMethodBeat.o(114615);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.d.f.f
 * JD-Core Version:    0.6.2
 */