package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.po;
import com.tencent.mm.protocal.protobuf.pp;
import com.tencent.mm.sdk.platformtools.ab;

public final class e extends a
{
  private final String TAG;
  private b ehh;
  private f ehi;
  public pp kDy;

  public e(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, int paramInt3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt4)
  {
    AppMethodBeat.i(41042);
    this.TAG = "MicroMsg.NetSceneQrRewardPlaceOrder";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new po();
    ((b.a)localObject).fsK = new pp();
    ((b.a)localObject).fsI = 1336;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/rewardqrcodeplaceorder";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (po)this.ehh.fsG.fsP;
    ((po)localObject).nUf = paramInt1;
    ((po)localObject).vWL = paramInt2;
    ((po)localObject).vWJ = paramString1;
    ((po)localObject).vWK = paramString2;
    ((po)localObject).pPT = paramString3;
    ((po)localObject).cIb = paramInt3;
    ((po)localObject).vWM = paramString4;
    ((po)localObject).vWG = paramString5;
    ((po)localObject).vWN = paramString6;
    ((po)localObject).vWO = paramString7;
    ((po)localObject).vWP = paramString8;
    ((po)localObject).vWQ = paramInt4;
    AppMethodBeat.o(41042);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(41043);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(41043);
    return i;
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41044);
    ab.i("MicroMsg.NetSceneQrRewardPlaceOrder", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.kDy = ((pp)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneQrRewardPlaceOrder", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.kDy.kCl), this.kDy.kCm });
    if ((!this.kDr) && (this.kDy.kCl != 0))
      this.kDs = true;
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(41044);
  }

  public final int getType()
  {
    return 1336;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.a.e
 * JD-Core Version:    0.6.2
 */