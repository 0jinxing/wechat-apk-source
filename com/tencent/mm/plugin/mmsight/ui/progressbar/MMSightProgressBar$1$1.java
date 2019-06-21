package com.tencent.mm.plugin.mmsight.ui.progressbar;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.wcdb.support.Log;
import java.util.List;

final class MMSightProgressBar$1$1
  implements b.a
{
  MMSightProgressBar$1$1(MMSightProgressBar.1 param1)
  {
  }

  public final void a(a parama)
  {
    AppMethodBeat.i(55333);
    MMSightProgressBar.b(this.oDP.oDO).add(parama);
    MMSightProgressBar.a(this.oDP.oDO, null);
    if (MMSightProgressBar.b(this.oDP.oDO).size() >= 5)
    {
      Log.i("MicroMsg.MMSightProgressBar", "progress finish!");
      if (MMSightProgressBar.e(this.oDP.oDO) != null)
        MMSightProgressBar.e(this.oDP.oDO);
    }
    while (true)
    {
      this.oDP.oDO.invalidate();
      AppMethodBeat.o(55333);
      return;
      if (MMSightProgressBar.a(this.oDP.oDO))
        MMSightProgressBar.f(this.oDP.oDO).sendEmptyMessage(233);
    }
  }

  public final void bQN()
  {
    AppMethodBeat.i(55334);
    this.oDP.oDO.invalidate();
    AppMethodBeat.o(55334);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.progressbar.MMSightProgressBar.1.1
 * JD-Core Version:    0.6.2
 */