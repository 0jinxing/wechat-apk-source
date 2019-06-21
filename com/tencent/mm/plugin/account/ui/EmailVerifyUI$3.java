package com.tencent.mm.plugin.account.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.ui.base.h;

final class EmailVerifyUI$3
  implements View.OnClickListener
{
  EmailVerifyUI$3(EmailVerifyUI paramEmailVerifyUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(124761);
    paramView = new StringBuilder();
    g.RN();
    paramView = paramView.append(com.tencent.mm.kernel.a.Rb()).append(",").append(getClass().getName()).append(",R500_250,");
    g.RN();
    com.tencent.mm.plugin.b.a.wB(com.tencent.mm.kernel.a.lF("R500_250") + ",3");
    h.a(this.gAP, 2131302239, 2131302229, 2131296994, 2131296868, new EmailVerifyUI.3.1(this), null);
    AppMethodBeat.o(124761);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.EmailVerifyUI.3
 * JD-Core Version:    0.6.2
 */