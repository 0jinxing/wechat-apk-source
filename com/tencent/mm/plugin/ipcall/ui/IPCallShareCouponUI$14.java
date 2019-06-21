package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class IPCallShareCouponUI$14
  implements View.OnClickListener
{
  IPCallShareCouponUI$14(IPCallShareCouponUI paramIPCallShareCouponUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22332);
    paramView = new Intent();
    paramView.setClass(this.nFI.mController.ylL, IPCallMyGiftCardUI.class);
    this.nFI.mController.ylL.startActivity(paramView);
    AppMethodBeat.o(22332);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI.14
 * JD-Core Version:    0.6.2
 */