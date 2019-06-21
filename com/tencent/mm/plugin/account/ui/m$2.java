package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.h;

final class m$2
  implements DialogInterface.OnClickListener
{
  m$2(m paramm)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125236);
    ab.d("MicroMsg.MobileVerifyForgetPwdLogic", "imgSid:" + this.gEG.gBT.guh + " img len" + this.gEG.gBT.gug.length + " " + com.tencent.mm.compatible.util.g.Mq());
    q localq = new q(this.gEG.gBT.account, this.gEG.gBT.gCK, this.gEG.gBT.gCL, this.gEG.gue.getSecImgCode(), this.gEG.gue.getSecImgSid(), this.gEG.gue.getSecImgEncryptKey(), 1, "", false, true);
    com.tencent.mm.kernel.g.Rg().a(localq, 0);
    paramDialogInterface = this.gEG.gEE;
    this.gEG.gEE.getString(2131297061);
    h.b(paramDialogInterface, this.gEG.gEE.getString(2131301031), true, new m.2.1(this, localq));
    AppMethodBeat.o(125236);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.m.2
 * JD-Core Version:    0.6.2
 */