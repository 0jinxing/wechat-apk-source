package com.tencent.mm.e;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.view.b.a.b;

final class c$2
  implements a.b
{
  c$2(c paramc)
  {
  }

  public final void CV()
  {
    AppMethodBeat.i(116151);
    this.cjQ.cjE = true;
    this.cjQ.cjc.dlT().getBaseBoardView().o(new Rect(0, 0, this.cjQ.cjc.dlV().getWidth(), this.cjQ.cjc.dlV().getHeight()));
    c.a(this.cjQ, 200L, true, false);
    AppMethodBeat.o(116151);
  }

  public final void onStart()
  {
    AppMethodBeat.i(116152);
    c.a(this.cjQ, false);
    this.cjQ.cjE = false;
    c.a(this.cjQ);
    com.tencent.mm.y.a.jA(282);
    AppMethodBeat.o(116152);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.e.c.2
 * JD-Core Version:    0.6.2
 */