package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.modelstat.e;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.sdk.platformtools.ab;

final class LocationWidget$4
  implements b.a
{
  LocationWidget$4(LocationWidget paramLocationWidget)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(38288);
    if (!paramBoolean)
    {
      paramBoolean = true;
      AppMethodBeat.o(38288);
    }
    while (true)
    {
      return paramBoolean;
      ab.d("MicroMsg.LocationWidget", "get location %f %f", new Object[] { Float.valueOf(paramFloat2), Float.valueOf(paramFloat1) });
      e locale = e.akf();
      if (paramInt == 0)
      {
        paramBoolean = false;
        label55: if (LocationWidget.h(this.rko) != null)
          break label118;
      }
      label118: for (boolean bool = false; ; bool = LocationWidget.h(this.rko).fBD)
      {
        locale.a(2003, paramBoolean, bool, paramFloat1, paramFloat2, (int)paramDouble2);
        o.a(2003, paramFloat1, paramFloat2, 0);
        if (LocationWidget.e(this.rko))
          break label133;
        paramBoolean = false;
        AppMethodBeat.o(38288);
        break;
        paramBoolean = true;
        break label55;
      }
      label133: if ((LocationWidget.i(this.rko) == -1000.0F) || (LocationWidget.j(this.rko) == -1000.0F))
      {
        LocationWidget.a(this.rko, paramFloat2);
        LocationWidget.b(this.rko, paramFloat1);
      }
      paramBoolean = false;
      AppMethodBeat.o(38288);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.LocationWidget.4
 * JD-Core Version:    0.6.2
 */