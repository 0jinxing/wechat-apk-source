package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class SettingsAliasUI$3
  implements MenuItem.OnMenuItemClickListener
{
  SettingsAliasUI$3(SettingsAliasUI paramSettingsAliasUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127187);
    SettingsAliasUI.a(this.qmW, SettingsAliasUI.c(this.qmW).getText().toString().trim());
    if (r.Yz().equalsIgnoreCase(SettingsAliasUI.d(this.qmW)))
    {
      this.qmW.aqX();
      this.qmW.finish();
      AppMethodBeat.o(127187);
    }
    while (true)
    {
      return true;
      h.a(this.qmW.mController.ylL, this.qmW.getString(2131301492, new Object[] { SettingsAliasUI.d(this.qmW) }), this.qmW.getString(2131298427), new SettingsAliasUI.3.1(this), null);
      AppMethodBeat.o(127187);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI.3
 * JD-Core Version:    0.6.2
 */