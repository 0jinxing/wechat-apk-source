package com.tencent.mm.ui.chatting.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.n.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;

final class j$8
  implements Runnable
{
  j$8(j paramj)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(32323);
    String str = e.bOU();
    if (!bo.isNullOrNil(str))
    {
      h.pYm.X(14092, str);
      AppMethodBeat.o(32323);
    }
    while (true)
    {
      return;
      h.pYm.X(14092, "0");
      AppMethodBeat.o(32323);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.gallery.j.8
 * JD-Core Version:    0.6.2
 */