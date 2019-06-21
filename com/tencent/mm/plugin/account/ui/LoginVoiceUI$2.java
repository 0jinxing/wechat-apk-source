package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.q;

final class LoginVoiceUI$2
  implements DialogInterface.OnCancelListener
{
  LoginVoiceUI$2(LoginVoiceUI paramLoginVoiceUI, q paramq)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(125074);
    g.Rg().c(this.gBH);
    this.gDg.aqW();
    AppMethodBeat.o(125074);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LoginVoiceUI.2
 * JD-Core Version:    0.6.2
 */