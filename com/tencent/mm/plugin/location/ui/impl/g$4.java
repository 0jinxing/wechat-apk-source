package com.tencent.mm.plugin.location.ui.impl;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.location.model.f;
import com.tencent.mm.plugin.location.ui.MyLocationButton;
import com.tencent.mm.plugin.location.ui.m;
import com.tencent.mm.sdk.platformtools.ab;

final class g$4
  implements b.a
{
  g$4(g paramg)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(113673);
    if (!paramBoolean)
    {
      paramBoolean = false;
      AppMethodBeat.o(113673);
    }
    while (true)
    {
      return paramBoolean;
      ab.d("MicroMsg.ShareMapUI", "onGetLocation, latitude=%f, longtitude=%f, speed=%f", new Object[] { Float.valueOf(paramFloat2), Float.valueOf(paramFloat1), Double.valueOf(paramDouble1) });
      if ((f.x(paramDouble1)) && (!this.nQT.nQG.nNU))
      {
        ab.d("MicroMsg.ShareMapUI", "set driving mode");
        this.nQT.nQG.nNX = false;
        this.nQT.nQG.iD(true);
        this.nQT.nQE.bJO();
      }
      paramBoolean = true;
      AppMethodBeat.o(113673);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.g.4
 * JD-Core Version:    0.6.2
 */