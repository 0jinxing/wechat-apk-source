package com.tencent.mm.plugin.appbrand.jsapi.m;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.picker.a;

final class i$3
  implements Runnable
{
  i$3(i parami, a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(126362);
    if ((this.hUw.getPicker() != null) && ((this.hUw.getPicker() instanceof View)))
      ((View)this.hUw.getPicker()).requestLayout();
    AppMethodBeat.o(126362);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.m.i.3
 * JD-Core Version:    0.6.2
 */