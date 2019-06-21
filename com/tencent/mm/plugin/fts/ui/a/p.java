package com.tencent.mm.plugin.fts.ui.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d.a.a.b;

public final class p extends m
{
  public l mKp;
  private p.a mLj;
  public int showType;

  public p(int paramInt)
  {
    super(paramInt);
    AppMethodBeat.i(62028);
    this.mLj = new p.a(this);
    AppMethodBeat.o(62028);
  }

  public final a.b Ps()
  {
    return this.mLj;
  }

  public final int bAw()
  {
    int i = 2;
    if (this.mKY < 2)
      i = 0;
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.a.p
 * JD-Core Version:    0.6.2
 */