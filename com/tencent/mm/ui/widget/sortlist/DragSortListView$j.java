package com.tencent.mm.ui.widget.sortlist;

import android.util.SparseIntArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

final class DragSortListView$j
{
  private int xCD;
  private SparseIntArray zVT;
  private ArrayList<Integer> zVU;

  private DragSortListView$j(DragSortListView paramDragSortListView)
  {
    AppMethodBeat.i(113051);
    this.zVT = new SparseIntArray(3);
    this.zVU = new ArrayList(3);
    this.xCD = 3;
    AppMethodBeat.o(113051);
  }

  public final void add(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(113052);
    int i = this.zVT.get(paramInt1, -1);
    if (i != paramInt2)
    {
      if (i != -1)
        break label87;
      if (this.zVT.size() == this.xCD)
        this.zVT.delete(((Integer)this.zVU.remove(0)).intValue());
    }
    while (true)
    {
      this.zVT.put(paramInt1, paramInt2);
      this.zVU.add(Integer.valueOf(paramInt1));
      AppMethodBeat.o(113052);
      return;
      label87: this.zVU.remove(Integer.valueOf(paramInt1));
    }
  }

  public final void clear()
  {
    AppMethodBeat.i(113054);
    this.zVT.clear();
    this.zVU.clear();
    AppMethodBeat.o(113054);
  }

  public final int get(int paramInt)
  {
    AppMethodBeat.i(113053);
    paramInt = this.zVT.get(paramInt, -1);
    AppMethodBeat.o(113053);
    return paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.sortlist.DragSortListView.j
 * JD-Core Version:    0.6.2
 */