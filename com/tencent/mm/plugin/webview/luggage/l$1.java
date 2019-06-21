package com.tencent.mm.plugin.webview.luggage;

import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.bag.g.a;
import me.imid.swipebacklayout.lib.SwipeBackLayout.a;

final class l$1
  implements SwipeBackLayout.a
{
  l$1(l paraml, g.a parama)
  {
  }

  public final boolean ba(boolean paramBoolean)
  {
    AppMethodBeat.i(6201);
    if (this.ujo != null)
    {
      paramBoolean = this.ujo.ba(paramBoolean);
      AppMethodBeat.o(6201);
    }
    while (true)
    {
      return paramBoolean;
      paramBoolean = false;
      AppMethodBeat.o(6201);
    }
  }

  public final void h(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(6199);
    if (this.ujo != null)
      this.ujo.bg(paramFloat);
    AppMethodBeat.o(6199);
  }

  public final void l(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(6200);
    if (this.ujo != null)
      this.ujo.l(paramMotionEvent);
    AppMethodBeat.o(6200);
  }

  public final void xv()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.l.1
 * JD-Core Version:    0.6.2
 */