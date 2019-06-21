package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.aq;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LuckyMoneyNotHookReceiveUI$12
  implements View.OnClickListener
{
  LuckyMoneyNotHookReceiveUI$12(LuckyMoneyNotHookReceiveUI paramLuckyMoneyNotHookReceiveUI, boolean paramBoolean)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42859);
    if (this.ogA)
      h.pYm.e(11701, new Object[] { Integer.valueOf(6), Integer.valueOf(LuckyMoneyNotHookReceiveUI.yi(LuckyMoneyNotHookReceiveUI.i(this.ogx).cRT)), Integer.valueOf(LuckyMoneyNotHookReceiveUI.j(this.ogx)), Integer.valueOf(0), Integer.valueOf(1) });
    paramView = new Intent();
    paramView.setClass(this.ogx.mController.ylL, LuckyMoneyBeforeDetailUI.class);
    paramView.putExtra("key_native_url", LuckyMoneyNotHookReceiveUI.i(this.ogx).cRS);
    paramView.putExtra("key_sendid", LuckyMoneyNotHookReceiveUI.i(this.ogx).nSX);
    paramView.putExtra("key_lucky_money_can_received", true);
    paramView.putExtra("key_username", this.ogx.getIntent().getStringExtra("key_username"));
    this.ogx.startActivity(paramView);
    this.ogx.finish();
    AppMethodBeat.o(42859);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI.12
 * JD-Core Version:    0.6.2
 */