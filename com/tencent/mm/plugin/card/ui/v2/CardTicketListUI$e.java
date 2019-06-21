package com.tencent.mm.plugin.card.ui.v2;

import a.l;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class CardTicketListUI$e
  implements View.OnClickListener
{
  CardTicketListUI$e(CardTicketListUI paramCardTicketListUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(89301);
    ab.i("MicroMsg.CardTicketListUI", "click history wording");
    paramView = new Intent((Context)this.kqh, CardInvalidTicketListUI.class);
    this.kqh.startActivity(paramView);
    h.pYm.e(16322, new Object[] { Integer.valueOf(8) });
    AppMethodBeat.o(89301);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.v2.CardTicketListUI.e
 * JD-Core Version:    0.6.2
 */