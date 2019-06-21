package com.tencent.mm.plugin.readerapp;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

final class PluginReaderApp$2
  implements f
{
  PluginReaderApp$2(PluginReaderApp paramPluginReaderApp)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(76740);
    g.RQ();
    if (bo.h((Integer)g.RP().Ry().get(15, null)) != 0)
    {
      PluginReaderApp.access$000(this.pEI);
      g.Rg().b(138, this);
    }
    AppMethodBeat.o(76740);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.readerapp.PluginReaderApp.2
 * JD-Core Version:    0.6.2
 */