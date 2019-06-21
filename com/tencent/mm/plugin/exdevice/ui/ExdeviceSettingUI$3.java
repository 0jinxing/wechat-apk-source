package com.tencent.mm.plugin.exdevice.ui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceSettingUI$3
  implements Runnable
{
  ExdeviceSettingUI$3(ExdeviceSettingUI paramExdeviceSettingUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20217);
    ExdeviceSettingUI.a(this.lDU).dismiss();
    AppMethodBeat.o(20217);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceSettingUI.3
 * JD-Core Version:    0.6.2
 */