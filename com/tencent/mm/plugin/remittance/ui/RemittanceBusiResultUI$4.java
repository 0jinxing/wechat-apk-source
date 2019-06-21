package com.tencent.mm.plugin.remittance.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.se;
import com.tencent.mm.protocal.protobuf.mr;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.ui.e;

final class RemittanceBusiResultUI$4
  implements View.OnClickListener
{
  RemittanceBusiResultUI$4(RemittanceBusiResultUI paramRemittanceBusiResultUI, mr parammr)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(44872);
    ab.i("MicroMsg.RemittanceBusiResultUI", "app type: %s", new Object[] { Integer.valueOf(this.pSW.type) });
    if (this.pSW.type == 1)
    {
      RemittanceBusiResultUI.a(this.pSU);
      paramView = new se();
      paramView.cOf.userName = this.pSW.vQG;
      paramView.cOf.cOh = bo.bc(this.pSW.vQH, "");
      paramView.cOf.scene = 1034;
      paramView.cOf.cOi = 0;
      a.xxA.m(paramView);
      AppMethodBeat.o(44872);
    }
    while (true)
    {
      return;
      if (this.pSW.type == 2)
      {
        RemittanceBusiResultUI.a(this.pSU);
        e.n(this.pSU.mController.ylL, this.pSW.url, true);
      }
      AppMethodBeat.o(44872);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI.4
 * JD-Core Version:    0.6.2
 */