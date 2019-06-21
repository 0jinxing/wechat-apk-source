package com.tencent.mm.plugin.wenote.model.nativenote.c;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d
{
  public int coc;
  public int endPos;
  public int startOffset;
  public int uRf;

  public d()
  {
    AppMethodBeat.i(26855);
    this.coc = -1;
    this.startOffset = -1;
    this.endPos = -1;
    this.uRf = -1;
    set(-1, -1, -1, -1);
    AppMethodBeat.o(26855);
  }

  public d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(26856);
    this.coc = -1;
    this.startOffset = -1;
    this.endPos = -1;
    this.uRf = -1;
    set(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(26856);
  }

  public final int dfa()
  {
    int i = 1;
    AppMethodBeat.i(26857);
    if ((this.coc < 0) || (this.startOffset < 0) || (this.endPos < 0) || (this.uRf < 0) || (this.coc > this.endPos) || ((this.coc == this.endPos) && (this.startOffset > this.uRf)))
    {
      AppMethodBeat.o(26857);
      i = 0;
    }
    while (true)
    {
      return i;
      com.tencent.mm.plugin.wenote.model.a.c localc1 = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(this.coc);
      com.tencent.mm.plugin.wenote.model.a.c localc2 = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.dem().Ke(this.endPos);
      if ((localc1 == null) || (localc2 == null))
      {
        AppMethodBeat.o(26857);
        i = 0;
      }
      else if ((this.coc == this.endPos) && (this.startOffset == this.uRf))
      {
        AppMethodBeat.o(26857);
      }
      else if ((this.coc == this.endPos) && (localc1.getType() == 1))
      {
        i = 2;
        AppMethodBeat.o(26857);
      }
      else
      {
        i = 3;
        AppMethodBeat.o(26857);
      }
    }
  }

  public final void set(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.coc = paramInt1;
    this.startOffset = paramInt2;
    this.endPos = paramInt3;
    this.uRf = paramInt4;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.nativenote.c.d
 * JD-Core Version:    0.6.2
 */