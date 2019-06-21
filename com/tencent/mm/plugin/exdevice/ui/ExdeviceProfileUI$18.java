package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;

final class ExdeviceProfileUI$18
  implements Runnable
{
  ExdeviceProfileUI$18(ExdeviceProfileUI paramExdeviceProfileUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20042);
    if (ExdeviceProfileUI.d(this.lCu) != null)
      ExdeviceProfileUI.d(this.lCu).show();
    AppMethodBeat.o(20042);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.18
 * JD-Core Version:    0.6.2
 */