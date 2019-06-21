package com.tencent.mm.pluginsdk.model.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.c;
import com.tencent.mm.i.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

final class ai$1$3
  implements ag.a
{
  ai$1$3(ai.1 param1, d paramd)
  {
  }

  public final void cC(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(27374);
    ab.i("MicroMsg.NetSceneUploadAppAttach", "summerbig cdntra NetSceneSendAppMsgForCdn callback %d,%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 4) && (paramInt2 == 102))
    {
      aw.RS().aa(new ai.1.3.1(this));
      AppMethodBeat.o(27374);
    }
    while (true)
    {
      return;
      new com.tencent.mm.g.b.a.f(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(1), Long.valueOf(this.vcG.vcF.startTime), Long.valueOf(bo.anU()), Integer.valueOf(c.bW(ah.getContext())), Integer.valueOf(com.tencent.mm.i.a.MediaType_FILE), Integer.valueOf(this.fyV.field_fileLength), this.fyV.field_transInfo, "", "", "", "", "", "", "", this.fyV.efY })).ajK();
      if ((paramInt1 == 0) && (paramInt2 == 0))
        this.vcG.vcF.d(this.fyV);
      this.vcG.vcF.ehi.onSceneEnd(paramInt1, paramInt2, "", this.vcG.vcF);
      AppMethodBeat.o(27374);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ai.1.3
 * JD-Core Version:    0.6.2
 */