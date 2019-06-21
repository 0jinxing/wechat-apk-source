package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.storage.q;

final class c$2
  implements Runnable
{
  c$2(c paramc)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(14363);
    c.a(this.jQX);
    if ((c.b(this.jQX) == null) || (c.b(this.jQX).isFinishing()))
      AppMethodBeat.o(14363);
    while (true)
    {
      return;
      if ((c.aWV()) && (!at.isWifi(c.b(this.jQX))))
      {
        AppMethodBeat.o(14363);
      }
      else if (!c.c(this.jQX))
      {
        ab.v("MicroMsg.BizTimeLineImgLoader", "not all visibleItem loaded");
        AppMethodBeat.o(14363);
      }
      else
      {
        q localq = c.d(this.jQX);
        if (localq == null)
        {
          ab.v("MicroMsg.BizTimeLineImgLoader", "not loading");
          AppMethodBeat.o(14363);
        }
        else
        {
          c.a(this.jQX, localq);
          AppMethodBeat.o(14363);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.c.2
 * JD-Core Version:    0.6.2
 */