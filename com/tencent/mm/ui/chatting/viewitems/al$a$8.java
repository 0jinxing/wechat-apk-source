package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.c.b.ah;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;

final class al$a$8
  implements DialogInterface.OnClickListener
{
  al$a$8(al.a parama, a parama1, bi parambi)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(33294);
    paramDialogInterface = new Intent(this.zbG.yTx.getContext(), MsgRetransmitUI.class);
    String str = ((ah)this.zbG.aF(ah.class)).bm(this.fku);
    if (this.fku.dtr())
    {
      paramDialogInterface.putExtra("Retr_Msg_content", str);
      paramDialogInterface.putExtra("Retr_Msg_Type", 6);
    }
    while (true)
    {
      this.zbG.yTx.getContext().startActivity(paramDialogInterface);
      AppMethodBeat.o(33294);
      return;
      paramDialogInterface.putExtra("Retr_Msg_content", str);
      paramDialogInterface.putExtra("Retr_Msg_Type", 4);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.al.a.8
 * JD-Core Version:    0.6.2
 */