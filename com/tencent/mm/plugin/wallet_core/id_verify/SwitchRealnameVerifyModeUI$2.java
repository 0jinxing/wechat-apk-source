package com.tencent.mm.plugin.wallet_core.id_verify;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.e;

final class SwitchRealnameVerifyModeUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SwitchRealnameVerifyModeUI$2(SwitchRealnameVerifyModeUI paramSwitchRealnameVerifyModeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    boolean bool = false;
    AppMethodBeat.i(46590);
    paramMenuItem = this.tvl.dOD();
    if (paramMenuItem != null)
    {
      e.a(14, bo.anT(), SwitchRealnameVerifyModeUI.a(this.tvl));
      paramMenuItem.c(this.tvl, 0);
      bool = true;
      AppMethodBeat.o(46590);
    }
    while (true)
    {
      return bool;
      this.tvl.finish();
      AppMethodBeat.o(46590);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI.2
 * JD-Core Version:    0.6.2
 */