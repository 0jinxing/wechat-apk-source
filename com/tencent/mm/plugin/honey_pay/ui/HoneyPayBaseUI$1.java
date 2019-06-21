package com.tencent.mm.plugin.honey_pay.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class HoneyPayBaseUI$1
  implements MenuItem.OnMenuItemClickListener
{
  HoneyPayBaseUI$1(HoneyPayBaseUI paramHoneyPayBaseUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(41770);
    this.nqU.aqX();
    this.nqU.aoB();
    this.nqU.finish();
    AppMethodBeat.o(41770);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayBaseUI.1
 * JD-Core Version:    0.6.2
 */