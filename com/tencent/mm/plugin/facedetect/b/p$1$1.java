package com.tencent.mm.plugin.facedetect.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;

final class p$1$1
  implements f
{
  p$1$1(p.1 param1)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(93);
    ab.d("MicroMsg.NetSceneFaceRsaBase", "hy: summerauth dkcert getcert type:%d ret [%d,%d]", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.NetSceneFaceRsaBase", "hy: do scene err in rsa when get cert. clear ticket");
      p.bsi();
      this.lSX.lSW.Lo(p.agg());
      this.lSX.lSW.ehi.onSceneEnd(paramInt1, paramInt2, "", this.lSX.lSW);
      AppMethodBeat.o(93);
    }
    while (true)
    {
      return;
      this.lSX.lSW.g(p.b(this.lSX.lSW));
      AppMethodBeat.o(93);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.b.p.1.1
 * JD-Core Version:    0.6.2
 */