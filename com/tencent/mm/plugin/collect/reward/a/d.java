package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.pm;
import com.tencent.mm.protocal.protobuf.pn;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends a
{
  private final String TAG;
  private b ehh;
  private f ehi;
  private pn kDx;

  public d(String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, String paramString5)
  {
    AppMethodBeat.i(41039);
    this.TAG = "MicroMsg.NetSceneQrRewardPayCheck";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new pm();
    ((b.a)localObject).fsK = new pn();
    ((b.a)localObject).fsI = 1960;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/rewardqrcodepaycheck";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (pm)this.ehh.fsG.fsP;
    ((pm)localObject).cBT = paramString1;
    ((pm)localObject).vWI = paramString2;
    ((pm)localObject).vFc = paramString3;
    ((pm)localObject).nUf = paramInt;
    ((pm)localObject).vWG = paramString4;
    ((pm)localObject).vWF = paramString5;
    ab.i("MicroMsg.NetSceneQrRewardPayCheck", "rewardid: %s, amt: %s", new Object[] { paramString2, Integer.valueOf(paramInt) });
    AppMethodBeat.o(41039);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(41040);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(41040);
    return i;
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41041);
    ab.i("MicroMsg.NetSceneQrRewardPayCheck", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.kDx = ((pn)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneQrRewardPayCheck", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.kDx.kCl), this.kDx.kCm });
    if ((!this.kDr) && (this.kDx.kCl != 0))
      this.kDs = true;
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(41041);
  }

  public final int getType()
  {
    return 1960;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.a.d
 * JD-Core Version:    0.6.2
 */