package com.tencent.mm.plugin.card.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.ui.base.o;

final class j$1
  implements View.OnClickListener
{
  j$1(j paramj)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88621);
    if ((paramView.getId() == 2131822257) || (paramView.getId() == 2131822263))
    {
      if ((this.knx.gKG != null) && (this.knx.gKG.isShowing()))
        this.knx.gKG.dismiss();
      if (!this.knx.kaS.aZF())
        this.knx.bdq();
    }
    AppMethodBeat.o(88621);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.j.1
 * JD-Core Version:    0.6.2
 */