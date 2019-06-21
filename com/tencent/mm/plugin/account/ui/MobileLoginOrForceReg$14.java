package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MobileLoginOrForceReg$14
  implements View.OnClickListener
{
  MobileLoginOrForceReg$14(MobileLoginOrForceReg paramMobileLoginOrForceReg)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(125215);
    MobileLoginOrForceReg.a(this.gEv, new g(new MobileLoginOrForceReg.14.1(this), MobileLoginOrForceReg.c(this.gEv), MobileLoginOrForceReg.d(this.gEv), MobileLoginOrForceReg.e(this.gEv)));
    MobileLoginOrForceReg.f(this.gEv).a(this.gEv);
    AppMethodBeat.o(125215);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg.14
 * JD-Core Version:    0.6.2
 */