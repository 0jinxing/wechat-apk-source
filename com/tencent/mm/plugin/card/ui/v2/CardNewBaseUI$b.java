package com.tencent.mm.plugin.card.ui.v2;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "isOk", "fLongitude", "", "fLatitude", "locType", "", "speed", "", "accuracy", "altitude", "onGetLocation"})
final class CardNewBaseUI$b
  implements b.a
{
  CardNewBaseUI$b(CardNewBaseUI paramCardNewBaseUI)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(89284);
    if (paramBoolean)
    {
      this.kpV.cEB = paramFloat2;
      this.kpV.cGm = paramFloat1;
      this.kpV.bep();
    }
    this.kpV.P(0, paramBoolean);
    AppMethodBeat.o(89284);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI.b
 * JD-Core Version:    0.6.2
 */