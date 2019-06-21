package com.tencent.mm.plugin.honey_pay.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.honey_pay.model.c;
import com.tencent.mm.plugin.wallet_core.model.k;
import com.tencent.mm.protocal.protobuf.ajr;
import com.tencent.mm.protocal.protobuf.ajs;
import com.tencent.mm.protocal.protobuf.mu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p;

public final class e extends p
{
  private final String TAG;
  public ajs nqB;

  public e(String paramString)
  {
    AppMethodBeat.i(41725);
    this.TAG = "MicroMsg.NetSceneGetHoneyPayCard";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ajr();
    ((b.a)localObject).fsK = new ajs();
    ((b.a)localObject).fsI = 1983;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/gethpcard";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ajr)this.ehh.fsG.fsP;
    ((ajr)localObject).wpp = paramString;
    ((ajr)localObject).woh = k.bQO();
    ab.i("MicroMsg.NetSceneGetHoneyPayCard", "card no: %s", new Object[] { paramString });
    AppMethodBeat.o(41725);
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41726);
    ab.i("MicroMsg.NetSceneGetHoneyPayCard", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.nqB = ((ajs)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneGetHoneyPayCard", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.nqB.kdT), this.nqB.kdU });
    if (this.nqB.wpq != null)
      c.U(this.nqB.wpq.cJF, this.nqB.wpq.vQO, this.nqB.wpq.ubv);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(41726);
  }

  public final void f(q paramq)
  {
    paramq = (ajs)((b)paramq).fsH.fsP;
    this.AfC = paramq.kdT;
    this.AfD = paramq.kdU;
  }

  public final int getType()
  {
    return 1983;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.a.e
 * JD-Core Version:    0.6.2
 */