package com.tencent.mm.plugin.clean.ui.newui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;

final class CleanMsgUI$7
  implements com.tencent.mm.plugin.clean.c.h
{
  CleanMsgUI$7(CleanMsgUI paramCleanMsgUI)
  {
  }

  public final void dP(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(18895);
    CleanMsgUI.c(this.kyS).setMessage(this.kyS.getString(2131298315, new Object[] { paramInt1 * 100 / paramInt2 + "%" }));
    AppMethodBeat.o(18895);
  }

  public final void hi(long paramLong)
  {
    AppMethodBeat.i(18896);
    al.d(new CleanMsgUI.7.1(this, paramLong));
    com.tencent.mm.plugin.report.service.h.pYm.a(282L, 12L, 1L, false);
    com.tencent.mm.plugin.report.service.h.pYm.a(282L, 13L, paramLong / 1024L, false);
    AppMethodBeat.o(18896);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.CleanMsgUI.7
 * JD-Core Version:    0.6.2
 */