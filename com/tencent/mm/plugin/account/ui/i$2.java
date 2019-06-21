package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.n.d;

final class i$2
  implements n.d
{
  i$2(i parami)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(125097);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 2001:
    case 2002:
    }
    while (true)
    {
      AppMethodBeat.o(125097);
      while (true)
      {
        return;
        i.a(this.gDv);
        AppMethodBeat.o(125097);
      }
      i locali = this.gDv;
      locali.gBm.daR = 1L;
      locali.gBm.cVS = 10L;
      paramMenuItem = new Intent(locali.gDo, FacebookLoginUI.class);
      locali.gDo.startActivity(paramMenuItem);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.i.2
 * JD-Core Version:    0.6.2
 */