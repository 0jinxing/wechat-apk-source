package com.tencent.mm.ui.gridviewheaders;

import android.database.DataSetObserver;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class c$1 extends DataSetObserver
{
  c$1(c paramc)
  {
  }

  public final void onChanged()
  {
    int i = 0;
    AppMethodBeat.i(107329);
    c localc = this.zys;
    localc.mCount = 0;
    int j = localc.zyo.dJh();
    if (j == 0)
      localc.mCount = localc.zyo.getCount();
    while (true)
    {
      this.zys.notifyDataSetChanged();
      AppMethodBeat.o(107329);
      return;
      while (i < j)
      {
        localc.mCount += localc.zyo.PA(i) + localc.mNumColumns;
        i++;
      }
    }
  }

  public final void onInvalidated()
  {
    AppMethodBeat.i(107330);
    c.a(this.zys).clear();
    this.zys.notifyDataSetInvalidated();
    AppMethodBeat.o(107330);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.gridviewheaders.c.1
 * JD-Core Version:    0.6.2
 */