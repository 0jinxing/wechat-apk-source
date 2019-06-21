package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceProfileUI$1$3
  implements Runnable
{
  ExdeviceProfileUI$1$3(ExdeviceProfileUI.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20022);
    ExdeviceProfileUI.k(this.lCw.lCu);
    ExdeviceProfileUI.l(this.lCw.lCu).notifyDataSetChanged();
    AppMethodBeat.o(20022);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI.1.3
 * JD-Core Version:    0.6.2
 */