package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class MobileLoginOrForceReg$2
  implements DialogInterface.OnClickListener
{
  MobileLoginOrForceReg$2(MobileLoginOrForceReg paramMobileLoginOrForceReg, String paramString1, String paramString2, m paramm, Boolean paramBoolean)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125205);
    final s locals = new s("", this.gEw, this.gEx, 0, "", MobileLoginOrForceReg.e(this.gEv), "", "", MobileLoginOrForceReg.h(this.gEv), MobileLoginOrForceReg.t(this.gEv), "", ((s)this.crb).ajn(), MobileLoginOrForceReg.r(this.gEv).getSecImgCode(), true, this.gEy.booleanValue());
    locals.ts(MobileLoginOrForceReg.i(this.gEv));
    locals.tt(MobileLoginOrForceReg.j(this.gEv));
    locals.lX(MobileLoginOrForceReg.m(this.gEv));
    g.Rg().a(locals, 0);
    paramDialogInterface = this.gEv;
    AppCompatActivity localAppCompatActivity = this.gEv.mController.ylL;
    this.gEv.getString(2131297061);
    paramDialogInterface.ehJ = h.b(localAppCompatActivity, this.gEv.getString(2131302326), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        AppMethodBeat.i(125204);
        g.Rg().c(locals);
        AppMethodBeat.o(125204);
      }
    });
    AppMethodBeat.o(125205);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.MobileLoginOrForceReg.2
 * JD-Core Version:    0.6.2
 */