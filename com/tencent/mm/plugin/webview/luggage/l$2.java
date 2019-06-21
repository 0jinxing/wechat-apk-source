package com.tencent.mm.plugin.webview.luggage;

import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.bag.g.a;
import com.tencent.mm.ui.widget.SwipeBackLayout.b;

final class l$2
  implements SwipeBackLayout.b
{
  l$2(l paraml, g.a parama)
  {
  }

  public final boolean ba(boolean paramBoolean)
  {
    AppMethodBeat.i(6204);
    if (this.ujo != null)
    {
      paramBoolean = this.ujo.ba(paramBoolean);
      AppMethodBeat.o(6204);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(6204);
    }
  }

  public final void bf(float paramFloat)
  {
    AppMethodBeat.i(6202);
    if (this.ujo != null)
      this.ujo.bg(paramFloat);
    AppMethodBeat.o(6202);
  }

  public final void l(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(6203);
    if (this.ujo != null)
      this.ujo.l(paramMotionEvent);
    AppMethodBeat.o(6203);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.l.2
 * JD-Core Version:    0.6.2
 */