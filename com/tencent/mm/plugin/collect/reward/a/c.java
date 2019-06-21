package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bud;
import com.tencent.mm.protocal.protobuf.bue;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.wallet_core.c.p;

public final class c extends p
{
  public bue kDw;

  public c(String paramString, int paramInt)
  {
    AppMethodBeat.i(41037);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bud();
    ((b.a)localObject).fsK = new bue();
    ((b.a)localObject).fsI = 2811;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/scanrewardmaterialcode";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bud)this.ehh.fsG.fsP;
    ((bud)localObject).wVT = paramString;
    ((bud)localObject).scene = paramInt;
    ab.i("MicroMsg.NetSceneQrRewardMaterial", "req url: %s, %s", new Object[] { paramString, Integer.valueOf(paramInt) });
    AppMethodBeat.o(41037);
  }

  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    AppMethodBeat.i(41038);
    this.kDw = ((bue)((b)paramq).fsH.fsP);
    ab.i("MicroMsg.NetSceneQrRewardMaterial", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.kDw.kCl), this.kDw.kCm });
    if (this.ehi != null)
      this.ehi.onSceneEnd(paramInt1, paramInt2, paramString, this);
    AppMethodBeat.o(41038);
  }

  public final boolean bgR()
  {
    return true;
  }

  public final void f(q paramq)
  {
    paramq = (bue)((b)paramq).fsH.fsP;
    this.AfC = paramq.kCl;
    this.AfD = paramq.kCm;
  }

  public final int getType()
  {
    return 2811;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.a.c
 * JD-Core Version:    0.6.2
 */