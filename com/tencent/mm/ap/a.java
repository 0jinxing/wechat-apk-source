package com.tencent.mm.ap;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.model.t;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.storage.bi;
import junit.framework.Assert;

public final class a extends m
  implements k
{
  private bi csG;
  private f ehi;
  private ak handler;

  public a(String paramString1, String paramString2)
  {
    AppMethodBeat.i(16438);
    this.handler = new a.1(this);
    this.csG = new bi();
    this.csG.setStatus(1);
    this.csG.ju(paramString1);
    this.csG.eJ(bf.oC(paramString1));
    this.csG.hO(1);
    this.csG.setContent(paramString2);
    this.csG.setType(t.nK(paramString1));
    aw.ZK();
    long l = c.XO().Z(this.csG);
    if (l != -1L);
    while (true)
    {
      Assert.assertTrue(bool);
      ab.i("MicroMsg.NetSceneSendMsgFake", "new msg inserted to db , local id = ".concat(String.valueOf(l)));
      AppMethodBeat.o(16438);
      return;
      bool = false;
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(16439);
    this.ehi = paramf;
    ab.i("MicroMsg.NetSceneSendMsgFake", "send local msg, msgId = " + this.csG.field_msgId);
    this.handler.sendEmptyMessageDelayed(0, 500L);
    AppMethodBeat.o(16439);
    return 999;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(16440);
    ab.i("MicroMsg.NetSceneSendMsgFake", "recv local msg, msgId = " + this.csG.field_msgId);
    this.csG.setStatus(2);
    this.csG.eJ(bf.q(this.csG.field_talker, System.currentTimeMillis() / 1000L));
    aw.ZK();
    c.XO().a(this.csG.field_msgId, this.csG);
    this.ehi.onSceneEnd(0, 0, paramString, this);
    AppMethodBeat.o(16440);
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 522;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ap.a
 * JD-Core Version:    0.6.2
 */