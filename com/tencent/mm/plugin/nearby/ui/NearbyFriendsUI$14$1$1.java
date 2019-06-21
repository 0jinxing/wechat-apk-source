package com.tencent.mm.plugin.nearby.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class NearbyFriendsUI$14$1$1
  implements DialogInterface.OnCancelListener
{
  NearbyFriendsUI$14$1$1(NearbyFriendsUI.14.1 param1)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(55455);
    g.Rg().c(NearbyFriendsUI.w(this.oQw.oQv.oQs));
    AppMethodBeat.o(55455);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI.14.1.1
 * JD-Core Version:    0.6.2
 */