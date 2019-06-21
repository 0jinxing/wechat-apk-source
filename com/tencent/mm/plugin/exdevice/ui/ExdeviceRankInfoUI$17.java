package com.tencent.mm.plugin.exdevice.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.f.b.a.a;
import com.tencent.mm.plugin.exdevice.f.b.c;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.sport.a.d;
import com.tencent.mm.ui.base.n.d;

final class ExdeviceRankInfoUI$17
  implements n.d
{
  ExdeviceRankInfoUI$17(ExdeviceRankInfoUI paramExdeviceRankInfoUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(20155);
    if (ExdeviceRankInfoUI.x(this.lDC) == null)
    {
      AppMethodBeat.o(20155);
      return;
    }
    switch (paramInt)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(20155);
      break;
      ExdeviceRankInfoUI.a(this.lDC, true);
      d.kT(10);
      ad.bpe();
      c.d("", ExdeviceRankInfoUI.y(this.lDC), ExdeviceRankInfoUI.x(this.lDC).field_username, 3);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.17
 * JD-Core Version:    0.6.2
 */