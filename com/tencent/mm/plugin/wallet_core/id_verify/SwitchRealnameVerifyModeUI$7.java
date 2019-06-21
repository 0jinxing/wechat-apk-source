package com.tencent.mm.plugin.wallet_core.id_verify;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class SwitchRealnameVerifyModeUI$7
  implements MenuItem.OnMenuItemClickListener
{
  SwitchRealnameVerifyModeUI$7(SwitchRealnameVerifyModeUI paramSwitchRealnameVerifyModeUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(46596);
    e.a(18, bo.anT(), SwitchRealnameVerifyModeUI.a(this.tvl));
    e.n(this.tvl.mController.ylL, SwitchRealnameVerifyModeUI.d(this.tvl), false);
    AppMethodBeat.o(46596);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.SwitchRealnameVerifyModeUI.7
 * JD-Core Version:    0.6.2
 */