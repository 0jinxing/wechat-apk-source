package com.tencent.mm.ui.chatting.viewitems;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;

final class f$c$1
  implements DialogInterface.OnClickListener
{
  f$c$1(f.c paramc, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(32883);
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("key_scene", 1);
    paramDialogInterface.putExtra("key_receiver", this.uHJ);
    paramDialogInterface.putExtra("key_receivertitle", this.zdm);
    paramDialogInterface.putExtra("key_sendertitle", this.zdn);
    paramDialogInterface.putExtra("key_sender_des", this.zdo);
    paramDialogInterface.putExtra("key_receiver_des", this.zdp);
    paramDialogInterface.putExtra("key_url", this.val$url);
    paramDialogInterface.putExtra("key_templateid", this.hWj);
    paramDialogInterface.putExtra("key_sceneid", this.zdq);
    d.b(this.zbG.yTx.getContext(), "wallet_index", ".ui.WalletSendC2CMsgUI", paramDialogInterface);
    AppMethodBeat.o(32883);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.f.c.1
 * JD-Core Version:    0.6.2
 */