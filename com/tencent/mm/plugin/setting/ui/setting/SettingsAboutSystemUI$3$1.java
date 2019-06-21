package com.tencent.mm.plugin.setting.ui.setting;

import android.os.Process;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SettingsAboutSystemUI$3$1
  implements Runnable
{
  SettingsAboutSystemUI$3$1(SettingsAboutSystemUI.3 param3)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(127110);
    Process.killProcess(Process.myPid());
    AppMethodBeat.o(127110);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsAboutSystemUI.3.1
 * JD-Core Version:    0.6.2
 */