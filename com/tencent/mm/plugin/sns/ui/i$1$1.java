package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class i$1$1
  implements Runnable
{
  int count = 20;

  i$1$1(i.1 param1, int paramInt1, int paramInt2, int paramInt3, View paramView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38164);
    this.rhI.rhF.nDp.setSelectionFromTop(this.sN + this.rhI.rhF.nDp.getHeaderViewsCount(), this.rhG + this.rhH);
    this.count -= 1;
    ab.d("MicroMsg.TimelineClickListener", "count: %s, delt: %s", new Object[] { Integer.valueOf(this.count), Integer.valueOf(Math.abs(this.val$view.getTop() - (this.rhG + this.rhH))) });
    if ((this.count <= 0) || (Math.abs(this.val$view.getTop() - (this.rhG + this.rhH)) < 5))
    {
      ab.d("MicroMsg.TimelineClickListener", "count: %s", new Object[] { Integer.valueOf(this.count) });
      this.rhI.rhF.qPr.notifyDataSetChanged();
      AppMethodBeat.o(38164);
    }
    while (true)
    {
      return;
      new ak().postDelayed(this, 5L);
      AppMethodBeat.o(38164);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.i.1.1
 * JD-Core Version:    0.6.2
 */