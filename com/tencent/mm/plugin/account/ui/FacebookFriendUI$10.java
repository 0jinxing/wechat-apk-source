package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.ab;
import com.tencent.mm.sdk.platformtools.ap;

final class FacebookFriendUI$10
  implements DialogInterface.OnCancelListener
{
  FacebookFriendUI$10(FacebookFriendUI paramFacebookFriendUI, ap paramap, ab paramab)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(124817);
    this.gBi.stopTimer();
    g.Rg().c(this.gBh);
    AppMethodBeat.o(124817);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.FacebookFriendUI.10
 * JD-Core Version:    0.6.2
 */