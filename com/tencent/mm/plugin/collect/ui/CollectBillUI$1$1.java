package com.tencent.mm.plugin.collect.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.dg;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class CollectBillUI$1$1
  implements View.OnClickListener
{
  CollectBillUI$1$1(CollectBillUI.1 param1, dg paramdg)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41210);
    if (!bo.isNullOrNil(this.kFY.url))
      e.n(this.kFZ.kFX.mController.ylL, this.kFY.url, true);
    AppMethodBeat.o(41210);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectBillUI.1.1
 * JD-Core Version:    0.6.2
 */