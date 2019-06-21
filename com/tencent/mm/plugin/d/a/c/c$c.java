package com.tencent.mm.plugin.d.a.c;

import android.bluetooth.BluetoothSocket;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;

public final class c$c
  implements Runnable
{
  private b jII;
  private a jIJ;
  private volatile boolean jIN;
  private volatile Runnable jIO;
  private OutputStream jIP;
  private final LinkedList<byte[]> jIQ;
  private final LinkedList<byte[]> jIR;

  public c$c(b paramb, a parama, BluetoothSocket paramBluetoothSocket)
  {
    AppMethodBeat.i(18492);
    this.jIO = null;
    this.jIP = null;
    this.jIQ = new LinkedList();
    this.jIR = new LinkedList();
    this.jII = null;
    this.jIJ = null;
    this.jIN = false;
    this.jII = paramb;
    this.jIJ = parama;
    try
    {
      paramb = paramBluetoothSocket.getOutputStream();
      this.jIO = this;
      this.jIP = paramb;
      AppMethodBeat.o(18492);
      return;
    }
    catch (IOException paramb)
    {
      while (true)
      {
        ab.e("MicroMsg.exdevice.SendThread", "temp sockets not created", new Object[] { paramb });
        this.jIP = null;
        if (this.jIJ != null)
          this.jIJ.jIy.c(this.jII.mSessionId, 11, "Can not get write stream");
        AppMethodBeat.o(18492);
      }
    }
  }

  public final boolean av(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    AppMethodBeat.i(18494);
    ab.i("MicroMsg.exdevice.SendThread", "------write------buffer length = %d", new Object[] { Integer.valueOf(paramArrayOfByte.length) });
    if (this.jIO == null)
    {
      ab.e("MicroMsg.exdevice.SendThread", "Send thread has been close. Send data abort");
      AppMethodBeat.o(18494);
    }
    while (true)
    {
      return bool;
      try
      {
        this.jIQ.add(paramArrayOfByte);
        notify();
        AppMethodBeat.o(18494);
        bool = true;
      }
      finally
      {
        AppMethodBeat.o(18494);
      }
    }
    throw paramArrayOfByte;
  }

  public final void cancel()
  {
    AppMethodBeat.i(18495);
    this.jIO = null;
    this.jIN = true;
    try
    {
      notify();
      this.jIR.clear();
      this.jIQ.clear();
      AppMethodBeat.o(18495);
      return;
    }
    finally
    {
      AppMethodBeat.o(18495);
    }
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: sipush 18493
    //   3: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 64
    //   8: ldc 125
    //   10: invokestatic 127	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   13: aload_0
    //   14: getfield 40	com/tencent/mm/plugin/d/a/c/c$c:jIP	Ljava/io/OutputStream;
    //   17: ifnonnull +36 -> 53
    //   20: sipush 18493
    //   23: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   26: return
    //   27: astore_1
    //   28: aload_0
    //   29: getfield 51	com/tencent/mm/plugin/d/a/c/c$c:jIJ	Lcom/tencent/mm/plugin/d/a/c/a;
    //   32: ifnull +21 -> 53
    //   35: aload_0
    //   36: getfield 51	com/tencent/mm/plugin/d/a/c/c$c:jIJ	Lcom/tencent/mm/plugin/d/a/c/a;
    //   39: getfield 78	com/tencent/mm/plugin/d/a/c/a:jIy	Lcom/tencent/mm/plugin/d/a/c/a$a;
    //   42: aload_0
    //   43: getfield 49	com/tencent/mm/plugin/d/a/c/c$c:jII	Lcom/tencent/mm/plugin/d/a/c/b;
    //   46: getfield 84	com/tencent/mm/plugin/d/a/c/b:mSessionId	J
    //   49: iconst_0
    //   50: invokevirtual 131	com/tencent/mm/plugin/d/a/c/a$a:m	(JZ)V
    //   53: aload_0
    //   54: getfield 53	com/tencent/mm/plugin/d/a/c/c$c:jIN	Z
    //   57: ifne +182 -> 239
    //   60: aload_0
    //   61: getfield 38	com/tencent/mm/plugin/d/a/c/c$c:jIO	Ljava/lang/Runnable;
    //   64: ifnonnull +19 -> 83
    //   67: ldc 64
    //   69: ldc 133
    //   71: invokestatic 136	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   74: sipush 18493
    //   77: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   80: goto -54 -> 26
    //   83: aload_0
    //   84: getfield 47	com/tencent/mm/plugin/d/a/c/c$c:jIR	Ljava/util/LinkedList;
    //   87: invokevirtual 140	java/util/LinkedList:isEmpty	()Z
    //   90: ifne +50 -> 140
    //   93: aload_0
    //   94: getfield 47	com/tencent/mm/plugin/d/a/c/c$c:jIR	Ljava/util/LinkedList;
    //   97: invokevirtual 144	java/util/LinkedList:pop	()Ljava/lang/Object;
    //   100: checkcast 146	[B
    //   103: astore_1
    //   104: aload_0
    //   105: getfield 40	com/tencent/mm/plugin/d/a/c/c$c:jIP	Ljava/io/OutputStream;
    //   108: aload_1
    //   109: invokevirtual 152	java/io/OutputStream:write	([B)V
    //   112: aload_0
    //   113: getfield 51	com/tencent/mm/plugin/d/a/c/c$c:jIJ	Lcom/tencent/mm/plugin/d/a/c/a;
    //   116: ifnull -63 -> 53
    //   119: aload_0
    //   120: getfield 51	com/tencent/mm/plugin/d/a/c/c$c:jIJ	Lcom/tencent/mm/plugin/d/a/c/a;
    //   123: getfield 78	com/tencent/mm/plugin/d/a/c/a:jIy	Lcom/tencent/mm/plugin/d/a/c/a$a;
    //   126: aload_0
    //   127: getfield 49	com/tencent/mm/plugin/d/a/c/c$c:jII	Lcom/tencent/mm/plugin/d/a/c/b;
    //   130: getfield 84	com/tencent/mm/plugin/d/a/c/b:mSessionId	J
    //   133: iconst_1
    //   134: invokevirtual 131	com/tencent/mm/plugin/d/a/c/a$a:m	(JZ)V
    //   137: goto -84 -> 53
    //   140: aload_0
    //   141: getfield 45	com/tencent/mm/plugin/d/a/c/c$c:jIQ	Ljava/util/LinkedList;
    //   144: invokevirtual 140	java/util/LinkedList:isEmpty	()Z
    //   147: ifne +47 -> 194
    //   150: aload_0
    //   151: getfield 45	com/tencent/mm/plugin/d/a/c/c$c:jIQ	Ljava/util/LinkedList;
    //   154: astore_1
    //   155: aload_1
    //   156: monitorenter
    //   157: aload_0
    //   158: getfield 47	com/tencent/mm/plugin/d/a/c/c$c:jIR	Ljava/util/LinkedList;
    //   161: aload_0
    //   162: getfield 45	com/tencent/mm/plugin/d/a/c/c$c:jIQ	Ljava/util/LinkedList;
    //   165: invokevirtual 156	java/util/LinkedList:addAll	(Ljava/util/Collection;)Z
    //   168: invokestatic 162	junit/framework/Assert:assertTrue	(Z)V
    //   171: aload_0
    //   172: getfield 45	com/tencent/mm/plugin/d/a/c/c$c:jIQ	Ljava/util/LinkedList;
    //   175: invokevirtual 120	java/util/LinkedList:clear	()V
    //   178: aload_1
    //   179: monitorexit
    //   180: goto -127 -> 53
    //   183: astore_2
    //   184: aload_1
    //   185: monitorexit
    //   186: sipush 18493
    //   189: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   192: aload_2
    //   193: athrow
    //   194: aload_0
    //   195: monitorenter
    //   196: aload_0
    //   197: invokevirtual 165	java/lang/Object:wait	()V
    //   200: aload_0
    //   201: monitorexit
    //   202: goto -149 -> 53
    //   205: astore_1
    //   206: aload_0
    //   207: monitorexit
    //   208: sipush 18493
    //   211: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   214: aload_1
    //   215: athrow
    //   216: astore_1
    //   217: ldc 64
    //   219: aload_1
    //   220: ldc 167
    //   222: iconst_0
    //   223: anewarray 4	java/lang/Object
    //   226: invokestatic 171	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   229: ldc 64
    //   231: ldc 173
    //   233: invokestatic 136	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   236: goto -36 -> 200
    //   239: sipush 18493
    //   242: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   245: goto -219 -> 26
    //
    // Exception table:
    //   from	to	target	type
    //   104	112	27	java/io/IOException
    //   157	180	183	finally
    //   184	186	183	finally
    //   196	200	205	finally
    //   200	202	205	finally
    //   206	208	205	finally
    //   217	236	205	finally
    //   196	200	216	java/lang/InterruptedException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.c.c.c
 * JD-Core Version:    0.6.2
 */