package com.tencent.mm.compatible.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class m
{
  static int esL = 0;
  static String esM = null;

  public static int Lw()
  {
    int i = 15;
    AppMethodBeat.i(92941);
    int j;
    int k;
    int m;
    if (n.LD())
    {
      j = 7;
      k = j;
      if (q.etb.esO)
      {
        k = j;
        if (q.etb.esQ == 0)
        {
          ab.d("MicroMsg.CpuChecker", "disable armv6 by server ");
          k = j & 0xFFFFFFFD;
        }
      }
      m = k;
      if (q.etb.esO)
      {
        m = k;
        if (q.etb.esP == 0)
        {
          ab.d("MicroMsg.CpuChecker", "disable armv7 by server ");
          m = k & 0xFFFFFFFB;
        }
      }
      j = n.getNumCores();
      if (j <= 16)
        break label185;
      k = 15;
      label98: j = bo.getInt(Lx(), 0) / 1000;
      if (k <= 4)
        break label196;
      j *= 4;
    }
    label135: label185: label196: label236: label239: 
    while (true)
    {
      label119: int n = j / 100;
      if (n > 30)
      {
        j = 30;
        if ((j > 5) || (k < 4))
          break label236;
        j = i;
      }
      while (true)
      {
        j = (m + (k << 4) << 8) + j;
        esL = j;
        AppMethodBeat.o(92941);
        return j;
        if (n.LE())
        {
          j = 3;
          break;
        }
        j = 1;
        break;
        k = j;
        if (j > 0)
          break label98;
        k = 1;
        break label98;
        if (k > 2)
        {
          j *= 2;
          break label119;
        }
        if (k <= 1)
          break label239;
        j = j * 3 >> 1;
        break label119;
        j = n;
        if (n >= 5)
          break label135;
        j = 5;
        break label135;
      }
    }
  }

  // ERROR //
  public static String Lx()
  {
    // Byte code:
    //   0: ldc 82
    //   2: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 84	java/io/BufferedReader
    //   8: astore_0
    //   9: new 86	java/io/FileReader
    //   12: astore_1
    //   13: aload_1
    //   14: ldc 88
    //   16: invokespecial 92	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   19: aload_0
    //   20: aload_1
    //   21: invokespecial 95	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   24: aload_0
    //   25: astore_1
    //   26: aload_0
    //   27: invokevirtual 98	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   30: astore_2
    //   31: aload_2
    //   32: ifnonnull +57 -> 89
    //   35: aload_0
    //   36: astore_1
    //   37: new 100	java/lang/NullPointerException
    //   40: astore_2
    //   41: aload_0
    //   42: astore_1
    //   43: aload_2
    //   44: ldc 102
    //   46: invokespecial 103	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   49: aload_0
    //   50: astore_1
    //   51: ldc 82
    //   53: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   56: aload_0
    //   57: astore_1
    //   58: aload_2
    //   59: athrow
    //   60: astore_2
    //   61: aload_0
    //   62: astore_1
    //   63: ldc 47
    //   65: aload_2
    //   66: ldc 105
    //   68: iconst_0
    //   69: anewarray 4	java/lang/Object
    //   72: invokestatic 109	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   75: ldc 111
    //   77: astore_1
    //   78: aload_0
    //   79: invokestatic 115	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   82: ldc 82
    //   84: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   87: aload_1
    //   88: areturn
    //   89: aload_0
    //   90: astore_1
    //   91: aload_2
    //   92: invokevirtual 120	java/lang/String:trim	()Ljava/lang/String;
    //   95: astore_2
    //   96: aload_2
    //   97: astore_1
    //   98: aload_0
    //   99: invokestatic 115	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   102: ldc 82
    //   104: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   107: goto -20 -> 87
    //   110: astore_0
    //   111: aconst_null
    //   112: astore_1
    //   113: aload_1
    //   114: invokestatic 115	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   117: ldc 82
    //   119: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   122: aload_0
    //   123: athrow
    //   124: astore_0
    //   125: goto -12 -> 113
    //   128: astore_2
    //   129: aconst_null
    //   130: astore_0
    //   131: goto -70 -> 61
    //
    // Exception table:
    //   from	to	target	type
    //   26	31	60	java/lang/Throwable
    //   37	41	60	java/lang/Throwable
    //   43	49	60	java/lang/Throwable
    //   51	56	60	java/lang/Throwable
    //   58	60	60	java/lang/Throwable
    //   91	96	60	java/lang/Throwable
    //   5	24	110	finally
    //   26	31	124	finally
    //   37	41	124	finally
    //   43	49	124	finally
    //   51	56	124	finally
    //   58	60	124	finally
    //   63	75	124	finally
    //   91	96	124	finally
    //   5	24	128	java/lang/Throwable
  }

  // ERROR //
  public static String Ly()
  {
    // Byte code:
    //   0: ldc 122
    //   2: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 84	java/io/BufferedReader
    //   8: astore_0
    //   9: new 86	java/io/FileReader
    //   12: astore_1
    //   13: aload_1
    //   14: ldc 124
    //   16: invokespecial 92	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   19: aload_0
    //   20: aload_1
    //   21: invokespecial 95	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   24: aload_0
    //   25: astore_1
    //   26: aload_0
    //   27: invokevirtual 98	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   30: astore_2
    //   31: aload_2
    //   32: ifnonnull +57 -> 89
    //   35: aload_0
    //   36: astore_1
    //   37: new 100	java/lang/NullPointerException
    //   40: astore_2
    //   41: aload_0
    //   42: astore_1
    //   43: aload_2
    //   44: ldc 126
    //   46: invokespecial 103	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   49: aload_0
    //   50: astore_1
    //   51: ldc 122
    //   53: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   56: aload_0
    //   57: astore_1
    //   58: aload_2
    //   59: athrow
    //   60: astore_2
    //   61: aload_0
    //   62: astore_1
    //   63: ldc 47
    //   65: aload_2
    //   66: ldc 105
    //   68: iconst_0
    //   69: anewarray 4	java/lang/Object
    //   72: invokestatic 109	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   75: ldc 111
    //   77: astore_1
    //   78: aload_0
    //   79: invokestatic 115	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   82: ldc 122
    //   84: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   87: aload_1
    //   88: areturn
    //   89: aload_0
    //   90: astore_1
    //   91: aload_2
    //   92: invokevirtual 120	java/lang/String:trim	()Ljava/lang/String;
    //   95: astore_2
    //   96: aload_2
    //   97: astore_1
    //   98: aload_0
    //   99: invokestatic 115	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   102: ldc 122
    //   104: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   107: goto -20 -> 87
    //   110: astore_0
    //   111: aconst_null
    //   112: astore_1
    //   113: aload_1
    //   114: invokestatic 115	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   117: ldc 122
    //   119: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   122: aload_0
    //   123: athrow
    //   124: astore_0
    //   125: goto -12 -> 113
    //   128: astore_2
    //   129: aconst_null
    //   130: astore_0
    //   131: goto -70 -> 61
    //
    // Exception table:
    //   from	to	target	type
    //   26	31	60	java/lang/Throwable
    //   37	41	60	java/lang/Throwable
    //   43	49	60	java/lang/Throwable
    //   51	56	60	java/lang/Throwable
    //   58	60	60	java/lang/Throwable
    //   91	96	60	java/lang/Throwable
    //   5	24	110	finally
    //   26	31	124	finally
    //   37	41	124	finally
    //   43	49	124	finally
    //   51	56	124	finally
    //   58	60	124	finally
    //   63	75	124	finally
    //   91	96	124	finally
    //   5	24	128	java/lang/Throwable
  }

  // ERROR //
  public static String Lz()
  {
    // Byte code:
    //   0: ldc 130
    //   2: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 84	java/io/BufferedReader
    //   8: astore_0
    //   9: new 86	java/io/FileReader
    //   12: astore_1
    //   13: aload_1
    //   14: ldc 132
    //   16: invokespecial 92	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   19: aload_0
    //   20: aload_1
    //   21: invokespecial 95	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   24: aload_0
    //   25: astore_1
    //   26: aload_0
    //   27: invokevirtual 98	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   30: astore_2
    //   31: aload_2
    //   32: ifnonnull +57 -> 89
    //   35: aload_0
    //   36: astore_1
    //   37: new 100	java/lang/NullPointerException
    //   40: astore_2
    //   41: aload_0
    //   42: astore_1
    //   43: aload_2
    //   44: ldc 134
    //   46: invokespecial 103	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   49: aload_0
    //   50: astore_1
    //   51: ldc 130
    //   53: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   56: aload_0
    //   57: astore_1
    //   58: aload_2
    //   59: athrow
    //   60: astore_2
    //   61: aload_0
    //   62: astore_1
    //   63: ldc 47
    //   65: aload_2
    //   66: ldc 105
    //   68: iconst_0
    //   69: anewarray 4	java/lang/Object
    //   72: invokestatic 109	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   75: ldc 111
    //   77: astore_1
    //   78: aload_0
    //   79: invokestatic 115	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   82: ldc 130
    //   84: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   87: aload_1
    //   88: areturn
    //   89: aload_0
    //   90: astore_1
    //   91: aload_2
    //   92: invokevirtual 120	java/lang/String:trim	()Ljava/lang/String;
    //   95: astore_2
    //   96: aload_2
    //   97: astore_1
    //   98: aload_0
    //   99: invokestatic 115	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   102: ldc 130
    //   104: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   107: goto -20 -> 87
    //   110: astore_1
    //   111: aconst_null
    //   112: astore_2
    //   113: aload_1
    //   114: astore_0
    //   115: aload_2
    //   116: invokestatic 115	com/tencent/mm/sdk/platformtools/bo:b	(Ljava/io/Closeable;)V
    //   119: ldc 130
    //   121: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   124: aload_0
    //   125: athrow
    //   126: astore_0
    //   127: aload_1
    //   128: astore_2
    //   129: goto -14 -> 115
    //   132: astore_2
    //   133: aconst_null
    //   134: astore_0
    //   135: goto -74 -> 61
    //
    // Exception table:
    //   from	to	target	type
    //   26	31	60	java/lang/Exception
    //   37	41	60	java/lang/Exception
    //   43	49	60	java/lang/Exception
    //   51	56	60	java/lang/Exception
    //   58	60	60	java/lang/Exception
    //   91	96	60	java/lang/Exception
    //   5	24	110	finally
    //   26	31	126	finally
    //   37	41	126	finally
    //   43	49	126	finally
    //   51	56	126	finally
    //   58	60	126	finally
    //   63	75	126	finally
    //   91	96	126	finally
    //   5	24	132	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.e.m
 * JD-Core Version:    0.6.2
 */