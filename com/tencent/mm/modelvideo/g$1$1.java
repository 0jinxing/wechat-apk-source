package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.c;
import com.tencent.mm.i.d;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

final class g$1$1
  implements h.a
{
  g$1$1(g.1 param1, d paramd)
  {
  }

  public final void cC(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50694);
    if ((paramInt1 == 4) && (paramInt2 == 102))
    {
      com.tencent.mm.kernel.g.RS().aa(new g.1.1.1(this));
      AppMethodBeat.o(50694);
    }
    while (true)
    {
      return;
      new com.tencent.mm.g.b.a.f(com.tencent.mm.plugin.report.a.r(new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(1), Long.valueOf(g.d(this.fVN.fVM)), Long.valueOf(bo.anU()), Integer.valueOf(c.bW(ah.getContext())), Integer.valueOf(g.e(this.fVN.fVM)), Integer.valueOf(this.fyV.field_fileLength), this.fyV.field_transInfo, "", "", "", "", "", "", "", this.fyV.efY })).ajK();
      a.a(g.g(this.fVN.fVM), 0);
      g.a(this.fVN.fVM, this.fyV);
      g.f(this.fVN.fVM).onSceneEnd(paramInt1, paramInt2, "", this.fVN.fVM);
      AppMethodBeat.o(50694);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.g.1.1
 * JD-Core Version:    0.6.2
 */