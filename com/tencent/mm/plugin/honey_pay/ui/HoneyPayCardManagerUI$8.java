package com.tencent.mm.plugin.honey_pay.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bdh;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class HoneyPayCardManagerUI$8
  implements View.OnClickListener
{
  HoneyPayCardManagerUI$8(HoneyPayCardManagerUI paramHoneyPayCardManagerUI, bdh parambdh)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(41800);
    e.n(this.nrS.mController.ylL, this.nrV.url, false);
    AppMethodBeat.o(41800);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI.8
 * JD-Core Version:    0.6.2
 */