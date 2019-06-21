package com.tencent.mm.plugin.shake.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.shake.e.c.a;

final class TVInfoUI$1
  implements View.OnClickListener
{
  TVInfoUI$1(TVInfoUI paramTVInfoUI, c.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(24910);
    h.pYm.e(10987, new Object[] { Integer.valueOf(2), this.qwF.field_playstatid, "", "" });
    TVInfoUI.a(this.qwG, this.qwF.field_playurl);
    AppMethodBeat.o(24910);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.ui.TVInfoUI.1
 * JD-Core Version:    0.6.2
 */