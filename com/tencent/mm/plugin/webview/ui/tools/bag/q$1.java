package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.SwipeBackLayout.b;

final class q$1
  implements SwipeBackLayout.b
{
  q$1(q paramq, g.a parama)
  {
  }

  public final boolean ba(boolean paramBoolean)
  {
    AppMethodBeat.i(8278);
    paramBoolean = this.ujo.ba(paramBoolean);
    AppMethodBeat.o(8278);
    return paramBoolean;
  }

  public final void bf(float paramFloat)
  {
    AppMethodBeat.i(8276);
    this.ujo.bg(paramFloat);
    AppMethodBeat.o(8276);
  }

  public final void l(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(8277);
    this.ujo.l(paramMotionEvent);
    AppMethodBeat.o(8277);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.q.1
 * JD-Core Version:    0.6.2
 */