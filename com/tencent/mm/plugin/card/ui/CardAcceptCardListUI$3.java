package com.tencent.mm.plugin.card.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import java.util.LinkedList;

final class CardAcceptCardListUI$3
  implements View.OnClickListener
{
  CardAcceptCardListUI$3(CardAcceptCardListUI paramCardAcceptCardListUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88217);
    if (CardAcceptCardListUI.a(this.kiw))
    {
      CardAcceptCardListUI.a(this.kiw, CardAcceptCardListUI.b(this.kiw));
      AppMethodBeat.o(88217);
    }
    while (true)
    {
      return;
      paramView = this.kiw;
      LinkedList localLinkedList = CardAcceptCardListUI.b(this.kiw);
      paramView.fE(true);
      paramView = new com.tencent.mm.plugin.card.model.p(localLinkedList, paramView.cME, paramView.kir, paramView.kis, paramView.kiq);
      g.RO().eJo.a(paramView, 0);
      AppMethodBeat.o(88217);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardAcceptCardListUI.3
 * JD-Core Version:    0.6.2
 */