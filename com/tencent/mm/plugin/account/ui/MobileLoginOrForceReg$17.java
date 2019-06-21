package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.h;

final class MobileLoginOrForceReg$17
  implements DialogInterface.OnClickListener
{
  MobileLoginOrForceReg$17(MobileLoginOrForceReg paramMobileLoginOrForceReg)
  {
  }

  public final void onClick(final DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125219);
    ab.d("MicorMsg.MobileLoginOrForceReg", "imgSid:" + MobileLoginOrForceReg.q(this.gEv).guh + " img len" + MobileLoginOrForceReg.q(this.gEv).gug.length + " " + com.tencent.mm.compatible.util.g.Mq());
    paramDialogInterface = new q(MobileLoginOrForceReg.q(this.gEv).account, MobileLoginOrForceReg.q(this.gEv).gCK, MobileLoginOrForceReg.q(this.gEv).gCL, MobileLoginOrForceReg.r(this.gEv).getSecImgCode(), MobileLoginOrForceReg.r(this.gEv).getSecImgSid(), MobileLoginOrForceReg.r(this.gEv).getSecImgEncryptKey(), 1, "", false, true);
    com.tencent.mm.kernel.g.Rg().a(paramDialogInterface, 0);
    MobileLoginOrForceReg localMobileLoginOrForceReg = this.gEv;
    this.gEv.getString(2131297061);
    h.b(localMobileLoginOrForceReg, this.gEv.getString(2131301031), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        AppMethodBeat.i(125218);
        com.tencent.mm.kernel.g.Rg().c(paramDialogInterface);
        AppMethodBeat.o(125218);
      }
    });
    AppMethodBeat.o(125219);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg.17
 * JD-Core Version:    0.6.2
 */