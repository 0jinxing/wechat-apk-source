package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.setting.model.e;

final class SettingsTrustFriendUI$5
  implements DialogInterface.OnCancelListener
{
  SettingsTrustFriendUI$5(SettingsTrustFriendUI paramSettingsTrustFriendUI, e parame)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(127536);
    g.Rg().c(this.qpq);
    AppMethodBeat.o(127536);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI.5
 * JD-Core Version:    0.6.2
 */