package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.f;

final class SettingsAboutSystemUI$4
  implements DialogInterface.OnClickListener
{
  SettingsAboutSystemUI$4(SettingsAboutSystemUI paramSettingsAboutSystemUI, CheckBoxPreference paramCheckBoxPreference, boolean paramBoolean)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(127112);
    this.qmr.uOT = this.qms;
    SettingsAboutSystemUI.a(this.qml).notifyDataSetChanged();
    AppMethodBeat.o(127112);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI.4
 * JD-Core Version:    0.6.2
 */