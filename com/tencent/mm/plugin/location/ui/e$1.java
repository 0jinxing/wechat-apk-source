package com.tencent.mm.plugin.location.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.k.d;
import com.tencent.mm.sdk.platformtools.ab;

final class e$1
  implements b.a
{
  e$1(e parame)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(113456);
    if (!paramBoolean)
    {
      paramBoolean = false;
      AppMethodBeat.o(113456);
    }
    while (true)
    {
      return paramBoolean;
      if (!e.a(this.nLV))
        break;
      paramBoolean = false;
      AppMethodBeat.o(113456);
    }
    ab.d("MicroMsg.MyPoiPoint", "new location comes! slat : %f, slng: %f", new Object[] { Float.valueOf(paramFloat2), Float.valueOf(paramFloat1) });
    e.b(this.nLV);
    e.a(this.nLV, paramDouble2);
    e.b(this.nLV, paramFloat2);
    e.c(this.nLV, paramFloat1);
    if (e.c(this.nLV) != null)
    {
      if (e.d(this.nLV))
        break label232;
      e.e(this.nLV);
      e.c(this.nLV).addPinView(this.nLV, e.f(this.nLV), e.g(this.nLV));
    }
    while (true)
    {
      if (e.h(this.nLV) != null)
        e.h(this.nLV).a(paramBoolean, paramFloat1, paramFloat2, paramInt, paramDouble1, paramDouble2, paramDouble3);
      this.nLV.invalidate();
      this.nLV.postInvalidate();
      this.nLV.requestLayout();
      e.i(this.nLV);
      paramBoolean = true;
      AppMethodBeat.o(113456);
      break;
      label232: e.c(this.nLV).updateLocaitonPinLayout(this.nLV, e.f(this.nLV), e.g(this.nLV));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.e.1
 * JD-Core Version:    0.6.2
 */