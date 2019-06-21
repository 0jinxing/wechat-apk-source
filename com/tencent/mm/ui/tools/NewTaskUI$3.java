package com.tencent.mm.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.modelsimple.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.h;

final class NewTaskUI$3
  implements DialogInterface.OnClickListener
{
  NewTaskUI$3(NewTaskUI paramNewTaskUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(34919);
    ab.i("MicroMsg.NewTaskUI", "dkwt dlg imgSid:" + NewTaskUI.a(this.zGF).guh + " img len" + NewTaskUI.a(this.zGF).gug.length + " " + com.tencent.mm.compatible.util.g.Mq());
    if (NewTaskUI.b(this.zGF) == null)
    {
      ab.d("MicroMsg.NewTaskUI", "[arthurdan.SecurityImageCrash] fatal error!!! secimg is null!");
      AppMethodBeat.o(34919);
    }
    while (true)
    {
      return;
      q localq = new q(NewTaskUI.a(this.zGF).gCL, NewTaskUI.b(this.zGF).getSecImgCode(), NewTaskUI.b(this.zGF).getSecImgSid(), NewTaskUI.b(this.zGF).getSecImgEncryptKey());
      aw.Rg().a(localq, 0);
      paramDialogInterface = this.zGF;
      NewTaskUI localNewTaskUI = this.zGF;
      this.zGF.getString(2131297061);
      NewTaskUI.a(paramDialogInterface, h.b(localNewTaskUI, this.zGF.getString(2131301031), true, new NewTaskUI.3.1(this, localq)));
      AppMethodBeat.o(34919);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.NewTaskUI.3
 * JD-Core Version:    0.6.2
 */