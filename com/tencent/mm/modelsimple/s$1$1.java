package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;

final class s$1$1
  implements f
{
  s$1$1(s.1 param1)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(123460);
    ab.d("MicroMsg.NetSceneReg", "summerauth dkcert getcert type:%d ret [%d,%d]", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.fPE.fPD.ehi.onSceneEnd(paramInt1, paramInt2, "", this.fPE.fPD);
      AppMethodBeat.o(123460);
    }
    while (true)
    {
      return;
      this.fPE.fPD.a(this.fPE.fPD.ftf, this.fPE.fPD.ehi);
      AppMethodBeat.o(123460);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.s.1.1
 * JD-Core Version:    0.6.2
 */