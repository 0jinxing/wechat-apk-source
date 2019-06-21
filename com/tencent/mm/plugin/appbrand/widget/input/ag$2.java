package com.tencent.mm.plugin.appbrand.widget.input;

import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.s.d;
import com.tencent.mm.plugin.appbrand.jsapi.s.d.f;
import com.tencent.mm.sdk.platformtools.ab;

final class ag$2
  implements Runnable
{
  ag$2(ag paramag)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(123836);
    if (!this.jgN.jgK)
      AppMethodBeat.o(123836);
    while (true)
    {
      return;
      d.f localf = d.co(this.jgN.jgG);
      if ((this.jgN.jgI == null) || (Math.abs(this.jgN.jgI.x - localf.x) > 1.0F) || (Math.abs(this.jgN.jgI.y - localf.y) > 1.0F))
      {
        ab.v(this.jgN.TAG, "check long press timeout, but view has moved.");
        AppMethodBeat.o(123836);
      }
      else if (this.jgN.jgJ == null)
      {
        AppMethodBeat.o(123836);
      }
      else
      {
        this.jgN.jgK = false;
        this.jgN.jgG.removeCallbacks(this.jgN.jgL);
        AppMethodBeat.o(123836);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.ag.2
 * JD-Core Version:    0.6.2
 */