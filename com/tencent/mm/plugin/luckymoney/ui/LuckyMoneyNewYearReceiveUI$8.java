package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;

final class LuckyMoneyNewYearReceiveUI$8
  implements View.OnClickListener
{
  LuckyMoneyNewYearReceiveUI$8(LuckyMoneyNewYearReceiveUI paramLuckyMoneyNewYearReceiveUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42793);
    ab.i("MicroMsg.LuckyMoneyNewYearReceiveUI", "goto detail!");
    paramView = new Intent();
    paramView.putExtra("key_native_url", LuckyMoneyNewYearReceiveUI.j(this.ofE));
    d.b(this.ofE, "luckymoney", ".ui.LuckyMoneyBeforeDetailUI", paramView);
    AppMethodBeat.o(42793);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI.8
 * JD-Core Version:    0.6.2
 */