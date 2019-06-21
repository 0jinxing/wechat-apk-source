package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.voip.a.a;

final class l$1
  implements f
{
  l$1(l paraml)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(4732);
    a.Logd("MicroMsg.NetSceneVoipStatReport", "onSceneEnd type:" + paramm.getType() + " errType:" + paramInt1 + " errCode:" + paramInt2);
    AppMethodBeat.o(4732);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.l.1
 * JD-Core Version:    0.6.2
 */