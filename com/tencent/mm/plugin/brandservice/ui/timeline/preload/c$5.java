package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.z;
import com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.r;

final class c$5
  implements Runnable
{
  c$5(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14367);
    if ((c.b(this.jQX) == null) || (c.b(this.jQX).isFinishing()))
      AppMethodBeat.o(14367);
    while (true)
    {
      return;
      q localq = this.jQX.aWT();
      if (localq == null)
      {
        AppMethodBeat.o(14367);
      }
      else
      {
        al.d(new c.5.1(this, z.aeX().ah(5, localq.field_orderFlag)));
        AppMethodBeat.o(14367);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.c.5
 * JD-Core Version:    0.6.2
 */