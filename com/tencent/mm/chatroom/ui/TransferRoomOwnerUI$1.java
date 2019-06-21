package com.tencent.mm.chatroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.t;
import com.tencent.mm.ui.base.h;

final class TransferRoomOwnerUI$1
  implements DialogInterface.OnClickListener
{
  TransferRoomOwnerUI$1(TransferRoomOwnerUI paramTransferRoomOwnerUI, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(104462);
    if (t.mP(this.eoh.ejD));
    for (paramDialogInterface = new com.tencent.mm.openim.b.p(this.eoh.ejD, this.eiH); ; paramDialogInterface = new com.tencent.mm.chatroom.c.p(this.eoh.ejD, this.eiH))
    {
      g.RO().eJo.a(paramDialogInterface, 0);
      paramDialogInterface = this.eoh;
      TransferRoomOwnerUI localTransferRoomOwnerUI = this.eoh;
      this.eoh.getString(2131297061);
      TransferRoomOwnerUI.a(paramDialogInterface, h.b(localTransferRoomOwnerUI, this.eoh.getString(2131302640), false, null));
      AppMethodBeat.o(104462);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.TransferRoomOwnerUI.1
 * JD-Core Version:    0.6.2
 */