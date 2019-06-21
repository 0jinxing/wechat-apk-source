package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.report.service.h;

final class SingleChatInfoUI$7
  implements DialogInterface.OnClickListener
{
  SingleChatInfoUI$7(SingleChatInfoUI paramSingleChatInfoUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(29874);
    h.pYm.e(14553, new Object[] { Integer.valueOf(6), Integer.valueOf(4), SingleChatInfoUI.e(this.yqm) });
    SingleChatInfoUI.pZ(true);
    if (!SingleChatInfoUI.f(this.yqm))
    {
      paramDialogInterface = LauncherUI.getInstance();
      if (paramDialogInterface != null)
        paramDialogInterface.startChatting(SingleChatInfoUI.g(this.yqm).field_username, null, true);
      AppMethodBeat.o(29874);
    }
    while (true)
    {
      return;
      this.yqm.finish();
      AppMethodBeat.o(29874);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.SingleChatInfoUI.7
 * JD-Core Version:    0.6.2
 */