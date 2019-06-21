package com.tencent.mm.plugin.fts.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public final class j
{
  public int bFZ;
  public i mAJ;
  public g mDz;
  public a mEx;
  public List<l> mEy;

  public j(i parami)
  {
    AppMethodBeat.i(114272);
    this.mEy = new ArrayList();
    this.mAJ = parami;
    AppMethodBeat.o(114272);
  }

  public final String toString()
  {
    int i = 0;
    AppMethodBeat.i(114273);
    int j = this.bFZ;
    if (this.mEy == null);
    while (true)
    {
      String str = String.format("{resultCode: %d, resultSize: %d}", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
      AppMethodBeat.o(114273);
      return str;
      i = this.mEy.size();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.a.j
 * JD-Core Version:    0.6.2
 */