package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;

final class CleanMsgUI$3
  implements View.OnClickListener
{
  CleanMsgUI$3(CleanMsgUI paramCleanMsgUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(18800);
    this.kyg.startActivityForResult(new Intent(this.kyg, CleanChattingUI.class), 0);
    h.pYm.a(714L, 12L, 1L, false);
    AppMethodBeat.o(18800);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.CleanMsgUI.3
 * JD-Core Version:    0.6.2
 */