package com.tencent.mm.plugin.honey_pay.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class HoneyPayCardBackUI$1
  implements MenuItem.OnMenuItemClickListener
{
  HoneyPayCardBackUI$1(HoneyPayCardBackUI paramHoneyPayCardBackUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(41771);
    this.nrc.aqX();
    this.nrc.aoB();
    this.nrc.finish();
    AppMethodBeat.o(41771);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardBackUI.1
 * JD-Core Version:    0.6.2
 */