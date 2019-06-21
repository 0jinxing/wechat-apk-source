package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Dialog;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.z;

final class SettingsAboutSystemUI$2$1
  implements Runnable
{
  SettingsAboutSystemUI$2$1(SettingsAboutSystemUI.2 param2, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127108);
    ((Dialog)this.qmp.qmm.getTag()).dismiss();
    g.RP().Ry().set(327686, Integer.valueOf(this.qmo));
    g.RP().Ry().dsb();
    SettingsAboutSystemUI.f(this.qmp.qml);
    AppMethodBeat.o(127108);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI.2.1
 * JD-Core Version:    0.6.2
 */