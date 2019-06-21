package com.tencent.mm.chatroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;

final class RoomUpgradeUI$5
  implements DialogInterface.OnCancelListener
{
  RoomUpgradeUI$5(RoomUpgradeUI paramRoomUpgradeUI)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(104240);
    if (RoomUpgradeUI.h(this.elb) != null)
    {
      g.RO().eJo.c(RoomUpgradeUI.h(this.elb));
      RoomUpgradeUI.i(this.elb);
    }
    this.elb.finish();
    AppMethodBeat.o(104240);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomUpgradeUI.5
 * JD-Core Version:    0.6.2
 */