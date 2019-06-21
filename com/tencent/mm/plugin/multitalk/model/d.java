package com.tencent.mm.plugin.multitalk.model;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.y;

public final class d
  implements f
{
  c.a cqd;
  com.tencent.mm.audio.b.c kzb;
  public com.tencent.pb.talkroom.sdk.d oFP;
  c oFQ;
  com.tencent.pb.talkroom.sdk.c oFR;
  com.tencent.pb.talkroom.sdk.b oFS;
  com.tencent.mm.plugin.voip.model.b oFT;

  public d()
  {
    AppMethodBeat.i(53908);
    this.cqd = new d.2(this);
    this.oFT = new d.3(this);
    ab.i("MicroMsg.MT.MultiTalkEngine", "init multiTalk engine");
    Context localContext = ah.getContext();
    com.tencent.wecall.talkroom.model.e locale = com.tencent.wecall.talkroom.model.e.dTl();
    com.tencent.wecall.talkroom.model.e.jt(localContext);
    this.oFP = locale;
    this.oFP.dPP();
    this.oFQ = new c();
    int i = bo.h((Integer)g.RP().eJH.get(1));
    this.oFP.a(p.bSf(), new d.1(this));
    this.oFP.bR(i, r.Yz());
    g.Rg().a(1918, this);
    g.Rg().a(1919, this);
    g.Rg().a(1927, this);
    g.Rg().a(1928, this);
    g.Rg().a(1929, this);
    g.Rg().a(1931, this);
    g.Rg().a(1932, this);
    g.Rg().a(1933, this);
    g.Rg().a(1935, this);
    g.Rg().a(1937, this);
    g.Rg().a(1938, this);
    g.Rg().a(1939, this);
    AppMethodBeat.o(53908);
  }

  public final void jj(boolean paramBoolean)
  {
    AppMethodBeat.i(53910);
    ab.c("MicroMsg.MT.MultiTalkEngine", "setEngineHeadsetPlugged, %s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      int j = (byte)i;
      this.oFP.setAppCmd(425, new byte[] { j }, 1);
      AppMethodBeat.o(53910);
      return;
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(53909);
    paramString = (o)paramm;
    ab.i("MicroMsg.MT.MultiTalkEngine", "onSceneEnd errtype " + paramInt1 + " errCode " + paramInt2 + " cmdid " + paramString.lqy);
    this.oFP.e(paramInt2, paramString.lqx, paramString.lqy, paramString.cQr);
    AppMethodBeat.o(53909);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.multitalk.model.d
 * JD-Core Version:    0.6.2
 */