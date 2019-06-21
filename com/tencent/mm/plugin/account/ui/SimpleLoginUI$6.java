package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.h;

final class SimpleLoginUI$6
  implements DialogInterface.OnClickListener
{
  SimpleLoginUI$6(SimpleLoginUI paramSimpleLoginUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125602);
    ab.d("MicroMsg.SimpleLoginUI", "imgSid:" + SimpleLoginUI.g(this.gIp).guh + " img len" + SimpleLoginUI.g(this.gIp).gug.length + " " + com.tencent.mm.compatible.util.g.Mq());
    q localq = new q(SimpleLoginUI.g(this.gIp).account, SimpleLoginUI.g(this.gIp).guf, SimpleLoginUI.g(this.gIp).gCL, SimpleLoginUI.h(this.gIp).getSecImgCode(), SimpleLoginUI.h(this.gIp).getSecImgSid(), SimpleLoginUI.h(this.gIp).getSecImgEncryptKey(), 0, "", false, false);
    com.tencent.mm.kernel.g.Rg().a(localq, 0);
    paramDialogInterface = this.gIp;
    SimpleLoginUI localSimpleLoginUI = this.gIp;
    this.gIp.getString(2131297061);
    SimpleLoginUI.a(paramDialogInterface, h.b(localSimpleLoginUI, this.gIp.getString(2131301031), true, new SimpleLoginUI.6.1(this, localq)));
    AppMethodBeat.o(125602);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.SimpleLoginUI.6
 * JD-Core Version:    0.6.2
 */