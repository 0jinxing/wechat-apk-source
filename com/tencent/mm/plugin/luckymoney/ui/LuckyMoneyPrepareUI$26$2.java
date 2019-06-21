package com.tencent.mm.plugin.luckymoney.ui;

import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.view.BaseEmojiView;
import com.tencent.mm.g.b.a.aa;
import com.tencent.mm.plugin.emojicapture.api.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;

final class LuckyMoneyPrepareUI$26$2
  implements n.d
{
  LuckyMoneyPrepareUI$26$2(LuckyMoneyPrepareUI.26 param26)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(42970);
    ab.i("MicroMsg.LuckyMoneyPrepareUI", "showLuckyHbDlg() onMMMenuItemSelected menuItemId:%s", new Object[] { Integer.valueOf(paramMenuItem.getItemId()) });
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(42970);
      while (true)
      {
        return;
        LuckyMoneyPrepareUI.b(this.ohN.ohI, 1);
        c.h(this.ohN.ohI, null, 4);
        LuckyMoneyPrepareUI.a(this.ohN.ohI, new aa());
        LuckyMoneyPrepareUI.h(this.ohN.ohI).cVT = 4L;
        LuckyMoneyPrepareUI.h(this.ohN.ohI).ajK();
        AppMethodBeat.o(42970);
        continue;
        LuckyMoneyPrepareUI.b(this.ohN.ohI, 2);
        LuckyMoneyPrepareUI.y(this.ohN.ohI);
        AppMethodBeat.o(42970);
      }
      LuckyMoneyPrepareUI.z(this.ohN.ohI);
      paramMenuItem = LuckyMoneyPrepareUI.A(this.ohN.ohI);
      paramMenuItem.ohX.setTag("");
      paramMenuItem.ohY.setVisibility(0);
      paramMenuItem.ohZ.setVisibility(8);
      LuckyMoneyPrepareUI.a(this.ohN.ohI, null);
      LuckyMoneyPrepareUI.a(this.ohN.ohI, new aa());
      LuckyMoneyPrepareUI.h(this.ohN.ohI).cVT = 5L;
      LuckyMoneyPrepareUI.h(this.ohN.ohI).ajK();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.26.2
 * JD-Core Version:    0.6.2
 */