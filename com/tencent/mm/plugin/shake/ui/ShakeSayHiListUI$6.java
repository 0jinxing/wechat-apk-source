package com.tencent.mm.plugin.shake.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bi.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bu;
import com.tencent.mm.ui.base.MMSlideDelView.f;

final class ShakeSayHiListUI$6
  implements MMSlideDelView.f
{
  ShakeSayHiListUI$6(ShakeSayHiListUI paramShakeSayHiListUI)
  {
  }

  public final void bN(Object paramObject)
  {
    AppMethodBeat.i(24879);
    if (paramObject == null)
    {
      ab.e("MicroMsg.SayHiListUI", "onItemDel object null");
      AppMethodBeat.o(24879);
    }
    while (true)
    {
      return;
      d.akR().QT(paramObject.toString());
      ShakeSayHiListUI.b(this.qwt).a(null, null);
      AppMethodBeat.o(24879);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI.6
 * JD-Core Version:    0.6.2
 */