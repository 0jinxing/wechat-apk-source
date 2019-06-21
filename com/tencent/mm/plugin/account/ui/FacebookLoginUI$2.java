package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class FacebookLoginUI$2
  implements DialogInterface.OnCancelListener
{
  FacebookLoginUI$2(FacebookLoginUI paramFacebookLoginUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(124831);
    if (FacebookLoginUI.h(this.gBp) != null)
      g.Rg().c(FacebookLoginUI.h(this.gBp));
    AppMethodBeat.o(124831);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.FacebookLoginUI.2
 * JD-Core Version:    0.6.2
 */