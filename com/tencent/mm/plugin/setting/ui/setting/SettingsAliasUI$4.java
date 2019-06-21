package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class SettingsAliasUI$4
  implements DialogInterface.OnCancelListener
{
  SettingsAliasUI$4(SettingsAliasUI paramSettingsAliasUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(127188);
    if (SettingsAliasUI.f(this.qmW) != null)
      g.Rg().c(SettingsAliasUI.f(this.qmW));
    AppMethodBeat.o(127188);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI.4
 * JD-Core Version:    0.6.2
 */