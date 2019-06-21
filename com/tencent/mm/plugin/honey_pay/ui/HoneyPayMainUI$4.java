package com.tencent.mm.plugin.honey_pay.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.he;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class HoneyPayMainUI$4
  implements View.OnClickListener
{
  HoneyPayMainUI$4(HoneyPayMainUI paramHoneyPayMainUI, he paramhe)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41884);
    e.n(this.nsB.mController.ylL, this.nsD.url, true);
    AppMethodBeat.o(41884);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI.4
 * JD-Core Version:    0.6.2
 */