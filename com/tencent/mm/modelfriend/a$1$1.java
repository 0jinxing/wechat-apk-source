package com.tencent.mm.modelfriend;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;

final class a$1$1
  implements f
{
  a$1$1(a.1 param1)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(123395);
    ab.d("MicroMsg.NetSceneBindMobileForReg", "summerauth dkcert getcert type:%d ret [%d,%d]", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.fBd.fBc.ehi.onSceneEnd(paramInt1, paramInt2, "", this.fBd.fBc);
      AppMethodBeat.o(123395);
    }
    while (true)
    {
      return;
      this.fBd.fBc.a(this.fBd.fBc.ftf, this.fBd.fBc.ehi);
      AppMethodBeat.o(123395);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelfriend.a.1.1
 * JD-Core Version:    0.6.2
 */