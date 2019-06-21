package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.c;
import com.tencent.mm.i.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

final class af$1$1
  implements ag.a
{
  af$1$1(af.1 param1, d paramd)
  {
  }

  public final void cC(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(27358);
    ab.d("MicroMsg.NetSceneSendAppMsg", "summersafecdn cdntra NetSceneSendAppMsgForCdn callback %d,%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    new com.tencent.mm.g.b.a.f(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(1), Long.valueOf(this.vcy.vcx.startTime), Long.valueOf(bo.anU()), Integer.valueOf(c.bW(ah.getContext())), Integer.valueOf(com.tencent.mm.i.a.MediaType_FILE), Integer.valueOf(this.fyV.field_fileLength), this.fyV.field_transInfo, "", "", "", "", "", "", "", this.fyV.efY })).ajK();
    this.vcy.vcx.ehi.onSceneEnd(paramInt1, paramInt2, "", this.vcy.vcx);
    AppMethodBeat.o(27358);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.af.1.1
 * JD-Core Version:    0.6.2
 */