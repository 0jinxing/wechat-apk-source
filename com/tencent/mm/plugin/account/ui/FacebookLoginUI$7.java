package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.d;

final class FacebookLoginUI$7
  implements DialogInterface.OnClickListener
{
  FacebookLoginUI$7(FacebookLoginUI paramFacebookLoginUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(124840);
    if (d.vxr)
    {
      FacebookLoginUI.e(this.gBp);
      AppMethodBeat.o(124840);
    }
    while (true)
    {
      return;
      FacebookLoginUI.f(this.gBp);
      AppMethodBeat.o(124840);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.FacebookLoginUI.7
 * JD-Core Version:    0.6.2
 */