package com.tencent.mm.plugin.radar.b;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.pluginsdk.model.lbs.Location;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "isOk", "fLongitude", "", "fLatitude", "locType", "", "<anonymous parameter 4>", "", "maccuracy", "<anonymous parameter 6>", "onGetLocation"})
final class e$i
  implements b.a
{
  e$i(e parame)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(102920);
    if (e.a(this.pBX))
    {
      ab.d(e.access$getTAG$cp(), "cancel location");
      AppMethodBeat.o(102920);
    }
    while (true)
    {
      return false;
      if (e.c(this.pBX) == null)
        break;
      AppMethodBeat.o(102920);
    }
    e locale;
    if (paramBoolean)
    {
      locale = this.pBX;
      e.c(this.pBX);
      e.a(locale, true);
      o.a(2006, paramFloat1, paramFloat2, (int)paramDouble2);
      ab.d(e.access$getTAG$cp(), "lat:%f lng:%f accuracy:%f", new Object[] { Float.valueOf(paramFloat2), Float.valueOf(paramFloat1), Double.valueOf(paramDouble2) });
      e.a(this.pBX, new Location(paramFloat2, paramFloat1, (int)paramDouble2, paramInt, "", ""));
      e.e(this.pBX).ms(0L);
    }
    while (true)
    {
      AppMethodBeat.o(102920);
      break;
      locale = this.pBX;
      e.c(this.pBX);
      e.a(locale, false);
      e.f(this.pBX);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.b.e.i
 * JD-Core Version:    0.6.2
 */