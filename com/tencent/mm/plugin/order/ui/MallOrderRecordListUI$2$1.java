package com.tencent.mm.plugin.order.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.order.model.i;
import com.tencent.mm.ui.base.h.c;
import java.util.List;

final class MallOrderRecordListUI$2$1
  implements h.c
{
  MallOrderRecordListUI$2$1(MallOrderRecordListUI.2 param2, int paramInt)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(43850);
    switch (paramInt)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(43850);
      return;
      i locali = (i)this.pef.pee.pea.get(this.sN);
      if (locali != null)
      {
        String str = locali.pcU;
        this.pef.pee.fz(str, locali.pdn);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.MallOrderRecordListUI.2.1
 * JD-Core Version:    0.6.2
 */