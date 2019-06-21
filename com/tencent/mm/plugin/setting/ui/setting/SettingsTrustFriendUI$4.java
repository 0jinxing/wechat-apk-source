package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsTrustFriendUI$4
  implements DialogInterface.OnClickListener
{
  SettingsTrustFriendUI$4(SettingsTrustFriendUI paramSettingsTrustFriendUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(127535);
    this.qpo.finish();
    AppMethodBeat.o(127535);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI.4
 * JD-Core Version:    0.6.2
 */