package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.clean.c.j;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

final class CleanMsgUI$2
  implements View.OnClickListener
{
  CleanMsgUI$2(CleanMsgUI paramCleanMsgUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(18799);
    h.a(this.kyg, this.kyg.getString(2131298312, new Object[] { bo.my(j.bgd().kvX) }), "", this.kyg.getString(2131296994), this.kyg.getString(2131296868), new CleanMsgUI.2.1(this), null, 2131690384);
    AppMethodBeat.o(18799);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.CleanMsgUI.2
 * JD-Core Version:    0.6.2
 */