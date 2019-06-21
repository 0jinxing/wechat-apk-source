package com.tencent.mm.plugin.honey_pay.ui;

import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.ui.o.a;
import com.tencent.mm.protocal.protobuf.asi;
import com.tencent.mm.protocal.protobuf.asj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;

final class HoneyPaySelectCardTypeUI$a$1
  implements o.a
{
  HoneyPaySelectCardTypeUI$a$1(HoneyPaySelectCardTypeUI.a parama, asj paramasj, Context paramContext)
  {
  }

  public final void df(View paramView)
  {
    AppMethodBeat.i(41953);
    ab.i("MicroMsg.HoneyPaySelectCardTypeUI", "click oper text");
    if (!bo.isNullOrNil(this.nto.wpr.url))
      e.n(this.val$context, this.nto.wpr.url, false);
    AppMethodBeat.o(41953);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI.a.1
 * JD-Core Version:    0.6.2
 */