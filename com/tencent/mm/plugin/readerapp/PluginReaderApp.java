package com.tencent.mm.plugin.readerapp;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.q;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.readerapp.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public class PluginReaderApp extends com.tencent.mm.kernel.b.f
  implements com.tencent.mm.kernel.api.c, a
{
  private com.tencent.mm.ai.f pEH;

  public PluginReaderApp()
  {
    AppMethodBeat.i(76741);
    this.pEH = new PluginReaderApp.2(this);
    AppMethodBeat.o(76741);
  }

  private boolean checkInstall()
  {
    AppMethodBeat.i(76749);
    boolean bool;
    if ((r.YK() & 0x80000) == 0)
    {
      bool = true;
      AppMethodBeat.o(76749);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(76749);
    }
  }

  private boolean checkRecvNews()
  {
    AppMethodBeat.i(76750);
    boolean bool;
    if ((r.YF() & 0x400) == 0)
    {
      bool = true;
      AppMethodBeat.o(76750);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(76750);
    }
  }

  private void reportPluginStatus()
  {
    AppMethodBeat.i(76747);
    int i;
    if (checkInstall())
    {
      i = 1;
      if (!checkRecvNews())
        break label84;
    }
    label84: for (int j = 1; ; j = 0)
    {
      h.pYm.e(15416, new Object[] { "newsapp", Integer.valueOf(i), Integer.valueOf(j) });
      com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xVh, Long.valueOf(System.currentTimeMillis()));
      AppMethodBeat.o(76747);
      return;
      i = 0;
      break;
    }
  }

  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(76744);
    if (paramg.SG())
      pin(new q(com.tencent.mm.plugin.readerapp.c.g.class));
    AppMethodBeat.o(76744);
  }

  public void dependency()
  {
    AppMethodBeat.i(76743);
    dependsOn(com.tencent.mm.plugin.messenger.foundation.a.p.class);
    AppMethodBeat.o(76743);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(76745);
    if (paramg.SG())
      com.tencent.mm.bp.c.aks("readerapp");
    AppMethodBeat.o(76745);
  }

  public void installed()
  {
    AppMethodBeat.i(76742);
    alias(a.class);
    AppMethodBeat.o(76742);
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(76746);
    d.post(new PluginReaderApp.1(this), "ReaderAppReport");
    AppMethodBeat.o(76746);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(76748);
    com.tencent.mm.kernel.g.Rg().b(138, this.pEH);
    AppMethodBeat.o(76748);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.PluginReaderApp
 * JD-Core Version:    0.6.2
 */