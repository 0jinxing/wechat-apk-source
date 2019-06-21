package com.tencent.mm.plugin.honey_pay.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.asi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class HoneyPayCardDetailUI$4
  implements View.OnClickListener
{
  HoneyPayCardDetailUI$4(HoneyPayCardDetailUI paramHoneyPayCardDetailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41780);
    ab.d(this.nrq.TAG, "click oper btn: %s", new Object[] { HoneyPayCardDetailUI.b(this.nrq).url });
    if (!bo.isNullOrNil(HoneyPayCardDetailUI.b(this.nrq).url))
      e.n(this.nrq.mController.ylL, HoneyPayCardDetailUI.b(this.nrq).url, false);
    AppMethodBeat.o(41780);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardDetailUI.4
 * JD-Core Version:    0.6.2
 */