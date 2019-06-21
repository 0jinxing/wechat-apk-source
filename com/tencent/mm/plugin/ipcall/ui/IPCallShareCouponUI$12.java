package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class IPCallShareCouponUI$12
  implements View.OnClickListener
{
  IPCallShareCouponUI$12(IPCallShareCouponUI paramIPCallShareCouponUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22330);
    h.pYm.e(13340, new Object[] { Integer.valueOf(1), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1) });
    paramView = new Intent();
    paramView.setClass(this.nFI.mController.ylL, IPCallShareCouponCardUI.class);
    this.nFI.mController.ylL.startActivity(paramView);
    AppMethodBeat.o(22330);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.12
 * JD-Core Version:    0.6.2
 */