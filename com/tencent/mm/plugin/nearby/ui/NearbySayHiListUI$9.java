package com.tencent.mm.plugin.nearby.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMSlideDelView.f;

final class NearbySayHiListUI$9
  implements MMSlideDelView.f
{
  NearbySayHiListUI$9(NearbySayHiListUI paramNearbySayHiListUI)
  {
  }

  public final void bN(Object paramObject)
  {
    AppMethodBeat.i(55503);
    if (paramObject == null)
    {
      ab.e("MicroMsg.SayHiListUI", "onItemDel object null");
      AppMethodBeat.o(55503);
    }
    while (true)
    {
      return;
      g.RN().QU();
      ((j)g.K(j.class)).bOo().QT(paramObject.toString());
      NearbySayHiListUI.b(this.oQP).a(null, null);
      AppMethodBeat.o(55503);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI.9
 * JD-Core Version:    0.6.2
 */