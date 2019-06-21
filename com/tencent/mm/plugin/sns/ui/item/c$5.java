package com.tencent.mm.plugin.sns.ui.item;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView;

final class c$5
  implements Runnable
{
  c$5(c paramc, c.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(40142);
    c.a.b(this.rIQ).setVisibility(8);
    c.a.b(this.rIQ).setBackgroundColor(0);
    c.a.b(this.rIQ).cvA();
    c.a.b(this.rIQ).setOnGestureListener(null);
    AppMethodBeat.o(40142);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.c.5
 * JD-Core Version:    0.6.2
 */