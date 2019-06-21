package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyNotHookReceiveUI$7
  implements View.OnClickListener
{
  LuckyMoneyNotHookReceiveUI$7(LuckyMoneyNotHookReceiveUI paramLuckyMoneyNotHookReceiveUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42854);
    LuckyMoneyNotHookReceiveUI.a(this.ogx, true);
    AppMethodBeat.o(42854);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI.7
 * JD-Core Version:    0.6.2
 */