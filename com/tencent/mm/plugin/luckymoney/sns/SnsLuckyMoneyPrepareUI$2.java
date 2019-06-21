package com.tencent.mm.plugin.luckymoney.sns;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyIndexUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class SnsLuckyMoneyPrepareUI$2
  implements Runnable
{
  SnsLuckyMoneyPrepareUI$2(SnsLuckyMoneyPrepareUI paramSnsLuckyMoneyPrepareUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42509);
    Intent localIntent = new Intent();
    localIntent.setClass(this.obN.mController.ylL, LuckyMoneyIndexUI.class);
    localIntent.addFlags(67108864);
    this.obN.mController.ylL.startActivity(localIntent);
    this.obN.finish();
    AppMethodBeat.o(42509);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI.2
 * JD-Core Version:    0.6.2
 */