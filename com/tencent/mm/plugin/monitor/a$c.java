package com.tencent.mm.plugin.monitor;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$c
{
  boolean fIa = false;
  long jrb;
  final String oEn;
  long oEo;
  long oEp;
  long oEs;

  a$c(String paramString)
  {
    this.oEn = paramString;
  }

  public final String toString()
  {
    AppMethodBeat.i(84514);
    String str = String.format("TempAccDirResult hash(%d) root[%s], canceled[%b], dirCount[%d], fileCount[%d], totalSize[%d], fileLenInvaildCount[%d]", new Object[] { Integer.valueOf(hashCode()), this.oEn, Boolean.valueOf(this.fIa), Long.valueOf(this.oEo), Long.valueOf(this.oEp), Long.valueOf(this.jrb), Long.valueOf(this.oEs) });
    AppMethodBeat.o(84514);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.monitor.a.c
 * JD-Core Version:    0.6.2
 */