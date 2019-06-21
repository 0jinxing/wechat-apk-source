package com.tencent.mm.plugin.card.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.plugin.card.b.i;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.model.am;

final class CardDetailUI$1
  implements b.a
{
  CardDetailUI$1(CardDetailUI paramCardDetailUI)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(88272);
    if (!paramBoolean)
    {
      paramBoolean = true;
      AppMethodBeat.o(88272);
    }
    while (true)
    {
      return paramBoolean;
      if ((CardDetailUI.a(this.kjb) == -85.0F) && (CardDetailUI.b(this.kjb) == -1000.0F))
      {
        CardDetailUI.a(this.kjb, paramFloat2);
        CardDetailUI.b(this.kjb, paramFloat1);
        am.bbc().O(CardDetailUI.a(this.kjb), CardDetailUI.b(this.kjb));
      }
      i locali = CardDetailUI.c(this.kjb);
      paramFloat2 = CardDetailUI.b(this.kjb);
      paramFloat1 = CardDetailUI.a(this.kjb);
      synchronized (locali.kbe)
      {
        locali.ecs = paramFloat1;
        locali.ect = paramFloat2;
        if (CardDetailUI.d(this.kjb))
        {
          CardDetailUI.e(this.kjb);
          CardDetailUI.f(this.kjb);
        }
        CardDetailUI.g(this.kjb);
        paramBoolean = false;
        AppMethodBeat.o(88272);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardDetailUI.1
 * JD-Core Version:    0.6.2
 */