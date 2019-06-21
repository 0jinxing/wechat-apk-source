package com.tencent.liteav.network.a.a;

import com.tencent.liteav.network.a.a;
import com.tencent.liteav.network.a.d;
import com.tencent.liteav.network.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.net.InetAddress;
import java.util.Random;

public final class c
  implements com.tencent.liteav.network.a.c
{
  private static final Random b;
  final InetAddress a;
  private final int c;

  static
  {
    AppMethodBeat.i(67641);
    b = new Random();
    AppMethodBeat.o(67641);
  }

  public c(InetAddress paramInetAddress)
  {
    this(paramInetAddress, 10);
  }

  public c(InetAddress paramInetAddress, int paramInt)
  {
    this.a = paramInetAddress;
    this.c = paramInt;
  }

  // ERROR //
  private byte[] a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: ldc 43
    //   2: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: new 45	java/net/DatagramSocket
    //   8: astore_2
    //   9: aload_2
    //   10: invokespecial 46	java/net/DatagramSocket:<init>	()V
    //   13: new 48	java/net/DatagramPacket
    //   16: astore_3
    //   17: aload_3
    //   18: aload_1
    //   19: aload_1
    //   20: arraylength
    //   21: aload_0
    //   22: getfield 39	com/tencent/liteav/network/a/a/c:a	Ljava/net/InetAddress;
    //   25: bipush 53
    //   27: invokespecial 51	java/net/DatagramPacket:<init>	([BILjava/net/InetAddress;I)V
    //   30: aload_2
    //   31: aload_0
    //   32: getfield 41	com/tencent/liteav/network/a/a/c:c	I
    //   35: sipush 1000
    //   38: imul
    //   39: invokevirtual 54	java/net/DatagramSocket:setSoTimeout	(I)V
    //   42: aload_2
    //   43: aload_3
    //   44: invokevirtual 58	java/net/DatagramSocket:send	(Ljava/net/DatagramPacket;)V
    //   47: new 48	java/net/DatagramPacket
    //   50: astore_1
    //   51: aload_1
    //   52: sipush 1500
    //   55: newarray byte
    //   57: sipush 1500
    //   60: invokespecial 61	java/net/DatagramPacket:<init>	([BI)V
    //   63: aload_2
    //   64: aload_1
    //   65: invokevirtual 64	java/net/DatagramSocket:receive	(Ljava/net/DatagramPacket;)V
    //   68: aload_1
    //   69: invokevirtual 68	java/net/DatagramPacket:getData	()[B
    //   72: astore_1
    //   73: aload_2
    //   74: invokevirtual 71	java/net/DatagramSocket:close	()V
    //   77: ldc 43
    //   79: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   82: aload_1
    //   83: areturn
    //   84: astore_1
    //   85: aconst_null
    //   86: astore_2
    //   87: aload_2
    //   88: ifnull +7 -> 95
    //   91: aload_2
    //   92: invokevirtual 71	java/net/DatagramSocket:close	()V
    //   95: ldc 43
    //   97: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   100: aload_1
    //   101: athrow
    //   102: astore_1
    //   103: goto -16 -> 87
    //
    // Exception table:
    //   from	to	target	type
    //   5	13	84	finally
    //   13	73	102	finally
  }

  public final e[] a(com.tencent.liteav.network.a.b paramb, d arg2)
  {
    AppMethodBeat.i(67639);
    int i;
    synchronized (b)
    {
      i = b.nextInt() & 0xFF;
      ??? = a(b.a(paramb.a, i));
      if (??? == null)
      {
        paramb = new a(paramb.a, "cant get answer");
        AppMethodBeat.o(67639);
        throw paramb;
      }
    }
    paramb = b.a(???, i, paramb.a);
    AppMethodBeat.o(67639);
    return paramb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.network.a.a.c
 * JD-Core Version:    0.6.2
 */