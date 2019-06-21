package com.tencent.mm.plugin.fts.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.openim.b.n;

final class FTSAddWw$6
  implements DialogInterface.OnCancelListener
{
  FTSAddWw$6(FTSAddWw paramFTSAddWw, n paramn, f paramf)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(61758);
    g.Rg().c(this.mIh);
    g.Rg().b(372, this.mIi);
    FTSAddWw.h(this.mIg);
    AppMethodBeat.o(61758);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.FTSAddWw.6
 * JD-Core Version:    0.6.2
 */