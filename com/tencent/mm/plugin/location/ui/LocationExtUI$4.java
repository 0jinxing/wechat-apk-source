package com.tencent.mm.plugin.location.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LocationExtUI$4
  implements MenuItem.OnMenuItemClickListener
{
  LocationExtUI$4(LocationExtUI paramLocationExtUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(113434);
    this.nLA.finish();
    AppMethodBeat.o(113434);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.LocationExtUI.4
 * JD-Core Version:    0.6.2
 */