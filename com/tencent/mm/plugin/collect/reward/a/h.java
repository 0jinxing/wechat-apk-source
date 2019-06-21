package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ps;
import com.tencent.mm.protocal.protobuf.pt;
import com.tencent.mm.sdk.platformtools.ab;

public final class h extends a
{
  private final String TAG;
  private b ehh;
  private f ehi;
  public String jMS;
  public pt kDB;

  public h(String paramString)
  {
    AppMethodBeat.i(41051);
    this.TAG = "MicroMsg.NetSceneQrRewardSetPhotoWord";
    b.a locala = new b.a();
    locala.fsJ = new ps();
    locala.fsK = new pt();
    locala.fsI = 1649;
    locala.uri = "/cgi-bin/mmpay-bin/setrewardqrcodephotoword";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((ps)this.ehh.fsG.fsP).jMS = paramString;
    this.jMS = paramString;
    if ((paramString.length() > 0) && (paramString.length() <= 3))
    {
      com.tencent.mm.plugin.report.service.h.pYm.a(724L, 0L, 1L, false);
      AppMethodBeat.o(41051);
    }
    while (true)
    {
      return;
      if (paramString.length() > 3)
        com.tencent.mm.plugin.report.service.h.pYm.a(724L, 1L, 1L, false);
      AppMethodBeat.o(41051);
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(41052);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(41052);
    return i;
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41053);
    ab.i("MicroMsg.NetSceneQrRewardSetPhotoWord", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.kDB = ((pt)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneQrRewardSetPhotoWord", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.kDB.kCl), this.kDB.kCm });
    if ((!this.kDr) && (this.kDB.kCl != 0))
      this.kDs = true;
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(41053);
  }

  public final int getType()
  {
    return 1649;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.a.h
 * JD-Core Version:    0.6.2
 */