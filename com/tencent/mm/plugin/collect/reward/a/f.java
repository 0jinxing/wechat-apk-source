package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.pq;
import com.tencent.mm.protocal.protobuf.pr;
import com.tencent.mm.sdk.platformtools.ab;

public final class f extends a
{
  private final String TAG;
  private b ehh;
  private com.tencent.mm.ai.f ehi;
  public pr kDz;

  public f(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(41045);
    this.TAG = "MicroMsg.NetSceneQrRewardScanCode";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new pq();
    ((b.a)localObject).fsK = new pr();
    ((b.a)localObject).fsI = 1516;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/scanrewardqrcode";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (pq)this.ehh.fsG.fsP;
    ((pq)localObject).kCn = paramString1;
    ((pq)localObject).cIb = paramInt;
    ((pq)localObject).vWN = paramString2;
    AppMethodBeat.o(41045);
  }

  public final int a(e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(41046);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(41046);
    return i;
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41047);
    ab.i("MicroMsg.NetSceneQrRewardScanCode", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.kDz = ((pr)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneQrRewardScanCode", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.kDz.kCl), this.kDz.kCm });
    if ((!this.kDr) && (this.kDz.kCl != 0))
      this.kDs = true;
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(41047);
  }

  protected final boolean bgQ()
  {
    return false;
  }

  public final int getType()
  {
    return 1516;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.a.f
 * JD-Core Version:    0.6.2
 */