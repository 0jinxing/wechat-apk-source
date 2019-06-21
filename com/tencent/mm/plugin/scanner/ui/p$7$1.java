package com.tencent.mm.plugin.scanner.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.a.m;

final class p$7$1
  implements DialogInterface.OnClickListener
{
  p$7$1(p.7 param7)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(81207);
    this.qfs.qfp.qff = false;
    this.qfs.qfp.qfg = false;
    m.pZK.reset();
    m.pZK.BU(m.pZH);
    if (this.qfs.qfp.qet != null)
    {
      this.qfs.qfp.qet.kj(false);
      this.qfs.qfp.qet.jK(this.qfs.qfp.qeH);
    }
    AppMethodBeat.o(81207);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.p.7.1
 * JD-Core Version:    0.6.2
 */