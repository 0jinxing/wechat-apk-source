package com.tencent.mm.plugin.setting.ui.setting;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsTrustFriendUI$9
  implements View.OnClickListener
{
  SettingsTrustFriendUI$9(SettingsTrustFriendUI paramSettingsTrustFriendUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127540);
    SettingsTrustFriendUI.f(this.qpo).setVisibility(8);
    AppMethodBeat.o(127540);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI.9
 * JD-Core Version:    0.6.2
 */