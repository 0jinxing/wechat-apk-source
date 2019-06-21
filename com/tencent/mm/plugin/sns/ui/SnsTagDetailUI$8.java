package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.model.w;

final class SnsTagDetailUI$8
  implements DialogInterface.OnCancelListener
{
  SnsTagDetailUI$8(SnsTagDetailUI paramSnsTagDetailUI, w paramw)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(39351);
    g.RQ();
    g.RO().eJo.c(this.rvl);
    AppMethodBeat.o(39351);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTagDetailUI.8
 * JD-Core Version:    0.6.2
 */