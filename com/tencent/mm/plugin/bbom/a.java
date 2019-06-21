package com.tencent.mm.plugin.bbom;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.b;
import com.tencent.mm.g.a.hi;
import com.tencent.mm.g.a.su;
import com.tencent.mm.model.av;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.protocal.j.f;
import com.tencent.mm.protocal.j.g;
import com.tencent.mm.protocal.protobuf.ar;
import com.tencent.mm.protocal.protobuf.beh;
import com.tencent.mm.protocal.protobuf.cjj;
import com.tencent.mm.protocal.v.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

public final class a
  implements com.tencent.mm.plugin.auth.a.a
{
  public final void a(j.f paramf, j.g paramg, boolean paramBoolean)
  {
    AppMethodBeat.i(18229);
    if ((paramg.vxV.xic & 0x2) != 0)
    {
      paramf = paramg.vxV.xie;
      if (!paramBoolean)
      {
        aw.ZK();
        c.iy(paramf.vCi);
      }
      paramg = b.pX(r.Yz());
      av.fly.ou(paramg);
      if (paramf.vCf != 0)
      {
        aw.ZK();
        c.XU().cE(paramf.vCf + "@qqim", 3);
      }
      b.d(paramf.vCf, 3);
      o.mg(1);
      if (!paramBoolean)
        break label180;
      paramf = new hi();
      paramf.cCe.cCf = false;
      com.tencent.mm.sdk.b.a.xxA.m(paramf);
      paramf = new su();
      paramf.cOT.cOU = true;
      com.tencent.mm.sdk.b.a.xxA.m(paramf);
      AppMethodBeat.o(18229);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.BigBallAuthHandle", "summerauth updateProfile acctsect not set!");
      break;
      label180: aw.RS().aa(new a.1(this));
      AppMethodBeat.o(18229);
    }
  }

  public final void a(v.b paramb, String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    AppMethodBeat.i(18230);
    paramString1 = b.pX(r.Yz());
    av.fly.ou(paramString1);
    b.d(paramInt1, 3);
    aw.ZK();
    c.XU().cE(paramb.vyJ.wIh, 2);
    if (paramInt1 != 0)
    {
      aw.ZK();
      c.XU().cE(paramInt1 + "@qqim", 3);
    }
    AppMethodBeat.o(18230);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bbom.a
 * JD-Core Version:    0.6.2
 */