package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.f;

final class SettingsAboutSystemUI$9
  implements DialogInterface.OnClickListener
{
  SettingsAboutSystemUI$9(SettingsAboutSystemUI paramSettingsAboutSystemUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(127119);
    this.qml.ehZ.edit().putBoolean("settings_voicerecorder_mode", true).commit();
    ((CheckBoxPreference)SettingsAboutSystemUI.a(this.qml).aqO("settings_voicerecorder_mode")).uOT = true;
    SettingsAboutSystemUI.a(this.qml).notifyDataSetChanged();
    AppMethodBeat.o(127119);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI.9
 * JD-Core Version:    0.6.2
 */