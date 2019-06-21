package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bf.a;

final class SettingsAboutSystemUI$5$2
  implements bf.a
{
  SettingsAboutSystemUI$5$2(SettingsAboutSystemUI.5 param5)
  {
  }

  public final boolean JU()
  {
    AppMethodBeat.i(127114);
    boolean bool = SettingsAboutSystemUI.b(this.qmt.qml);
    AppMethodBeat.o(127114);
    return bool;
  }

  public final void JV()
  {
    AppMethodBeat.i(127115);
    if (SettingsAboutSystemUI.c(this.qmt.qml) != null)
    {
      SettingsAboutSystemUI.c(this.qmt.qml).dismiss();
      SettingsAboutSystemUI.a(this.qmt.qml, null);
    }
    AppMethodBeat.o(127115);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI.5.2
 * JD-Core Version:    0.6.2
 */