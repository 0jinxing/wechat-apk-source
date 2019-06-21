package com.tencent.mm.plugin.record.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.c;
import com.tencent.mm.plugin.fav.a.g;
import com.tencent.mm.plugin.fav.a.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;

final class d$1
  implements p
{
  d$1(d paramd)
  {
  }

  public final void d(c paramc)
  {
    AppMethodBeat.i(24196);
    b localb = (b)this.pKc.pKs;
    if (paramc.field_favLocalId != localb.mnW.field_localId)
    {
      ab.i("MicroMsg.FavRecordAdapter", "not equal Id %d %d", new Object[] { Long.valueOf(paramc.field_favLocalId), Long.valueOf(localb.mnW.field_localId) });
      AppMethodBeat.o(24196);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.FavRecordAdapter", "on cdn status changed, fav local id %d, data id %s, status %d", new Object[] { Long.valueOf(paramc.field_favLocalId), paramc.field_dataId, Integer.valueOf(paramc.field_status) });
      if (4 == paramc.field_status)
        d.bDq().put(bo.bc(paramc.field_dataId, "null"), Boolean.TRUE);
      if (paramc.isFinished())
        this.pKc.mty.post(new d.1.1(this, paramc));
      this.pKc.ceP();
      AppMethodBeat.o(24196);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.d.1
 * JD-Core Version:    0.6.2
 */