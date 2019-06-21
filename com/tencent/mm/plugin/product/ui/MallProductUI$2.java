package com.tencent.mm.plugin.product.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.product.b.c;
import com.tencent.mm.sdk.platformtools.bo;

final class MallProductUI$2
  implements MenuItem.OnMenuItemClickListener
{
  MallProductUI$2(MallProductUI paramMallProductUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(44158);
    paramMenuItem = MallProductUI.e(this.pke);
    if (!bo.isNullOrNil(paramMenuItem.piK.pgQ))
    {
      g.RQ();
      g.RO().eJo.a(new com.tencent.mm.plugin.product.b.f(paramMenuItem.piK.bZS(), paramMenuItem.piK.pgQ), 0);
    }
    paramMenuItem.piK.clear();
    this.pke.finish();
    AppMethodBeat.o(44158);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductUI.2
 * JD-Core Version:    0.6.2
 */