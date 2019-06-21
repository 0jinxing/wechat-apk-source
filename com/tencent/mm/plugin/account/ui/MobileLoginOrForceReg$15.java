package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.b.a;
import com.tencent.mm.sdk.platformtools.bo;

final class MobileLoginOrForceReg$15
  implements View.OnClickListener
{
  MobileLoginOrForceReg$15(MobileLoginOrForceReg paramMobileLoginOrForceReg)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125216);
    if (bo.isNullOrNil(MobileLoginOrForceReg.g(this.gEv)))
    {
      paramView = new Intent();
      a.wA("R200_900_phone");
      paramView.putExtra("regsetinfo_ticket", MobileLoginOrForceReg.h(this.gEv));
      paramView.putExtra("regsetinfo_user", MobileLoginOrForceReg.e(this.gEv));
      paramView.putExtra("regsetinfo_pwd", MobileLoginOrForceReg.d(this.gEv));
      paramView.putExtra("regsetinfo_ismobile", 4);
      paramView.putExtra("regsetinfo_isForce", true);
      paramView.putExtra("regsession_id", MobileLoginOrForceReg.i(this.gEv));
      paramView.putExtra("reg_3d_app_ticket", MobileLoginOrForceReg.j(this.gEv));
      paramView.putExtra("reg_3d_app_type", MobileLoginOrForceReg.k(this.gEv));
      paramView.putExtra("regsetinfo_NextControl", MobileLoginOrForceReg.l(this.gEv));
      paramView.putExtra("mobile_check_type", MobileLoginOrForceReg.m(this.gEv));
      paramView.putExtra("key_reg_style", MobileLoginOrForceReg.n(this.gEv));
      paramView.setClass(this.gEv, RegSetInfoUI.class);
      this.gEv.startActivity(paramView);
      AppMethodBeat.o(125216);
    }
    while (true)
    {
      return;
      MobileLoginOrForceReg.o(this.gEv);
      AppMethodBeat.o(125216);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg.15
 * JD-Core Version:    0.6.2
 */