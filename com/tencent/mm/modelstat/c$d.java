package com.tencent.mm.modelstat;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Serializable;
import java.util.Locale;

final class c$d
  implements Serializable, Comparable<d>
{
  String fRX = null;
  int left;
  long time = 0L;
  int top;
  int type = 0;

  public final String toString()
  {
    AppMethodBeat.i(78669);
    String str = String.format(Locale.getDefault(), "[%s,%s]", new Object[] { this.fRX, c.fR(this.time) });
    AppMethodBeat.o(78669);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.c.d
 * JD-Core Version:    0.6.2
 */