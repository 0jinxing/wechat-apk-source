package com.tencent.mm.plugin.honey_pay.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ur;
import com.tencent.mm.protocal.protobuf.us;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p;

public final class c extends p
{
  private final String TAG;
  public us nqz;

  public c(String paramString1, long paramLong, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    AppMethodBeat.i(41721);
    this.TAG = "MicroMsg.NetSceneCreateHoneyPayCard";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ur();
    ((b.a)localObject).fsK = new us();
    ((b.a)localObject).fsI = 2662;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/createhoneypaycard";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ur)this.ehh.fsG.fsP;
    ((ur)localObject).wcg = paramString1;
    ((ur)localObject).wch = paramLong;
    ((ur)localObject).vYh = paramString2;
    ((ur)localObject).vYl = paramString3;
    ((ur)localObject).iAd = paramInt;
    ((ur)localObject).nSd = paramString4;
    ab.d("MicroMsg.NetSceneCreateHoneyPayCard", "token: %s, take message: %s, wishing: %s", new Object[] { paramString1, paramString3, paramString4 });
    ab.i("MicroMsg.NetSceneCreateHoneyPayCard", "username: %s, credit line: %s", new Object[] { paramString2, Long.valueOf(paramLong) });
    AppMethodBeat.o(41721);
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41722);
    ab.i("MicroMsg.NetSceneCreateHoneyPayCard", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.nqz = ((us)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneCreateHoneyPayCard", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.nqz.kdT), this.nqz.kdU });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(41722);
  }

  public final void f(q paramq)
  {
    paramq = (us)((b)paramq).fsH.fsP;
    this.AfC = paramq.kdT;
    this.AfD = paramq.kdU;
  }

  public final int getType()
  {
    return 2662;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.a.c
 * JD-Core Version:    0.6.2
 */