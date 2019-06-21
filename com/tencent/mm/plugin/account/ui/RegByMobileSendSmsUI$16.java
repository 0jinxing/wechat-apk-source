package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class RegByMobileSendSmsUI$16
  implements DialogInterface.OnClickListener
{
  RegByMobileSendSmsUI$16(RegByMobileSendSmsUI paramRegByMobileSendSmsUI, s params)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125412);
    paramDialogInterface = new s("", RegByMobileSendSmsUI.g(this.gGq), RegByMobileSendSmsUI.h(this.gGq), 0, "", RegByMobileSendSmsUI.i(this.gGq), "", "", RegByMobileSendSmsUI.j(this.gGq), 1, "", this.gGr.ajn(), RegByMobileSendSmsUI.k(this.gGq).getSecImgCode(), true, RegByMobileSendSmsUI.l(this.gGq));
    paramDialogInterface.ts(RegByMobileSendSmsUI.m(this.gGq));
    paramDialogInterface.tt(RegByMobileSendSmsUI.n(this.gGq));
    paramDialogInterface.lX(1);
    g.Rg().a(paramDialogInterface, 0);
    RegByMobileSendSmsUI localRegByMobileSendSmsUI = this.gGq;
    AppCompatActivity localAppCompatActivity = this.gGq.mController.ylL;
    this.gGq.getString(2131297061);
    RegByMobileSendSmsUI.a(localRegByMobileSendSmsUI, h.b(localAppCompatActivity, this.gGq.getString(2131302326), true, new RegByMobileSendSmsUI.16.1(this, paramDialogInterface)));
    AppMethodBeat.o(125412);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileSendSmsUI.16
 * JD-Core Version:    0.6.2
 */