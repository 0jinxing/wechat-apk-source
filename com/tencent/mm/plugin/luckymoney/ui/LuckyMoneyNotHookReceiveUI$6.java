package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyNotHookReceiveUI$6
  implements View.OnClickListener
{
  LuckyMoneyNotHookReceiveUI$6(LuckyMoneyNotHookReceiveUI paramLuckyMoneyNotHookReceiveUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42853);
    this.ogx.finish();
    AppMethodBeat.o(42853);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI.6
 * JD-Core Version:    0.6.2
 */