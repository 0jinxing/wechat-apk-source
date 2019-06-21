package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aex;
import com.tencent.mm.protocal.protobuf.aey;
import com.tencent.mm.sdk.platformtools.ab;

public final class e extends m
  implements k
{
  private b ehh;
  private f ehi;
  public aey ttO;

  public e(String paramString)
  {
    AppMethodBeat.i(46500);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aex();
    ((b.a)localObject).fsK = new aey();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/tenpay/getbanpaymobileinfo";
    ((b.a)localObject).fsI = 1667;
    ((b.a)localObject).fsO = com.tencent.mm.wallet_core.ui.e.atB(paramString);
    this.ehh = ((b.a)localObject).acD();
    localObject = (aex)this.ehh.fsG.fsP;
    ab.d("MicroMsg.NetSceneGetBanpayMobileInfo", "req_key: %s", new Object[] { paramString });
    ((aex)localObject).cBT = paramString;
    AppMethodBeat.o(46500);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(46501);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(46501);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(46502);
    ab.i("MicroMsg.NetSceneGetBanpayMobileInfo", "NetSceneGetBanpayMobileInfo, netId: %s, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.ttO = ((aey)this.ehh.fsH.fsP);
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(46502);
  }

  public final int getType()
  {
    return 1667;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.e
 * JD-Core Version:    0.6.2
 */