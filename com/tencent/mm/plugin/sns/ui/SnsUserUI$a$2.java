package com.tencent.mm.plugin.sns.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.base.n.d;

final class SnsUserUI$a$2
  implements n.d
{
  SnsUserUI$a$2(SnsUserUI.a parama)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(39809);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(39809);
      while (true)
      {
        return;
        h.pYm.e(13822, new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
        SnsUserUI.o(this.rDb.rDa);
        AppMethodBeat.o(39809);
      }
      h.pYm.e(13822, new Object[] { Integer.valueOf(2), Integer.valueOf(2) });
      SnsUserUI.p(this.rDb.rDa).Em(1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUserUI.a.2
 * JD-Core Version:    0.6.2
 */