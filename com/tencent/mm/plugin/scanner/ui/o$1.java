package com.tencent.mm.plugin.scanner.ui;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ak;

final class o$1 extends ak
{
  o$1(o paramo)
  {
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(81185);
    if (this.qfc.qeJ >= this.qfc.qeK)
    {
      if (this.qfc.qeV != null)
        g.Rg().c(this.qfc.qeV);
      paramMessage = this.qfc;
      paramMessage.qeJ -= 1;
    }
    AppMethodBeat.o(81185);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.o.1
 * JD-Core Version:    0.6.2
 */