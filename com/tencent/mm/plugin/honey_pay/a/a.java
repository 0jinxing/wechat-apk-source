package com.tencent.mm.plugin.honey_pay.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ra;
import com.tencent.mm.protocal.protobuf.rb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p;

public final class a extends p
{
  private final String TAG;
  public rb nqx;

  public a()
  {
    AppMethodBeat.i(41717);
    this.TAG = "MicroMsg.NetSceneCheckHoneyPayer";
    b.a locala = new b.a();
    locala.fsJ = new ra();
    locala.fsK = new rb();
    locala.fsI = 2618;
    locala.uri = "/cgi-bin/mmpay-bin/checkhoneypayer";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    AppMethodBeat.o(41717);
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41718);
    ab.i("MicroMsg.NetSceneCheckHoneyPayer", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.nqx = ((rb)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneCheckHoneyPayer", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.nqx.kdT), this.nqx.kdU });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(41718);
  }

  public final void f(q paramq)
  {
    paramq = (rb)((b)paramq).fsH.fsP;
    this.AfC = paramq.kdT;
    this.AfD = paramq.kdU;
  }

  public final int getType()
  {
    return 2618;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.a.a
 * JD-Core Version:    0.6.2
 */