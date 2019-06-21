package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Dialog;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsAboutSystemUI$10$1
  implements Runnable
{
  SettingsAboutSystemUI$10$1(SettingsAboutSystemUI.10 param10)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127120);
    ((Dialog)this.qmu.qmm.getTag()).dismiss();
    SettingsAboutSystemUI.e(this.qmu.qml);
    AppMethodBeat.o(127120);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI.10.1
 * JD-Core Version:    0.6.2
 */