package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class CardHomePageUI$5
  implements View.OnClickListener
{
  CardHomePageUI$5(CardHomePageUI paramCardHomePageUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88487);
    paramView = new Intent(this.klP, CardIndexUI.class);
    paramView.putExtra("key_card_type", 1);
    this.klP.startActivity(paramView);
    h.pYm.e(11324, new Object[] { "GotoMemberCardUI", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), Integer.valueOf(0) });
    AppMethodBeat.o(88487);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardHomePageUI.5
 * JD-Core Version:    0.6.2
 */