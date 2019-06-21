package com.tencent.mm.plugin.fts.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;

final class FTSMainUI$6
  implements DialogInterface.OnCancelListener
{
  FTSMainUI$6(FTSMainUI paramFTSMainUI, com.tencent.mm.plugin.messenger.a.f paramf, com.tencent.mm.ai.f paramf1)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(61871);
    g.Rg().c(this.mIc);
    g.Rg().b(106, this.mIi);
    FTSMainUI.p(this.mJJ);
    AppMethodBeat.o(61871);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSMainUI.6
 * JD-Core Version:    0.6.2
 */