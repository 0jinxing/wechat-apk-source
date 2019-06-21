package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.h;

final class l$2
  implements DialogInterface.OnClickListener
{
  l$2(l paraml, f paramf)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125135);
    ab.d("MicroMsg.MobileInputIndepPassLoginLogic", "imgSid:" + this.gDE.guh + " img len" + this.gDE.gug.length + " " + com.tencent.mm.compatible.util.g.Mq());
    q localq = new q(this.gDE.account, this.gDE.guf, this.gDE.gCL, this.gDD.gue.getSecImgCode(), this.gDD.gue.getSecImgSid(), this.gDD.gue.getSecImgEncryptKey(), 1, "", false, false);
    com.tencent.mm.kernel.g.Rg().a(localq, 0);
    paramDialogInterface = this.gDD.gDo;
    MobileInputUI localMobileInputUI = this.gDD.gDo;
    this.gDD.gDo.getString(2131297061);
    paramDialogInterface.guc = h.b(localMobileInputUI, this.gDD.gDo.getString(2131301031), true, new l.2.1(this, localq));
    AppMethodBeat.o(125135);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.l.2
 * JD-Core Version:    0.6.2
 */