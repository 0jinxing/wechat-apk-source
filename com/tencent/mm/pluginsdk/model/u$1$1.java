package com.tencent.mm.pluginsdk.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.xweb.x5.sdk.d.a;

final class u$1$1
  implements d.a
{
  u$1$1(u.1 param1)
  {
  }

  public final void onViewInitFinished(boolean paramBoolean)
  {
    AppMethodBeat.i(114656);
    ab.i("MicroMsg.TBSFileBrowseHelper", "tbs preInit callback, %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      u.hD(this.vbJ.val$filePath, this.vbJ.kvE);
      AppMethodBeat.o(114656);
    }
    while (true)
    {
      return;
      u.hC(this.vbJ.val$filePath, this.vbJ.kvE);
      AppMethodBeat.o(114656);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.u.1.1
 * JD-Core Version:    0.6.2
 */