package com.tencent.mm.plugin.wallet_index.c.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bjb;
import com.tencent.mm.protocal.protobuf.bjc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c.u;

public final class a extends u
{
  private b ehh;
  private f ehi;
  public String jumpUrl;
  public String prepayId;
  public String tRb;
  public String tRo;

  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt)
  {
    AppMethodBeat.i(48212);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bjb();
    ((b.a)localObject).fsK = new bjc();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payibggenprepay";
    ((b.a)localObject).fsI = 1563;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bjb)this.ehh.fsG.fsP;
    ((bjb)localObject).fKh = paramString1;
    ((bjb)localObject).vYP = paramString4;
    ((bjb)localObject).vYO = paramString2;
    ((bjb)localObject).vYQ = paramString5;
    ((bjb)localObject).vYR = paramString6;
    ((bjb)localObject).vLo = paramString3;
    ((bjb)localObject).vXP = paramString7;
    ((bjb)localObject).wla = paramString8;
    ((bjb)localObject).vAM = paramInt;
    ab.d("MicroMsg.NetSceneIbgPayGenPrepay", String.format("appid:%s,packageExt:%s,nonceStr:%s,paySignature:%s,signtype:%s,timeStamp:%s,url:%s,bizUsername:%s,", new Object[] { paramString1, paramString4, paramString2, paramString5, paramString6, paramString3, paramString7, paramString8 }));
    AppMethodBeat.o(48212);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(48214);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(48214);
    return i;
  }

  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(48213);
    ab.i("MicroMsg.NetSceneIbgPayGenPrepay", "hy: gen ibg prepay raw net errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    paramq = (bjc)((b)paramq).fsH.fsP;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      ab.i("MicroMsg.NetSceneIbgPayGenPrepay", "hy: gen ibg prepay jump url. biz_errcode: %d, biz_errmsg: %s", new Object[] { Integer.valueOf(paramq.luT), paramq.luU });
      paramString = paramq.luU;
      paramInt2 = paramq.luT;
      this.jumpUrl = paramq.mZj;
      this.prepayId = paramq.wlb;
      this.tRb = paramq.wlc;
      this.tRo = paramq.wMr;
    }
    while (true)
    {
      paramq = paramString;
      if (bo.isNullOrNil(paramString))
        paramq = ah.getContext().getString(2131304763);
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramq, this);
      AppMethodBeat.o(48213);
      return;
      ab.e("MicroMsg.NetSceneIbgPayGenPrepay", "hy: gen ibg prepay jump url failed");
      this.jumpUrl = null;
    }
  }

  public final int getType()
  {
    return 1563;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.c.a.a
 * JD-Core Version:    0.6.2
 */