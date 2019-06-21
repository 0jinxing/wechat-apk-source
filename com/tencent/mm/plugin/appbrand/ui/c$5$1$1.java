package com.tencent.mm.plugin.appbrand.ui;

import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$5$1$1
  implements Runnable
{
  c$5$1$1(c.5.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132938);
    this.iGz.iGy.iGs.setVisibility(8);
    ((ViewGroup)this.iGz.iGx).removeView(this.iGz.iGy.iGs);
    AppMethodBeat.o(132938);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.c.5.1.1
 * JD-Core Version:    0.6.2
 */