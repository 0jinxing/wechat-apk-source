package com.tencent.mm.plugin.wallet_core.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.uo;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.d.d;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.Date;

public final class x extends c<uo>
  implements f
{
  private uo tCr;
  private String tCs;

  public x()
  {
    AppMethodBeat.i(46900);
    this.tCs = null;
    this.xxI = uo.class.getName().hashCode();
    AppMethodBeat.o(46900);
  }

  private void cPR()
  {
    AppMethodBeat.i(46901);
    d locald = r.cPM();
    u localu = new u();
    localu.field_bulletin_scene = this.tCs;
    if (!locald.b(localu, new String[0]))
      ab.i("MicroMsg.WalletGetBulletinEventListener", "not bulletin data ");
    while (true)
    {
      this.tCr.callback.run();
      this.tCr = null;
      AppMethodBeat.o(46901);
      return;
      this.tCr.cQK.cQM = localu.field_bulletin_scene;
      this.tCr.cQK.content = localu.field_bulletin_content;
      this.tCr.cQK.url = localu.field_bulletin_url;
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(46902);
    ab.i("MicroMsg.WalletGetBulletinEventListener", "NetSceneGetBannerInfo resp,errType = " + paramInt1 + ";errCode=" + paramInt2);
    g.RQ();
    g.RO().eJo.b(385, this);
    g.RQ();
    g.RP().Ry().set(ac.a.xMN, Long.valueOf(new Date().getTime()));
    cPR();
    AppMethodBeat.o(46902);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.x
 * JD-Core Version:    0.6.2
 */