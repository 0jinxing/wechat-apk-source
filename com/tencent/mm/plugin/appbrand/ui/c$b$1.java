package com.tencent.mm.plugin.appbrand.ui;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$b$1
  implements Runnable
{
  c$b$1(c.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132945);
    if (c.k(this.iGB.iGs).getVisibility() == 0)
    {
      c.k(this.iGB.iGs).setText(String.format("%d%%", new Object[] { Integer.valueOf(c.b.a(this.iGB)) }));
      if (c.b.a(this.iGB) == 100)
      {
        c.o(this.iGB.iGs);
        if (c.p(this.iGB.iGs) != null)
        {
          c.p(this.iGB.iGs).run();
          c.a(this.iGB.iGs, null);
        }
      }
    }
    AppMethodBeat.o(132945);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.c.b.1
 * JD-Core Version:    0.6.2
 */