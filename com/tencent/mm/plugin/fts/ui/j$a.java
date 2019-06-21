package com.tencent.mm.plugin.fts.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.d.e;
import java.util.Iterator;
import java.util.List;

final class j$a
  implements Runnable
{
  private e mJd;
  private String query;

  j$a(j paramj, e parame, String paramString)
  {
    this.query = paramString;
    this.mJd = parame;
  }

  public final void run()
  {
    AppMethodBeat.i(61851);
    if ((!j.a(this.mJc)) && (((e)j.b(this.mJc).get(j.b(this.mJc).size() - 1)).getType() == this.mJd.getType()))
      j.c(this.mJc);
    Object localObject = j.b(this.mJc).iterator();
    for (int i = 0; ((Iterator)localObject).hasNext(); i = ((e)((Iterator)localObject).next()).vY(i));
    this.mJc.setCount(i);
    this.mJc.notifyDataSetChanged();
    localObject = this.mJc;
    ((j)localObject).T(i, j.d((j)localObject));
    if (j.d(this.mJc))
      j.e(this.mJc).mLr = System.currentTimeMillis();
    AppMethodBeat.o(61851);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.ui.j.a
 * JD-Core Version:    0.6.2
 */