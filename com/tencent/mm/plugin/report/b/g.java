package com.tencent.mm.plugin.report.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.a;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ads;
import com.tencent.mm.protocal.protobuf.adt;
import com.tencent.mm.protocal.protobuf.af;
import com.tencent.mm.protocal.protobuf.ag;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class g extends m
  implements k
{
  private static boolean isRunning;
  private static Object lock;
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  private ads pXt;
  public ag pXu;

  static
  {
    AppMethodBeat.i(72683);
    isRunning = false;
    lock = new Object();
    AppMethodBeat.o(72683);
  }

  public g(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(72680);
    this.pXt = null;
    setIsRunning(true);
    af localaf = new af();
    this.pXt = new ads();
    try
    {
      localaf.vBo = paramInt1;
      localaf.vBp = paramInt2;
      this.pXt.wlS = localaf;
      AppMethodBeat.o(72680);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.NetSceneGetAPMStrategy", "parse data error");
        AppMethodBeat.o(72680);
      }
    }
  }

  private static void setIsRunning(boolean paramBoolean)
  {
    synchronized (lock)
    {
      isRunning = paramBoolean;
      return;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(72682);
    this.ehi = paramf;
    com.tencent.mm.kernel.g.RN();
    int i;
    if (!a.QX())
    {
      ab.w("MicroMsg.NetSceneGetAPMStrategy", "get mrs strategy must go after login");
      i = -1;
      AppMethodBeat.o(72682);
    }
    while (true)
    {
      return i;
      paramf = new b.a();
      paramf.fsN = false;
      paramf.fsJ = this.pXt;
      paramf.fsK = new adt();
      paramf.uri = "/cgi-bin/micromsg-bin/getapmstrategy";
      paramf.fsI = 914;
      this.ehh = paramf.acD();
      i = a(parame, this.ehh, this);
      if (i < 0)
        ab.i("MicroMsg.NetSceneGetAPMStrategy", "mark all failed. do scene %d", new Object[] { Integer.valueOf(i) });
      try
      {
        this.pXu = null;
        setIsRunning(false);
        AppMethodBeat.o(72682);
      }
      catch (Exception parame)
      {
        while (true)
          ab.e("MicroMsg.NetSceneGetAPMStrategy", "onStrategyResp failed  hash:%d  , ex:%s", new Object[] { Integer.valueOf(hashCode()), bo.l(parame) });
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(72681);
    try
    {
      this.pXu = null;
      if ((com.tencent.mm.kernel.g.RO().eJo == null) || (com.tencent.mm.kernel.g.RO().eJo.ftA == null))
      {
        ab.f("MicroMsg.NetSceneGetAPMStrategy", "null == network().getNetSceneQueue().getDispatcher(), can't give response to kvcomm.");
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      }
      while (true)
      {
        return;
        if (paramInt2 != 0)
        {
          paramq = new java/lang/StringBuilder;
          paramq.<init>("get report strategy err, errType:");
          ab.e("MicroMsg.NetSceneGetAPMStrategy", paramInt2 + ", errCode:" + paramInt3);
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          setIsRunning(false);
          AppMethodBeat.o(72681);
        }
        else
        {
          ab.d("MicroMsg.NetSceneGetAPMStrategy", "get report strategy ok");
          this.pXu = ((adt)this.ehh.fsH.fsP).wlT;
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          setIsRunning(false);
          AppMethodBeat.o(72681);
        }
      }
    }
    finally
    {
      setIsRunning(false);
      AppMethodBeat.o(72681);
    }
    throw paramString;
  }

  public final int getType()
  {
    return 914;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.b.g
 * JD-Core Version:    0.6.2
 */