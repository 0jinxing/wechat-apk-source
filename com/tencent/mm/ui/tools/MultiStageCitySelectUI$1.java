package com.tencent.mm.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.modelsimple.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

final class MultiStageCitySelectUI$1
  implements b.a
{
  MultiStageCitySelectUI$1(MultiStageCitySelectUI paramMultiStageCitySelectUI)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(34891);
    if (MultiStageCitySelectUI.a(this.zGB) == null)
    {
      AppMethodBeat.o(34891);
      return false;
    }
    if (paramBoolean)
    {
      ab.i("MicroMsg.MultiStageCitySelectUI", "lat:%f lng:%f accuracy:%f", new Object[] { Float.valueOf(paramFloat2), Float.valueOf(paramFloat1), Double.valueOf(paramDouble2) });
      j localj = new j(paramFloat2, paramFloat1);
      aw.Rg().a(localj, 0);
    }
    while (true)
    {
      if (MultiStageCitySelectUI.a(this.zGB) != null)
      {
        MultiStageCitySelectUI.a(this.zGB).c(MultiStageCitySelectUI.e(this.zGB));
        MultiStageCitySelectUI.f(this.zGB);
      }
      AppMethodBeat.o(34891);
      break;
      MultiStageCitySelectUI.b(this.zGB);
      if ((!MultiStageCitySelectUI.c(this.zGB)) && (!d.agA()))
      {
        MultiStageCitySelectUI.d(this.zGB);
        h.a(this.zGB, this.zGB.getString(2131300421), this.zGB.getString(2131297061), this.zGB.getString(2131300878), this.zGB.getString(2131296868), false, new MultiStageCitySelectUI.1.1(this), null);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.MultiStageCitySelectUI.1
 * JD-Core Version:    0.6.2
 */