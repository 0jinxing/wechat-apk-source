package com.tencent.mm.plugin.honey_pay.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bcy;
import com.tencent.mm.protocal.protobuf.bcz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p;

public final class i extends p
{
  private final String TAG;
  public int bJt;
  private bcz nqG;

  public i(int paramInt)
  {
    AppMethodBeat.i(41733);
    this.TAG = "MicroMsg.NetSceneModifyHoneyPayerNotify";
    b.a locala = new b.a();
    locala.fsJ = new bcy();
    locala.fsK = new bcz();
    locala.fsI = 2742;
    locala.uri = "/cgi-bin/mmpay-bin/modifyhppayernotify";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((bcy)this.ehh.fsG.fsP).tob = paramInt;
    this.bJt = paramInt;
    ab.i("MicroMsg.NetSceneModifyHoneyPayerNotify", "notify flag: %s", new Object[] { Integer.valueOf(paramInt) });
    AppMethodBeat.o(41733);
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41734);
    ab.i("MicroMsg.NetSceneModifyHoneyPayerNotify", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.nqG = ((bcz)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneModifyHoneyPayerNotify", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.nqG.kdT), this.nqG.kdU });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(41734);
  }

  public final void f(q paramq)
  {
    paramq = (bcz)((b)paramq).fsH.fsP;
    this.AfC = paramq.kdT;
    this.AfD = paramq.kdU;
  }

  public final int getType()
  {
    return 2742;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.a.i
 * JD-Core Version:    0.6.2
 */