package com.tencent.mm.plugin.appbrand.appusage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;

final class am$1
  implements Iterator<Object[]>
{
  boolean haU;
  final Object[] haV;

  am$1(am paramam, Cursor paramCursor)
  {
    AppMethodBeat.i(129723);
    this.haV = new Object[3];
    AppMethodBeat.o(129723);
  }

  public final boolean hasNext()
  {
    AppMethodBeat.i(129724);
    boolean bool;
    if (this.haU)
    {
      bool = this.haW.moveToNext();
      if (!bool)
        this.haW.close();
      AppMethodBeat.o(129724);
    }
    while (true)
    {
      return bool;
      this.haU = true;
      bool = this.haW.moveToFirst();
      AppMethodBeat.o(129724);
    }
  }

  public final void remove()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.am.1
 * JD-Core Version:    0.6.2
 */