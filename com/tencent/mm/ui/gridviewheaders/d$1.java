package com.tencent.mm.ui.gridviewheaders;

import android.database.DataSetObserver;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$1 extends DataSetObserver
{
  d$1(d paramd)
  {
  }

  public final void onChanged()
  {
    AppMethodBeat.i(107405);
    this.zyW.notifyDataSetChanged();
    AppMethodBeat.o(107405);
  }

  public final void onInvalidated()
  {
    AppMethodBeat.i(107406);
    this.zyW.notifyDataSetInvalidated();
    AppMethodBeat.o(107406);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.gridviewheaders.d.1
 * JD-Core Version:    0.6.2
 */