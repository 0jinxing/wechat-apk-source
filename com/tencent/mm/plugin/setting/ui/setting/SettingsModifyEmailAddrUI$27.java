package com.tencent.mm.plugin.setting.ui.setting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.model.d;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class SettingsModifyEmailAddrUI$27
  implements MenuItem.OnMenuItemClickListener
{
  SettingsModifyEmailAddrUI$27(SettingsModifyEmailAddrUI paramSettingsModifyEmailAddrUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(127290);
    SettingsModifyEmailAddrUI.a(this.qnP, SettingsModifyEmailAddrUI.c(this.qnP).getText().toString().trim());
    if (!bo.amW(SettingsModifyEmailAddrUI.d(this.qnP)))
    {
      h.g(this.qnP.mController.ylL, 2131304231, 2131297061);
      AppMethodBeat.o(127290);
      return true;
    }
    paramMenuItem = (Integer)g.RP().Ry().get(7, null);
    boolean bool;
    if ((paramMenuItem != null) && ((paramMenuItem.intValue() & 0x2) != 0))
    {
      bool = true;
      label98: if ((SettingsModifyEmailAddrUI.d(this.qnP).equals(SettingsModifyEmailAddrUI.e(this.qnP))) && (Boolean.valueOf(bool).booleanValue()))
        break label225;
      paramMenuItem = new d(d.gyK, SettingsModifyEmailAddrUI.d(this.qnP));
      g.Rg().a(paramMenuItem, 0);
      SettingsModifyEmailAddrUI localSettingsModifyEmailAddrUI1 = this.qnP;
      SettingsModifyEmailAddrUI localSettingsModifyEmailAddrUI2 = this.qnP;
      this.qnP.getString(2131297061);
      SettingsModifyEmailAddrUI.a(localSettingsModifyEmailAddrUI1, h.b(localSettingsModifyEmailAddrUI2, this.qnP.getString(2131303053), true, new SettingsModifyEmailAddrUI.27.1(this, paramMenuItem)));
      this.qnP.aqX();
    }
    while (true)
    {
      AppMethodBeat.o(127290);
      break;
      bool = false;
      break label98;
      label225: this.qnP.finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI.27
 * JD-Core Version:    0.6.2
 */