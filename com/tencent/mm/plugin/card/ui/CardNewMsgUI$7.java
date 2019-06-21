package com.tencent.mm.plugin.card.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.b.k;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.g;
import com.tencent.mm.ui.base.h.c;

final class CardNewMsgUI$7
  implements h.c
{
  CardNewMsgUI$7(CardNewMsgUI paramCardNewMsgUI, int paramInt)
  {
  }

  public final void iE(int paramInt)
  {
    AppMethodBeat.i(88598);
    switch (paramInt)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(88598);
      return;
      g localg = (g)CardNewMsgUI.a(this.kmV).getItem(this.gvp);
      if (localg != null)
      {
        am.bba().Gr(localg.field_msg_id);
        CardNewMsgUI.g(this.kmV);
        CardNewMsgUI.a(this.kmV).a(null, null);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardNewMsgUI.7
 * JD-Core Version:    0.6.2
 */