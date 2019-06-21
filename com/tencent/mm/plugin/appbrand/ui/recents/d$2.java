package com.tencent.mm.plugin.appbrand.ui.recents;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class d$2
  implements Runnable
{
  d$2(d paramd)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(133326);
    List localList = this.iMi.aNk();
    if (bo.ek(localList))
      AppMethodBeat.o(133326);
    while (true)
    {
      return;
      d.a(this.iMi, localList);
      AppMethodBeat.o(133326);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.d.2
 * JD-Core Version:    0.6.2
 */