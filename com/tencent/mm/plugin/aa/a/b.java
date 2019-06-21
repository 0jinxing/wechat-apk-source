package com.tencent.mm.plugin.aa.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.aa.a.a.j;
import com.tencent.mm.plugin.aa.a.b.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.v;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class b
  implements com.tencent.mm.ai.f
{
  com.tencent.mm.vending.g.b glt;

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(40594);
    ab.i("MicroMsg.AAGetPaylistDetailLogic", "onSceneEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = ((j)paramm).gmq;
      ab.i("MicroMsg.AAGetPaylistDetailLogic", "AAQueryDetailRes, onSceneEnd, retCode: %s", new Object[] { Integer.valueOf(paramString.kCl) });
      if (paramString.kCl == 0)
      {
        com.tencent.mm.vending.g.f.a(this.glt, new Object[] { paramString });
        h.pYm.a(407L, 6L, 1L, false);
        paramm = com.tencent.mm.plugin.aa.b.aod().vH(paramString.vzL);
        if (paramm != null)
        {
          paramm.field_status = paramString.state;
          com.tencent.mm.plugin.aa.b.aod().b(paramm);
        }
        AppMethodBeat.o(40594);
      }
    }
    while (true)
    {
      return;
      if ((paramString.kCl > 0) && (!bo.isNullOrNil(paramString.kCm)))
        this.glt.cR(paramString.kCm);
      while (true)
      {
        h.pYm.a(407L, 8L, 1L, false);
        AppMethodBeat.o(40594);
        break;
        this.glt.cR(Boolean.FALSE);
      }
      if (this.glt != null)
        this.glt.cR(Boolean.FALSE);
      h.pYm.a(407L, 7L, 1L, false);
      AppMethodBeat.o(40594);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.b
 * JD-Core Version:    0.6.2
 */