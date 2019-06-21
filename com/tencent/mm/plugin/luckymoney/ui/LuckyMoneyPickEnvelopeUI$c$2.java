package com.tencent.mm.plugin.luckymoney.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.a.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class LuckyMoneyPickEnvelopeUI$c$2
  implements a.a
{
  LuckyMoneyPickEnvelopeUI$c$2(LuckyMoneyPickEnvelopeUI.c paramc)
  {
  }

  public final void iH(boolean paramBoolean)
  {
    AppMethodBeat.i(42924);
    ab.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "load ok: %s", new Object[] { Boolean.valueOf(paramBoolean) });
    LuckyMoneyPickEnvelopeUI.c.2.1 local1 = new LuckyMoneyPickEnvelopeUI.c.2.1(this, paramBoolean);
    if (al.isMainThread())
    {
      local1.run();
      AppMethodBeat.o(42924);
    }
    while (true)
    {
      return;
      this.ohi.ohe.post(local1);
      AppMethodBeat.o(42924);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.c.2
 * JD-Core Version:    0.6.2
 */