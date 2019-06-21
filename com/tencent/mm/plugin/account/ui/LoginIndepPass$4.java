package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.h;

final class LoginIndepPass$4
  implements DialogInterface.OnClickListener
{
  LoginIndepPass$4(LoginIndepPass paramLoginIndepPass)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(124972);
    ab.d("MicroMsg.LoginIndepPass", "imgSid:" + LoginIndepPass.e(this.gCE).guh + " img len" + LoginIndepPass.e(this.gCE).gug.length + " " + com.tencent.mm.compatible.util.g.Mq());
    paramDialogInterface = new q(LoginIndepPass.e(this.gCE).account, LoginIndepPass.e(this.gCE).guf, LoginIndepPass.e(this.gCE).gCL, LoginIndepPass.f(this.gCE).getSecImgCode(), LoginIndepPass.f(this.gCE).getSecImgSid(), LoginIndepPass.f(this.gCE).getSecImgEncryptKey(), 1, "", false, false);
    com.tencent.mm.kernel.g.Rg().a(paramDialogInterface, 0);
    LoginIndepPass localLoginIndepPass1 = this.gCE;
    LoginIndepPass localLoginIndepPass2 = this.gCE;
    this.gCE.getString(2131297061);
    LoginIndepPass.a(localLoginIndepPass1, h.b(localLoginIndepPass2, this.gCE.getString(2131301031), true, new LoginIndepPass.4.1(this, paramDialogInterface)));
    AppMethodBeat.o(124972);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginIndepPass.4
 * JD-Core Version:    0.6.2
 */