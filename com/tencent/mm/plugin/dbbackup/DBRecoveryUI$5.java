package com.tencent.mm.plugin.dbbackup;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.plugin.dbbackup.a.a.c;
import com.tencent.mm.plugin.dbbackup.a.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

final class DBRecoveryUI$5
  implements a.c
{
  private Collection<String> kIl;
  private int kIm;

  DBRecoveryUI$5(DBRecoveryUI paramDBRecoveryUI)
  {
    AppMethodBeat.i(18948);
    com.tencent.mm.kernel.g.RN();
    this.kIm = a.QF();
    AppMethodBeat.o(18948);
  }

  private void bhM()
  {
    AppMethodBeat.i(18949);
    if (this.kIl == null)
      this.kIl = b.bib();
    AppMethodBeat.o(18949);
  }

  public final Collection<byte[]> bhN()
  {
    AppMethodBeat.i(18950);
    bhM();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.kIl.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(com.tencent.mm.a.g.y((str + this.kIm).getBytes()));
    }
    AppMethodBeat.o(18950);
    return localArrayList;
  }

  public final Collection<byte[]> bhO()
  {
    AppMethodBeat.i(18951);
    bhM();
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.kIl.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localArrayList.add(com.tencent.mm.a.g.x((str + this.kIm).getBytes()).substring(0, 7).getBytes());
    }
    AppMethodBeat.o(18951);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.DBRecoveryUI.5
 * JD-Core Version:    0.6.2
 */