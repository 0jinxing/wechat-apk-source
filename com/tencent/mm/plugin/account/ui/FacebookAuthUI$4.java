package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class FacebookAuthUI$4
  implements DialogInterface.OnCancelListener
{
  FacebookAuthUI$4(FacebookAuthUI paramFacebookAuthUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(124777);
    if (FacebookAuthUI.a(this.gAZ) != null)
      g.Rg().c(FacebookAuthUI.a(this.gAZ));
    AppMethodBeat.o(124777);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.FacebookAuthUI.4
 * JD-Core Version:    0.6.2
 */