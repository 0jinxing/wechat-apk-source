package com.tencent.mm.chatroom.ui;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ao.b.a;

final class RoomUpgradeResultUI$3
  implements ao.b.a
{
  RoomUpgradeResultUI$3(RoomUpgradeResultUI paramRoomUpgradeResultUI, String paramString)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(104223);
    if (paramBoolean)
      RoomUpgradeResultUI.b(this.ekR).post(new RoomUpgradeResultUI.3.1(this));
    AppMethodBeat.o(104223);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomUpgradeResultUI.3
 * JD-Core Version:    0.6.2
 */