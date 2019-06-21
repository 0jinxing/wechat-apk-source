package com.tencent.mm.ui.chatting.c;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.k;
import com.tencent.mm.az.e;
import com.tencent.mm.g.a.qc;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.modelstat.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.pluginsdk.model.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;

final class aa$2
  implements DialogInterface.OnClickListener
{
  aa$2(aa paramaa, bi parambi)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(31581);
    if (this.fku.bws())
      j.aiC(this.fku.field_imgPath);
    bf.fm(this.fku.field_msgId);
    if (this.fku.bAA())
      b.fRa.c(this.fku, k.k(this.fku));
    while (true)
    {
      ab.i("MicroMsg.ChattingUI.MessBoxComponent", "delete msg, id:%d", new Object[] { Long.valueOf(this.fku.field_msgId) });
      if (!this.yQZ.cgL.getTalkerUserName().equals("medianote"))
      {
        aw.ZK();
        c.XL().c(new e(this.fku.field_talker, this.fku.field_msgSvrId));
      }
      if ((this.fku.field_status == 1) && (this.fku.field_isSend == 1))
      {
        ab.d("MicroMsg.ChattingUI.MessBoxComponent", "delete a sending msg, publish SendMsgFailEvent");
        paramDialogInterface = new qc();
        paramDialogInterface.cMs.csG = this.fku;
        com.tencent.mm.sdk.b.a.xxA.m(paramDialogInterface);
      }
      AppMethodBeat.o(31581);
      return;
      b.fRa.E(this.fku);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.c.aa.2
 * JD-Core Version:    0.6.2
 */