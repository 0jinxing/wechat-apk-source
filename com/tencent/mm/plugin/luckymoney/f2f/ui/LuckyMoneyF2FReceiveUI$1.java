package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyF2FReceiveUI$1
  implements View.OnClickListener
{
  LuckyMoneyF2FReceiveUI$1(LuckyMoneyF2FReceiveUI paramLuckyMoneyF2FReceiveUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42211);
    LuckyMoneyF2FReceiveUI.a(this.nVO).cancel();
    this.nVO.finish();
    AppMethodBeat.o(42211);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.LuckyMoneyF2FReceiveUI.1
 * JD-Core Version:    0.6.2
 */