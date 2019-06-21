package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$2
  implements View.OnClickListener
{
  g$2(g paramg)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(26776);
    this.uPD.uPB.dismiss();
    this.uPD.mParentView.setVisibility(8);
    if (this.uPD.uPC != null)
      this.uPD.uPC.deE();
    AppMethodBeat.o(26776);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.manager.g.2
 * JD-Core Version:    0.6.2
 */