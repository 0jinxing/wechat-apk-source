package com.tencent.mm.plugin.collect.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bua;
import com.tencent.mm.protocal.protobuf.bub;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p;

public final class k extends p
{
  public bub kCj;

  public k(String paramString, int paramInt)
  {
    AppMethodBeat.i(40973);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bua();
    ((b.a)localObject).fsK = new bub();
    ((b.a)localObject).fsI = 1800;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/scanf2fmaterialcode";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bua)this.ehh.fsG.fsP;
    ((bua)localObject).wVT = paramString;
    ((bua)localObject).scene = paramInt;
    ab.i("MicroMsg.NetSceneF2fMaterial", "req url: %s, %s", new Object[] { paramString, Integer.valueOf(paramInt) });
    AppMethodBeat.o(40973);
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(40974);
    this.kCj = ((bub)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneF2fMaterial", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.kCj.kCl), this.kCj.kCm });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(40974);
  }

  public final void f(q paramq)
  {
    paramq = (bub)((b)paramq).fsH.fsP;
    this.AfC = paramq.kCl;
    this.AfD = paramq.kCm;
  }

  public final int getType()
  {
    return 1800;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.k
 * JD-Core Version:    0.6.2
 */