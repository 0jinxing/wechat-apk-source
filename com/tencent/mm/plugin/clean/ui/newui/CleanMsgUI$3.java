package com.tencent.mm.plugin.clean.ui.newui;

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
    AppMethodBeat.i(18890);
    this.kyS.startActivityForResult(new Intent(this.kyS, CleanChattingUI.class), 0);
    h.pYm.a(282L, 4L, 1L, false);
    AppMethodBeat.o(18890);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.CleanMsgUI.3
 * JD-Core Version:    0.6.2
 */