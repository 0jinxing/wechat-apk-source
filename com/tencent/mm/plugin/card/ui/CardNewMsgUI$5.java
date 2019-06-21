package com.tencent.mm.plugin.card.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.h;
import com.tencent.mm.ui.p.a;

final class CardNewMsgUI$5
  implements p.a
{
  CardNewMsgUI$5(CardNewMsgUI paramCardNewMsgUI)
  {
  }

  public final void apt()
  {
    AppMethodBeat.i(88596);
    CardNewMsgUI.g(this.kmV);
    if ((CardNewMsgUI.a(this.kmV).bdn()) && (am.baY().baS() == 0))
      CardNewMsgUI.c(this.kmV).setVisibility(8);
    AppMethodBeat.o(88596);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardNewMsgUI.5
 * JD-Core Version:    0.6.2
 */