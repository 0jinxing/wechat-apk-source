package com.tencent.mm.plugin.brandservice.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class BizSearchDetailPageUI$2
  implements MenuItem.OnMenuItemClickListener
{
  BizSearchDetailPageUI$2(BizSearchDetailPageUI paramBizSearchDetailPageUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(13876);
    this.jKZ.finish();
    AppMethodBeat.o(13876);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI.2
 * JD-Core Version:    0.6.2
 */