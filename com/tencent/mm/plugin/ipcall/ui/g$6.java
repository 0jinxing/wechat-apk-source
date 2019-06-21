package com.tencent.mm.plugin.ipcall.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class g$6
  implements View.OnClickListener
{
  g$6(g paramg)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(22156);
    g.a locala = (g.a)paramView.getTag();
    if (!locala.nDc);
    for (locala.nDc = true; ; locala.nDc = false)
    {
      g.a(this.nDb, (TextView)paramView);
      AppMethodBeat.o(22156);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.g.6
 * JD-Core Version:    0.6.2
 */