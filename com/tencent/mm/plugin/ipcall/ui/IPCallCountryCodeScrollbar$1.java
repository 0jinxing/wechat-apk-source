package com.tencent.mm.plugin.ipcall.ui;

import android.graphics.Paint;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

final class IPCallCountryCodeScrollbar$1
  implements Runnable
{
  IPCallCountryCodeScrollbar$1(IPCallCountryCodeScrollbar paramIPCallCountryCodeScrollbar, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(22106);
    if (this.nBZ.nBS.length <= 0)
      AppMethodBeat.o(22106);
    while (true)
    {
      return;
      int i = (int)IPCallCountryCodeScrollbar.a(this.nBZ).measureText(this.nBZ.nBS[(this.nBZ.nBS.length - 1)]) + a.fromDPToPix(this.nBZ.getContext(), 8);
      if (i > this.nBY)
      {
        ViewGroup.LayoutParams localLayoutParams = this.nBZ.getLayoutParams();
        localLayoutParams.width = i;
        localLayoutParams.height = this.mU;
        this.nBZ.setLayoutParams(localLayoutParams);
      }
      AppMethodBeat.o(22106);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeScrollbar.1
 * JD-Core Version:    0.6.2
 */