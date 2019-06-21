package com.tencent.mm.plugin.expt.roomexpt;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RoomExptDebugUI$4
  implements View.OnClickListener
{
  RoomExptDebugUI$4(RoomExptDebugUI paramRoomExptDebugUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(73594);
    a.brg().brj();
    RoomExptDebugUI.d(this.lOM).clear();
    Toast.makeText(this.lOM, "del db finish", 0).show();
    AppMethodBeat.o(73594);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.roomexpt.RoomExptDebugUI.4
 * JD-Core Version:    0.6.2
 */