package com.tencent.mm.modelsimple;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;

final class q$1$1
  implements f
{
  q$1$1(q.1 param1)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(123436);
    ab.d("MicroMsg.NetSceneManualAuth", "summerauth dkcert getcert type:%d ret [%d,%d]", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.fPn.fPm.ehi.onSceneEnd(paramInt1, paramInt2, "", this.fPn.fPm);
      AppMethodBeat.o(123436);
    }
    while (true)
    {
      return;
      this.fPn.fPm.a(this.fPn.fPm.ftf, this.fPn.fPm.ehi);
      AppMethodBeat.o(123436);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelsimple.q.1.1
 * JD-Core Version:    0.6.2
 */