package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.pd;
import com.tencent.mm.protocal.protobuf.pe;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b extends a
{
  private final String TAG;
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  public pe kDu;
  public boolean kDv;

  public b(boolean paramBoolean)
  {
    AppMethodBeat.i(41034);
    this.TAG = "MicroMsg.NetSceneQrRewardGetCode";
    b.a locala = new b.a();
    locala.fsJ = new pd();
    locala.fsK = new pe();
    locala.fsI = 1323;
    locala.uri = "/cgi-bin/mmpay-bin/getrewardqrcode";
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    ((pd)this.ehh.fsG.fsP).vWp = paramBoolean;
    this.kDv = paramBoolean;
    AppMethodBeat.o(41034);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(41035);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(41035);
    return i;
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41036);
    ab.i("MicroMsg.NetSceneQrRewardGetCode", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.kDu = ((pe)((com.tencent.mm.ai.b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneQrRewardGetCode", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.kDu.kCl), this.kDu.kCm });
    if ((!this.kDr) && (this.kDu.kCl != 0))
      this.kDs = true;
    if ((!this.kDr) && (!this.kDs))
    {
      g.RP().Ry().set(ac.a.xTv, Integer.valueOf(this.kDu.vWw));
      g.RP().Ry().set(ac.a.xTw, Integer.valueOf(this.kDu.vWs));
      g.RP().Ry().set(ac.a.xTy, this.kDu.desc);
      g.RP().Ry().set(ac.a.xTx, this.kDu.jMS);
      g.RP().Ry().set(ac.a.xTA, Integer.valueOf(this.kDu.vWv));
      g.RP().Ry().set(ac.a.xTC, this.kDu.kdE);
      g.RP().Ry().set(ac.a.xTD, this.kDu.vWu);
      g.RP().Ry().set(ac.a.xTE, this.kDu.pOy);
      paramq = new ArrayList();
      Iterator localIterator = this.kDu.vWt.iterator();
      while (localIterator.hasNext())
        paramq.add(String.valueOf(((Integer)localIterator.next()).intValue()));
      g.RP().Ry().set(ac.a.xTB, bo.c(paramq, ","));
      h.pYm.a(724L, 2L, 1L, false);
    }
    while (true)
    {
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
      AppMethodBeat.o(41036);
      return;
      if (this.kDr)
        h.pYm.a(724L, 4L, 1L, false);
      else
        h.pYm.a(724L, 3L, 1L, false);
    }
  }

  protected final boolean bgQ()
  {
    return false;
  }

  public final int getType()
  {
    return 1323;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.a.b
 * JD-Core Version:    0.6.2
 */