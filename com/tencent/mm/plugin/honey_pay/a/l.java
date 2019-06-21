package com.tencent.mm.plugin.honey_pay.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.honey_pay.model.c;
import com.tencent.mm.protocal.protobuf.bnk;
import com.tencent.mm.protocal.protobuf.bnl;
import com.tencent.mm.protocal.protobuf.mu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p;

public final class l extends p
{
  private final String TAG;
  public bnl nqJ;

  public l(String paramString)
  {
    AppMethodBeat.i(41739);
    this.TAG = "MicroMsg.NetSceneQryHoneyPayerDetail";
    b.a locala = new b.a();
    locala.fsJ = new bnk();
    locala.fsK = new bnl();
    locala.fsI = 2876;
    locala.uri = "/cgi-bin/mmpay-bin/qryhppayerdetail";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((bnk)this.ehh.fsG.fsP).wpp = paramString;
    ab.i("MicroMsg.NetSceneQryHoneyPayerDetail", "card no: %s", new Object[] { paramString });
    AppMethodBeat.o(41739);
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41740);
    ab.i("MicroMsg.NetSceneQryHoneyPayerDetail", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.nqJ = ((bnl)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneQryHoneyPayerDetail", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.nqJ.kdT), this.nqJ.kdU });
    if (this.nqJ.wpq != null)
      c.U(this.nqJ.wpq.cJF, this.nqJ.wpq.vQO, this.nqJ.wpq.ubv);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(41740);
  }

  public final void f(q paramq)
  {
    paramq = (bnl)((b)paramq).fsH.fsP;
    this.AfC = paramq.kdT;
    this.AfD = paramq.kdU;
  }

  public final int getType()
  {
    return 2876;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.a.l
 * JD-Core Version:    0.6.2
 */