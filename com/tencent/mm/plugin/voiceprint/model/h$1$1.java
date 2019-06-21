package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;

final class h$1$1
  implements f
{
  h$1$1(h.1 param1)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(26095);
    ab.d("MicroMsg.NetSceneRsaVertifyVoicePrint", "summerauth dkcert getcert type:%d ret [%d,%d]", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.sLl.sLk.ehi.onSceneEnd(paramInt1, paramInt2, "", this.sLl.sLk);
      AppMethodBeat.o(26095);
    }
    while (true)
    {
      return;
      this.sLl.sLk.a(this.sLl.sLk.ftf, this.sLl.sLk.ehi);
      AppMethodBeat.o(26095);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.model.h.1.1
 * JD-Core Version:    0.6.2
 */