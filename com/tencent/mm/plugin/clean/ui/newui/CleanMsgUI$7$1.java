package com.tencent.mm.plugin.clean.ui.newui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.clean.c.d;

final class CleanMsgUI$7$1
  implements Runnable
{
  CleanMsgUI$7$1(CleanMsgUI.7 param7, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18894);
    if (CleanMsgUI.c(this.kyV.kyS) != null)
      CleanMsgUI.c(this.kyV.kyS).dismiss();
    d.hg(d.bfW() + this.kxG);
    d.hf(d.bfV() - this.kxG);
    CleanMsgUI localCleanMsgUI = this.kyV.kyS;
    d.bfW();
    CleanMsgUI.a(localCleanMsgUI, d.bfT(), d.bfV(), d.bfU());
    AppMethodBeat.o(18894);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.CleanMsgUI.7.1
 * JD-Core Version:    0.6.2
 */