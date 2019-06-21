package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.m.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.b.c;
import com.tencent.mm.ui.widget.MMEditText;

final class SettingsModifyNameUI$3
  implements MenuItem.OnMenuItemClickListener
{
  SettingsModifyNameUI$3(SettingsModifyNameUI paramSettingsModifyNameUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    boolean bool = false;
    AppMethodBeat.i(127308);
    paramMenuItem = SettingsModifyNameUI.c(this.qnV).getText().toString();
    String str = b.Ne();
    if ((!bo.isNullOrNil(str)) && (paramMenuItem.matches(".*[" + str + "].*")))
    {
      h.b(this.qnV.mController.ylL, this.qnV.getString(2131300632, new Object[] { str }), this.qnV.getString(2131297061), true);
      AppMethodBeat.o(127308);
    }
    while (true)
    {
      return bool;
      c.d(SettingsModifyNameUI.c(this.qnV)).hz(1, 32).a(this.qnV);
      AppMethodBeat.o(127308);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI.3
 * JD-Core Version:    0.6.2
 */