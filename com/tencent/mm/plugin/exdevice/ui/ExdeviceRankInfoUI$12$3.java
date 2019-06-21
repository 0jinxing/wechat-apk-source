package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

final class ExdeviceRankInfoUI$12$3
  implements Runnable
{
  ExdeviceRankInfoUI$12$3(ExdeviceRankInfoUI.12 param12)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20149);
    ExdeviceRankInfoUI.h(this.lDD.lDC);
    if (!bo.isNullOrNil(ExdeviceRankInfoUI.i(this.lDD.lDC)))
      this.lDD.lDC.addIconOptionMenu(0, 2131230740, new ExdeviceRankInfoUI.12.3.1(this));
    if (ExdeviceRankInfoUI.k(this.lDD.lDC) != null)
      ExdeviceRankInfoUI.k(this.lDD.lDC).KF(ExdeviceRankInfoUI.l(this.lDD.lDC));
    AppMethodBeat.o(20149);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.12.3
 * JD-Core Version:    0.6.2
 */