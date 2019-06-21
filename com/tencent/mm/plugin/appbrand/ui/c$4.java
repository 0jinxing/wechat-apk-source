package com.tencent.mm.plugin.appbrand.ui;

import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

final class c$4
  implements Runnable
{
  c$4(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132937);
    if (c.g(this.iGs))
      AppMethodBeat.o(132937);
    while (true)
    {
      return;
      c.h(this.iGs);
      c.i(this.iGs).setVisibility(0);
      c.j(this.iGs).setVisibility(0);
      c.k(this.iGs).setVisibility(0);
      c.l(this.iGs);
      AppMethodBeat.o(132937);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.c.4
 * JD-Core Version:    0.6.2
 */