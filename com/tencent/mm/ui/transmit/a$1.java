package com.tencent.mm.ui.transmit;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import java.util.ArrayList;
import java.util.List;

final class a$1
  implements com.tencent.mm.plugin.fts.a.l
{
  a$1(a parama)
  {
  }

  public final void b(j paramj)
  {
    AppMethodBeat.i(35023);
    a.a locala = new a.a(this.zIG, (byte)0);
    locala.query = paramj.mAJ.query;
    locala.mDz = paramj.mDz;
    locala.mEy = paramj.mEy;
    if ((locala.mEy == null) || (locala.mEy.size() == 0))
    {
      paramj = new com.tencent.mm.plugin.fts.a.a.l();
      paramj.mDx = "no_result​";
      locala.mEy = new ArrayList();
      locala.mEy.add(paramj);
    }
    a.a(this.zIG).add(locala);
    a.b(this.zIG);
    AppMethodBeat.o(35023);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.a.1
 * JD-Core Version:    0.6.2
 */