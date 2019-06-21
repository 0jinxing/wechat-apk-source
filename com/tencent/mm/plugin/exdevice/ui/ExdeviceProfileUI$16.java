package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceProfileUI$16
  implements Runnable
{
  ExdeviceProfileUI$16(ExdeviceProfileUI paramExdeviceProfileUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20039);
    ExdeviceProfileUI.C(this.lCu);
    ExdeviceProfileUI.l(this.lCu).notifyDataSetChanged();
    ExdeviceProfileUI.D(this.lCu);
    AppMethodBeat.o(20039);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.16
 * JD-Core Version:    0.6.2
 */