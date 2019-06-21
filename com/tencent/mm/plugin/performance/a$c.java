package com.tencent.mm.plugin.performance;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$c
{
  String name;
  long pfd;
  long pfe;
  int tid;

  public final String toString()
  {
    AppMethodBeat.i(111023);
    String str = String.format("%s(%s) diff:%s", new Object[] { this.name, Integer.valueOf(this.tid), Long.valueOf(this.pfe) });
    AppMethodBeat.o(111023);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.performance.a.c
 * JD-Core Version:    0.6.2
 */