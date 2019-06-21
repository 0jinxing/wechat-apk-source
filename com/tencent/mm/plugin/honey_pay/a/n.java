package com.tencent.mm.plugin.honey_pay.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.cje;
import com.tencent.mm.protocal.protobuf.cjf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p;

public final class n extends p
{
  private final String TAG;
  public cjf nqL;

  public n(String paramString1, String paramString2)
  {
    AppMethodBeat.i(41743);
    this.TAG = "MicroMsg.NetSceneUnbindHoneyPayCard";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cje();
    ((b.a)localObject).fsK = new cjf();
    ((b.a)localObject).fsI = 2659;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/unbindhpcard";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cje)this.ehh.fsG.fsP;
    ((cje)localObject).wpp = paramString1;
    ((cje)localObject).wcg = paramString2;
    AppMethodBeat.o(41743);
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41744);
    ab.i("MicroMsg.NetSceneUnbindHoneyPayCard", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.nqL = ((cjf)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneUnbindHoneyPayCard", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.nqL.kdT), this.nqL.kdU });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(41744);
  }

  public final void f(q paramq)
  {
    paramq = (cjf)((b)paramq).fsH.fsP;
    this.AfC = paramq.kdT;
    this.AfD = paramq.kdU;
  }

  public final int getType()
  {
    return 2659;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.a.n
 * JD-Core Version:    0.6.2
 */