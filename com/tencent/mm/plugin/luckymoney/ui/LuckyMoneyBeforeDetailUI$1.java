package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LuckyMoneyBeforeDetailUI$1
  implements Runnable
{
  LuckyMoneyBeforeDetailUI$1(LuckyMoneyBeforeDetailUI paramLuckyMoneyBeforeDetailUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42576);
    Intent localIntent = new Intent(this.ocB.mController.ylL, LuckyMoneyDetailUI.class);
    localIntent.putExtras(this.ocB.getIntent());
    this.ocB.startActivity(localIntent);
    this.ocB.finish();
    AppMethodBeat.o(42576);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBeforeDetailUI.1
 * JD-Core Version:    0.6.2
 */