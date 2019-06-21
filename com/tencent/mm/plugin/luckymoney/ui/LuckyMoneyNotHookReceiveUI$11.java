package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.luckymoney.model.an;
import com.tencent.mm.plugin.luckymoney.model.aq;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.wallet.b;
import com.tencent.mm.sdk.platformtools.ab;

final class LuckyMoneyNotHookReceiveUI$11
  implements View.OnClickListener
{
  LuckyMoneyNotHookReceiveUI$11(LuckyMoneyNotHookReceiveUI paramLuckyMoneyNotHookReceiveUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42858);
    ((b)g.K(b.class)).eA(10, 3);
    h.pYm.e(11701, new Object[] { Integer.valueOf(5), Integer.valueOf(LuckyMoneyNotHookReceiveUI.yi(LuckyMoneyNotHookReceiveUI.i(this.ogx).cRT)), Integer.valueOf(LuckyMoneyNotHookReceiveUI.j(this.ogx)), Integer.valueOf(0), Integer.valueOf(2) });
    ab.i("MicroMsg.LuckyMoneyNotHookReceiveUI", "open btn click!");
    LuckyMoneyNotHookReceiveUI.k(this.ogx).setClickable(false);
    paramView = this.ogx;
    paramView.b(new an(paramView.nZs.msgType, paramView.nZs.cdf, paramView.nZs.nSX, paramView.nZs.cRS, x.bLC(), r.YB(), paramView.getIntent().getStringExtra("key_username"), "v1.0", paramView.nZs.nZl), false);
    x.c(paramView.nTE);
    AppMethodBeat.o(42858);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI.11
 * JD-Core Version:    0.6.2
 */