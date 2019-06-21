package com.tencent.mm.ui.gridviewheaders;

import com.tencent.matrix.trace.core.AppMethodBeat;

class GridHeadersGridView$f
{
  private int yxj;

  private GridHeadersGridView$f(GridHeadersGridView paramGridHeadersGridView)
  {
  }

  public final void dJk()
  {
    AppMethodBeat.i(107371);
    this.yxj = GridHeadersGridView.b(this.zyQ);
    AppMethodBeat.o(107371);
  }

  public final boolean dJl()
  {
    AppMethodBeat.i(107372);
    boolean bool;
    if ((this.zyQ.hasWindowFocus()) && (GridHeadersGridView.c(this.zyQ) == this.yxj))
    {
      bool = true;
      AppMethodBeat.o(107372);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(107372);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.gridviewheaders.GridHeadersGridView.f
 * JD-Core Version:    0.6.2
 */