package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceRankInfoUI$1
  implements Runnable
{
  ExdeviceRankInfoUI$1(ExdeviceRankInfoUI paramExdeviceRankInfoUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20134);
    ExdeviceRankInfoUI.b(this.lDC).lCD = ExdeviceRankInfoUI.a(this.lDC);
    ExdeviceRankInfoUI.b(this.lDC).notifyDataSetChanged();
    ExdeviceRankInfoUI.c(this.lDC);
    AppMethodBeat.o(20134);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.1
 * JD-Core Version:    0.6.2
 */