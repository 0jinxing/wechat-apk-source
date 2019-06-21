package com.tencent.mm.plugin.nearby.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class NearbyFriendsUI$3
  implements DialogInterface.OnCancelListener
{
  NearbyFriendsUI$3(NearbyFriendsUI paramNearbyFriendsUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(55444);
    g.Rg().c(NearbyFriendsUI.y(this.oQs));
    AppMethodBeat.o(55444);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI.3
 * JD-Core Version:    0.6.2
 */