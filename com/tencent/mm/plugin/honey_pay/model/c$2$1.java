package com.tencent.mm.plugin.honey_pay.model;

import android.graphics.Color;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bbd;
import com.tencent.mm.protocal.protobuf.btn;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.Iterator;
import java.util.LinkedList;

final class c$2$1
  implements n.c
{
  c$2$1(c.2 param2)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(41753);
    Iterator localIterator = this.nqS.nqO.wVw.iterator();
    int i = 0;
    bbd localbbd;
    if (localIterator.hasNext())
    {
      localbbd = (bbd)localIterator.next();
      if (bo.isNullOrNil(localbbd.jMS))
        break label108;
      if (!bo.isNullOrNil(localbbd.color))
      {
        paraml.a(i, Color.parseColor(localbbd.color), localbbd.jMS);
        label82: i++;
      }
    }
    label108: 
    while (true)
    {
      break;
      paraml.e(i, localbbd.jMS);
      break label82;
      AppMethodBeat.o(41753);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.model.c.2.1
 * JD-Core Version:    0.6.2
 */