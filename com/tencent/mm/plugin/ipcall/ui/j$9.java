package com.tencent.mm.plugin.ipcall.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.b.b;
import com.tencent.mm.plugin.ipcall.a.f;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class j$9
  implements IPCallFuncButton.a
{
  j$9(j paramj)
  {
  }

  public final void iv(boolean paramBoolean)
  {
    AppMethodBeat.i(22407);
    ab.d("MicroMsg.TalkUIController", "switch speaker, isChecked: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (com.tencent.mm.plugin.ipcall.a.i.bHu().bHl())
    {
      this.nGR.nGL = paramBoolean;
      this.nGR.nGM = paramBoolean;
      com.tencent.mm.plugin.ipcall.a.i.bHt().io(paramBoolean);
      h.pYm.e(12057, new Object[] { Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0) });
      AppMethodBeat.o(22407);
    }
    while (true)
    {
      return;
      if ((!com.tencent.mm.plugin.ipcall.a.i.bHA().DB()) && (!com.tencent.mm.plugin.ipcall.a.i.bHu().bHn()))
        com.tencent.mm.plugin.ipcall.a.i.bHA().mE(paramBoolean);
      AppMethodBeat.o(22407);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.j.9
 * JD-Core Version:    0.6.2
 */