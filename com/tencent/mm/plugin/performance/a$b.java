package com.tencent.mm.plugin.performance;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$b
{
  String name;
  long pfd;
  long pfe;
  long pff;
  int pid;

  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if ((paramObject instanceof b))
    {
      bool2 = bool1;
      if (((b)paramObject).pid == this.pid)
        bool2 = true;
    }
    return bool2;
  }

  public final int hashCode()
  {
    return this.pid;
  }

  public final String toString()
  {
    AppMethodBeat.i(111022);
    int i = this.name.indexOf(":");
    if (i > 0);
    for (String str = this.name.substring(i + 1); ; str = "main")
    {
      str = String.format(" %s(%s) diff:%s allThreadSumDiff:%s", new Object[] { str, Integer.valueOf(this.pid), Long.valueOf(this.pfe), Long.valueOf(this.pff) });
      AppMethodBeat.o(111022);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.performance.a.b
 * JD-Core Version:    0.6.2
 */