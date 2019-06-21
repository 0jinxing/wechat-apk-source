package com.tencent.mm.plugin.honey_pay.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.honey_pay.model.c;
import com.tencent.mm.protocal.protobuf.bnm;
import com.tencent.mm.protocal.protobuf.bnn;
import com.tencent.mm.protocal.protobuf.mu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p;

public final class m extends p
{
  private final String TAG;
  public bnn nqK;

  public m(String paramString)
  {
    AppMethodBeat.i(41741);
    this.TAG = "MicroMsg.NetSceneQryHoneyUserDetail";
    b.a locala = new b.a();
    locala.fsJ = new bnm();
    locala.fsK = new bnn();
    locala.fsI = 2613;
    locala.uri = "/cgi-bin/mmpay-bin/qryhpusererdetail";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((bnm)this.ehh.fsG.fsP).wpp = paramString;
    ab.i("MicroMsg.NetSceneQryHoneyUserDetail", "card no: %s", new Object[] { paramString });
    AppMethodBeat.o(41741);
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41742);
    ab.i("MicroMsg.NetSceneQryHoneyUserDetail", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.nqK = ((bnn)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneQryHoneyUserDetail", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.nqK.kdT), this.nqK.kdU });
    if (this.nqK.wpq != null)
      c.U(this.nqK.wpq.cJF, this.nqK.wpq.vQO, this.nqK.wpq.ubv);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(41742);
  }

  public final void f(q paramq)
  {
    paramq = (bnn)((b)paramq).fsH.fsP;
    this.AfC = paramq.kdT;
    this.AfD = paramq.kdU;
  }

  public final int getType()
  {
    return 2613;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.a.m
 * JD-Core Version:    0.6.2
 */