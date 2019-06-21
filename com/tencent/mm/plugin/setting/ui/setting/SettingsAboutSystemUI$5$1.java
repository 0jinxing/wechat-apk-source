package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsAboutSystemUI$5$1
  implements DialogInterface.OnCancelListener
{
  SettingsAboutSystemUI$5$1(SettingsAboutSystemUI.5 param5)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(127113);
    SettingsAboutSystemUI.a(this.qmt.qml, true);
    AppMethodBeat.o(127113);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI.5.1
 * JD-Core Version:    0.6.2
 */