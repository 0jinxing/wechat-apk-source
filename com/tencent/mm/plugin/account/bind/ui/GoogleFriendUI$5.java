package com.tencent.mm.plugin.account.bind.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class GoogleFriendUI$5
  implements DialogInterface.OnCancelListener
{
  GoogleFriendUI$5(GoogleFriendUI paramGoogleFriendUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(13654);
    GoogleFriendUI.c(this.gtp);
    g.Rg().c(GoogleFriendUI.d(this.gtp));
    AppMethodBeat.o(13654);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI.5
 * JD-Core Version:    0.6.2
 */