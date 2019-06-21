package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.bind.a.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class VerifyQQUI$3
  implements DialogInterface.OnClickListener
{
  VerifyQQUI$3(VerifyQQUI paramVerifyQQUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(13780);
    paramDialogInterface = new b(VerifyQQUI.c(this.guy), VerifyQQUI.d(this.guy), VerifyQQUI.e(this.guy).getSecImgSid(), VerifyQQUI.e(this.guy).getSecImgCode(), VerifyQQUI.e(this.guy).getSecImgEncryptKey(), VerifyQQUI.f(this.guy), VerifyQQUI.g(this.guy), true);
    g.Rg().a(paramDialogInterface, 0);
    VerifyQQUI localVerifyQQUI = this.guy;
    AppCompatActivity localAppCompatActivity = this.guy.mController.ylL;
    this.guy.getString(2131297620);
    VerifyQQUI.a(localVerifyQQUI, h.b(localAppCompatActivity, this.guy.getString(2131297611), true, new VerifyQQUI.3.1(this, paramDialogInterface)));
    AppMethodBeat.o(13780);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.VerifyQQUI.3
 * JD-Core Version:    0.6.2
 */