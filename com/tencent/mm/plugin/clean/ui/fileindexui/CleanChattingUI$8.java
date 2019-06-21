package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.app.ProgressDialog;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

final class CleanChattingUI$8
  implements Runnable
{
  CleanChattingUI$8(CleanChattingUI paramCleanChattingUI, long paramLong)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18787);
    CleanChattingUI.g(this.kxM).dismiss();
    h.b(this.kxM, this.kxM.getString(2131298296, new Object[] { bo.ga(this.kxG) }), "", true);
    CleanChattingUI.e(this.kxM).setText(this.kxM.getString(2131296518, new Object[] { " " }));
    AppMethodBeat.o(18787);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingUI.8
 * JD-Core Version:    0.6.2
 */