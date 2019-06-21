package com.tencent.mm.plugin.masssend.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.masssend.a.f;

final class MassSendMsgUI$6
  implements DialogInterface.OnCancelListener
{
  MassSendMsgUI$6(MassSendMsgUI paramMassSendMsgUI, f paramf)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(22830);
    aw.Rg().c(this.ooA);
    AppMethodBeat.o(22830);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendMsgUI.6
 * JD-Core Version:    0.6.2
 */