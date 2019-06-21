package com.tencent.mm.plugin.account.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RegByMobileVoiceVerifySelectUI$1
  implements MenuItem.OnMenuItemClickListener
{
  RegByMobileVoiceVerifySelectUI$1(RegByMobileVoiceVerifySelectUI paramRegByMobileVoiceVerifySelectUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(125454);
    this.gGO.aqX();
    this.gGO.finish();
    AppMethodBeat.o(125454);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileVoiceVerifySelectUI.1
 * JD-Core Version:    0.6.2
 */