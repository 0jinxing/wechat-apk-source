package com.tencent.mm.plugin.nearby.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class NearbyPersonalInfoUI$1
  implements MenuItem.OnMenuItemClickListener
{
  NearbyPersonalInfoUI$1(NearbyPersonalInfoUI paramNearbyPersonalInfoUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(55483);
    this.oQH.finish();
    AppMethodBeat.o(55483);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyPersonalInfoUI.1
 * JD-Core Version:    0.6.2
 */