package com.tencent.mm.plugin.ipcall.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.csc;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import com.tencent.mm.ui.q;
import java.util.Iterator;
import java.util.LinkedList;

final class IPCallShareCouponCardUI$12
  implements n.c
{
  IPCallShareCouponCardUI$12(IPCallShareCouponCardUI paramIPCallShareCouponCardUI)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(22294);
    Iterator localIterator = IPCallShareCouponCardUI.a(this.nFb, IPCallShareCouponCardUI.b(this.nFb).xpz).iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      String str = IPCallShareCouponCardUI.Q(this.nFb.mController.ylL, localInteger.intValue());
      int i = IPCallShareCouponCardUI.xu(localInteger.intValue());
      if ((str != null) && (i != -1))
        paraml.a(localInteger.intValue(), str, i);
    }
    AppMethodBeat.o(22294);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponCardUI.12
 * JD-Core Version:    0.6.2
 */