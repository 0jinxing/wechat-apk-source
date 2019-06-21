package com.tencent.mm.modelstat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.protocal.protobuf.aio;
import com.tencent.mm.sdk.e.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class c$4
  implements f
{
  c$4(c paramc, a parama, String paramString)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(78662);
    if ((paramm.getType() != 1126) || (paramInt1 != 0) || (paramInt2 != 0))
      AppMethodBeat.o(78662);
    while (true)
    {
      return;
      paramString = (aio)((j)paramm).fSY.fsH.fsP;
      if (paramString == null)
      {
        ab.e("MicroMsg.ClickFlowStatReceiver", "NetSceneUpdateEventConfig onSceneEnd resp is null");
        AppMethodBeat.o(78662);
      }
      else
      {
        c.b(this.fRJ).post(new c.4.1(this, paramString));
        AppMethodBeat.o(78662);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.c.4
 * JD-Core Version:    0.6.2
 */