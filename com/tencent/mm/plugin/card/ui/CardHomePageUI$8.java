package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.se;
import com.tencent.mm.plugin.card.d.b;
import com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.ny;
import com.tencent.mm.protocal.protobuf.oa;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class CardHomePageUI$8
  implements View.OnClickListener
{
  CardHomePageUI$8(CardHomePageUI paramCardHomePageUI, oa paramoa)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88490);
    if (this.klQ.vTw == 1)
    {
      b.a(this.klP, this.klQ.vTx, 0);
      AppMethodBeat.o(88490);
    }
    while (true)
    {
      return;
      if (this.klQ.vTw == 2)
      {
        if (this.klQ.vTy != null)
        {
          paramView = new se();
          paramView.cOf.userName = this.klQ.vTy.tzW;
          paramView.cOf.cOh = bo.bc(this.klQ.vTy.ttg, "");
          paramView.cOf.scene = 1028;
          a.xxA.m(paramView);
          AppMethodBeat.o(88490);
        }
      }
      else if (this.klQ.vTw == 3)
      {
        if ("weixin://wccard/sharecarddetail".equals(this.klQ.vTz))
        {
          ab.d("MicroMsg.CardHomePageUI", "go to share card ui");
          paramView = new Intent(this.klP, ShareCardListUI.class);
          paramView.putExtra("key_layout_buff", CardHomePageUI.e(this.klP));
          CardHomePageUI.f(this.klP);
          this.klP.startActivity(paramView);
          h.pYm.e(11324, new Object[] { "ClickShareCard", Integer.valueOf(0), "", "", Integer.valueOf(0), Integer.valueOf(0), "", Integer.valueOf(0), Integer.valueOf(0) });
          AppMethodBeat.o(88490);
        }
      }
      else
      {
        ab.w("MicroMsg.CardHomePageUI", "unknown op action: %s", new Object[] { Integer.valueOf(this.klQ.vTw) });
        AppMethodBeat.o(88490);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.CardHomePageUI.8
 * JD-Core Version:    0.6.2
 */