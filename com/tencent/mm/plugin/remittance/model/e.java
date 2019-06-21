package com.tencent.mm.plugin.remittance.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.pw;
import com.tencent.mm.protocal.protobuf.px;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p;

public final class e extends p
{
  private final String TAG;
  public px pOI;

  public e(String paramString)
  {
    AppMethodBeat.i(44727);
    this.TAG = "MicroMsg.NetSceneBeforeTransfer";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new pw();
    ((b.a)localObject).fsK = new px();
    ((b.a)localObject).fsI = 2783;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/beforetransfer";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (pw)this.ehh.fsG.fsP;
    ((pw)localObject).vFf = paramString;
    if (!com.tencent.mm.pluginsdk.wallet.f.dlH())
      ((pw)localObject).vWV = com.tencent.mm.pluginsdk.wallet.f.dlI();
    ab.d("MicroMsg.NetSceneBeforeTransfer", "rcver name: %s", new Object[] { paramString });
    AppMethodBeat.o(44727);
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(44728);
    ab.i("MicroMsg.NetSceneBeforeTransfer", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.pOI = ((px)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneBeforeTransfer", "ret_code: %s, ret_msg: %s", new Object[] { Integer.valueOf(this.pOI.kCl), this.pOI.kCm });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(44728);
  }

  public final void f(q paramq)
  {
    paramq = (px)((b)paramq).fsH.fsP;
    this.AfC = paramq.kCl;
    this.AfD = paramq.kCm;
  }

  public final int getType()
  {
    return 2783;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.model.e
 * JD-Core Version:    0.6.2
 */