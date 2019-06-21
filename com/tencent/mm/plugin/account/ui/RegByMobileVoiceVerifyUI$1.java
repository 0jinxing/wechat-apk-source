package com.tencent.mm.plugin.account.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RegByMobileVoiceVerifyUI$1
  implements MenuItem.OnMenuItemClickListener
{
  RegByMobileVoiceVerifyUI$1(RegByMobileVoiceVerifyUI paramRegByMobileVoiceVerifyUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(125461);
    this.gGS.aqX();
    this.gGS.finish();
    AppMethodBeat.o(125461);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifyUI.1
 * JD-Core Version:    0.6.2
 */