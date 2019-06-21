package com.tencent.mm.plugin.appbrand.widget.input;

import android.support.v4.view.s;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.input.panel.e;
import com.tencent.mm.sdk.platformtools.ab;

final class w$1
  implements Runnable
{
  w$1(w paramw)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(123767);
    if ((w.a(this.jfZ) == null) || (!s.av(w.a(this.jfZ))))
      AppMethodBeat.o(123767);
    while (true)
    {
      return;
      if (w.b(this.jfZ).aQZ())
      {
        ab.d("MicroMsg.AppBrandSoftKeyboardPanel", "postMeasure inLayout, skip");
        this.jfZ.post(this);
        AppMethodBeat.o(123767);
      }
      else
      {
        w.c(this.jfZ);
        AppMethodBeat.o(123767);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.w.1
 * JD-Core Version:    0.6.2
 */