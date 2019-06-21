package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.chatting.d.a;

final class p$3
  implements n.d
{
  p$3(p paramp, int paramInt)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(30625);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(30625);
      while (true)
      {
        return;
        new Intent();
        h.pYm.e(13822, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
        n.a(p.e(this.yJn).yTx, new Intent(), this.yJn.getTalkerUserName(), this.yqg);
        AppMethodBeat.o(30625);
      }
      d.b(p.e(this.yJn).yTx.getContext(), "mmsight", ".ui.SightSettingsUI", new Intent());
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.p.3
 * JD-Core Version:    0.6.2
 */