package com.tencent.mm.plugin.brandservice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.mh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.sortview.a;

final class f$1
  implements c.b
{
  f$1(f paramf)
  {
  }

  public final void a(c paramc, a parama, int paramInt1, String paramString, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(14031);
    mh localmh = this.jMA.sa(paramInt3);
    parama = new StringBuilder().append(bo.nullAsNil(this.jMA.jKW)).append(",").append(paramInt1).append(",").append(bo.nullAsNil(paramString)).append(",").append(paramInt2).append(",").append(paramc.jLe).append(",");
    if (localmh == null);
    for (paramc = ""; ; paramc = localmh.vQg + ",0")
    {
      paramc = paramc;
      h.pYm.X(10866, paramc);
      ab.d("MicroMsg.SearchOrRecommendBizAdapter", "report : ".concat(String.valueOf(paramc)));
      AppMethodBeat.o(14031);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.f.1
 * JD-Core Version:    0.6.2
 */