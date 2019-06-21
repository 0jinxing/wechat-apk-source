package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.q.a;

final class SelectLuckyMoneyContactUI$1
  implements q.a
{
  SelectLuckyMoneyContactUI$1(SelectLuckyMoneyContactUI paramSelectLuckyMoneyContactUI, Intent paramIntent)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(43076);
    if (paramBoolean)
    {
      this.oiz.setResult(-1, this.val$data);
      this.oiz.finish();
    }
    AppMethodBeat.o(43076);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.SelectLuckyMoneyContactUI.1
 * JD-Core Version:    0.6.2
 */