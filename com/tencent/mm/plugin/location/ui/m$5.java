package com.tencent.mm.plugin.location.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.location.model.i.a;
import com.tencent.mm.plugin.location.ui.impl.TrackPoint;
import com.tencent.mm.sdk.platformtools.ab;

final class m$5
  implements i.a
{
  m$5(m paramm)
  {
  }

  public final void y(double paramDouble)
  {
    AppMethodBeat.i(113563);
    if (m.d(this.nOf) != null)
    {
      ab.d("MicroMsg.TrackPointViewMgrImpl", "updateMyTrackPointDegree, degree = %f", new Object[] { Double.valueOf(paramDouble) });
      m.d(this.nOf).z(paramDouble);
    }
    AppMethodBeat.o(113563);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.m.5
 * JD-Core Version:    0.6.2
 */