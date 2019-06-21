package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceRankInfoUI$9
  implements Runnable
{
  ExdeviceRankInfoUI$9(ExdeviceRankInfoUI paramExdeviceRankInfoUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20143);
    ExdeviceRankInfoUI.u(this.lDC);
    if (!ExdeviceRankInfoUI.v(this.lDC))
    {
      ExdeviceRankInfoUI.h(this.lDC);
      AppMethodBeat.o(20143);
    }
    while (true)
    {
      return;
      ExdeviceRankInfoUI.b(this.lDC).notifyDataSetChanged();
      AppMethodBeat.o(20143);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.9
 * JD-Core Version:    0.6.2
 */