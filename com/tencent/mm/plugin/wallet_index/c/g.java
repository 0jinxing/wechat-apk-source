package com.tencent.mm.plugin.wallet_index.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.plugin.wallet_core.model.k;
import com.tencent.mm.protocal.protobuf.bin;
import com.tencent.mm.protocal.protobuf.bio;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.i;
import com.tencent.mm.wallet_core.c.u;

public class g extends u
  implements i
{
  public b ehh;
  private f ehi;

  public g(PayReq paramPayReq, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(48187);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bin();
    ((b.a)localObject).fsK = new bio();
    ((b.a)localObject).uri = getUri();
    ((b.a)localObject).fsI = getType();
    ((b.a)localObject).fsL = 188;
    ((b.a)localObject).fsM = 1000000188;
    ((b.a)localObject).fsO = com.tencent.mm.wallet_core.ui.e.atB(paramPayReq.prepayId);
    this.ehh = ((b.a)localObject).acD();
    localObject = (bin)this.ehh.fsG.fsP;
    ((bin)localObject).fKh = paramPayReq.appId;
    ((bin)localObject).wLU = paramPayReq.partnerId;
    ((bin)localObject).wlb = paramPayReq.prepayId;
    ((bin)localObject).vYO = paramPayReq.nonceStr;
    ((bin)localObject).wLV = paramPayReq.timeStamp;
    ((bin)localObject).vYP = paramPayReq.packageValue;
    ((bin)localObject).vYQ = paramPayReq.sign;
    ((bin)localObject).vYR = paramPayReq.signType;
    ((bin)localObject).wLW = paramString1;
    ((bin)localObject).mZu = paramString2;
    ((bin)localObject).ncH = paramString3;
    ((bin)localObject).vRP = k.cPy();
    ((bin)localObject).wLY = paramString4;
    AppMethodBeat.o(48187);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(48188);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(48188);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(48189);
    ab.d("MicroMsg.NetScenePayAuthApp", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(48189);
  }

  public int getType()
  {
    return 397;
  }

  public String getUri()
  {
    return "/cgi-bin/mmpay-bin/payauthapp";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.c.g
 * JD-Core Version:    0.6.2
 */