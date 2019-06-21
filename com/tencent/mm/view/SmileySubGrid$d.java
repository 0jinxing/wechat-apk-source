package com.tencent.mm.view;

import com.tencent.matrix.trace.core.AppMethodBeat;

class SmileySubGrid$d
{
  private int yxj;

  private SmileySubGrid$d(SmileySubGrid paramSmileySubGrid)
  {
  }

  public final void dJk()
  {
    AppMethodBeat.i(62958);
    this.yxj = SmileySubGrid.a(this.Abc);
    AppMethodBeat.o(62958);
  }

  public final boolean dJl()
  {
    AppMethodBeat.i(62959);
    boolean bool;
    if ((this.Abc.hasWindowFocus()) && (SmileySubGrid.b(this.Abc) == this.yxj))
    {
      bool = true;
      AppMethodBeat.o(62959);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(62959);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.SmileySubGrid.d
 * JD-Core Version:    0.6.2
 */