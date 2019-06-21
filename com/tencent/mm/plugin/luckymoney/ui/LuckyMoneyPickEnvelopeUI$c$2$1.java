package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Dialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LuckyMoneyPickEnvelopeUI$c$2$1
  implements Runnable
{
  LuckyMoneyPickEnvelopeUI$c$2$1(LuckyMoneyPickEnvelopeUI.c.2 param2, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42923);
    if ((LuckyMoneyPickEnvelopeUI.c.a(this.ohj.ohi) != null) && (LuckyMoneyPickEnvelopeUI.c.a(this.ohj.ohi).isShowing()))
      LuckyMoneyPickEnvelopeUI.c.a(this.ohj.ohi).dismiss();
    if (!this.fBW)
    {
      this.ohj.ohi.ohe.setVisibility(0);
      this.ohj.ohi.ohf.setVisibility(0);
      this.ohj.ohi.ohg.setVisibility(8);
      this.ohj.ohi.ohh.setVisibility(0);
      AppMethodBeat.o(42923);
    }
    while (true)
    {
      return;
      this.ohj.ohi.ohe.setVisibility(8);
      AppMethodBeat.o(42923);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.c.2.1
 * JD-Core Version:    0.6.2
 */