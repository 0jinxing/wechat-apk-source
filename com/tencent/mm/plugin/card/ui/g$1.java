package com.tencent.mm.plugin.card.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class g$1
  implements View.OnClickListener
{
  g$1(g paramg)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(88545);
    int i = ((Integer)paramView.getTag()).intValue();
    paramView = this.kmf;
    if (((Boolean)paramView.kmd.get(i)).booleanValue())
      paramView.kmd.set(i, Boolean.FALSE);
    while (true)
    {
      paramView.notifyDataSetChanged();
      AppMethodBeat.o(88545);
      return;
      paramView.kmd.set(i, Boolean.TRUE);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.g.1
 * JD-Core Version:    0.6.2
 */