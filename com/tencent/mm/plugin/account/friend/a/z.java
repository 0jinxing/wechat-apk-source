package com.tencent.mm.plugin.account.friend.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ax;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.protobuf.bzr;
import com.tencent.mm.protocal.protobuf.cfi;
import com.tencent.mm.protocal.protobuf.xw;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;

public final class z extends m
  implements k
{
  private f ehi;
  public com.tencent.mm.network.q ftU;
  private int ftx;

  private z(int paramInt, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(108437);
    this.ftx = 2;
    this.ftU = new z.a();
    r.a locala = (r.a)this.ftU.acF();
    locala.gvF.vIJ = paramInt;
    locala.gvF.vLe = paramString1;
    locala.gvF.luQ = aa.dor();
    locala.gvF.vLJ = bo.and(paramString2);
    locala.gvF.wdy = paramString3;
    paramString1 = locala.gvF;
    g.RN();
    paramString1.vIj = a.Rb();
    locala.gvF.wdz = com.tencent.mm.compatible.e.q.getSimCountryIso();
    locala.gvF.wdA = 1;
    AppMethodBeat.o(108437);
  }

  public z(String paramString1, String paramString2)
  {
    this(1, paramString1, paramString2, "");
  }

  public z(String paramString1, String paramString2, String paramString3)
  {
    this(2, paramString1, paramString2, paramString3);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(108438);
    this.ehi = paramf;
    int i = a(parame, this.ftU, this);
    AppMethodBeat.o(108438);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(108439);
    ab.i("MicroMsg.NetSceneEmailReg", "onGYNetEnd  errType:%d errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    paramq = (r.b)paramq.ZS();
    if ((paramInt2 == 4) && (paramInt3 == -301))
    {
      ax.a(true, paramq.gvG.vLL, paramq.gvG.vLM, paramq.gvG.vLK);
      this.ftx -= 1;
      if (this.ftx <= 0)
      {
        this.ehi.onSceneEnd(3, -1, "", this);
        AppMethodBeat.o(108439);
      }
    }
    while (true)
    {
      return;
      a(this.ftf, this.ehi);
      AppMethodBeat.o(108439);
      continue;
      if ((paramInt2 != 0) || (paramInt3 != 0))
      {
        ab.e("MicroMsg.NetSceneEmailReg", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(108439);
      }
      else
      {
        ax.a(false, paramq.gvG.vLL, paramq.gvG.vLM, paramq.gvG.vLK);
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(108439);
      }
    }
  }

  public final int acn()
  {
    return 5;
  }

  public final int ajx()
  {
    AppMethodBeat.i(108440);
    Object localObject = ((r.b)this.ftU.ZS()).gvG.vHR;
    if ((localObject != null) && (((bzr)localObject).wYM != null) && (((bzr)localObject).wYM.size() > 0))
    {
      Iterator localIterator = ((bzr)localObject).wYM.iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        localObject = (cfi)localIterator.next();
      }
      while (((cfi)localObject).pXC != 1);
    }
    for (int i = bo.getInt(((cfi)localObject).xeN, 0); ; i = 0)
    {
      AppMethodBeat.o(108440);
      return i;
    }
  }

  public final m.b b(com.tencent.mm.network.q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 481;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.friend.a.z
 * JD-Core Version:    0.6.2
 */