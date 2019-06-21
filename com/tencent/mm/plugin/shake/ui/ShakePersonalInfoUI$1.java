package com.tencent.mm.plugin.shake.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ShakePersonalInfoUI$1
  implements MenuItem.OnMenuItemClickListener
{
  ShakePersonalInfoUI$1(ShakePersonalInfoUI paramShakePersonalInfoUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(24766);
    this.quT.finish();
    AppMethodBeat.o(24766);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.ShakePersonalInfoUI.1
 * JD-Core Version:    0.6.2
 */