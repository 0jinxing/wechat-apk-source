package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class CleanNewUI$2
  implements View.OnClickListener
{
  CleanNewUI$2(CleanNewUI paramCleanNewUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(18812);
    ab.i("MicroMsg.CleanNewUI", "%s goto clean msg ui", new Object[] { CleanNewUI.a(this.kyC) });
    h.pYm.a(714L, 2L, 1L, false);
    this.kyC.startActivityForResult(new Intent(this.kyC, CleanMsgUI.class), 0);
    AppMethodBeat.o(18812);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI.2
 * JD-Core Version:    0.6.2
 */