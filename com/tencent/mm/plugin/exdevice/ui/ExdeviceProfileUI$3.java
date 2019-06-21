package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceProfileUI$3
  implements Runnable
{
  ExdeviceProfileUI$3(ExdeviceProfileUI paramExdeviceProfileUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20025);
    ExdeviceProfileUI.g(this.lCu);
    ExdeviceProfileUI.l(this.lCu).notifyDataSetChanged();
    AppMethodBeat.o(20025);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.3
 * JD-Core Version:    0.6.2
 */