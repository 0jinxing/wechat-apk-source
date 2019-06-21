package com.tencent.mm.plugin.appbrand.widget.i;

import android.graphics.Bitmap;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b.i;

final class g$1
  implements b.i
{
  g$1(g paramg)
  {
  }

  public final void abU()
  {
  }

  public final void mr()
  {
    AppMethodBeat.i(87566);
    this.jpA.jpv.a("Failed to load icon via network", this.jpA);
    AppMethodBeat.o(87566);
  }

  public final String wP()
  {
    return this.jpA.jpu;
  }

  public final void x(Bitmap paramBitmap)
  {
    AppMethodBeat.i(87565);
    this.jpA.I(paramBitmap);
    AppMethodBeat.o(87565);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.i.g.1
 * JD-Core Version:    0.6.2
 */