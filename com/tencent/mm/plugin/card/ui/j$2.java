package com.tencent.mm.plugin.card.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.o;

final class j$2
  implements View.OnClickListener
{
  j$2(j paramj)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88622);
    if ((this.knx.gKG != null) && (this.knx.gKG.isShowing()))
      this.knx.gKG.dismiss();
    AppMethodBeat.o(88622);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.j.2
 * JD-Core Version:    0.6.2
 */