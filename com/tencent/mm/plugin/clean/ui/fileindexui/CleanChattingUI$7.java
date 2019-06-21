package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.app.ProgressDialog;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class CleanChattingUI$7
  implements Runnable
{
  CleanChattingUI$7(CleanChattingUI paramCleanChattingUI, int paramInt1, int paramInt2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18786);
    CleanChattingUI.g(this.kxM).setMessage(this.kxM.getString(2131298315, new Object[] { this.fzv * 100 / this.fFn + "%" }));
    AppMethodBeat.o(18786);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingUI.7
 * JD-Core Version:    0.6.2
 */