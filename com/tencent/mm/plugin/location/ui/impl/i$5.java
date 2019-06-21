package com.tencent.mm.plugin.location.ui.impl;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.c;
import com.tencent.mm.plugin.location.model.LocationInfo;
import com.tencent.mm.sdk.platformtools.ab;

final class i$5
  implements b.a
{
  i$5(i parami)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(113743);
    if (!paramBoolean)
    {
      paramBoolean = false;
      AppMethodBeat.o(113743);
    }
    while (true)
    {
      return paramBoolean;
      ab.d("MicroMsg.ViewMapUI", "onGetLocation flong " + paramFloat1 + " flat " + paramFloat2);
      if ((paramFloat2 == 0.0D) && (paramFloat1 == 0.0D))
      {
        paramBoolean = true;
        AppMethodBeat.o(113743);
      }
      else
      {
        ab.d("MicroMsg.ViewMapUI", "myLocation " + this.nRu.nOK.nJu + " " + this.nRu.nOK.nJv);
        ab.d("MicroMsg.ViewMapUI", "location my show");
        this.nRu.nOK.nJu = paramFloat2;
        this.nRu.nOK.nJv = paramFloat1;
        this.nRu.nOO.a(this.nRu.nOK.nJu, this.nRu.nOK.nJv, this.nRu.nOV, this.nRu.nOK.nJt);
        paramBoolean = true;
        AppMethodBeat.o(113743);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.i.5
 * JD-Core Version:    0.6.2
 */