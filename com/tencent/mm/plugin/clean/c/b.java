package com.tencent.mm.plugin.clean.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;

public final class b
  implements Comparable<b>
{
  public long jrb;
  public ArrayList<a> kwf;
  public String username;

  public final boolean bfI()
  {
    AppMethodBeat.i(18666);
    this.jrb = 0L;
    Iterator localIterator = this.kwf.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      this.jrb += locala.size;
    }
    boolean bool;
    if (this.kwf.size() == 0)
    {
      bool = false;
      AppMethodBeat.o(18666);
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(18666);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.c.b
 * JD-Core Version:    0.6.2
 */