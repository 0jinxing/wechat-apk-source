package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.h;

final class RegSetInfoUI$10
  implements DialogInterface.OnClickListener
{
  RegSetInfoUI$10(RegSetInfoUI paramRegSetInfoUI, m paramm)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125516);
    paramDialogInterface = RegSetInfoUI.a(this.gHM).getText().toString().trim();
    Object localObject = RegSetInfoUI.b(this.gHM).getText().toString().trim();
    if ((localObject == null) || (((String)localObject).length() <= 0))
    {
      h.g(this.gHM, 2131304226, 2131302287);
      AppMethodBeat.o(125516);
    }
    while (true)
    {
      return;
      paramInt = RegSetInfoUI.e(this.gHM);
      g.Rg().a(126, this.gHM);
      s locals = new s("", RegSetInfoUI.y(this.gHM), (String)localObject, RegSetInfoUI.z(this.gHM), RegSetInfoUI.A(this.gHM), RegSetInfoUI.B(this.gHM), "", "", RegSetInfoUI.g(this.gHM), paramInt, paramDialogInterface, ((s)this.crb).ajn(), RegSetInfoUI.C(this.gHM).getSecImgCode(), RegSetInfoUI.D(this.gHM), RegSetInfoUI.j(this.gHM));
      locals.ts(RegSetInfoUI.E(this.gHM));
      locals.tt(RegSetInfoUI.F(this.gHM));
      locals.lX(RegSetInfoUI.G(this.gHM));
      g.Rg().a(locals, 0);
      paramDialogInterface = this.gHM;
      localObject = this.gHM;
      this.gHM.getString(2131297061);
      RegSetInfoUI.a(paramDialogInterface, h.b((Context)localObject, this.gHM.getString(2131302326), true, new RegSetInfoUI.10.1(this, locals)));
      AppMethodBeat.o(125516);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.10
 * JD-Core Version:    0.6.2
 */