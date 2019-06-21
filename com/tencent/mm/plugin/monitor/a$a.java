package com.tencent.mm.plugin.monitor;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public final class a$a
{
  int bna;
  long ckF;
  boolean fIa;
  long fileLenInvalidCount;
  long jrb;
  final String oEn;
  long oEo;
  long oEp;
  ArrayList<a.b> oEq;
  ArrayList<a.c> oEr;

  a$a(String paramString)
  {
    AppMethodBeat.i(84511);
    this.oEq = new ArrayList(20);
    this.oEr = new ArrayList(20);
    this.fIa = false;
    this.oEn = paramString;
    AppMethodBeat.o(84511);
  }

  public final String toString()
  {
    AppMethodBeat.i(84512);
    String str = String.format("FileResult hash(%d) root[%s], canceled[%b], dirCount[%d], fileCount[%d], totalSize[%d], fileLenInvalidCount[%d], subDirResult[%d], tempAccDirResult[%d], totalTime[%d], depth[%d]", new Object[] { Integer.valueOf(hashCode()), this.oEn, Boolean.valueOf(this.fIa), Long.valueOf(this.oEo), Long.valueOf(this.oEp), Long.valueOf(this.jrb), Long.valueOf(this.fileLenInvalidCount), Integer.valueOf(this.oEq.size()), Integer.valueOf(this.oEr.size()), Long.valueOf(this.ckF), Integer.valueOf(this.bna) });
    AppMethodBeat.o(84512);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.monitor.a.a
 * JD-Core Version:    0.6.2
 */