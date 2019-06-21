package com.tencent.mm.plugin.appbrand.canvas;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class b$a
  implements a
{
  private WeakReference<com.tencent.mm.plugin.appbrand.canvas.widget.a> hcC;

  b$a(com.tencent.mm.plugin.appbrand.canvas.widget.a parama)
  {
    AppMethodBeat.i(103147);
    this.hcC = new WeakReference(parama);
    AppMethodBeat.o(103147);
  }

  public final void invalidate()
  {
    AppMethodBeat.i(103148);
    com.tencent.mm.plugin.appbrand.canvas.widget.a locala = (com.tencent.mm.plugin.appbrand.canvas.widget.a)this.hcC.get();
    if (locala == null)
      AppMethodBeat.o(103148);
    while (true)
    {
      return;
      locala.ayc();
      AppMethodBeat.o(103148);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.canvas.b.a
 * JD-Core Version:    0.6.2
 */