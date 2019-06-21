package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.p;

final class ExdeviceProfileUI$15$1
  implements Runnable
{
  ExdeviceProfileUI$15$1(ExdeviceProfileUI.15 param15)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20037);
    if (ExdeviceProfileUI.d(this.lCy.lCu) != null)
      ExdeviceProfileUI.d(this.lCy.lCu).dismiss();
    AppMethodBeat.o(20037);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.15.1
 * JD-Core Version:    0.6.2
 */