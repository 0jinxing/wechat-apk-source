package com.tencent.mm.plugin.account.security.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.bz.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.security.a.c;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

final class ModSafeDeviceNameUI$2
  implements MenuItem.OnMenuItemClickListener
{
  ModSafeDeviceNameUI$2(ModSafeDeviceNameUI paramModSafeDeviceNameUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(69864);
    ModSafeDeviceNameUI.a(this.gzu, ModSafeDeviceNameUI.a(this.gzu).getText().toString());
    if (bo.isNullOrNil(ModSafeDeviceNameUI.b(this.gzu)))
      AppMethodBeat.o(69864);
    while (true)
    {
      return true;
      this.gzu.aqX();
      paramMenuItem = new c(ModSafeDeviceNameUI.c(this.gzu), ModSafeDeviceNameUI.b(this.gzu), ModSafeDeviceNameUI.d(this.gzu));
      g.Rg().a(paramMenuItem, 0);
      ModSafeDeviceNameUI.a(this.gzu, h.b(this.gzu, a.an(this.gzu, 2131297086), true, new ModSafeDeviceNameUI.2.1(this, paramMenuItem)));
      AppMethodBeat.o(69864);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.ui.ModSafeDeviceNameUI.2
 * JD-Core Version:    0.6.2
 */