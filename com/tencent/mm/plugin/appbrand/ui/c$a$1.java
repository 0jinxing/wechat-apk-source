package com.tencent.mm.plugin.appbrand.ui;

import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.game.preload.ui.BootstrapProgressBar;

final class c$a$1
  implements Runnable
{
  c$a$1(c.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132943);
    if (c.q(this.iGA.iGs).getVisibility() == 0)
      c.r(this.iGA.iGs).setProgress(c.a.a(this.iGA));
    AppMethodBeat.o(132943);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.c.a.1
 * JD-Core Version:    0.6.2
 */