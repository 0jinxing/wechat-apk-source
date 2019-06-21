package com.tencent.mm.plugin.honey_pay.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.atg;
import com.tencent.mm.protocal.protobuf.ath;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p;

public final class f extends p
{
  private final String TAG;
  public ath nqC;

  public f()
  {
    AppMethodBeat.i(41727);
    this.TAG = "MicroMsg.NetSceneHoneyPayerList";
    b.a locala = new b.a();
    locala.fsJ = new atg();
    locala.fsK = new ath();
    locala.fsI = 2725;
    locala.uri = "/cgi-bin/mmpay-bin/honeypayerlist";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(41727);
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41728);
    ab.i("MicroMsg.NetSceneHoneyPayerList", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.nqC = ((ath)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneHoneyPayerList", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.nqC.kdT), this.nqC.kdU });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(41728);
  }

  public final void f(q paramq)
  {
    paramq = (ath)((b)paramq).fsH.fsP;
    this.AfC = paramq.kdT;
    this.AfD = paramq.kdU;
  }

  public final int getType()
  {
    return 2725;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.a.f
 * JD-Core Version:    0.6.2
 */