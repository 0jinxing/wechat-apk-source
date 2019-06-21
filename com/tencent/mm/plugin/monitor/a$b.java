package com.tencent.mm.plugin.monitor;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$b
{
  boolean fIa = false;
  long fileLenInvalidCount;
  long jrb;
  final String oEn;
  long oEo;
  long oEp;
  final int tag;

  a$b(String paramString, int paramInt)
  {
    this.oEn = paramString;
    this.tag = paramInt;
  }

  public final String toString()
  {
    AppMethodBeat.i(84513);
    String str = String.format("SubDirResult hash(%d) root[%d][%s], canceled[%b], dirCount[%d], fileCount[%d], totalSize[%d], fileLenInvalidCount[%d]", new Object[] { Integer.valueOf(hashCode()), Integer.valueOf(this.tag), this.oEn, Boolean.valueOf(this.fIa), Long.valueOf(this.oEo), Long.valueOf(this.oEp), Long.valueOf(this.jrb), Long.valueOf(this.fileLenInvalidCount) });
    AppMethodBeat.o(84513);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.monitor.a.b
 * JD-Core Version:    0.6.2
 */