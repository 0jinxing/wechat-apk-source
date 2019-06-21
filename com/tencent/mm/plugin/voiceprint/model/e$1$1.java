package com.tencent.mm.plugin.voiceprint.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;

final class e$1$1
  implements f
{
  e$1$1(e.1 param1)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(26081);
    ab.d("MicroMsg.NetSceneGetVoiceprintTicketRsa", "summerauth dkcert getcert type:%d ret [%d,%d]", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.sLa.sKZ.ehi.onSceneEnd(paramInt1, paramInt2, "", this.sLa.sKZ);
      AppMethodBeat.o(26081);
    }
    while (true)
    {
      return;
      this.sLa.sKZ.a(this.sLa.sKZ.ftf, this.sLa.sKZ.ehi);
      AppMethodBeat.o(26081);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.model.e.1.1
 * JD-Core Version:    0.6.2
 */