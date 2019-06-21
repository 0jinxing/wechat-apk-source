package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Dialog;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsPrivacyUI$2$1
  implements Runnable
{
  SettingsPrivacyUI$2$1(SettingsPrivacyUI.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127408);
    ((Dialog)this.qoz.qmm.getTag()).dismiss();
    SettingsPrivacyUI.i(this.qoz.qoy);
    AppMethodBeat.o(127408);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI.2.1
 * JD-Core Version:    0.6.2
 */