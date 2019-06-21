package com.tencent.mm.plugin.setting.ui.setting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.y;
import com.tencent.mm.ui.base.h;

final class SettingsModifyEmailAddrUI$22
  implements View.OnClickListener
{
  SettingsModifyEmailAddrUI$22(SettingsModifyEmailAddrUI paramSettingsModifyEmailAddrUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127284);
    paramView = new y(y.gvY);
    g.Rg().a(paramView, 0);
    SettingsModifyEmailAddrUI localSettingsModifyEmailAddrUI = this.qnP;
    paramView = this.qnP;
    this.qnP.getString(2131297061);
    SettingsModifyEmailAddrUI.a(localSettingsModifyEmailAddrUI, h.b(paramView, this.qnP.getString(2131303329), true, new SettingsModifyEmailAddrUI.22.1(this)));
    this.qnP.aqX();
    AppMethodBeat.o(127284);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsModifyEmailAddrUI.22
 * JD-Core Version:    0.6.2
 */