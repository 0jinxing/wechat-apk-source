package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.graphics.Point;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class l$2
  implements a.b
{
  l$2(l paraml)
  {
  }

  public final void daY()
  {
    AppMethodBeat.i(8210);
    l.a(this.uzz, 17);
    Point localPoint = null;
    if (l.b(this.uzz) != null)
      localPoint = l.b(this.uzz).getLastTouchDownViewPos();
    this.uzz.dbg();
    if (localPoint != null)
    {
      l.c(this.uzz).uzB = localPoint.x;
      l.c(this.uzz).uzA = localPoint.y;
      l.c(this.uzz).save();
    }
    AppMethodBeat.o(8210);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.l.2
 * JD-Core Version:    0.6.2
 */