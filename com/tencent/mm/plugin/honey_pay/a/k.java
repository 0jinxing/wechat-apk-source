package com.tencent.mm.plugin.honey_pay.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bni;
import com.tencent.mm.protocal.protobuf.bnj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p;

public final class k extends p
{
  private final String TAG;
  public bnj nqI;

  public k(String paramString)
  {
    AppMethodBeat.i(41737);
    this.TAG = "MicroMsg.NetSceneQryHoneyPayCardDetail";
    b.a locala = new b.a();
    locala.fsJ = new bni();
    locala.fsK = new bnj();
    locala.fsI = 2851;
    locala.uri = "/cgi-bin/mmpay-bin/qryhpcarddetail";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((bni)this.ehh.fsG.fsP).wpp = paramString;
    AppMethodBeat.o(41737);
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41738);
    ab.i("MicroMsg.NetSceneQryHoneyPayCardDetail", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.nqI = ((bnj)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneQryHoneyPayCardDetail", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.nqI.kdT), this.nqI.kdU });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(41738);
  }

  public final void f(q paramq)
  {
    paramq = (bnj)((b)paramq).fsH.fsP;
    this.AfC = paramq.kdT;
    this.AfD = paramq.kdU;
  }

  public final int getType()
  {
    return 2851;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.a.k
 * JD-Core Version:    0.6.2
 */