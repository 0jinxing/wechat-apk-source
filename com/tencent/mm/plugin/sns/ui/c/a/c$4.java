package com.tencent.mm.plugin.sns.ui.c.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.storage.b.c.a;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView;

final class c$4
  implements Runnable
{
  c$4(c paramc, b.c.a parama, n paramn)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(40100);
    this.rHb.rGY.setVisibility(0);
    this.rHb.rGY.cvA();
    this.rHb.rGY.setPaintColor(this.rHd.color);
    this.rHb.rGY.setOnGestureListener(new c.4.1(this));
    AppMethodBeat.o(40100);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.c.a.c.4
 * JD-Core Version:    0.6.2
 */