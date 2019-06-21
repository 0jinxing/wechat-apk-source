package com.tencent.mm.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class SingleChatInfoUI$8
  implements DialogInterface.OnClickListener
{
  SingleChatInfoUI$8(SingleChatInfoUI paramSingleChatInfoUI, ProgressDialog paramProgressDialog)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29875);
    h.pYm.e(14553, new Object[] { Integer.valueOf(6), Integer.valueOf(3), SingleChatInfoUI.e(this.yqm) });
    this.eiD.show();
    SingleChatInfoUI.pZ(false);
    SingleChatInfoUI.a(this.yqm, this.eiD);
    AppMethodBeat.o(29875);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.SingleChatInfoUI.8
 * JD-Core Version:    0.6.2
 */