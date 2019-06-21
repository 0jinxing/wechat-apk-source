package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.pu;
import com.tencent.mm.protocal.protobuf.pv;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g extends a
{
  private final String TAG;
  private b ehh;
  private f ehi;
  public pv kDA;

  public g(LinkedList<Integer> paramLinkedList, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(41048);
    this.TAG = "MicroMsg.NetSceneQrRewardSetCode";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new pu();
    ((b.a)localObject).fsK = new pv();
    ((b.a)localObject).fsI = 1562;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/setrewardqrcode";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (pu)this.ehh.fsG.fsP;
    ((pu)localObject).vWt = paramLinkedList;
    ((pu)localObject).desc = paramString;
    ((pu)localObject).vWT = paramBoolean1;
    ((pu)localObject).vWU = paramBoolean2;
    ab.i("MicroMsg.NetSceneQrRewardSetCode", "desc: %s, flag: %s, default: %s", new Object[] { paramString, Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2) });
    AppMethodBeat.o(41048);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(41049);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(41049);
    return i;
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41050);
    ab.i("MicroMsg.NetSceneQrRewardSetCode", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.kDA = ((pv)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneQrRewardSetCode", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.kDA.kCl), this.kDA.kCm });
    if ((!this.kDr) && (this.kDA.kCl != 0))
      this.kDs = true;
    if ((!this.kDr) && (!this.kDs))
    {
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xTv, Integer.valueOf(this.kDA.vWw));
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xTw, Integer.valueOf(this.kDA.vWs));
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xTy, this.kDA.desc);
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xTE, this.kDA.pOy);
      ArrayList localArrayList = new ArrayList();
      paramq = this.kDA.vWt.iterator();
      while (paramq.hasNext())
        localArrayList.add(String.valueOf(((Integer)paramq.next()).intValue()));
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xTB, bo.c(localArrayList, ","));
      h.pYm.a(724L, 5L, 1L, false);
    }
    while (true)
    {
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
      AppMethodBeat.o(41050);
      return;
      if (this.kDr)
        h.pYm.a(724L, 7L, 1L, false);
      else
        h.pYm.a(724L, 6L, 1L, false);
    }
  }

  public final int getType()
  {
    return 1562;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.a.g
 * JD-Core Version:    0.6.2
 */