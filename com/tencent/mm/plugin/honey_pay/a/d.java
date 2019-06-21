package com.tencent.mm.plugin.honey_pay.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.k;
import com.tencent.mm.protocal.protobuf.ahv;
import com.tencent.mm.protocal.protobuf.ahw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p;

public final class d extends p
{
  private final String TAG;
  public ahw nqA;

  public d(String paramString, long paramLong)
  {
    AppMethodBeat.i(41723);
    this.TAG = "MicroMsg.NetSceneGetCreateTokenSign";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ahv();
    ((b.a)localObject).fsK = new ahw();
    ((b.a)localObject).fsI = 2630;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/createhpcardtoken";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ahv)this.ehh.fsG.fsP;
    ((ahv)localObject).vYl = paramString;
    ((ahv)localObject).wch = paramLong;
    ((ahv)localObject).woh = k.bQO();
    ab.i("MicroMsg.NetSceneGetCreateTokenSign", "take_message: %s, credit_line: %s", new Object[] { paramString, Long.valueOf(paramLong) });
    AppMethodBeat.o(41723);
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41724);
    ab.i("MicroMsg.NetSceneGetCreateTokenSign", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.nqA = ((ahw)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneGetCreateTokenSign", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.nqA.kdT), this.nqA.kdU });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(41724);
  }

  public final void f(q paramq)
  {
    paramq = (ahw)((b)paramq).fsH.fsP;
    this.AfC = paramq.kdT;
    this.AfD = paramq.kdU;
  }

  public final int getType()
  {
    return 2630;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.a.d
 * JD-Core Version:    0.6.2
 */