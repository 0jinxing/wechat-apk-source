package com.tencent.mm.plugin.sns.ui.item;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.a.b.g;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.d.b;

final class i$5
  implements View.OnClickListener
{
  i$5(i parami, au paramau, int paramInt, i.b paramb)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(40159);
    this.rHs.qOL.rKn.onClick(paramView);
    if (this.rHo > 0)
      this.rHs.rxP.rhm.jQ(this.rIZ.rHt);
    AppMethodBeat.o(40159);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.i.5
 * JD-Core Version:    0.6.2
 */