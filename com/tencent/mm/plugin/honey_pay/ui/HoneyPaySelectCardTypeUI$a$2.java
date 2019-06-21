package com.tencent.mm.plugin.honey_pay.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.asj;
import com.tencent.mm.sdk.platformtools.ab;

final class HoneyPaySelectCardTypeUI$a$2
  implements View.OnClickListener
{
  HoneyPaySelectCardTypeUI$a$2(HoneyPaySelectCardTypeUI.a parama, asj paramasj)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41954);
    ab.i("MicroMsg.HoneyPaySelectCardTypeUI", "card type clicked");
    if (HoneyPaySelectCardTypeUI.a(this.ntp.ntj) != null)
    {
      HoneyPaySelectCardTypeUI.a(this.ntp.ntj, HoneyPaySelectCardTypeUI.a(this.ntp.ntj));
      AppMethodBeat.o(41954);
    }
    while (true)
    {
      return;
      HoneyPaySelectCardTypeUI.a(this.ntp.ntj, this.nto.iAd);
      HoneyPaySelectCardTypeUI.b(this.ntp.ntj);
      AppMethodBeat.o(41954);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI.a.2
 * JD-Core Version:    0.6.2
 */