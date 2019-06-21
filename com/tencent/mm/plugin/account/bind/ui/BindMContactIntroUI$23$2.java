package com.tencent.mm.plugin.account.bind.ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.base.n.d;

final class BindMContactIntroUI$23$2
  implements n.d
{
  BindMContactIntroUI$23$2(BindMContactIntroUI.23 param23)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(13432);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(13432);
      while (true)
      {
        return;
        BindMContactIntroUI.d(this.grx.grt);
        AppMethodBeat.o(13432);
      }
      paramMenuItem = new Intent();
      paramMenuItem.putExtra("need_matte_high_light_item", "settings_find_me_by_mobile");
      d.b(this.grx.grt, "setting", ".ui.setting.SettingsPrivacyUI", paramMenuItem);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.23.2
 * JD-Core Version:    0.6.2
 */