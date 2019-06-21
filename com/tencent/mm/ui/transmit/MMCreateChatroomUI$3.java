package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.roomsdk.a.c.a;

final class MMCreateChatroomUI$3
  implements DialogInterface.OnCancelListener
{
  MMCreateChatroomUI$3(MMCreateChatroomUI paramMMCreateChatroomUI, a parama)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(35042);
    MMCreateChatroomUI.a(this.zIQ, false);
    this.zoT.cancel();
    AppMethodBeat.o(35042);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MMCreateChatroomUI.3
 * JD-Core Version:    0.6.2
 */