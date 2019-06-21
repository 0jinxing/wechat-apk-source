package com.tencent.tencentmap.mapsdk.maps.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class cj
{
  private static String a = "info.3g.qq.com";

  public static boolean a()
  {
    AppMethodBeat.i(98638);
    CountDownLatch localCountDownLatch = new CountDownLatch(1);
    boolean[] arrayOfBoolean = new boolean[1];
    arrayOfBoolean[0] = false;
    ch.a.a().b().execute(new ck(arrayOfBoolean, localCountDownLatch));
    try
    {
      localCountDownLatch.await(5L, TimeUnit.SECONDS);
      label51: int i = arrayOfBoolean[0];
      AppMethodBeat.o(98638);
      return i;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label51;
    }
  }

  // ERROR //
  private static boolean a(String paramString, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: ldc 69
    //   2: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: iconst_0
    //   6: istore_3
    //   7: iconst_0
    //   8: istore 4
    //   10: new 71	java/net/Socket
    //   13: astore 5
    //   15: aload 5
    //   17: invokespecial 73	java/net/Socket:<init>	()V
    //   20: new 75	java/net/InetSocketAddress
    //   23: astore 6
    //   25: aload 6
    //   27: aload_0
    //   28: bipush 80
    //   30: invokespecial 78	java/net/InetSocketAddress:<init>	(Ljava/lang/String;I)V
    //   33: aload 5
    //   35: aload 6
    //   37: sipush 5000
    //   40: invokevirtual 82	java/net/Socket:connect	(Ljava/net/SocketAddress;I)V
    //   43: aload 5
    //   45: invokevirtual 85	java/net/Socket:isConnected	()Z
    //   48: istore 7
    //   50: iload 7
    //   52: ifeq +6 -> 58
    //   55: iconst_1
    //   56: istore 4
    //   58: aload 5
    //   60: invokevirtual 88	java/net/Socket:close	()V
    //   63: ldc 69
    //   65: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   68: iload 4
    //   70: ireturn
    //   71: astore_0
    //   72: aconst_null
    //   73: astore 5
    //   75: iload_3
    //   76: istore 4
    //   78: aload 5
    //   80: ifnull -17 -> 63
    //   83: aload 5
    //   85: invokevirtual 88	java/net/Socket:close	()V
    //   88: iload_3
    //   89: istore 4
    //   91: goto -28 -> 63
    //   94: astore_0
    //   95: iload_3
    //   96: istore 4
    //   98: goto -35 -> 63
    //   101: astore_0
    //   102: aconst_null
    //   103: astore 5
    //   105: aload 5
    //   107: ifnull +8 -> 115
    //   110: aload 5
    //   112: invokevirtual 88	java/net/Socket:close	()V
    //   115: ldc 69
    //   117: invokestatic 65	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   120: aload_0
    //   121: athrow
    //   122: astore_0
    //   123: goto -60 -> 63
    //   126: astore 5
    //   128: goto -13 -> 115
    //   131: astore_0
    //   132: goto -27 -> 105
    //   135: astore_0
    //   136: goto -61 -> 75
    //
    // Exception table:
    //   from	to	target	type
    //   10	20	71	java/lang/Throwable
    //   83	88	94	java/lang/Throwable
    //   10	20	101	finally
    //   58	63	122	java/lang/Throwable
    //   110	115	126	java/lang/Throwable
    //   20	50	131	finally
    //   20	50	135	java/lang/Throwable
  }

  public static boolean b()
  {
    AppMethodBeat.i(98639);
    boolean bool = a(a, 80, 5000);
    AppMethodBeat.o(98639);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.cj
 * JD-Core Version:    0.6.2
 */