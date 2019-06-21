package com.tencent.mm.plugin.expt.roomexpt;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RoomExptDebugUI$3
  implements View.OnClickListener
{
  RoomExptDebugUI$3(RoomExptDebugUI paramRoomExptDebugUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(73593);
    a.brg().brk();
    RoomExptDebugUI.c(this.lOM);
    Toast.makeText(this.lOM, "reset finish", 0).show();
    AppMethodBeat.o(73593);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.roomexpt.RoomExptDebugUI.3
 * JD-Core Version:    0.6.2
 */