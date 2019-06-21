package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.a.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class IPCallAcitivityUI$2
  implements View.OnClickListener
{
  IPCallAcitivityUI$2(IPCallAcitivityUI paramIPCallAcitivityUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(21987);
    if (IPCallAcitivityUI.a(this.nAv).jCt == 1)
    {
      ab.i("MicroMsg.IPCallAcitivityUI", "click activity, go to IPCallPackageUI");
      paramView = new Intent();
      paramView.setClass(this.nAv.mController.ylL, IPCallShareCouponUI.class);
      this.nAv.startActivity(paramView);
      paramView = new Intent();
      paramView.setClass(this.nAv.mController.ylL, IPCallPackageUI.class);
      this.nAv.startActivity(paramView);
    }
    IPCallAcitivityUI.b(this.nAv);
    this.nAv.finish();
    AppMethodBeat.o(21987);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallAcitivityUI.2
 * JD-Core Version:    0.6.2
 */