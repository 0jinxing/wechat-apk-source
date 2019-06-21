package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class CardHomePageUI$7
  implements View.OnClickListener
{
  CardHomePageUI$7(CardHomePageUI paramCardHomePageUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88489);
    paramView = new Intent(this.klP, CardIndexUI.class);
    paramView.putExtra("key_card_type", 3);
    this.klP.startActivity(paramView);
    h.pYm.e(11324, new Object[] { "ClickTicketCard", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), Integer.valueOf(0) });
    AppMethodBeat.o(88489);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardHomePageUI.7
 * JD-Core Version:    0.6.2
 */