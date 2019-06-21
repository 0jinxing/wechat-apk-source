package com.tencent.mm.plugin.sns;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.ia;
import com.tencent.mm.g.a.ia.a;
import com.tencent.mm.g.a.pd;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.q;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.cbg;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.LinkedList;

public final class d extends c<ia>
  implements f
{
  private int qBW;
  private cbf qBX;
  private n qBY;
  private ap qBZ;

  public d()
  {
    AppMethodBeat.i(35604);
    this.xxI = ia.class.getName().hashCode();
    AppMethodBeat.o(35604);
  }

  private boolean a(ia paramia)
  {
    AppMethodBeat.i(35605);
    boolean bool;
    if (!(paramia instanceof ia))
    {
      ab.f("MicroMsg.GetSnsObjectDetailListener", "mismatched event");
      AppMethodBeat.o(35605);
      bool = false;
    }
    while (true)
    {
      return bool;
      this.qBW = paramia.cCX.cyN;
      this.qBY = af.cnF().DK(this.qBW);
      this.qBX = aj.p(this.qBY);
      if ((this.qBX != null) && (((this.qBX.wGz == 3) && (this.qBX.xaB != null) && (this.qBX.xaB.size() > 0)) || ((this.qBX.wGz == 5) && (this.qBX.wFp != null) && (this.qBX.wFp.size() > 0))))
      {
        paramia.cCY.cCZ = this.qBX;
        AppMethodBeat.o(35605);
        bool = true;
      }
      else
      {
        paramia = new q(this.qBY.field_snsId);
        ((cbg)paramia.ehh.fsG.fsP).xaH = 1;
        g.RQ();
        g.RO().eJo.a(210, this);
        g.RQ();
        g.RO().eJo.a(paramia, 0);
        this.qBZ = new ap(new d.1(this), false);
        this.qBZ.ae(10000L, 10000L);
        AppMethodBeat.o(35605);
        bool = true;
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(35606);
    ab.i("MicroMsg.GetSnsObjectDetailListener", "dz:[onSceneEnd]errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.qBZ.stopTimer();
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramm = af.cnF().kD(this.qBY.field_snsId);
      paramString = new pd();
      paramString.cLs.cCZ = aj.p(paramm);
      a.xxA.m(paramString);
      AppMethodBeat.o(35606);
    }
    while (true)
    {
      return;
      paramString = new pd();
      paramString.cLs.cCZ = null;
      a.xxA.m(paramString);
      AppMethodBeat.o(35606);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.d
 * JD-Core Version:    0.6.2
 */