package com.tencent.mm.ui.transmit;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

final class MMCreateChatroomUI$4
  implements DialogInterface.OnClickListener
{
  MMCreateChatroomUI$4(MMCreateChatroomUI paramMMCreateChatroomUI, LinkedList paramLinkedList)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(35043);
    MMCreateChatroomUI.a(this.zIQ, this.zoU);
    AppMethodBeat.o(35043);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MMCreateChatroomUI.4
 * JD-Core Version:    0.6.2
 */