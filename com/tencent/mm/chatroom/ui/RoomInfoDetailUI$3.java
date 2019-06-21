package com.tencent.mm.chatroom.ui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.bf.a;

final class RoomInfoDetailUI$3
  implements bf.a
{
  RoomInfoDetailUI$3(RoomInfoDetailUI paramRoomInfoDetailUI, ProgressDialog paramProgressDialog)
  {
  }

  public final boolean JU()
  {
    AppMethodBeat.i(104190);
    boolean bool = RoomInfoDetailUI.a(this.ekA);
    AppMethodBeat.o(104190);
    return bool;
  }

  public final void JV()
  {
    AppMethodBeat.i(104191);
    if (this.eiD != null)
      this.eiD.dismiss();
    AppMethodBeat.o(104191);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomInfoDetailUI.3
 * JD-Core Version:    0.6.2
 */