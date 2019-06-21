package com.tencent.mm.plugin.expt.roomexpt;

import android.widget.ArrayAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RoomExptDebugUI$7
  implements Runnable
{
  RoomExptDebugUI$7(RoomExptDebugUI paramRoomExptDebugUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(73597);
    RoomExptDebugUI.d(this.lOM).notifyDataSetChanged();
    RoomExptDebugUI.c(this.lOM);
    AppMethodBeat.o(73597);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.roomexpt.RoomExptDebugUI.7
 * JD-Core Version:    0.6.2
 */