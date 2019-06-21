package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.h;

final class LoginUI$11
  implements DialogInterface.OnClickListener
{
  LoginUI$11(LoginUI paramLoginUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125037);
    if (LoginUI.h(this.gDe) == null)
    {
      ab.e("MicroMsg.LoginUI", "secimg is null!");
      AppMethodBeat.o(125037);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.LoginUI", "imgSid:" + LoginUI.i(this.gDe).guh + " img len" + LoginUI.i(this.gDe).gug.length + " " + com.tencent.mm.compatible.util.g.Mq());
      q localq = new q(LoginUI.i(this.gDe).account, LoginUI.i(this.gDe).guf, LoginUI.i(this.gDe).gCL, LoginUI.h(this.gDe).getSecImgCode(), LoginUI.h(this.gDe).getSecImgSid(), LoginUI.h(this.gDe).getSecImgEncryptKey(), 2, "", false, false);
      com.tencent.mm.kernel.g.Rg().a(localq, 0);
      paramDialogInterface = this.gDe;
      LoginUI localLoginUI = this.gDe;
      this.gDe.getString(2131297061);
      LoginUI.a(paramDialogInterface, h.b(localLoginUI, this.gDe.getString(2131301031), true, new LoginUI.11.1(this, localq)));
      AppMethodBeat.o(125037);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginUI.11
 * JD-Core Version:    0.6.2
 */