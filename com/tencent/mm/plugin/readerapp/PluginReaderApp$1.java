package com.tencent.mm.plugin.readerapp;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class PluginReaderApp$1
  implements Runnable
{
  PluginReaderApp$1(PluginReaderApp paramPluginReaderApp)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(76739);
    long l = ((Long)g.RP().Ry().get(ac.a.xVh, Long.valueOf(0L))).longValue();
    int i;
    if (System.currentTimeMillis() - l >= 604800000L)
    {
      g.RQ();
      if (bo.h((Integer)g.RP().Ry().get(15, null)) != 0)
      {
        i = 1;
        if (i == 0)
          break label89;
        PluginReaderApp.access$000(this.pEI);
        AppMethodBeat.o(76739);
      }
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label89: g.Rg().a(138, PluginReaderApp.access$100(this.pEI));
      AppMethodBeat.o(76739);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.PluginReaderApp.1
 * JD-Core Version:    0.6.2
 */