package com.tencent.mm.plugin.freewifi.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class FreeWifiSuccWebViewUI$2
  implements MenuItem.OnMenuItemClickListener
{
  FreeWifiSuccWebViewUI$2(FreeWifiSuccWebViewUI paramFreeWifiSuccWebViewUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(21098);
    this.mAp.finish();
    FreeWifiSuccWebViewUI.a(this.mAp);
    AppMethodBeat.o(21098);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiSuccWebViewUI.2
 * JD-Core Version:    0.6.2
 */