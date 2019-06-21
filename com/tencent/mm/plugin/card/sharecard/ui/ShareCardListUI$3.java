package com.tencent.mm.plugin.card.sharecard.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.sharecard.a.b;
import com.tencent.mm.plugin.report.service.h;

final class ShareCardListUI$3
  implements View.OnClickListener
{
  ShareCardListUI$3(ShareCardListUI paramShareCardListUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88167);
    ShareCardListUI.c(this.khB);
    if (b.bbw())
    {
      ShareCardListUI.c(this.khB);
      if (b.bbv())
        ShareCardListUI.a(this.khB, 2);
    }
    while (true)
    {
      h.pYm.e(11582, new Object[] { "OperChangeOtherCity ", Integer.valueOf(0), Integer.valueOf(0), "", "", "" });
      am.bbb().putValue("key_share_card_show_type", Integer.valueOf(ShareCardListUI.d(this.khB)));
      ShareCardListUI.e(this.khB);
      ShareCardListUI.f(this.khB).cu();
      ShareCardListUI.c(this.khB);
      b.kft = true;
      AppMethodBeat.o(88167);
      return;
      ShareCardListUI.c(this.khB);
      if (b.bbv())
        ShareCardListUI.a(this.khB, 3);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI.3
 * JD-Core Version:    0.6.2
 */