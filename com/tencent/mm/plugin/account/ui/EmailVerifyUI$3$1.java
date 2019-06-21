package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.z;
import com.tencent.mm.ui.base.h;

final class EmailVerifyUI$3$1
  implements DialogInterface.OnClickListener
{
  EmailVerifyUI$3$1(EmailVerifyUI.3 param3)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(124760);
    paramDialogInterface = new z(EmailVerifyUI.a(this.gAQ.gAP), EmailVerifyUI.b(this.gAQ.gAP));
    g.Rg().a(paramDialogInterface, 0);
    EmailVerifyUI localEmailVerifyUI1 = this.gAQ.gAP;
    EmailVerifyUI localEmailVerifyUI2 = this.gAQ.gAP;
    this.gAQ.gAP.getString(2131297061);
    EmailVerifyUI.a(localEmailVerifyUI1, h.b(localEmailVerifyUI2, this.gAQ.gAP.getString(2131302247), true, new EmailVerifyUI.3.1.1(this, paramDialogInterface)));
    AppMethodBeat.o(124760);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.EmailVerifyUI.3.1
 * JD-Core Version:    0.6.2
 */