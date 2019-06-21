package com.tencent.mm.plugin.nearby.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.sdk.platformtools.ab;

final class NearbyFriendsUI$7
  implements DialogInterface.OnCancelListener
{
  NearbyFriendsUI$7(NearbyFriendsUI paramNearbyFriendsUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(55447);
    this.oQs.eVT = true;
    com.tencent.mm.plugin.report.service.g.BP(11);
    if (NearbyFriendsUI.b(this.oQs) != null)
      com.tencent.mm.kernel.g.Rg().c(NearbyFriendsUI.b(this.oQs));
    ab.i("MicroMsg.NearbyFriend", "[MonsterzDai]  [loading cancel] cancel in loading");
    if (!NearbyFriendsUI.c(this.oQs))
    {
      this.oQs.finish();
      ab.i("MicroMsg.NearbyFriend", "[MonsterzDai]  [loading cancel] cancel in first loading");
    }
    AppMethodBeat.o(55447);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI.7
 * JD-Core Version:    0.6.2
 */