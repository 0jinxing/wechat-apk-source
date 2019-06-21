package com.tencent.mm.chatroom.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RoomUpgradeUI$2
  implements View.OnClickListener
{
  RoomUpgradeUI$2(RoomUpgradeUI paramRoomUpgradeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(104236);
    switch (RoomUpgradeUI.a(this.elb))
    {
    case 3:
    case 4:
    default:
    case 1:
    case 2:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(104236);
      while (true)
      {
        return;
        if (RoomUpgradeUI.b(this.elb))
        {
          b.a(this.elb, RoomUpgradeUI.c(this.elb), true);
          AppMethodBeat.o(104236);
        }
        else
        {
          RoomUpgradeUI.a(this.elb, true);
          AppMethodBeat.o(104236);
          continue;
          if (!RoomUpgradeUI.b(this.elb))
            break;
          RoomUpgradeUI.d(this.elb);
          AppMethodBeat.o(104236);
        }
      }
      RoomUpgradeUI.a(this.elb, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomUpgradeUI.2
 * JD-Core Version:    0.6.2
 */