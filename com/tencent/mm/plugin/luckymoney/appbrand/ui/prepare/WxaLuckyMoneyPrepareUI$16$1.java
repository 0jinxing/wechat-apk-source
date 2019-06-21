package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.picker.b;
import com.tencent.mm.ui.widget.picker.b.a;

final class WxaLuckyMoneyPrepareUI$16$1
  implements b.a
{
  WxaLuckyMoneyPrepareUI$16$1(WxaLuckyMoneyPrepareUI.16 param16, b paramb)
  {
  }

  public final void d(boolean paramBoolean, Object paramObject)
  {
    AppMethodBeat.i(42071);
    this.jqm.hide();
    if (paramBoolean)
      WxaLuckyMoneyPrepareUI.h(this.nTv.nTo).setText((CharSequence)paramObject);
    WxaLuckyMoneyPrepareUI.a(this.nTv.nTo, this.jqm.dLl());
    AppMethodBeat.o(42071);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI.16.1
 * JD-Core Version:    0.6.2
 */