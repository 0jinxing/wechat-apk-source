package com.tencent.mm.plugin.fts.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class a
{
  public List<a> bnR;
  public int end;
  public a mEO;
  public boolean mEP;
  public int start;

  public a(int paramInt1, int paramInt2, a parama)
  {
    this.start = paramInt1;
    this.end = paramInt2;
    this.mEO = parama;
  }

  public final String toString()
  {
    AppMethodBeat.i(114283);
    String str;
    if (this.mEO == null)
    {
      str = String.format("[%d,%d]", new Object[] { Integer.valueOf(this.start), Integer.valueOf(this.end) });
      AppMethodBeat.o(114283);
    }
    while (true)
    {
      return str;
      str = String.format("%s [%d,%d]", new Object[] { this.mEO, Integer.valueOf(this.start), Integer.valueOf(this.end) });
      AppMethodBeat.o(114283);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.b.a
 * JD-Core Version:    0.6.2
 */