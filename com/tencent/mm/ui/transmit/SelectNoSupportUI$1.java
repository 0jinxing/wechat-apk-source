package com.tencent.mm.ui.transmit;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SelectNoSupportUI$1
  implements MenuItem.OnMenuItemClickListener
{
  SelectNoSupportUI$1(SelectNoSupportUI paramSelectNoSupportUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(35208);
    paramMenuItem = this.zKt;
    paramMenuItem.aqX();
    paramMenuItem.finish();
    AppMethodBeat.o(35208);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectNoSupportUI.1
 * JD-Core Version:    0.6.2
 */