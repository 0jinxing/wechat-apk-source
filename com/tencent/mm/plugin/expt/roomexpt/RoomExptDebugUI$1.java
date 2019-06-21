package com.tencent.mm.plugin.expt.roomexpt;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.al;

final class RoomExptDebugUI$1
  implements View.OnClickListener
{
  RoomExptDebugUI$1(RoomExptDebugUI paramRoomExptDebugUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(73590);
    g.RS().aa(new RoomExptDebugUI.1.1(this));
    AppMethodBeat.o(73590);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.roomexpt.RoomExptDebugUI.1
 * JD-Core Version:    0.6.2
 */