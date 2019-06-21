package com.tencent.mm.chatroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMEditText;

final class RoomCardUI$11
  implements DialogInterface.OnClickListener
{
  RoomCardUI$11(RoomCardUI paramRoomCardUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(104155);
    RoomCardUI localRoomCardUI = this.ekm;
    paramDialogInterface = this.ekm.mController.ylL;
    this.ekm.getString(2131297061);
    RoomCardUI.a(localRoomCardUI, h.b(paramDialogInterface, this.ekm.getString(2131302623), false, null));
    if (RoomCardUI.e(this.ekm))
    {
      RoomCardUI.f(this.ekm);
      RoomCardUI.a(this.ekm, RoomCardUI.b(this.ekm).getText().toString());
    }
    AppMethodBeat.o(104155);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomCardUI.11
 * JD-Core Version:    0.6.2
 */