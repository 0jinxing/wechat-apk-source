package com.tencent.mm.plugin.mmsight.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SightSettingsUI$2
  implements MenuItem.OnMenuItemClickListener
{
  SightSettingsUI$2(SightSettingsUI paramSightSettingsUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(55280);
    this.oDq.finish();
    AppMethodBeat.o(55280);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.SightSettingsUI.2
 * JD-Core Version:    0.6.2
 */