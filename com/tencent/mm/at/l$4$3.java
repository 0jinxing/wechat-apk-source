package com.tencent.mm.at;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.c;
import com.tencent.mm.i.d;
import com.tencent.mm.plugin.report.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

final class l$4$3
  implements m.a
{
  l$4$3(l.4 param4, d paramd, e parame)
  {
  }

  public final void a(long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(78324);
    new com.tencent.mm.g.b.a.f(a.r(new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(1), Long.valueOf(l.l(this.fFG.fFF)), Long.valueOf(bo.anU()), Integer.valueOf(c.bW(ah.getContext())), Integer.valueOf(l.m(this.fFG.fFF)), Integer.valueOf(this.fyV.field_fileLength), this.fyV.field_transInfo, "", "", "", "", "", "", "", l.sp(this.fyV.efY) })).ajK();
    ab.i(l.f(this.fFG.fFF), "cdntra clientid:%s NetSceneUploadMsgImgForCdn ret:[%d,%d]", new Object[] { l.j(this.fFG.fFF), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      i.lC((int)l.b(this.fFG.fFF));
      i.lB((int)l.b(this.fFG.fFF));
      l.g(this.fFG.fFF).onSceneEnd(paramInt2, paramInt3, "", this.fFG.fFF);
      if (l.k(this.fFG.fFF) != null)
        l.k(this.fFG.fFF).agX();
      AppMethodBeat.o(78324);
    }
    while (true)
    {
      return;
      l.a(this.fFG.fFF, this.fFp, this.fFp.frO, paramLong, paramInt1, this.fyV);
      AppMethodBeat.o(78324);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.l.4.3
 * JD-Core Version:    0.6.2
 */