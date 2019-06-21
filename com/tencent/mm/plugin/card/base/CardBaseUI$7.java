package com.tencent.mm.plugin.card.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelstat.o;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.model.am;

final class CardBaseUI$7
  implements b.a
{
  CardBaseUI$7(CardBaseUI paramCardBaseUI)
  {
  }

  public final boolean a(boolean paramBoolean, float paramFloat1, float paramFloat2, int paramInt, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    AppMethodBeat.i(87623);
    if (!paramBoolean)
    {
      this.kav.aZx();
      paramBoolean = true;
      AppMethodBeat.o(87623);
    }
    while (true)
    {
      return paramBoolean;
      if ((paramFloat2 != -85.0F) && (paramFloat1 != -1000.0F))
      {
        CardBaseUI.a(this.kav, paramFloat2);
        CardBaseUI.b(this.kav, paramFloat1);
        am.bbc().O(CardBaseUI.a(this.kav), CardBaseUI.b(this.kav));
        this.kav.aZw();
      }
      if (!CardBaseUI.c(this.kav))
      {
        CardBaseUI.d(this.kav);
        o.a(2010, paramFloat1, paramFloat2, (int)paramDouble2);
      }
      paramBoolean = false;
      AppMethodBeat.o(87623);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.base.CardBaseUI.7
 * JD-Core Version:    0.6.2
 */