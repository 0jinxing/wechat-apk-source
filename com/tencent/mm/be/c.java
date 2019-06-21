package com.tencent.mm.be;

import android.os.HandlerThread;
import com.tencent.map.swlocation.api.INetworkApi;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;

public final class c
  implements INetworkApi, f
{
  private float cEB;
  private float cGm;
  private int cGn;
  private int cGo;
  private String cGp;
  private String cGq;
  private a fNH;
  private byte[] fNI;
  private ap fNJ;
  private int fNK;
  private Object lock;
  private int scene;

  public c(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, String paramString1, String paramString2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(78556);
    this.lock = new Object();
    g.RQ();
    this.fNJ = new ap(g.RS().oAl.getLooper(), new c.1(this), false);
    this.cGm = paramFloat1;
    this.cEB = paramFloat2;
    this.cGn = paramInt1;
    this.cGo = paramInt2;
    this.cGp = paramString1;
    this.cGq = paramString2;
    this.fNK = paramInt3;
    this.scene = paramInt4;
    g.RO().eJo.a(752, this);
    AppMethodBeat.o(78556);
  }

  private void aiN()
  {
    AppMethodBeat.i(78558);
    g.RO().eJo.b(752, this);
    AppMethodBeat.o(78558);
  }

  public final void finish()
  {
    AppMethodBeat.i(78557);
    this.fNJ.stopTimer();
    if (this.fNH != null)
      g.RO().eJo.c(this.fNH);
    this.fNH = null;
    this.fNI = null;
    synchronized (this.lock)
    {
      this.lock.notifyAll();
      aiN();
      AppMethodBeat.o(78557);
      return;
    }
  }

  public final byte[] httpRequest(String paramString, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78559);
    ab.w("MicroMsg.SenseWhereHttpUtil", "why use this method? sense where sdk has something warn.");
    AppMethodBeat.o(78559);
    return new byte[0];
  }

  public final byte[] httpRequest(byte[] arg1)
  {
    AppMethodBeat.i(78560);
    try
    {
      String str = new java/lang/String;
      str.<init>(???, "UTF-8");
      ab.d("MicroMsg.SenseWhereHttpUtil", "sense where http request content : ".concat(String.valueOf(str)));
      this.fNI = null;
      ??? = new com/tencent/mm/be/a;
      ???.<init>(this.cGm, this.cEB, this.cGn, this.cGo, this.cGp, this.cGq, this.fNK, this.scene, str);
      this.fNH = ???;
      g.RO().eJo.a(this.fNH, 0);
      this.fNJ.ae(60000L, 60000L);
      synchronized (this.lock)
      {
        this.lock.wait();
        ab.i("MicroMsg.SenseWhereHttpUtil", "upload sense where info finish. it is response is null? %b", new Object[] { Boolean.valueOf(bo.cb(this.fNI)) });
        ??? = this.fNI;
        AppMethodBeat.o(78560);
        return ???;
      }
    }
    catch (Exception )
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SenseWhereHttpUtil", ???, "", new Object[0]);
        ab.e("MicroMsg.SenseWhereHttpUtil", "sense where http request error: " + ???.toString());
      }
    }
  }

  // ERROR //
  public final void onSceneEnd(int paramInt1, int paramInt2, String arg3, com.tencent.mm.ai.m arg4)
  {
    // Byte code:
    //   0: ldc 235
    //   2: invokestatic 39	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: getfield 75	com/tencent/mm/be/c:fNJ	Lcom/tencent/mm/sdk/platformtools/ap;
    //   9: invokevirtual 130	com/tencent/mm/sdk/platformtools/ap:stopTimer	()V
    //   12: iload_1
    //   13: ifne +142 -> 155
    //   16: iload_2
    //   17: ifne +138 -> 155
    //   20: aload 4
    //   22: instanceof 176
    //   25: ifeq +111 -> 136
    //   28: aload 4
    //   30: checkcast 176	com/tencent/mm/be/a
    //   33: getfield 238	com/tencent/mm/be/a:fNi	Ljava/lang/String;
    //   36: ldc 209
    //   38: invokestatic 242	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   41: astore_3
    //   42: ldc 143
    //   44: ldc 244
    //   46: aload_3
    //   47: invokestatic 168	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   50: invokevirtual 172	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   53: invokestatic 174	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   56: aload_0
    //   57: aload_3
    //   58: ldc 159
    //   60: invokevirtual 248	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   63: putfield 123	com/tencent/mm/be/c:fNI	[B
    //   66: aload_0
    //   67: getfield 41	com/tencent/mm/be/c:lock	Ljava/lang/Object;
    //   70: astore 4
    //   72: aload 4
    //   74: monitorenter
    //   75: aload_0
    //   76: getfield 41	com/tencent/mm/be/c:lock	Ljava/lang/Object;
    //   79: invokevirtual 136	java/lang/Object:notifyAll	()V
    //   82: aload 4
    //   84: monitorexit
    //   85: aload_0
    //   86: aconst_null
    //   87: putfield 114	com/tencent/mm/be/c:fNH	Lcom/tencent/mm/be/a;
    //   90: ldc 235
    //   92: invokestatic 110	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   95: return
    //   96: astore_3
    //   97: ldc 143
    //   99: aload_3
    //   100: ldc 209
    //   102: iconst_0
    //   103: anewarray 4	java/lang/Object
    //   106: invokestatic 213	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   109: ldc 143
    //   111: new 215	java/lang/StringBuilder
    //   114: dup
    //   115: ldc 250
    //   117: invokespecial 220	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   120: aload_3
    //   121: invokevirtual 224	java/lang/Exception:toString	()Ljava/lang/String;
    //   124: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: invokevirtual 229	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   130: invokestatic 232	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   133: goto -67 -> 66
    //   136: aload_0
    //   137: aconst_null
    //   138: putfield 123	com/tencent/mm/be/c:fNI	[B
    //   141: goto -75 -> 66
    //   144: astore_3
    //   145: aload 4
    //   147: monitorexit
    //   148: ldc 235
    //   150: invokestatic 110	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   153: aload_3
    //   154: athrow
    //   155: ldc 143
    //   157: ldc 252
    //   159: iconst_3
    //   160: anewarray 4	java/lang/Object
    //   163: dup
    //   164: iconst_0
    //   165: iload_1
    //   166: invokestatic 257	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   169: aastore
    //   170: dup
    //   171: iconst_1
    //   172: iload_2
    //   173: invokestatic 257	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   176: aastore
    //   177: dup
    //   178: iconst_2
    //   179: aload_3
    //   180: aastore
    //   181: invokestatic 259	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   184: aload_0
    //   185: aconst_null
    //   186: putfield 123	com/tencent/mm/be/c:fNI	[B
    //   189: aload_0
    //   190: getfield 41	com/tencent/mm/be/c:lock	Ljava/lang/Object;
    //   193: astore_3
    //   194: aload_3
    //   195: monitorenter
    //   196: aload_0
    //   197: getfield 41	com/tencent/mm/be/c:lock	Ljava/lang/Object;
    //   200: invokevirtual 136	java/lang/Object:notifyAll	()V
    //   203: aload_3
    //   204: monitorexit
    //   205: invokestatic 265	com/tencent/mm/be/b:aiD	()Lcom/tencent/mm/be/b;
    //   208: invokevirtual 268	com/tencent/mm/be/b:aiF	()V
    //   211: getstatic 274	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   214: ldc2_w 275
    //   217: ldc2_w 277
    //   220: lconst_1
    //   221: iconst_0
    //   222: invokevirtual 281	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   225: goto -140 -> 85
    //   228: astore 4
    //   230: aload_3
    //   231: monitorexit
    //   232: ldc 235
    //   234: invokestatic 110	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   237: aload 4
    //   239: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   56	66	96	java/lang/Exception
    //   75	85	144	finally
    //   145	148	144	finally
    //   196	205	228	finally
    //   230	232	228	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.be.c
 * JD-Core Version:    0.6.2
 */