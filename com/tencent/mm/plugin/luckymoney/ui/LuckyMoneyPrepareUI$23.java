package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class LuckyMoneyPrepareUI$23
  implements Runnable
{
  LuckyMoneyPrepareUI$23(LuckyMoneyPrepareUI paramLuckyMoneyPrepareUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42967);
    Intent localIntent = new Intent();
    localIntent.setClass(this.ohI.mController.ylL, LuckyMoneyIndexUI.class);
    localIntent.addFlags(67108864);
    this.ohI.mController.ylL.startActivity(localIntent);
    this.ohI.finish();
    AppMethodBeat.o(42967);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPrepareUI.23
 * JD-Core Version:    0.6.2
 */