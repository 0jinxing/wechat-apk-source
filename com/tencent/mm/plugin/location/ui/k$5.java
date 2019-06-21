package com.tencent.mm.plugin.location.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bg.c;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;

final class k$5
  implements ap.a
{
  k$5(k paramk)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(113534);
    if (this.nNE.nNu == 3);
    for (int i = this.nNE.nNA.akx(); ; i = this.nNE.nNA.aky())
    {
      k localk = this.nNE;
      float f1 = i;
      float f2 = f1;
      if (f1 < 10.0F)
        f2 = 10.0F;
      f1 = f2;
      if (f2 > 100.0F)
        f1 = 100.0F;
      localk.nNn.setVolume(f1 / 100.0F);
      localk.nNn.invalidate();
      boolean bool = true;
      AppMethodBeat.o(113534);
      while (true)
      {
        return bool;
        if (!bo.isNullOrNil(this.nNE.nNr))
          break;
        bool = false;
        AppMethodBeat.o(113534);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.k.5
 * JD-Core Version:    0.6.2
 */