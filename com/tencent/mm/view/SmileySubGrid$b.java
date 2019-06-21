package com.tencent.mm.view;

import android.view.View;
import android.widget.ListAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SmileySubGrid$b extends SmileySubGrid.d
  implements Runnable
{
  View Dg;
  int zyT;

  private SmileySubGrid$b(SmileySubGrid paramSmileySubGrid)
  {
    super(paramSmileySubGrid, (byte)0);
  }

  public final void run()
  {
    AppMethodBeat.i(62956);
    ab.i("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "Click run");
    ListAdapter localListAdapter = this.Abc.getAdapter();
    int i = this.zyT;
    if ((localListAdapter != null) && (this.Abc.getCount() > 0) && (i != -1) && (i < localListAdapter.getCount()) && (dJl()))
    {
      ab.d("MicroMsg.emoji.SmileyPanel.SmileySubGrid", "PerformClick performItemClick position:[%d] id:[%d] ", new Object[] { Integer.valueOf(i), Long.valueOf(localListAdapter.getItemId(i)) });
      this.Abc.performItemClick(this.Dg, i, localListAdapter.getItemId(i));
    }
    AppMethodBeat.o(62956);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.SmileySubGrid.b
 * JD-Core Version:    0.6.2
 */