package com.tencent.mm.plugin.ipcall.ui;

import android.widget.LinearLayout;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.o.b;

final class IPCallContactUI$5
  implements o.b
{
  IPCallContactUI$5(IPCallContactUI paramIPCallContactUI)
  {
  }

  public final void apo()
  {
    AppMethodBeat.i(22076);
    ab.d("MicroMsg.IPCallContactUI", "onQuitSearch");
    this.nBH.vM("");
    this.nBH.iu(true);
    IPCallContactUI.a(this.nBH).setVisibility(8);
    IPCallContactUI.b(this.nBH).setVisibility(0);
    IPCallContactUI.c(this.nBH).setVisibility(0);
    AppMethodBeat.o(22076);
  }

  public final void app()
  {
    AppMethodBeat.i(22075);
    ab.d("MicroMsg.IPCallContactUI", "onEnterSearch");
    h.pYm.e(12767, new Object[] { Integer.valueOf(1) });
    IPCallContactUI.a(this.nBH).setVisibility(0);
    IPCallContactUI.b(this.nBH).setVisibility(8);
    IPCallContactUI.c(this.nBH).setVisibility(8);
    this.nBH.iu(false);
    AppMethodBeat.o(22075);
  }

  public final void apq()
  {
    AppMethodBeat.i(22079);
    IPCallContactUI.a(this.nBH).setVisibility(0);
    IPCallContactUI.b(this.nBH).setVisibility(8);
    IPCallContactUI.c(this.nBH).setVisibility(8);
    AppMethodBeat.o(22079);
  }

  public final void apr()
  {
  }

  public final boolean vN(String paramString)
  {
    AppMethodBeat.i(22078);
    ab.d("MicroMsg.IPCallContactUI", "onSearchKeyDown");
    AppMethodBeat.o(22078);
    return false;
  }

  public final void vO(String paramString)
  {
    AppMethodBeat.i(22077);
    ab.d("MicroMsg.IPCallContactUI", "onSearchChange");
    this.nBH.vM(paramString);
    if (!bo.isNullOrNil(paramString))
    {
      IPCallContactUI.a(this.nBH).setVisibility(8);
      IPCallContactUI.b(this.nBH).setVisibility(0);
      IPCallContactUI.c(this.nBH).setVisibility(8);
    }
    AppMethodBeat.o(22077);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallContactUI.5
 * JD-Core Version:    0.6.2
 */